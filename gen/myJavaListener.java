// Generated from C:/Users/hikse/IdeaProjects/CourseWork/src\myJava.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myJavaParser}.
 */
public interface myJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(myJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(myJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link myJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(myJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(myJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(myJavaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(myJavaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link myJavaParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(myJavaParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(myJavaParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link myJavaParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(myJavaParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(myJavaParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link myJavaParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(myJavaParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(myJavaParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link myJavaParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(myJavaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(myJavaParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link myJavaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(myJavaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link myJavaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(myJavaParser.PrintContext ctx);
}