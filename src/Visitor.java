import java.util.*;

public class Visitor extends ChocopyBaseVisitor<Object>{

    // Stack that contains the symbol tables for each scope
    // When entering a new scope, a new item should be added to the stack
    // When getting out of an scope, the last item of the stack should be popped
    Stack<String> callStack;
    Hashtable<String, Hashtable<String, Record>> symbolTables;
    // Contains the symbol table of the current scope
    Hashtable<String, Record> symbolTable;

    public Visitor() {
        callStack = new Stack<>();
        symbolTables = new Hashtable<>();
        Hashtable<String, Record> program = new Hashtable<>();
        symbolTables.put("program", program);
        callStack.push("program");
        symbolTable = symbolTables.get(callStack.peek());
    }

    @Override
    public Object visitProgram(ChocopyParser.ProgramContext ctx) {

        if (!ctx.stmt().isEmpty()){
            for (int i = 0; i < ctx.stmt().size(); i++) {
                visitStmt(ctx.stmt(i));
            }
            return null;
        }
        if (ctx.class_def() != null){
            visitClass_def(ctx.class_def());
            return visitProgram(ctx.program());
        }
        if (ctx.var_def() != null){
            visitVar_def(ctx.var_def());
            return visitProgram(ctx.program());
        }
        if (ctx.func_def() != null){
            visitFunc_def(ctx.func_def());
            return visitProgram(ctx.program());
        }
        return null;
    }

    /*
    @Override
    public Object visitClass_def(ChocopyParser.Class_defContext ctx) {
        String className = ctx.ID(0).getText();
        String parentName = ctx.ID(1).getText();

        if (symbolTable.containsKey(className)){
            System.err.println("La clase " + className + " ya fue definida");
            System.exit(1);
        }
        if (!symbolTable.containsKey(parentName)){
            System.err.println("La clase " + parentName + " no ha sido definida");
            System.exit(1);
        }
        Record new_class = new Record("class", ctx);
        symbolTable.put(className, new_class);

        return  null;
    }
    */

    @Override
    public Object visitFunc_def(ChocopyParser.Func_defContext ctx) {
        String funcName = ctx.ID().getText();
        if (symbolTable.containsKey(funcName)){
            System.err.println("La funcion " + funcName + " ya fue declarada");
            System.exit(1);
        }
        Record func = new Record("func", ctx);
        symbolTable.put(funcName, func);
        symbolTables.put(funcName, new Hashtable<>());
        return  null;
    }
    
    @Override
    public Object visitSimple_stmt(ChocopyParser.Simple_stmtContext ctx) {
        if(ctx.PASS() != null){
            //pass
            return new Record("None", "pass");
        }
        if(ctx.RETURN() != null){
            if(ctx.expr() != null){
                return visitExpr(ctx.expr());
            }
            return new Record("None", "");
        }
        if(ctx.PRINT() != null){
            Record r = (Record) visitExpr(ctx.expr());
            if (r.getType().equals("None")){
                System.err.println("No se puede imprimir una variable de tipo \"None\"");
                System.exit(1);
            }
            System.out.println(r.getValue());
            return null;
        }
        if(ctx.target() !=  null){
            //(target IGUAL)+ expr
            Record r1 = (Record) visitExpr(ctx.expr());
            for (int i = 0; i < ctx.target().size(); i++) {
                Record r2 = (Record) visitTarget(ctx.target(i));
                if(!r2.getType().equals(r1.getType())){
                    System.err.println("Los tipos de datos \"" + r2.getType() + "\" y \"" + r1.getType() + "\" no coinciden");
                    System.exit(1);
                }
            }
            //itera sobre todos los target y dependiendo del tipo de "operacion" y cambia el valor anidado de la tabla de simbolos
            for (int i = 0; i < ctx.target().size(); i++) {
                Record temp = null;
                if(((Record) visitTarget(ctx.target(i))).getTrace().isEmpty()) {
                    System.err.println("No se puede asignar un valor a un resultado anonimo");
                    System.exit(1);
                }
                for (Tupla t : ((Record) visitTarget(ctx.target(i))).getTrace()) {
                    switch (t.x) {
                        case "id":
                            temp = symbolTable.get(t.y);
                        case "index":
                            //revisar esto
                            assert temp != null;
                            temp.setValue(((Object[]) temp.getValue())[(int) t.y]);
                        case "member":
                            //temp.setValue(); revisar
                    }
                }
                temp.setValue(r1.getValue());
            }
            return null;
        }
        if(ctx.expr() != null){
            //expr
            visitExpr(ctx.expr());
            return null;
        }
        return null;
    }

