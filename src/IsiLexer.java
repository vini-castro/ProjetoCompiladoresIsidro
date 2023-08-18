// Generated from Isi.g4 by ANTLR 4.7.2

	import datastructures.IsiSymbol;
	import datastructures.IsiVariable;
	import datastructures.IsiSymbolTable;
	import exceptions.IsiSemanticException;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, AP=14, FP=15, Ponto=16, OP=17, 
		ID=18, NUMBER=19, OP_REL=20, TEXTO=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "AP", "FP", "Ponto", "OP", "ID", "NUMBER", 
			"OP_REL", "TEXTO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'declare'", "','", "'leia'", "'escreva'", 
			"':='", "'if'", "'{'", "'}'", "'else'", "'while'", "'do'", "'('", "')'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "AP", "FP", "Ponto", "OP", "ID", "NUMBER", "OP_REL", "TEXTO", 
			"WS"
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


	    private int _tipo;
	    private String _varName;
	    private String _varValue;
	    private IsiSymbolTable symbolTable = new IsiSymbolTable();
	    private IsiSymbol symbol;


	public IsiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Isi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\5\23z\n\23\3\23\7\23}\n\23\f\23\16\23\u0080\13\23\3\24"+
		"\6\24\u0083\n\24\r\24\16\24\u0084\3\24\3\24\6\24\u0089\n\24\r\24\16\24"+
		"\u008a\5\24\u008d\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u0098\n\25\3\26\3\26\7\26\u009c\n\26\f\26\16\26\u009f\13\26\3\26\3"+
		"\26\3\27\6\27\u00a4\n\27\r\27\16\27\u00a5\3\27\3\27\2\2\30\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30\3\2\t\5\2,-//\61\61\4\2C\\c|\5\2\62;C\\c|\3\2\62"+
		";\4\2>>@@\b\2\13\13\"#//\62;C\\c|\5\2\13\f\17\17\"\"\2\u00b2\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\58\3\2\2"+
		"\2\7A\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rP\3\2\2\2\17X\3\2\2\2\21[\3\2\2"+
		"\2\23^\3\2\2\2\25`\3\2\2\2\27b\3\2\2\2\31g\3\2\2\2\33m\3\2\2\2\35p\3\2"+
		"\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%y\3\2\2\2\'\u0082\3\2\2\2)\u0097"+
		"\3\2\2\2+\u0099\3\2\2\2-\u00a3\3\2\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7"+
		"q\2\2\62\63\7i\2\2\63\64\7t\2\2\64\65\7c\2\2\65\66\7o\2\2\66\67\7c\2\2"+
		"\67\4\3\2\2\289\7h\2\29:\7k\2\2:;\7o\2\2;<\7r\2\2<=\7t\2\2=>\7q\2\2>?"+
		"\7i\2\2?@\7\60\2\2@\6\3\2\2\2AB\7f\2\2BC\7g\2\2CD\7e\2\2DE\7n\2\2EF\7"+
		"c\2\2FG\7t\2\2GH\7g\2\2H\b\3\2\2\2IJ\7.\2\2J\n\3\2\2\2KL\7n\2\2LM\7g\2"+
		"\2MN\7k\2\2NO\7c\2\2O\f\3\2\2\2PQ\7g\2\2QR\7u\2\2RS\7e\2\2ST\7t\2\2TU"+
		"\7g\2\2UV\7x\2\2VW\7c\2\2W\16\3\2\2\2XY\7<\2\2YZ\7?\2\2Z\20\3\2\2\2[\\"+
		"\7k\2\2\\]\7h\2\2]\22\3\2\2\2^_\7}\2\2_\24\3\2\2\2`a\7\177\2\2a\26\3\2"+
		"\2\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f\30\3\2\2\2gh\7y\2\2hi\7j\2\2"+
		"ij\7k\2\2jk\7n\2\2kl\7g\2\2l\32\3\2\2\2mn\7f\2\2no\7q\2\2o\34\3\2\2\2"+
		"pq\7*\2\2q\36\3\2\2\2rs\7+\2\2s \3\2\2\2tu\7\60\2\2u\"\3\2\2\2vw\t\2\2"+
		"\2w$\3\2\2\2xz\t\3\2\2yx\3\2\2\2z~\3\2\2\2{}\t\4\2\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177&\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\t\5\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u008c\3\2\2\2\u0086\u0088\7\60\2\2\u0087\u0089\t"+
		"\5\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d(\3\2\2\2\u008e\u0098\t\6\2\2\u008f\u0090\7>\2\2\u0090\u0098"+
		"\7?\2\2\u0091\u0092\7@\2\2\u0092\u0098\7?\2\2\u0093\u0094\7#\2\2\u0094"+
		"\u0098\7?\2\2\u0095\u0096\7?\2\2\u0096\u0098\7?\2\2\u0097\u008e\3\2\2"+
		"\2\u0097\u008f\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098*\3\2\2\2\u0099\u009d\7$\2\2\u009a\u009c\t\7\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1,\3\2\2\2\u00a2"+
		"\u00a4\t\b\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\27\2\2\u00a8"+
		".\3\2\2\2\r\2y|~\u0084\u008a\u008c\u0097\u009b\u009d\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}