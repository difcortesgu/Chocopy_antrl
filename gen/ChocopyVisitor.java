// Generated from C:/Users/diego/Documents/Lenguajes/Chocopy_antrl/grammar\Chocopy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChocopyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChocopyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ChocopyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(ChocopyParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(ChocopyParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(ChocopyParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(ChocopyParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#typed_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_var(ChocopyParser.Typed_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ChocopyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#global_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_decl(ChocopyParser.Global_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_decl(ChocopyParser.Nonlocal_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(ChocopyParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ChocopyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(ChocopyParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ChocopyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ChocopyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ChocopyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexpr(ChocopyParser.CexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(ChocopyParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(ChocopyParser.TargetContext ctx);
}