    @Override
    public Object visitStmt(ChocopyParser.StmtContext ctx) {
        if(ctx.simple_stmt() != null){
            //simple_stmt NEWLINE
            return visitSimple_stmt(ctx.simple_stmt());
        }
        if(ctx.IF() != null){
            //IF expr DOS_PUNTOS block (ELIF expr DOS_PUNTOS block )* (ELSE DOS_PUNTOS block)?
            Record r = (Record) visitExpr(ctx.expr(0));
            if (!r.getType().equals("bool")){
                System.err.println("La comparacion solo es valida entre booleanos, se recibio: \""+r.getType()+"\"");
                System.exit(1);
            }
            if(ctx.ELIF() != null){
                for (int i = 1; i < ctx.expr().size(); i++) {
                    r = (Record) visitExpr(ctx.expr(i));
                    if (!r.getType().equals("bool")){
                        System.err.println("La comparacion solo es valida entre booleanos, se recibio: \""+r.getType()+"\"");
                        System.exit(1);
                    }
                }
            }
            for (int i = 0; i < ctx.expr().size(); i++) {
                r = (Record) visitExpr(ctx.expr(i));
                if((boolean) r.getValue()){
                    visitBlock(ctx.block(i));
                    return null;
                }
            }
            if(ctx.ELSE() != null){
                visitBlock(ctx.block(ctx.expr().size()-1));
                return null;
            }
        return null;
        }
        if(ctx.WHILE() != null){
            //WHILE expr DOS_PUNTOS block
            Record r = (Record) visitExpr(ctx.expr(0));
            if (!r.getType().equals("bool")){
                System.err.println("La comparacion solo es valida entre booleanos, se recibio: \""+r.getType()+"\"");
                System.exit(1);
            }
            while((boolean) r.getValue()){
                visitBlock(ctx.block(0));
            }
            return null;
        }
        if(ctx.FOR() != null){
            //FOR ID IN expr DOS_PUNTOS block;
            Record r = (Record) visitExpr(ctx.expr(0));
            if (!r.getType().equals("list") || !r.getType().equals("str")){
                System.err.println("Solo es posible iterar sobre listas o strings, se recibio: \""+r.getType()+"\"");
                System.exit(1);
            }
            if(!symbolTable.containsKey(ctx.ID().getText())){
                System.err.println("La variable " + ctx.ID().getText() + " ya fue declarada");
                System.exit(1);
            }
            for (int i = 0; i < ctx.expr().size(); i++) {
                visitBlock(ctx.block(0));
            }
            return null;
        }
        return null;
    }

    @Override
    public Object visitBlock(ChocopyParser.BlockContext ctx) {
        for (int i = 0; i < ctx.stmt().size(); i++) {
            visitStmt(ctx.stmt(i));
        }
        return null;
    }

    @Override public Object visitLiteral(ChocopyParser.LiteralContext ctx){

        if (ctx.getText().equals("None"))
            return new Record("None", "None");
        if (ctx.getText().equals("True"))
            return new Record("bool", true);
        if (ctx.getText().equals("False"))
            return new Record("bool", false);
        if (ctx.IDSTRING()!= null)
            return new Record("str", ctx.IDSTRING().getText());
        if (ctx.INTEGER()!= null)
            return new Record("int", Integer.parseInt(ctx.INTEGER().getText()));
        if (ctx.STRING()!= null)
            return new Record("str", ctx.STRING().getText());
        return null;
    }

