// Generated from c:\Users\93739\IdeaProjects\Mx\src\main\resources\MStarTree.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MStarTreeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, INT=2, STRING=3, VOID=4, IF=5, ELSE=6, FOR=7, WHILE=8, BREAK=9, 
		CONTINUE=10, RETURN=11, CLASS=12, NEW=13, THIS=14, LPAREN=15, RPAREN=16, 
		LBRACK=17, RBRACK=18, LBRACE=19, RBRACE=20, SEMI=21, COMMA=22, COLON=23, 
		DOT=24, ASSIGN=25, SELFINC=26, SELFDEC=27, ADD=28, SUB=29, MUL=30, DIV=31, 
		MOD=32, NEG=33, NOT=34, LSHIFT=35, RSHIFT=36, LT=37, GT=38, LE=39, GE=40, 
		EQ=41, NEQ=42, AND=43, OR=44, XOR=45, LOGAND=46, LOGOR=47, LogicConstant=48, 
		IntegerConstant=49, StringConstant=50, NullConstant=51, Identifier=52, 
		WhiteSpace=53, NewLine=54, LineComment=55, BlockComment=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOL", "INT", "STRING", "VOID", "IF", "ELSE", "FOR", "WHILE", "BREAK", 
		"CONTINUE", "RETURN", "CLASS", "NEW", "THIS", "LPAREN", "RPAREN", "LBRACK", 
		"RBRACK", "LBRACE", "RBRACE", "SEMI", "COMMA", "COLON", "DOT", "ASSIGN", 
		"SELFINC", "SELFDEC", "ADD", "SUB", "MUL", "DIV", "MOD", "NEG", "NOT", 
		"LSHIFT", "RSHIFT", "LT", "GT", "LE", "GE", "EQ", "NEQ", "AND", "OR", 
		"XOR", "LOGAND", "LOGOR", "LogicConstant", "IntegerConstant", "StringConstant", 
		"NullConstant", "Identifier", "DecimalConstant", "EscapeSequence", "WhiteSpace", 
		"NewLine", "LineComment", "BlockComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bool'", "'int'", "'string'", "'void'", "'if'", "'else'", "'for'", 
		"'while'", "'break'", "'continue'", "'return'", "'class'", "'new'", "'this'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", "'.'", 
		"'='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", 
		"'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", 
		"'^'", "'&$'", "'||'", null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL", "INT", "STRING", "VOID", "IF", "ELSE", "FOR", "WHILE", "BREAK", 
		"CONTINUE", "RETURN", "CLASS", "NEW", "THIS", "LPAREN", "RPAREN", "LBRACK", 
		"RBRACK", "LBRACE", "RBRACE", "SEMI", "COMMA", "COLON", "DOT", "ASSIGN", 
		"SELFINC", "SELFDEC", "ADD", "SUB", "MUL", "DIV", "MOD", "NEG", "NOT", 
		"LSHIFT", "RSHIFT", "LT", "GT", "LE", "GE", "EQ", "NEQ", "AND", "OR", 
		"XOR", "LOGAND", "LOGOR", "LogicConstant", "IntegerConstant", "StringConstant", 
		"NullConstant", "Identifier", "WhiteSpace", "NewLine", "LineComment", 
		"BlockComment"
	};
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


	public MStarTreeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "src/main/MStarTree.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0166\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0119\n\61\3\62\3\62\3\63\3\63"+
		"\3\63\7\63\u0120\n\63\f\63\16\63\u0123\13\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\7\65\u012e\n\65\f\65\16\65\u0131\13\65\3\66\3\66"+
		"\7\66\u0135\n\66\f\66\16\66\u0138\13\66\3\66\5\66\u013b\n\66\3\67\3\67"+
		"\3\67\38\68\u0141\n8\r8\168\u0142\38\38\39\69\u0148\n9\r9\169\u0149\3"+
		"9\39\3:\3:\3:\3:\7:\u0152\n:\f:\16:\u0155\13:\3:\3:\3;\3;\3;\3;\7;\u015d"+
		"\n;\f;\16;\u0160\13;\3;\3;\3;\3;\3;\3\u015e\2<\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\67q8s9u:\3\2\n\6\2\f"+
		"\f\17\17$$^^\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\f\2$$))AA^^cdhhp"+
		"pttvvxx\4\2\13\13\"\"\4\2\f\f\17\17\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3"+
		"w\3\2\2\2\5|\3\2\2\2\7\u0080\3\2\2\2\t\u0087\3\2\2\2\13\u008c\3\2\2\2"+
		"\r\u008f\3\2\2\2\17\u0094\3\2\2\2\21\u0098\3\2\2\2\23\u009e\3\2\2\2\25"+
		"\u00a4\3\2\2\2\27\u00ad\3\2\2\2\31\u00b4\3\2\2\2\33\u00ba\3\2\2\2\35\u00be"+
		"\3\2\2\2\37\u00c3\3\2\2\2!\u00c5\3\2\2\2#\u00c7\3\2\2\2%\u00c9\3\2\2\2"+
		"\'\u00cb\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2/\u00d3\3"+
		"\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67\u00dc\3\2"+
		"\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2\2\2A\u00e7"+
		"\3\2\2\2C\u00e9\3\2\2\2E\u00eb\3\2\2\2G\u00ed\3\2\2\2I\u00f0\3\2\2\2K"+
		"\u00f3\3\2\2\2M\u00f5\3\2\2\2O\u00f7\3\2\2\2Q\u00fa\3\2\2\2S\u00fd\3\2"+
		"\2\2U\u0100\3\2\2\2W\u0103\3\2\2\2Y\u0105\3\2\2\2[\u0107\3\2\2\2]\u0109"+
		"\3\2\2\2_\u010c\3\2\2\2a\u0118\3\2\2\2c\u011a\3\2\2\2e\u011c\3\2\2\2g"+
		"\u0126\3\2\2\2i\u012b\3\2\2\2k\u013a\3\2\2\2m\u013c\3\2\2\2o\u0140\3\2"+
		"\2\2q\u0147\3\2\2\2s\u014d\3\2\2\2u\u0158\3\2\2\2wx\7d\2\2xy\7q\2\2yz"+
		"\7q\2\2z{\7n\2\2{\4\3\2\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\6\3\2\2"+
		"\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7i\2\2\u0086\b\3\2\2\2\u0087\u0088"+
		"\7x\2\2\u0088\u0089\7q\2\2\u0089\u008a\7k\2\2\u008a\u008b\7f\2\2\u008b"+
		"\n\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7h\2\2\u008e\f\3\2\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2"+
		"\u0093\16\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7q\2\2\u0096\u0097\7"+
		"t\2\2\u0097\20\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a\7j\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\22\3\2\2\2\u009e\u009f"+
		"\7d\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7m\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2"+
		"\u00aa\u00ab\7w\2\2\u00ab\u00ac\7g\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7"+
		"t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\u00b3\7p\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\32\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7y\2\2\u00bd"+
		"\34\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4 \3\2\2\2\u00c5"+
		"\u00c6\7+\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7]\2\2\u00c8$\3\2\2\2\u00c9"+
		"\u00ca\7_\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7}\2\2\u00cc(\3\2\2\2\u00cd\u00ce"+
		"\7\177\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7=\2\2\u00d0,\3\2\2\2\u00d1\u00d2"+
		"\7.\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4\60\3\2\2\2\u00d5\u00d6"+
		"\7\60\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7?\2\2\u00d8\64\3\2\2\2\u00d9\u00da"+
		"\7-\2\2\u00da\u00db\7-\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd\u00de"+
		"\7/\2\2\u00de8\3\2\2\2\u00df\u00e0\7-\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7"+
		"/\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7\61"+
		"\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7\'\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7#"+
		"\2\2\u00eaD\3\2\2\2\u00eb\u00ec\7\u0080\2\2\u00ecF\3\2\2\2\u00ed\u00ee"+
		"\7>\2\2\u00ee\u00ef\7>\2\2\u00efH\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2"+
		"\7@\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7"+
		"@\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7?\2\2\u00f9P\3\2"+
		"\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc\7?\2\2\u00fcR\3\2\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe\u00ff\7?\2\2\u00ffT\3\2\2\2\u0100\u0101\7#\2\2\u0101\u0102"+
		"\7?\2\2\u0102V\3\2\2\2\u0103\u0104\7(\2\2\u0104X\3\2\2\2\u0105\u0106\7"+
		"~\2\2\u0106Z\3\2\2\2\u0107\u0108\7`\2\2\u0108\\\3\2\2\2\u0109\u010a\7"+
		"(\2\2\u010a\u010b\7&\2\2\u010b^\3\2\2\2\u010c\u010d\7~\2\2\u010d\u010e"+
		"\7~\2\2\u010e`\3\2\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111\u0112"+
		"\7w\2\2\u0112\u0119\7g\2\2\u0113\u0114\7h\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117\u0119\7g\2\2\u0118\u010f\3\2\2"+
		"\2\u0118\u0113\3\2\2\2\u0119b\3\2\2\2\u011a\u011b\5k\66\2\u011bd\3\2\2"+
		"\2\u011c\u0121\7$\2\2\u011d\u0120\n\2\2\2\u011e\u0120\5m\67\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$"+
		"\2\2\u0125f\3\2\2\2\u0126\u0127\7p\2\2\u0127\u0128\7w\2\2\u0128\u0129"+
		"\7n\2\2\u0129\u012a\7n\2\2\u012ah\3\2\2\2\u012b\u012f\t\3\2\2\u012c\u012e"+
		"\t\4\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130j\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0136\t\5\2\2"+
		"\u0133\u0135\t\6\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013b\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013b\7\62\2\2\u013a\u0132\3\2\2\2\u013a\u0139\3\2\2\2\u013bl\3\2\2\2"+
		"\u013c\u013d\7^\2\2\u013d\u013e\t\7\2\2\u013en\3\2\2\2\u013f\u0141\t\b"+
		"\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b8\2\2\u0145p\3\2\2\2\u0146"+
		"\u0148\t\t\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b9\2\2\u014c"+
		"r\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u014f\7\61\2\2\u014f\u0153\3\2\2"+
		"\2\u0150\u0152\n\t\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0157\b:\2\2\u0157t\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015a\7,\2\2\u015a"+
		"\u015e\3\2\2\2\u015b\u015d\13\2\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0162\7,\2\2\u0162\u0163\7\61\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0165\b;\2\2\u0165v\3\2\2\2\r\2\u0118\u011f\u0121\u012f\u0136"+
		"\u013a\u0142\u0149\u0153\u015e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}