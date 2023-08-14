// Generated from Isi.g4 by ANTLR 4.7.2
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
		T__9=10, AP=11, FP=12, Ponto=13, OP=14, ATTR=15, ID=16, NUMBER=17, ASPAS=18, 
		OP_REL=19, TEXTO=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "AP", "FP", "Ponto", "OP", "ATTR", "ID", "NUMBER", "ASPAS", "OP_REL", 
			"TEXTO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'declare'", "','", "'leia'", "'escreva'", 
			"'if'", "'{'", "'}'", "'else'", "'('", "')'", "'.'", null, "':='", null, 
			null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AP", 
			"FP", "Ponto", "OP", "ATTR", "ID", "NUMBER", "ASPAS", "OP_REL", "TEXTO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\5\21o\n\21\3\21\7\21r\n\21\f"+
		"\21\16\21u\13\21\3\22\6\22x\n\22\r\22\16\22y\3\22\3\22\6\22~\n\22\r\22"+
		"\16\22\177\5\22\u0082\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u008f\n\24\3\25\6\25\u0092\n\25\r\25\16\25\u0093\3\26"+
		"\6\26\u0097\n\26\r\26\16\26\u0098\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27\3\2\n\5\2,-//\61\61\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\60\60"+
		"\62\62;;\4\2>>@@\6\2\"\"\62;C\\c|\5\2\13\f\17\17\"\"\2\u00a5\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\66\3\2\2\2\7?\3\2"+
		"\2\2\tG\3\2\2\2\13I\3\2\2\2\rN\3\2\2\2\17V\3\2\2\2\21Y\3\2\2\2\23[\3\2"+
		"\2\2\25]\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3"+
		"\2\2\2!n\3\2\2\2#w\3\2\2\2%\u0083\3\2\2\2\'\u008e\3\2\2\2)\u0091\3\2\2"+
		"\2+\u0096\3\2\2\2-.\7r\2\2./\7t\2\2/\60\7q\2\2\60\61\7i\2\2\61\62\7t\2"+
		"\2\62\63\7c\2\2\63\64\7o\2\2\64\65\7c\2\2\65\4\3\2\2\2\66\67\7h\2\2\67"+
		"8\7k\2\289\7o\2\29:\7r\2\2:;\7t\2\2;<\7q\2\2<=\7i\2\2=>\7\60\2\2>\6\3"+
		"\2\2\2?@\7f\2\2@A\7g\2\2AB\7e\2\2BC\7n\2\2CD\7c\2\2DE\7t\2\2EF\7g\2\2"+
		"F\b\3\2\2\2GH\7.\2\2H\n\3\2\2\2IJ\7n\2\2JK\7g\2\2KL\7k\2\2LM\7c\2\2M\f"+
		"\3\2\2\2NO\7g\2\2OP\7u\2\2PQ\7e\2\2QR\7t\2\2RS\7g\2\2ST\7x\2\2TU\7c\2"+
		"\2U\16\3\2\2\2VW\7k\2\2WX\7h\2\2X\20\3\2\2\2YZ\7}\2\2Z\22\3\2\2\2[\\\7"+
		"\177\2\2\\\24\3\2\2\2]^\7g\2\2^_\7n\2\2_`\7u\2\2`a\7g\2\2a\26\3\2\2\2"+
		"bc\7*\2\2c\30\3\2\2\2de\7+\2\2e\32\3\2\2\2fg\7\60\2\2g\34\3\2\2\2hi\t"+
		"\2\2\2i\36\3\2\2\2jk\7<\2\2kl\7?\2\2l \3\2\2\2mo\t\3\2\2nm\3\2\2\2os\3"+
		"\2\2\2pr\t\4\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\"\3\2\2\2us"+
		"\3\2\2\2vx\t\5\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0081\3\2"+
		"\2\2{}\7\60\2\2|~\t\6\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"$\3\2\2\2\u0083\u0084\7$\2\2\u0084&\3\2\2\2\u0085\u008f\t\7\2\2\u0086"+
		"\u0087\7>\2\2\u0087\u008f\7?\2\2\u0088\u0089\7@\2\2\u0089\u008f\7?\2\2"+
		"\u008a\u008b\7#\2\2\u008b\u008f\7?\2\2\u008c\u008d\7?\2\2\u008d\u008f"+
		"\7?\2\2\u008e\u0085\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0088\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f(\3\2\2\2\u0090\u0092\t\b\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094*\3\2\2\2\u0095\u0097\t\t\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\b\26\2\2\u009b,\3\2\2\2\r\2nqsy\177\u0081\u008e\u0091"+
		"\u0093\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}