import javax.print.attribute.standard.JobKOctets;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Visitor<T> extends ChocopyBaseVisitor{

    // Stack that contains the symbol tables for each scope
    // When entering a new scope, a new item should be added to the stack
    // When getting out of an scope, the last item of the stack should be popped
    Stack<Hashtable<String, Record>> callStack;
    // Contains the symbol table of the current scope
    Hashtable<String,Record> symbolTable;

    @Override
    public T visitProgram(ChocopyParser.ProgramContext ctx) {
        callStack = new Stack<>();
        Hashtable<String, Record> program = new Hashtable<>();
        callStack.push(program);
        symbolTable = callStack.peek();
        return (T) super.visitProgram(ctx);
    }

    @Override
    public T visitFunc_def(ChocopyParser.Func_defContext ctx) {
        String funcName = ctx.ID().getText();
        if (symbolTable.containsKey(funcName)){
            System.err.println("La funcion " + funcName + " ya fue declarada");
            System.exit(1);
        }
        Record<ChocopyParser.Func_defContext> func = new Record<>("func", ctx);
        symbolTable.put(funcName, func);
        return (T) funcName; // No estoy seguro que deberia devolver
    }

    @Override
    public T visitExpr(ChocopyParser.ExprContext ctx) {

        if (ctx.cexpr() !=  null){
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.NOT() !=  null){
            //NOT EXPR
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.AND() !=  null){
            // EXPR AND EXPR
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.OR() !=  null){
            // EXPR OR EXPR
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.IF() !=  null){
            // EXPR IF EXPR ELSE EXPR
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.LEN() !=  null){
            // LEN ( EXPR )
            return visitCexpr(ctx.cexpr());
        }
        if (ctx.INPUT() !=  null){
            // INPUT ( )
            return visitCexpr(ctx.cexpr());
        }

        return null;
    }

    @Override
    public T visitCexpr(ChocopyParser.CexprContext ctx) {

        if (ctx.ID() !=  null){

            if (ctx.PUNTO() !=  null){

                if (ctx.PAR_IZQ() !=  null){
                    // CEXPR . ID ( EXPR ... )
                    return null;
                }

                // CEXPR . ID
                return null;
            }
            if (ctx.PAR_IZQ() !=  null){
                // ID ( EXPR ... )
                return null;
            }

            // ID
            return null;
        }

        if (ctx.COR_IZQ() != null){

            if (ctx.cexpr() !=  null){
                // CEXPR [ EXPR ]
                return null;
            }

            // [ EXPR ...
            return null;

        }

        if (ctx.literal() != null){
            // LITERAL
            return (T) visitLiteral(ctx.literal());
        }

        if (ctx.PAR_IZQ() != null){
            // ( EXPR )
            return null;
        }

        if (ctx.bin_op() != null){
            // CEXPR BIN_OP CEXPR
            return null;
        }

        if (ctx.MENOS() != null){
            // LITERAL
            return null;
        }

        return null;
    }

    public T func_eval(ChocopyParser.CexprContext ctx){
        String funcName = ctx.ID().getText();
        if (!symbolTable.containsKey(funcName)){
            System.err.println("La funcion " + funcName + " no ha sido declarada");
            System.exit(1);
        }

        if (symbolTable.get(funcName).getType() != "func"){
            System.err.println("La variable " + funcName + " no es una funcion");
            System.exit(1);
        }

        //Get the context of the function
        Record record = symbolTable.get(funcName);
        ChocopyParser.Func_defContext ctxFunc = (ChocopyParser.Func_defContext) record.getValue();

        // Set the scope to be inside of the function
        Hashtable<String, Record> function = new Hashtable<>();
        callStack.push(function);
        symbolTable = callStack.peek();

        // Check if the parameters match
        for (int i = 0; i< ctxFunc.typed_var().size(); i++){
            // Inside of this function params must be declared in the symbol table
            try {
                String param_name = (String) visitTyped_var(ctxFunc.typed_var(i));
                Record<T> type = (Record) visitExpr(ctx.expr(i));
            }catch (IndexOutOfBoundsException e){
                System.err.println("El numero de parametros no coincide");
            }

            //if (ctx.expr(i).getType()  symbolTable.get(param_name).getType())
        }




        // Set the scope to be outside of the function again
        callStack.pop();
        symbolTable = callStack.peek();
        // FUNCTION EVALUATION
        return null;
    }

}