    @Override public Object visitVar_def(ChocopyParser.Var_defContext ctx){
        String varName = ctx.typed_var().ID().getText();
        if (symbolTable.containsKey(varName)){
            System.err.println("La variable " + varName + " ya fue declarada");
            System.exit(1);
        }
        Record literal = (Record)visitLiteral(ctx.literal());
        Record type = (Record) visitType(ctx.typed_var().type());

        if (!(literal.getType().equals(type.getValue()))){
            if(!(literal.getValue().equals("None")&& ctx.typed_var().type().COR_DER()!=null)) {
                System.err.println("No se puede asignar un " + type.getValue() + " a una variable " + literal.getType());
                System.exit(1);
            }
        }

        Record var = new Record((String) type.getValue(), literal.getValue());
        symbolTable.put(varName, var);
        return  null;
    }

    @Override public Object visitTyped_var(ChocopyParser.Typed_varContext ctx){
        if (ctx.ID()!= null){
            Record r = (Record) visitType(ctx.type());
            symbolTable.put(ctx.ID().getText(), new Record((String) r.getValue(), null));
            return ctx.ID().getText();
        }
        return null;
    }

    @Override public Object visitType(ChocopyParser.TypeContext ctx){
        if (ctx.ID()!= null){
            return new Record("str", ctx.ID().getText());
        }
        if (ctx.IDSTRING()!= null){
            return new Record("str", ctx.IDSTRING().getText());
        }
        if (ctx.COR_DER()!= null){
            return new Record("str", "list");
        }
        return null;
    }

    @Override
    public Object visitFunc_body(ChocopyParser.Func_bodyContext ctx) {

        if (!ctx.stmt().isEmpty()){
            for (int i = 0; i < ctx.stmt().size(); i++) {
                Record r = (Record) visitStmt(ctx.stmt(i));
                 if (r != null && !r.getValue().equals("")) {
                    return r;
                }
            }
        }
        if (ctx.global_decl() != null){
            visitGlobal_decl(ctx.global_decl());
            return visitFunc_body(ctx.func_body());
        }
        if (ctx.nonlocal_decl() != null){
            visitNonlocal_decl(ctx.nonlocal_decl());
            return visitFunc_body(ctx.func_body());
        }
        if (ctx.var_def() != null){
            visitVar_def(ctx.var_def());
            return visitFunc_body(ctx.func_body());
        }
        if (ctx.func_def() != null){
            visitFunc_def(ctx.func_def());
            return visitFunc_body(ctx.func_body());
        }
        return null;
    }

    @Override
    public Object visitCmp(ChocopyParser.CmpContext ctx) {
        if (ctx.DOBLE_IGUAL()!=null)
            return "==";
        if (ctx.DIFERENTE()!=null)
            return "!=";
        if (ctx.MAYOR_IGUAL()!=null)
            return ">=";
        if (ctx.MENOR_IGUAL()!=null)
            return "<=";
        if (ctx.MENOR()!=null)
            return "<";
        if (ctx.MAYOR()!=null)
            return ">";
        if (ctx.IS()!=null)
            return "is";
        return null;
    }

    @Override
    public Object visitOp_suma(ChocopyParser.Op_sumaContext ctx) {
        if (ctx.MAS() != null)
            return "+";
        if (ctx.MENOS() != null)
            return "-";
        return null;
    }

    @Override
    public Object visitOp_mul(ChocopyParser.Op_mulContext ctx) {
        if (ctx.MULTIPLICA()!= null)
            return "*";
        if (ctx.DIV_ENTERA() != null)
            return "//";
        if (ctx.MODULO()!=null)
            return "%";
        return null;
    }


    //-------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------


