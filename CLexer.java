// Generated from C.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CONST=38, 
		POINTER=39, STRUCT=40, Identifier=41, Constant=42, DigitSequence=43, StringLiteral=44, 
		Whitespace=45, Newline=46, BlockComment=47, LineComment=48, IncludeDirective=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "CONST", "POINTER", "STRUCT", "Identifier", 
			"Constant", "DigitSequence", "StringLiteral", "SCharSequence", "SChar", 
			"Whitespace", "Newline", "BlockComment", "LineComment", "IncludeDirective"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'void'", "'char'", "'{'", "'}'", "','", "';'", "':'", 
			"'['", "']'", "'('", "')'", "'if'", "'else'", "'while'", "'for'", "'continue'", 
			"'break'", "'return'", "'='", "'.'", "'++'", "'--'", "'+'", "'-'", "'&'", 
			"'/'", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'...'", "'const'", "'*'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CONST", "POINTER", "STRUCT", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"IncludeDirective"
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


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\7*\u00f1\n*\f*\16*\u00f4\13*\3+\3+\7+\u00f8"+
		"\n+\f+\16+\u00fb\13+\3,\6,\u00fe\n,\r,\16,\u00ff\3-\3-\5-\u0104\n-\3-"+
		"\3-\3-\3-\3-\5-\u010b\n-\3.\6.\u010e\n.\r.\16.\u010f\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u011a\n/\3\60\6\60\u011d\n\60\r\60\16\60\u011e\3\60\3\60\3"+
		"\61\3\61\5\61\u0125\n\61\3\61\5\61\u0128\n\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\7\62\u0130\n\62\f\62\16\62\u0133\13\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\7\63\u013e\n\63\f\63\16\63\u0141\13\63\3\63\3\63"+
		"\3\64\3\64\5\64\u0147\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0152\n\64\3\64\3\64\7\64\u0156\n\64\f\64\16\64\u0159\13\64\3\64"+
		"\3\64\3\64\7\64\u015e\n\64\f\64\16\64\u0161\13\64\3\64\5\64\u0164\n\64"+
		"\3\64\5\64\u0167\n\64\3\64\3\64\3\64\3\64\3\u0131\2\65\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[\2]\2_/a\60c\61e\62g\63\3\2\n\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\3\2\63;\3\2\62;\6\2\f\f\17\17$$^^\r\2$$))\62\62AA^^cdhhppttvvxx\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5m\3\2\2"+
		"\2\7r\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\177\3\2"+
		"\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0087\3\2\2"+
		"\2\33\u0089\3\2\2\2\35\u008c\3\2\2\2\37\u0091\3\2\2\2!\u0097\3\2\2\2#"+
		"\u009b\3\2\2\2%\u00a4\3\2\2\2\'\u00aa\3\2\2\2)\u00b1\3\2\2\2+\u00b3\3"+
		"\2\2\2-\u00b5\3\2\2\2/\u00b8\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2"+
		"\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7"+
		"\3\2\2\2?\u00ca\3\2\2\2A\u00cc\3\2\2\2C\u00cf\3\2\2\2E\u00d2\3\2\2\2G"+
		"\u00d5\3\2\2\2I\u00d8\3\2\2\2K\u00db\3\2\2\2M\u00df\3\2\2\2O\u00e5\3\2"+
		"\2\2Q\u00e7\3\2\2\2S\u00ee\3\2\2\2U\u00f5\3\2\2\2W\u00fd\3\2\2\2Y\u010a"+
		"\3\2\2\2[\u010d\3\2\2\2]\u0119\3\2\2\2_\u011c\3\2\2\2a\u0127\3\2\2\2c"+
		"\u012b\3\2\2\2e\u0139\3\2\2\2g\u0144\3\2\2\2ij\7k\2\2jk\7p\2\2kl\7v\2"+
		"\2l\4\3\2\2\2mn\7x\2\2no\7q\2\2op\7k\2\2pq\7f\2\2q\6\3\2\2\2rs\7e\2\2"+
		"st\7j\2\2tu\7c\2\2uv\7t\2\2v\b\3\2\2\2wx\7}\2\2x\n\3\2\2\2yz\7\177\2\2"+
		"z\f\3\2\2\2{|\7.\2\2|\16\3\2\2\2}~\7=\2\2~\20\3\2\2\2\177\u0080\7<\2\2"+
		"\u0080\22\3\2\2\2\u0081\u0082\7]\2\2\u0082\24\3\2\2\2\u0083\u0084\7_\2"+
		"\2\u0084\26\3\2\2\2\u0085\u0086\7*\2\2\u0086\30\3\2\2\2\u0087\u0088\7"+
		"+\2\2\u0088\32\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\34"+
		"\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f"+
		"\u0090\7g\2\2\u0090\36\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096 \3\2\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a\"\3\2\2\2\u009b"+
		"\u009c\7e\2\2\u009c\u009d\7q\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7m\2\2\u00a9&\3\2\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2"+
		"*\3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6"+
		"\u00b7\7-\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\7/\2\2\u00ba"+
		"\60\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7/\2\2\u00be"+
		"\64\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2"+
		"8\3\2\2\2\u00c3\u00c4\7\'\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6"+
		"<\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\u00c9\7?\2\2\u00c9>\3\2\2\2\u00ca\u00cb"+
		"\7@\2\2\u00cb@\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\7?\2\2\u00ceB\3"+
		"\2\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7?\2\2\u00d1D\3\2\2\2\u00d2\u00d3"+
		"\7#\2\2\u00d3\u00d4\7?\2\2\u00d4F\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7"+
		"\7(\2\2\u00d7H\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da\7~\2\2\u00daJ\3"+
		"\2\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00de\7\60\2\2"+
		"\u00deL\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7p\2"+
		"\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4N\3\2\2\2\u00e5\u00e6\7"+
		",\2\2\u00e6P\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"R\3\2\2\2\u00ee\u00f2\t\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2"+
		"\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3T\3"+
		"\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f9\t\4\2\2\u00f6\u00f8\t\5\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00faV\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\t\5\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"X\3\2\2\2\u0101\u0103\7$\2\2\u0102\u0104\5[.\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010b\7$\2\2\u0106\u0107\7)\2"+
		"\2\u0107\u0108\5]/\2\u0108\u0109\7)\2\2\u0109\u010b\3\2\2\2\u010a\u0101"+
		"\3\2\2\2\u010a\u0106\3\2\2\2\u010bZ\3\2\2\2\u010c\u010e\5]/\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\\\3\2\2\2\u0111\u011a\n\6\2\2\u0112\u0113\7^\2\2\u0113\u011a\t\7\2\2"+
		"\u0114\u0115\7^\2\2\u0115\u011a\7\f\2\2\u0116\u0117\7^\2\2\u0117\u0118"+
		"\7\17\2\2\u0118\u011a\7\f\2\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2"+
		"\u0119\u0114\3\2\2\2\u0119\u0116\3\2\2\2\u011a^\3\2\2\2\u011b\u011d\t"+
		"\b\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b\60\2\2\u0121`\3\2\2\2"+
		"\u0122\u0124\7\17\2\2\u0123\u0125\7\f\2\2\u0124\u0123\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0128\7\f\2\2\u0127\u0122\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\61\2\2\u012ab\3\2\2\2"+
		"\u012b\u012c\7\61\2\2\u012c\u012d\7,\2\2\u012d\u0131\3\2\2\2\u012e\u0130"+
		"\13\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u0132\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135"+
		"\7,\2\2\u0135\u0136\7\61\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b\62\2\2"+
		"\u0138d\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b\7\61\2\2\u013b\u013f"+
		"\3\2\2\2\u013c\u013e\n\t\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0143\b\63\2\2\u0143f\3\2\2\2\u0144\u0146\7%\2\2\u0145\u0147"+
		"\5_\60\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\7k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7e\2\2\u014b\u014c\7n\2\2"+
		"\u014c\u014d\7w\2\2\u014d\u014e\7f\2\2\u014e\u014f\7g\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u0152\5_\60\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0163\3\2\2\2\u0153\u0157\7$\2\2\u0154\u0156\n\t\2\2\u0155\u0154\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u0164\7$\2\2\u015b\u015f\7>\2"+
		"\2\u015c\u015e\n\t\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0164\7@\2\2\u0163\u0153\3\2\2\2\u0163\u015b\3\2\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0167\5_\60\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\5a\61\2\u0169\u016a\3\2\2\2\u016a\u016b\b\64"+
		"\2\2\u016bh\3\2\2\2\26\2\u00f0\u00f2\u00f9\u00ff\u0103\u010a\u010f\u0119"+
		"\u011e\u0124\u0127\u0131\u013f\u0146\u0151\u0157\u015f\u0163\u0166\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}