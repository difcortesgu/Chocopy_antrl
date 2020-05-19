// Generated from C:/Users/diego/IdeaProjects/Chocopy_Interpreter/grammar\Chocopy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChocopyParser}.
 */
public interface ChocopyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ChocopyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ChocopyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(ChocopyParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(ChocopyParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(ChocopyParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(ChocopyParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(ChocopyParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(ChocopyParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(ChocopyParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(ChocopyParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void enterTyped_var(ChocopyParser.Typed_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void exitTyped_var(ChocopyParser.Typed_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ChocopyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ChocopyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_decl(ChocopyParser.Global_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_decl(ChocopyParser.Global_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_decl(ChocopyParser.Nonlocal_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_decl(ChocopyParser.Nonlocal_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(ChocopyParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(ChocopyParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ChocopyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ChocopyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(ChocopyParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(ChocopyParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ChocopyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ChocopyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ChocopyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ChocopyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ChocopyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ChocopyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(ChocopyParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(ChocopyParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(ChocopyParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(ChocopyParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(ChocopyParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(ChocopyParser.TargetContext ctx);
}