    @Override
    public Object visitTarget(ChocopyParser.TargetContext ctx) {
        if(ctx.ID() !=  null){
            Record r = new Record("str", ctx.ID().getText());
            r.addTrace(new Tupla("id", ctx.ID().getText()));
            return r;
        }
        if(ctx.PUNTO() != null){
            // Record r = (Record) visitSimple_value(ctx.simple_value());
            // r.addTrace(new Tupla("member", ctx.ID().getText()));
            // return r;
            return null;
        }
        if(ctx.COR_IZQ() != null){
            Record r = (Record) visitSimple_value(ctx.simple_value());
            Record i = (Record) visitExpr(ctx.expr());
            if (!r.getType().equals("list") && !r.getType().equals("str")){
                System.err.println("La operacion [] no esta permitida para tipos de dato diferentes a \"str\", \"list\"");
                System.exit(1);
            }
            if (!i.getType().equals("int")){
                System.err.println("El index debe ser de tipo \"int\"");
                System.exit(1);
            }
            if ((int) i.getValue() >= ((Object[]) r.getValue()).length){
                System.err.println("El index no se encuentra en el arreglo");
                System.exit(1);
            }
            r.addTrace(new Tupla("index", i.getValue()));
            return r;
        }
        return null;
    }

    public Object func_eval(ChocopyParser.Simple_valueContext ctx){

        String funcName = ctx.ID().getText();
        if (!symbolTable.containsKey(funcName)){//cambiar
            System.err.println("La funcion " + funcName + " no ha sido declarada");
            System.exit(1);
        }

        if (!symbolTable.get(funcName).getType().equals("func")){
            System.err.println("La variable " + funcName + " no es una funcion");
            System.exit(1);
        }

        //Get the context of the function
        Record record = symbolTable.get(funcName);
        ChocopyParser.Func_defContext ctxFunc = (ChocopyParser.Func_defContext) record.getValue();

        // Set the scope to be inside of the function
        UUID id = UUID.randomUUID();
        callStack.push(id.toString());
        symbolTables.put(id.toString(), new Hashtable<>());
        symbolTable = symbolTables.get(callStack.peek());

        // Check if the parameters match
        for (int i = 0; i< ctxFunc.typed_var().size(); i++){
            // Inside of this function params must be declared in the symbol table
            try {
                String param = (String) visitTyped_var(ctxFunc.typed_var(i));
                Record expr = (Record) visitExpr(ctx.expr(i));

                if (! expr.getType().equals(symbolTable.get(param).getType())){
                    System.err.println("El parametro "+ param +" debe ser de tipo \""+ symbolTable.get(param).getType() +"\" y se recibio \""+ expr.getType() +"\"");
                    System.exit(1);
                }

                symbolTable.get(param).setValue(expr.getValue());

            }catch (IndexOutOfBoundsException e){
                System.err.println("El numero de parametros no coincide");
                System.exit(1);
            }
        }

        Record func_body =  (Record) visitFunc_body(ctxFunc.func_body());

        if (ctxFunc.type() != null){
            String type = (String) ((Record) visitType(ctxFunc.type())).getValue();
            if (!func_body.getType().equals(type)){
                System.err.println("La funcion \""+funcName+"\" debe retornar el tipo \""+type+"\" y se encontro el tipo \""+func_body.getType()+"\"");
                System.exit(1);
            }
        }
        // Set the scope to be outside of the function again
        symbolTables.remove(callStack.pop());
        symbolTable = symbolTables.get(callStack.peek());
        return func_body;
    }

    @Override
    public Object visitExpr(ChocopyParser.ExprContext ctx) {
        if (ctx.IF() !=  null){
            // EXPR_OR IF EXPR_OR ELSE EXPR
            Record r1 = (Record) visitExpr_or(ctx.expr_or(0));
            Record r2 = (Record) visitExpr_or(ctx.expr_or(1));
            Record r3 = (Record) visitExpr(ctx.expr());
            if (!r2.getType().equals("bool")){
                System.err.println("La condicion debe ser de tipo booleano, se recibio: \""+r2.getType()+"\"");
                System.exit(1);
            }
            if ((boolean) r2.getValue())
                return r1;
            else
                return r3;
        }
        return visitExpr_or(ctx.expr_or(0));
    }

