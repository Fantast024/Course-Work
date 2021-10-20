// Generated from C:/Users/hikse/IdeaProjects/CourseWork/src\myJava.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, NUMBER=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "NUMBER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'class'", "'{'", "'}'", 
			"'int'", "'='", "';'", "'+='", "'-='", "'*='", "'/='", "'System.out.println('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUMBER", "WS"
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


	public myJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\6\21v\n\21\r\21\16\21w\3\22\6\22{\n\22\r\22\16\22|\3\23\6\23"+
		"\u0080\n\23\r\23\16\23\u0081\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\5\3"+
		"\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5."+
		"\3\2\2\2\7\66\3\2\2\2\t@\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21"+
		"N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27U\3\2\2\2\31X\3\2\2\2\33[\3\2\2\2"+
		"\35^\3\2\2\2\37r\3\2\2\2!u\3\2\2\2#z\3\2\2\2%\177\3\2\2\2\'(\7r\2\2()"+
		"\7w\2\2)*\7d\2\2*+\7n\2\2+,\7k\2\2,-\7e\2\2-\4\3\2\2\2./\7r\2\2/\60\7"+
		"t\2\2\60\61\7k\2\2\61\62\7x\2\2\62\63\7c\2\2\63\64\7v\2\2\64\65\7g\2\2"+
		"\65\6\3\2\2\2\66\67\7r\2\2\678\7t\2\289\7q\2\29:\7v\2\2:;\7g\2\2;<\7e"+
		"\2\2<=\7v\2\2=>\7g\2\2>?\7f\2\2?\b\3\2\2\2@A\7e\2\2AB\7n\2\2BC\7c\2\2"+
		"CD\7u\2\2DE\7u\2\2E\n\3\2\2\2FG\7}\2\2G\f\3\2\2\2HI\7\177\2\2I\16\3\2"+
		"\2\2JK\7k\2\2KL\7p\2\2LM\7v\2\2M\20\3\2\2\2NO\7?\2\2O\22\3\2\2\2PQ\7="+
		"\2\2Q\24\3\2\2\2RS\7-\2\2ST\7?\2\2T\26\3\2\2\2UV\7/\2\2VW\7?\2\2W\30\3"+
		"\2\2\2XY\7,\2\2YZ\7?\2\2Z\32\3\2\2\2[\\\7\61\2\2\\]\7?\2\2]\34\3\2\2\2"+
		"^_\7U\2\2_`\7{\2\2`a\7u\2\2ab\7v\2\2bc\7g\2\2cd\7o\2\2de\7\60\2\2ef\7"+
		"q\2\2fg\7w\2\2gh\7v\2\2hi\7\60\2\2ij\7r\2\2jk\7t\2\2kl\7k\2\2lm\7p\2\2"+
		"mn\7v\2\2no\7n\2\2op\7p\2\2pq\7*\2\2q\36\3\2\2\2rs\7+\2\2s \3\2\2\2tv"+
		"\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\"\3\2\2\2y{\t\3\2\2"+
		"zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}$\3\2\2\2~\u0080\t\4\2\2\177"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\b\23\2\2\u0084&\3\2\2\2\6\2w|\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}