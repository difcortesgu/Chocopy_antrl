import java.util.*;

public class Visitor extends ChocopyBaseVisitor<Object>{

    // Stack that contains the symbol tables for each scope
    // When entering a new scope, a new item should be added to the stack
    // When getting out of an scope, the last item of the stack should be popped
    Stack<String> callStack;
    Hashtable<String, Hashtable<String, Record>> symbolTables;
    // Contains the symbol table of the current scope
    Hashtable<String, Record> symbolTable;

    @Override
    public Object visitProgram(ChocopyParser.ProgramContext ctx) {
        callStack = new Stack<>();
        symbolTables = new Hashtable<String, Hashtable<String, Record>>();
        Hashtable<String, Record> program = new Hashtable<>();
        symbolTables.put("program", program);
        callStack.push("program");
        symbolTable = symbolTables.get(callStack.peek());
        return  super.visitProgram(ctx);
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
        symbolTables.put(funcName, new Hashtable<String, Record>());
        return  null;
    }

    @Override
    public Object visitExpr(ChocopyParser.ExprContext ctx) {

        if (ctx.cexpr() !=  null){
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.NOT() !=  null){
            //NOT EXPR
            Record r = (Record) visitExpr(ctx.expr(0));
            if (r.getType() != "bool"){
                System.err.println("La operacion not solo es valida en booleanos, se recibio: \""+r.getType()+"\"");
                System.exit(1);
            }
            return ! (boolean)((Record) visitExpr(ctx.expr(0))).getValue();
        }
        if (ctx.AND() !=  null || ctx.OR() !=  null){
            // EXPR AND EXPR
            Record r1 = (Record) visitExpr(ctx.expr(0));
            Record r2 = (Record) visitExpr(ctx.expr(1));
            if (r1.getType() != "bool" || r2.getType() != "bool"){
                System.err.println("La operacion and/or solo es valida en booleanos, se recibio: \""+r1.getType()+"\", \""+r2.getType()+"\"");
                System.exit(1);
            }
            if (ctx.AND() !=  null)
                return (boolean) r1.getValue() && (boolean) r2.getValue();
            else
                return (boolean) r1.getValue() || (boolean) r2.getValue();
        }
        if (ctx.IF() !=  null){
            // EXPR IF EXPR ELSE EXPR
            Record r2 = (Record) visitExpr(ctx.expr(1));
            if (r2.getType() != "bool"){
                System.err.println("La condicion debe ser de tipo booleano, se recibio: \""+r2.getType()+"\"");
                System.exit(1);
            }
            if ((boolean) r2.getValue())
                return visitExpr(ctx.expr(0));
            else
                return visitExpr(ctx.expr(2));
        }
        if (ctx.LEN() !=  null){
            // LEN ( EXPR )
            Record r = (Record) visitExpr(ctx.expr(0));
            if (r.getType() != "str" || r.getType() != "list"){
                System.err.println("La expresion debe ser de tipo \"lista\" o \"str\", se recibio: \""+r.getType()+"\"");
                System.exit(1);
            }
            return ((Object[])r.getValue()).length;
        }
        if (ctx.INPUT() !=  null){
            // INPUT ( )
            Scanner s = new Scanner(System.in);
            return new Record("str", s.next());
        }
        return null;
    }

    @Override
    public Object visitCexpr(ChocopyParser.CexprContext ctx) {

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
                    // CEXPR . ID ( EXPR ... )
                    Record result = (Record) func_eval(ctx);
                    symbolTable = callStack.peek();
                    return result;
                }