    @Override
    public Object visitExpr_or(ChocopyParser.Expr_orContext ctx) {
        if (ctx.OR() !=  null){
            // expr_and OR simple_expr
            Record r1 = (Record) visitExpr_or(ctx.expr_or());
            Record r2 = (Record) visitExpr_and(ctx.expr_and());
            if (!r1.getType().equals("bool") || !r2.getType().equals("bool")){
                System.err.println("La operacion or solo es valida en booleanos, se recibio: \""+r1.getType()+"\", \""+r2.getType()+"\"");
                System.exit(1);
            }
            return (boolean) r1.getValue() || (boolean) r2.getValue();
        }
        return visitExpr_and(ctx.expr_and());
    }

    @Override
    public Object visitExpr_and(ChocopyParser.Expr_andContext ctx) {
        if (ctx.AND() !=  null){
            // expr_and AND simple_expr
            Record r1 = (Record) visitExpr_and(ctx.expr_and());
            Record r2 = (Record) visitSimple_expr(ctx.simple_expr());
            if (!r1.getType().equals("bool") || !r2.getType().equals("bool")){
                System.err.println("La operacion and solo es valida en booleanos, se recibio: \""+r1.getType()+"\", \""+r2.getType()+"\"");
                System.exit(1);
            }
            return (boolean) r1.getValue() && (boolean) r2.getValue();
        }
        return visitSimple_expr(ctx.simple_expr());
    }

    @Override
    public Object visitSimple_expr(ChocopyParser.Simple_exprContext ctx) {
        if (ctx.cexpr() != null){
            //cexpr
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.NOT() !=  null){
            //NOT EXPR
            Record r = (Record) visitSimple_expr(ctx.simple_expr());
            if (!r.getType().equals("bool")){
                System.err.println("La operacion not solo es valida en booleanos, se recibio: \""+r.getType()+"\"");
                System.exit(1);
            }
            return ! (boolean)((Record) visitSimple_expr(ctx.simple_expr())).getValue();
        }
        return null;
    }

    @Override
    public Object visitCexpr(ChocopyParser.CexprContext ctx) {
        if (ctx.cexpr() != null){
            //cexpr_sum op_suma cexpr_mul
            Record r1 = (Record) visitCexpr(ctx.cexpr());
            Record r2 = (Record) visitCexpr_sum(ctx.cexpr_sum());
            String op = (String) visitCmp(ctx.cmp());

            return evalOp(r1,r2,op);
        }
        //cexpr_mul
        return visitCexpr_sum(ctx.cexpr_sum());
    }

    @Override
    public Object visitCexpr_sum(ChocopyParser.Cexpr_sumContext ctx) {
        if (ctx.cexpr_sum() != null){
            //cexpr_sum op_suma cexpr_mul
            Record r1 = (Record) visitCexpr_sum(ctx.cexpr_sum());
            Record r2 = (Record) visitCexpr_mul(ctx.cexpr_mul());
            String op = (String) visitOp_suma(ctx.op_suma());

            return evalOp(r1,r2,op);
        }
        //cexpr_mul
        return visitCexpr_mul(ctx.cexpr_mul());
    }

    @Override
    public Object visitCexpr_mul(ChocopyParser.Cexpr_mulContext ctx) {
        if (ctx.cexpr_mul() != null){
            //cexpr_mul op_mul simple_value
            Record r1 = (Record) visitCexpr_mul(ctx.cexpr_mul());
            Record r2 = (Record) visitSimple_value(ctx.simple_value());
            String op = (String) visitOp_mul(ctx.op_mul());
            return evalOp(r1,r2,op);
        }
        //simple_value
        return visitSimple_value(ctx.simple_value());
    }

