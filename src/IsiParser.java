// Generated from Isi.g4 by ANTLR 4.7.2

	import datastructures.IsiSymbol;
	import datastructures.IsiVariable;
	import datastructures.IsiSymbolTable;
	import exceptions.IsiSemanticException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, AP=12, FP=13, Ponto=14, OP=15, ID=16, NUMBER=17, OP_REL=18, 
		TEXTO=19, WS=20;
	public static final int
		RULE_prog = 0, RULE_declara = 1, RULE_bloco = 2, RULE_cmd = 3, RULE_cmdLeitura = 4, 
		RULE_cmdEscrita = 5, RULE_cmdExpr = 6, RULE_cmdIf = 7, RULE_expr = 8, 
		RULE_termo = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declara", "bloco", "cmd", "cmdLeitura", "cmdEscrita", "cmdExpr", 
			"cmdIf", "expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'declare'", "','", "'leia'", "'escreva'", 
			"':='", "'if'", "'{'", "'}'", "'else'", "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"AP", "FP", "Ponto", "OP", "ID", "NUMBER", "OP_REL", "TEXTO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Isi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int _tipo;
	    private String _varName;
	    private String _varValue;
	    private IsiSymbolTable symbolTable = new IsiSymbolTable();
	    private IsiSymbol symbol;

	public IsiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<DeclaraContext> declara() {
			return getRuleContexts(DeclaraContext.class);
		}
		public DeclaraContext declara(int i) {
			return getRuleContext(DeclaraContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				declara();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(26);
			bloco();
			setState(27);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiParser.ID, i);
		}
		public TerminalNode Ponto() { return getToken(IsiParser.Ponto, 0); }
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__2);
			setState(30);
			match(ID);

			                          _varName = _input.LT(-1).getText();
			                          _varValue = null;
			                          symbol = new IsiVariable(_varName, _tipo, _varValue);
			                          if (!symbolTable.exists(_varName)){
			                             symbolTable.add(symbol);
			                          }
			                          else{
			                             throw new IsiSemanticException("Simbolo '"+_varName+"' ja foi declarado previamente");
			                          }
			                         
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(32);
				match(T__3);
				setState(33);
				match(ID);

				                          _varName = _input.LT(-1).getText();
				                          _varValue = null;
				                          symbol = new IsiVariable(_varName, _tipo, _varValue);
				                          if (!symbolTable.exists(_varName)){
				                             symbolTable.add(symbol);
				                          }
				                          else{
				                             throw new IsiSemanticException("Simbolo '"+_varName+"' ja foi declarado previamente");
				                          }
				                       
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(Ponto);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				cmd();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdExprContext cmdExpr() {
			return getRuleContext(CmdExprContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				cmdLeitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				cmdEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				cmdExpr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				cmdIf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiParser.FP, 0); }
		public TerminalNode Ponto() { return getToken(IsiParser.Ponto, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__4);
			setState(54);
			match(AP);
			setState(55);
			match(ID);
			 _varName = _input.LT(-1).getText();
			                            if (!symbolTable.exists(_varName)){
			                                throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
			                            }
			                       
			setState(57);
			match(FP);
			setState(58);
			match(Ponto);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiParser.FP, 0); }
		public TerminalNode Ponto() { return getToken(IsiParser.Ponto, 0); }
		public TerminalNode TEXTO() { return getToken(IsiParser.TEXTO, 0); }
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(61);
				match(AP);
				setState(62);
				match(TEXTO);
				setState(63);
				match(FP);
				setState(64);
				match(Ponto);
				}
				}
				break;
			case 2:
				{
				setState(65);
				match(AP);
				setState(66);
				match(ID);
				 _varName = _input.LT(-1).getText();
				                       if (!symbolTable.exists(_varName)){
				                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
				                       }
				                   
				setState(68);
				match(FP);
				setState(69);
				match(Ponto);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(IsiParser.Ponto, 0); }
		public CmdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterCmdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitCmdExpr(this);
		}
	}

	public final CmdExprContext cmdExpr() throws RecognitionException {
		CmdExprContext _localctx = new CmdExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ID);
			 _varName = _input.LT(-1).getText();
			               if (!symbolTable.exists(_varName)){
			                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
			               }
			             
			setState(74);
			match(T__6);
			setState(75);
			expr();
			setState(76);
			match(Ponto);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(IsiParser.OP_REL, 0); }
		public TerminalNode FP() { return getToken(IsiParser.FP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__7);
			setState(79);
			match(AP);
			setState(80);
			expr();
			setState(81);
			match(OP_REL);
			setState(82);
			expr();
			setState(83);
			match(FP);
			setState(84);
			match(T__8);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				cmd();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << ID))) != 0) );
			setState(90);
			match(T__9);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(91);
				match(T__10);
				setState(92);
				match(T__8);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					cmd();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << ID))) != 0) );
				setState(98);
				match(T__9);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(IsiParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(IsiParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			termo();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(103);
				match(OP);
				setState(104);
				termo();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(IsiParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiListener ) ((IsiListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_termo);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(ID);
				 _varName = _input.LT(-1).getText();
				               if (!symbolTable.exists(_varName)){
				                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
				               }
				            
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\3\3\3\3\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\3\5\3\5\5"+
		"\5\66\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\6\tY\n\t\r\t\16\tZ\3\t\3\t\3\t\3\t\6\ta\n\t\r\t\16\tb\3\t\3\t\5\t"+
		"g\n\t\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\13\3\13\3\13\5\13t\n\13\3"+
		"\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2w\2\26\3\2\2\2\4\37\3\2\2\2\6-"+
		"\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f>\3\2\2\2\16J\3\2\2\2\20P\3\2\2\2"+
		"\22h\3\2\2\2\24s\3\2\2\2\26\30\7\3\2\2\27\31\5\4\3\2\30\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\5\6\4\2\35"+
		"\36\7\4\2\2\36\3\3\2\2\2\37 \7\5\2\2 !\7\22\2\2!\'\b\3\1\2\"#\7\6\2\2"+
		"#$\7\22\2\2$&\b\3\1\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2"+
		"\2\2)\'\3\2\2\2*+\7\20\2\2+\5\3\2\2\2,.\5\b\5\2-,\3\2\2\2./\3\2\2\2/-"+
		"\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61\66\5\n\6\2\62\66\5\f\7\2\63\66\5"+
		"\16\b\2\64\66\5\20\t\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64"+
		"\3\2\2\2\66\t\3\2\2\2\678\7\7\2\289\7\16\2\29:\7\22\2\2:;\b\6\1\2;<\7"+
		"\17\2\2<=\7\20\2\2=\13\3\2\2\2>H\7\b\2\2?@\7\16\2\2@A\7\25\2\2AB\7\17"+
		"\2\2BI\7\20\2\2CD\7\16\2\2DE\7\22\2\2EF\b\7\1\2FG\7\17\2\2GI\7\20\2\2"+
		"H?\3\2\2\2HC\3\2\2\2I\r\3\2\2\2JK\7\22\2\2KL\b\b\1\2LM\7\t\2\2MN\5\22"+
		"\n\2NO\7\20\2\2O\17\3\2\2\2PQ\7\n\2\2QR\7\16\2\2RS\5\22\n\2ST\7\24\2\2"+
		"TU\5\22\n\2UV\7\17\2\2VX\7\13\2\2WY\5\b\5\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\f\7\f\2\2]^\7\r\2\2^`\7\13\2\2_a\5\b\5\2`_"+
		"\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2\2eg\3\2\2\2f"+
		"]\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hm\5\24\13\2ij\7\21\2\2jl\5\24\13\2ki\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2om\3\2\2\2pq\7\22\2\2"+
		"qt\b\13\1\2rt\7\23\2\2sp\3\2\2\2sr\3\2\2\2t\25\3\2\2\2\f\32\'/\65HZbf"+
		"ms";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}