                // CEXPR . ID
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
            return  symbolTable.get(varName);
        }

        if (ctx.COR_IZQ() != null){

            if (ctx.cexpr(0) !=  null){
                // CEXPR [ EXPR ]
                Record cexpr = (Record) visitCexpr(ctx.cexpr(0));
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
            return visitExpr((ChocopyParser.ExprContext) ctx.expr());
        }

        if (ctx.bin_op() != null){
            // CEXPR BIN_OP CEXPR

            var cexpr1 = (Record) visitCexpr(ctx.cexpr(0));
            var cexpr2 = (Record) visitCexpr(ctx.cexpr(1));
            String op = (String) visitBin_op(ctx.bin_op());

            // Check for operation compatibility
            try {
                switch (cexpr1.getType()) {
                    case "int":
                        if (!cexpr2.getType().equals("int"))
                            throw new Exception();
                        if (op.equals("is"))
                            throw new Exception();
                        break;
                    case "bool":
                        if (!cexpr2.getType().equals("bool"))
                            throw new Exception();
                        if (!op.equals("==") && !op.equals("!="))
                            throw new Exception();
                        break;
                    case "str":
                        if (!cexpr2.getType().equals("str"))
                            throw new Exception();
                        if (!op.equals("==") && !op.equals("!=") && !op.equals("+"))
                            throw new Exception();
                        break;
                    case "list":
                        if (!cexpr2.getType().equals("list") && !op.equals("is"))
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
                System.err.println("La operacion \""+op+"\" no esta permitida entre los tipos de datos "+cexpr1.getType()+" y "+cexpr2.getType());
                System.exit(1);
            }

            switch (op){
                case "+":
                    if (cexpr1.getType().equals("int")){
                        return new Record("int", (int) cexpr1.getValue() + (int) cexpr2.getValue());
                    }
                    else if (cexpr1.getType().equals("str")){
                        return new Record("str", cexpr1.getValue().toString() + cexpr2.getValue().toString());
                    }
                    else{
                        Object[] l1 = (Object[]) cexpr1.getValue();
                        Object[] l2 = (Object[]) cexpr2.getValue();
                        Object[] new_array = new Object[l1.length + l2.length];
                        System.arraycopy(l1, 0, new_array, 0, l1.length);
                        System.arraycopy(l2, 0, new_array, l1.length, l2.length);
                        return  new_array;
                    }
                case "-":
                    return new Record("int", (int) cexpr1.getValue() - (int) cexpr2.getValue());
                case "*":
                    return new Record("int", (int) cexpr1.getValue() * (int) cexpr2.getValue());
                case "//":
                    return new Record("int", ((int) cexpr1.getValue() - ((int) cexpr1.getValue() % (int) cexpr2.getValue())) / (int) cexpr2.getValue());
                case "%":
                    return new Record("int", (int) cexpr1.getValue() % (int) cexpr2.getValue());
                case "==":
                    // Esto puede fallar
                    return switch (cexpr1.getType()) {
                        case "int" -> new Record("bool", (int) cexpr1.getValue() == (int) cexpr2.getValue());
                        // case "str" -> new Record("bool", cexpr1.getValue().equals(cexpr2.getValue()));
                        case "bool" -> new Record("bool", (boolean) cexpr1.getValue() == (boolean) cexpr2.getValue());
                        default -> new Record("bool", cexpr1.getValue().equals(cexpr2.getValue()));
                    };
                case "!=":
                    // Esto puede fallar
                    return switch (cexpr1.getType()) {
                        case "int" -> new Record("bool", (int) cexpr1.getValue() != (int) cexpr2.getValue());
                        // case "str" -> new Record("bool", !(cexpr1.getValue()).equals(cexpr2.getValue()));
                        case "bool" -> new Record("bool", (boolean) cexpr1.getValue() != (boolean) cexpr2.getValue());
                        default -> new Record("bool", !cexpr1.getValue().equals(cexpr2.getValue()));
                    };
                case "<=":
                    return  new Record("bool", (int) cexpr1.getValue() <= (int) cexpr2.getValue());
                case ">=":
                    return  new Record("bool", (int) cexpr1.getValue() >= (int) cexpr2.getValue());
                case "<":
                    return  new Record("bool", (int) cexpr1.getValue() < (int) cexpr2.getValue());
                case ">":
                    return  new Record("bool", (int) cexpr1.getValue() > (int) cexpr2.getValue());
                case "is":
                    return  new Record("bool", cexpr1.getValue() == cexpr2.getValue());
            }
        }

        if (ctx.MENOS() != null){
            // - CEXPR
            Record cexpr = (Record) visitCexpr(ctx.cexpr(0));
            if (!cexpr.getType().equals("int")){
                System.err.println("La operacion - no esta permitida para tipos de dato diferentes a \"int\"");
                System.exit(1);
            }

            return - (int)cexpr.getValue();
        }
        return null;
    }

    public Object func_eval(ChocopyParser.CexprContext ctx){

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
        symbolTables.put(id.toString(), new Hashtable<String, Record>());
        symbolTable = symbolTables.get(callStack.peek());

        // Check if the parameters match
        for (int i = 0; i< ctxFunc.typed_var().size(); i++){
            // Inside of this function params must be declared in the symbol table
            try {
                String param_name = (String) visitTyped_var(ctxFunc.typed_var(i));
                Record expr = (Record) visitExpr(ctx.expr(i));

                if (! expr.getType().equals(symbolTable.get(param_name).getType())){
                    System.err.println("El parametro "+ param_name +" debe ser de tipo \""+ symbolTable.get(param_name).getType() +"\" y se recibio \""+ expr.getType() +"\"");
                    System.exit(1);
                }

            }catch (IndexOutOfBoundsException e){
                System.err.println("El numero de parametros no coincide");
                System.exit(1);
            }
        }

        Record func_body =  (Record) visitFunc_body(ctxFunc.func_body());

        if (ctxFunc.type() != null){
            String type = (String) visitType(ctxFunc.type());
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
}