    @Override
    public Object visitSimple_value(ChocopyParser.Simple_valueContext ctx) {
        if (ctx.ID() !=  null){
            if (ctx.PUNTO() !=  null){
        /*
                Record r = (Record) visitCexpr(ctx.cexpr(0));
                ChocopyParser.Class_defContext ctxClass = (ChocopyParser.Class_defContext) symbolTable.get(r.getType()).getValue();
                UUID id = UUID.randomUUID();
                callStack.push(id.toString());
                symbolTables.put(id.toString(), new Hashtable<String, Record>());
                symbolTable = symbolTables.get(callStack.peek());
                if (ctx.PAR_IZQ() !=  null){
                    // SIMPLE_VALUE . ID ( EXPR ... )
                    Record result = (Record) func_eval(ctx);
                    symbolTable = callStack.peek();
                    return result;
                }

                // SIMPLE_VALUE . ID
                // por aca toca guardar el trace
                Record r1 = symbolTable.get(ctx.ID().getText());
                symbolTable = callStack.peek();
                return r1;
         */
                return null;
            }

            if (ctx.PAR_IZQ() !=  null){
                // ID ( EXPR ... )
                return func_eval(ctx);
            }

            // ID
            String varName = ctx.ID().getText();
            if (! symbolTable.containsKey(varName)){
                System.err.println("La variable " + varName + " no ha sido inicializada");
                System.exit(1);
            }
            if (symbolTable.get(varName).getType().equals("func")){
                System.err.println("El simbolo "+ varName +" es una funcion, no una variable");
                System.exit(1);
            }
            Record temp = symbolTable.get(varName);
            temp.addTrace(new Tupla("id",varName));
            return symbolTable.get(varName);
        }

        if (ctx.COR_IZQ() != null){

            if (ctx.simple_value() !=  null){
                // SIMPLE_VALUE [ EXPR ]
                Record cexpr = (Record) visitSimple_value(ctx.simple_value());
                if (!cexpr.getType().equals("list") && !cexpr.getType().equals("str")){
                    System.err.println("La operacion [] no esta permitida para tipos de dato diferentes a \"str\", \"list\"");
                    System.exit(1);
                }
                Record expr = (Record) visitExpr(ctx.expr(0));
                if (!cexpr.getType().equals("int")){
                    System.err.println("El index debe ser de tipo \"int\"");
                    System.exit(1);
                }
                if ((int) expr.getValue() >= ((Object[]) cexpr.getValue()).length){
                    System.err.println("El index no se encuentra en el arreglo");
                    System.exit(1);
                }
                cexpr.addTrace(new Tupla("index", expr.getValue()));
                return ((Object[]) cexpr.getValue())[(int) expr.getValue()];
            }
            // [ EXPR ...]
            Object[] l = new Object[ctx.expr().size()];
            for(int i=0; i<ctx.expr().size(); i++){
                l[i] = visitExpr(ctx.expr(i));
            }
            return l;
        }

        if (ctx.literal() != null){
            // LITERAL
            return  visitLiteral(ctx.literal());
        }

        if (ctx.PAR_IZQ() != null){
            // ( EXPR )
            return visitExpr(ctx.expr(0));
        }
        
        if (ctx.MENOS() != null){
            // - CEXPR
            Record cexpr = (Record) visitSimple_value(ctx.simple_value());
            if (!cexpr.getType().equals("int")){
                System.err.println("La operacion - no esta permitida para tipos de dato diferentes a \"int\"");
                System.exit(1);
            }

            return - (int)cexpr.getValue();
        }

        if (ctx.LEN() !=  null){
            // LEN ( EXPR )
            Record r = (Record) visitExpr(ctx.expr(0));
            if (!r.getType().equals("str") && !r.getType().equals("list")){
                System.err.println("La expresion debe ser de tipo \"lista\" o \"str\", se recibio: \""+r.getType()+"\"");
                System.exit(1);
            }
            return ((Object[])r.getValue()).length;
        }

        if (ctx.INPUT() !=  null){
            // INPUT ( )
            Scanner s = new Scanner(System.in);
            String text = s.nextLine();
            return new Record("str", text);
        }

        return null;
    }
    
