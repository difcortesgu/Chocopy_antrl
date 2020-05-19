public class Visitor<T> extends ChocopyBaseVisitor{
    @Override
    public Object visitProgram(ChocopyParser.ProgramContext ctx) {
        System.out.println("Hooolaaa");
        return super.visitProgram(ctx);
    }
}
