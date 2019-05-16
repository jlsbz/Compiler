// Generated from C:/Users/93739/IdeaProjects/MStar/src/main/resources\MStarTree.g4 by ANTLR 4.7.2
package MStarTree;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MStarTreeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, WHILE=4, BREAK=5, CONTINUE=6, RETURN=7, CLASS=8, 
		NEW=9, THIS=10, LPAREN=11, RPAREN=12, LBRACK=13, RBRACK=14, LBRACE=15, 
		RBRACE=16, SEMI=17, COMMA=18, COLON=19, DOT=20, ASSIGN=21, SELFINC=22, 
		SELFDEC=23, ADD=24, SUB=25, MUL=26, DIV=27, MOD=28, NEG=29, NOT=30, LSHIFT=31, 
		RSHIFT=32, LT=33, GT=34, LE=35, GE=36, EQ=37, NEQ=38, AND=39, OR=40, XOR=41, 
		LOGAND=42, LOGOR=43, VOID=44, BOOL=45, INT=46, STRING=47, NUMBER=48, ESC=49, 
		STR=50, BoolConstant=51, NullLiteral=52, ID=53, COMMENT=54, LINECOMMENT=55, 
		BLOCKCOMMENT=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "CLASS", 
			"NEW", "THIS", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"SEMI", "COMMA", "COLON", "DOT", "ASSIGN", "SELFINC", "SELFDEC", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "NEG", "NOT", "LSHIFT", "RSHIFT", "LT", "GT", 
			"LE", "GE", "EQ", "NEQ", "AND", "OR", "XOR", "LOGAND", "LOGOR", "VOID", 
			"BOOL", "INT", "STRING", "NULL", "TRUE", "FALSE", "NUMBER", "ESC", "STR", 
			"BoolConstant", "NullLiteral", "ID", "COMMENT", "LINECOMMENT", "BLOCKCOMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'class'", "'new'", "'this'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "';'", "','", "':'", "'.'", "'='", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'<<'", "'>>'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'^'", "'&&'", "'||'", 
			"'void'", "'bool'", "'int'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", "CLASS", 
			"NEW", "THIS", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"SEMI", "COMMA", "COLON", "DOT", "ASSIGN", "SELFINC", "SELFDEC", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "NEG", "NOT", "LSHIFT", "RSHIFT", "LT", "GT", 
			"LE", "GE", "EQ", "NEQ", "AND", "OR", "XOR", "LOGAND", "LOGOR", "VOID", 
			"BOOL", "INT", "STRING", "NUMBER", "ESC", "STR", "BoolConstant", "NullLiteral", 
			"ID", "COMMENT", "LINECOMMENT", "BLOCKCOMMENT", "WS"
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


	public MStarTreeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MStarTree.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\7\64\u0126\n\64\f\64\16\64\u0129\13\64\3\64\5\64\u012c\n\64\3\65"+
		"\3\65\3\65\3\65\5\65\u0132\n\65\3\66\3\66\3\66\7\66\u0137\n\66\f\66\16"+
		"\66\u013a\13\66\3\66\3\66\3\67\3\67\5\67\u0140\n\67\38\38\39\39\79\u0146"+
		"\n9\f9\169\u0149\139\3:\3:\5:\u014d\n:\3;\3;\3;\3;\7;\u0153\n;\f;\16;"+
		"\u0156\13;\3;\3;\3<\3<\3<\3<\7<\u015e\n<\f<\16<\u0161\13<\3<\3<\3<\3<"+
		"\3<\3=\6=\u0169\n=\r=\16=\u016a\3=\3=\4\u0138\u015f\2>\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\62i\63k\64m\65o\66q\67s8u9w:y;\3"+
		"\2\b\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2\u0175\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5~\3\2\2"+
		"\2\7\u0083\3\2\2\2\t\u0087\3\2\2\2\13\u008d\3\2\2\2\r\u0093\3\2\2\2\17"+
		"\u009c\3\2\2\2\21\u00a3\3\2\2\2\23\u00a9\3\2\2\2\25\u00ad\3\2\2\2\27\u00b2"+
		"\3\2\2\2\31\u00b4\3\2\2\2\33\u00b6\3\2\2\2\35\u00b8\3\2\2\2\37\u00ba\3"+
		"\2\2\2!\u00bc\3\2\2\2#\u00be\3\2\2\2%\u00c0\3\2\2\2\'\u00c2\3\2\2\2)\u00c4"+
		"\3\2\2\2+\u00c6\3\2\2\2-\u00c8\3\2\2\2/\u00cb\3\2\2\2\61\u00ce\3\2\2\2"+
		"\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00d8"+
		"\3\2\2\2=\u00da\3\2\2\2?\u00dc\3\2\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E"+
		"\u00e4\3\2\2\2G\u00e6\3\2\2\2I\u00e9\3\2\2\2K\u00ec\3\2\2\2M\u00ef\3\2"+
		"\2\2O\u00f2\3\2\2\2Q\u00f4\3\2\2\2S\u00f6\3\2\2\2U\u00f8\3\2\2\2W\u00fb"+
		"\3\2\2\2Y\u00fe\3\2\2\2[\u0103\3\2\2\2]\u0108\3\2\2\2_\u010c\3\2\2\2a"+
		"\u0113\3\2\2\2c\u0118\3\2\2\2e\u011d\3\2\2\2g\u012b\3\2\2\2i\u0131\3\2"+
		"\2\2k\u0133\3\2\2\2m\u013f\3\2\2\2o\u0141\3\2\2\2q\u0143\3\2\2\2s\u014c"+
		"\3\2\2\2u\u014e\3\2\2\2w\u0159\3\2\2\2y\u0168\3\2\2\2{|\7k\2\2|}\7h\2"+
		"\2}\4\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082"+
		"\7g\2\2\u0082\6\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7t\2\2\u0086\b\3\2\2\2\u0087\u0088\7y\2\2\u0088\u0089\7j\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\n\3\2\2\2\u008d\u008e"+
		"\7d\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7m\2\2\u0092\f\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2"+
		"\u0099\u009a\7w\2\2\u009a\u009b\7g\2\2\u009b\16\3\2\2\2\u009c\u009d\7"+
		"t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00a2\7p\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\22\3\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7y\2\2\u00ac"+
		"\24\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\30\3\2\2\2\u00b4"+
		"\u00b5\7+\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7\34\3\2\2\2\u00b8"+
		"\u00b9\7_\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb \3\2\2\2\u00bc"+
		"\u00bd\7\177\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7=\2\2\u00bf$\3\2\2\2\u00c0"+
		"\u00c1\7.\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7<\2\2\u00c3(\3\2\2\2\u00c4\u00c5"+
		"\7\60\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7,\3\2\2\2\u00c8\u00c9"+
		"\7-\2\2\u00c9\u00ca\7-\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd"+
		"\7/\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf\62\3\2\2\2\u00d0\u00d1"+
		"\7/\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\66\3\2\2\2\u00d4\u00d5"+
		"\7\61\2\2\u00d58\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7:\3\2\2\2\u00d8\u00d9"+
		"\7#\2\2\u00d9<\3\2\2\2\u00da\u00db\7\u0080\2\2\u00db>\3\2\2\2\u00dc\u00dd"+
		"\7>\2\2\u00dd\u00de\7>\2\2\u00de@\3\2\2\2\u00df\u00e0\7@\2\2\u00e0\u00e1"+
		"\7@\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7"+
		"@\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\u00e8\7?\2\2\u00e8H\3\2"+
		"\2\2\u00e9\u00ea\7@\2\2\u00ea\u00eb\7?\2\2\u00ebJ\3\2\2\2\u00ec\u00ed"+
		"\7?\2\2\u00ed\u00ee\7?\2\2\u00eeL\3\2\2\2\u00ef\u00f0\7#\2\2\u00f0\u00f1"+
		"\7?\2\2\u00f1N\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7"+
		"~\2\2\u00f5R\3\2\2\2\u00f6\u00f7\7`\2\2\u00f7T\3\2\2\2\u00f8\u00f9\7("+
		"\2\2\u00f9\u00fa\7(\2\2\u00faV\3\2\2\2\u00fb\u00fc\7~\2\2\u00fc\u00fd"+
		"\7~\2\2\u00fdX\3\2\2\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7q\2\2\u0100\u0101"+
		"\7k\2\2\u0101\u0102\7f\2\2\u0102Z\3\2\2\2\u0103\u0104\7d\2\2\u0104\u0105"+
		"\7q\2\2\u0105\u0106\7q\2\2\u0106\u0107\7n\2\2\u0107\\\3\2\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7p\2\2\u010a\u010b\7v\2\2\u010b^\3\2\2\2\u010c\u010d"+
		"\7u\2\2\u010d\u010e\7v\2\2\u010e\u010f\7t\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u0111\7p\2\2\u0111\u0112\7i\2\2\u0112`\3\2\2\2\u0113\u0114\7p\2\2\u0114"+
		"\u0115\7w\2\2\u0115\u0116\7n\2\2\u0116\u0117\7n\2\2\u0117b\3\2\2\2\u0118"+
		"\u0119\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b\7w\2\2\u011b\u011c\7g\2\2"+
		"\u011cd\3\2\2\2\u011d\u011e\7h\2\2\u011e\u011f\7c\2\2\u011f\u0120\7n\2"+
		"\2\u0120\u0121\7u\2\2\u0121\u0122\7g\2\2\u0122f\3\2\2\2\u0123\u0127\t"+
		"\2\2\2\u0124\u0126\t\3\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012c\7\62\2\2\u012b\u0123\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"h\3\2\2\2\u012d\u012e\7^\2\2\u012e\u0132\7$\2\2\u012f\u0130\7^\2\2\u0130"+
		"\u0132\7^\2\2\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2\2\u0132j\3\2\2\2\u0133"+
		"\u0138\7$\2\2\u0134\u0137\5i\65\2\u0135\u0137\13\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$"+
		"\2\2\u013cl\3\2\2\2\u013d\u0140\5c\62\2\u013e\u0140\5e\63\2\u013f\u013d"+
		"\3\2\2\2\u013f\u013e\3\2\2\2\u0140n\3\2\2\2\u0141\u0142\5a\61\2\u0142"+
		"p\3\2\2\2\u0143\u0147\t\4\2\2\u0144\u0146\t\5\2\2\u0145\u0144\3\2\2\2"+
		"\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148r\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u014a\u014d\5u;\2\u014b\u014d\5w<\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014b\3\2\2\2\u014dt\3\2\2\2\u014e\u014f\7\61\2\2\u014f"+
		"\u0150\7\61\2\2\u0150\u0154\3\2\2\2\u0151\u0153\n\6\2\2\u0152\u0151\3"+
		"\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\b;\2\2\u0158v\3\2\2\2\u0159"+
		"\u015a\7\61\2\2\u015a\u015b\7,\2\2\u015b\u015f\3\2\2\2\u015c\u015e\13"+
		"\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7,"+
		"\2\2\u0163\u0164\7\61\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b<\2\2\u0166"+
		"x\3\2\2\2\u0167\u0169\t\7\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2"+
		"\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\b=\2\2\u016dz\3\2\2\2\16\2\u0127\u012b\u0131\u0136\u0138\u013f\u0147"+
		"\u014c\u0154\u015f\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}