// Generated from Isi.g4 by ANTLR 4.7.2

	import datastructures.IsiSymbol;
	import datastructures.IsiVariable;
	import datastructures.IsiSymbolTable;
	import exceptions.IsiSemanticException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiParser}.
 */
public interface IsiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IsiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IsiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(IsiParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(IsiParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(IsiParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(IsiParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(IsiParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(IsiParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(IsiParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(IsiParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpr(IsiParser.CmdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpr(IsiParser.CmdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(IsiParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(IsiParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(IsiParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(IsiParser.TermoContext ctx);
}