    public Record evalOp( Record r1, Record r2, String op ){

        // Check for operation compatibility
        try {
            switch (r1.getType()) {
                case "int":
                    if (!r2.getType().equals("int"))
                        throw new Exception();
                    if (op.equals("is"))
                        throw new Exception();
                    break;
                case "bool":
                    if (!r2.getType().equals("bool"))
                        throw new Exception();
                    if (!op.equals("==") && !op.equals("!="))
                        throw new Exception();
                    break;
                case "str":
                    if (!r2.getType().equals("str"))
                        throw new Exception();
                    if (!op.equals("==") && !op.equals("!=") && !op.equals("+"))
                        throw new Exception();
                    break;
                case "list":
                    if (!r2.getType().equals("list") && !op.equals("is"))
                        throw new Exception();
                    if (!op.equals("+") && !op.equals("is"))
                        throw new Exception();
                    break;
                default:
                    if (!op.equals("is"))
                        throw new Exception();
                    break;
            }
        }catch (Exception e){
            System.err.println("La operacion \""+op+"\" no esta permitida entre los tipos de datos "+r1.getType()+" y "+r2.getType());
            System.exit(1);
        }

        switch (op){
            case "+":
                if (r1.getType().equals("int")){
                    return new Record("int", (int) r1.getValue() + (int) r2.getValue());
                }
                else if (r1.getType().equals("str")){
                    return new Record("str", r1.getValue().toString() + r2.getValue().toString());
                }
                else{
                    Object[] l1 = (Object[]) r1.getValue();
                    Object[] l2 = (Object[]) r2.getValue();
                    Object[] new_array = new Object[l1.length + l2.length];
                    System.arraycopy(l1, 0, new_array, 0, l1.length);
                    System.arraycopy(l2, 0, new_array, l1.length, l2.length);
                    return  new Record("list", new_array);
                }
            case "-":
                return new Record("int", (int) r1.getValue() - (int) r2.getValue());
            case "*":
                return new Record("int", (int) r1.getValue() * (int) r2.getValue());
            case "//":
                if((int) r2.getValue() == 0){
                    System.err.println("No esta permitida la division entre 0");
                    System.exit(1);
                }
                return new Record("int", ((int) r1.getValue() - ((int) r1.getValue() % (int) r2.getValue())) / (int) r2.getValue());
            case "%":
                if((int) r2.getValue() == 0){
                    System.err.println("No esta permitida la division entre 0");
                    System.exit(1);
                }
                return new Record("int", (int) r1.getValue() % (int) r2.getValue());
            case "==":
                // Esto puede fallar
                return switch (r1.getType()) {
                    case "int" -> new Record("bool", (int) r1.getValue() == (int) r2.getValue());
                    // case "str" -> new Record("bool", r1.getValue().equals(r2.getValue()));
                    case "bool" -> new Record("bool", (boolean) r1.getValue() == (boolean) r2.getValue());
                    default -> new Record("bool", r1.getValue().equals(r2.getValue()));
                };
            case "!=":
                // Esto puede fallar
                return switch (r1.getType()) {
                    case "int" -> new Record("bool", (int) r1.getValue() != (int) r2.getValue());
                    // case "str" -> new Record("bool", !(r1.getValue()).equals(r2.getValue()));
                    case "bool" -> new Record("bool", (boolean) r1.getValue() != (boolean) r2.getValue());
                    default -> new Record("bool", !r1.getValue().equals(r2.getValue()));
                };
            case "<=":
                return  new Record("bool", (int) r1.getValue() <= (int) r2.getValue());
            case ">=":
                return  new Record("bool", (int) r1.getValue() >= (int) r2.getValue());
            case "<":
                return  new Record("bool", (int) r1.getValue() < (int) r2.getValue());
            case ">":
                return  new Record("bool", (int) r1.getValue() > (int) r2.getValue());
            case "is":
                return  new Record("bool", r1.getValue() == r2.getValue());
        }
        return null;
    }
}
