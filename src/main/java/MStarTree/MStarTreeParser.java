// Generated from C:/Users/93739/IdeaProjects/MStar/src/main/resources\MStarTree.g4 by ANTLR 4.7.2
package MStarTree;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MStarTreeParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_functionDefinition = 1, RULE_classDefinition = 2, 
		RULE_variableDefinition = 3, RULE_memberDefinition = 4, RULE_parameterListDefinition = 5, 
		RULE_parameterDefinition = 6, RULE_functionType = 7, RULE_typeType = 8, 
		RULE_basicType = 9, RULE_statement = 10, RULE_block = 11, RULE_blockStatement = 12, 
		RULE_expression = 13, RULE_nonArrayTypeCreator = 14, RULE_creator = 15, 
		RULE_parameterList = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDefinition", "classDefinition", "variableDefinition", 
			"memberDefinition", "parameterListDefinition", "parameterDefinition", 
			"functionType", "typeType", "basicType", "statement", "block", "blockStatement", 
			"expression", "nonArrayTypeCreator", "creator", "parameterList"
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

	@Override
	public String getGrammarFileName() { return "MStarTree.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MStarTreeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					classDefinition();
					}
					break;
				case 2:
					{
					setState(35);
					variableDefinition();
					}
					break;
				case 3:
					{
					setState(36);
					functionDefinition();
					}
					break;
				}
				}
				setState(41);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ParameterListDefinitionContext parameterListDefinition() {
			return getRuleContext(ParameterListDefinitionContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42);
				functionType();
				}
				break;
			}
			setState(45);
			match(ID);
			setState(46);
			match(LPAREN);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(47);
				parameterListDefinition();
				}
			}

			setState(50);
			match(RPAREN);
			setState(51);
			block();
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MStarTreeParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(MStarTreeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MStarTreeParser.RBRACE, 0); }
		public List<MemberDefinitionContext> memberDefinition() {
			return getRuleContexts(MemberDefinitionContext.class);
		}
		public MemberDefinitionContext memberDefinition(int i) {
			return getRuleContext(MemberDefinitionContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(CLASS);
			setState(54);
			match(ID);
			setState(55);
			match(LBRACE);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(56);
				memberDefinition();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(RBRACE);
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(MStarTreeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			typeType(0);
			setState(65);
			match(ID);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(66);
				match(ASSIGN);
				setState(67);
				expression(0);
				}
			}

			setState(70);
			match(SEMI);
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

	public static class MemberDefinitionContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public MemberDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterMemberDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitMemberDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitMemberDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDefinitionContext memberDefinition() throws RecognitionException {
		MemberDefinitionContext _localctx = new MemberDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memberDefinition);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				variableDefinition();
				}
				break;
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

	public static class ParameterListDefinitionContext extends ParserRuleContext {
		public List<ParameterDefinitionContext> parameterDefinition() {
			return getRuleContexts(ParameterDefinitionContext.class);
		}
		public ParameterDefinitionContext parameterDefinition(int i) {
			return getRuleContext(ParameterDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MStarTreeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MStarTreeParser.COMMA, i);
		}
		public ParameterListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterListDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterParameterListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitParameterListDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitParameterListDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListDefinitionContext parameterListDefinition() throws RecognitionException {
		ParameterListDefinitionContext _localctx = new ParameterListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterListDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			parameterDefinition();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				parameterDefinition();
				}
				}
				setState(83);
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

	public static class ParameterDefinitionContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public ParameterDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterParameterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitParameterDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitParameterDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDefinitionContext parameterDefinition() throws RecognitionException {
		ParameterDefinitionContext _localctx = new ParameterDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			typeType(0);
			setState(85);
			match(ID);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MStarTreeParser.VOID, 0); }
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionType);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				typeType(0);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(VOID);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
	 
		public TypeTypeContext() { }
		public void copyFrom(TypeTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeTypeContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(MStarTreeParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MStarTreeParser.RBRACK, 0); }
		public ArrayTypeContext(TypeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonArrayTypeContext extends TypeTypeContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public NonArrayTypeContext(TypeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterNonArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitNonArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitNonArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		return typeType(0);
	}

	private TypeTypeContext typeType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, _parentState);
		TypeTypeContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_typeType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NonArrayTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(92);
			basicType();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeTypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeType);
					setState(94);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(95);
					match(LBRACK);
					setState(96);
					match(RBRACK);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MStarTreeParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MStarTreeParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MStarTreeParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStmtContext extends StatementContext {
		public ExpressionContext init;
		public ExpressionContext cond;
		public ExpressionContext update;
		public TerminalNode FOR() { return getToken(MStarTreeParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(MStarTreeParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MStarTreeParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MStarTreeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends StatementContext {
		public StatementContext thenStmt;
		public StatementContext elseStmt;
		public TerminalNode IF() { return getToken(MStarTreeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MStarTreeParser.ELSE, 0); }
		public IfElseStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStmtContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitExpressionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MStarTreeParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MStarTreeParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MStarTreeParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				block();
				}
				break;
			case NEW:
			case THIS:
			case LPAREN:
			case SEMI:
			case SELFINC:
			case SELFDEC:
			case ADD:
			case SUB:
			case NEG:
			case NOT:
			case NUMBER:
			case STR:
			case BoolConstant:
			case NullLiteral:
			case ID:
				_localctx = new ExpressionStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << NUMBER) | (1L << STR) | (1L << BoolConstant) | (1L << NullLiteral) | (1L << ID))) != 0)) {
					{
					setState(105);
					expression(0);
					}
				}

				setState(108);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(IF);
				setState(110);
				match(LPAREN);
				setState(111);
				expression(0);
				setState(112);
				match(RPAREN);
				setState(113);
				((IfElseStmtContext)_localctx).thenStmt = statement();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(114);
					match(ELSE);
					setState(115);
					((IfElseStmtContext)_localctx).elseStmt = statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(WHILE);
				setState(119);
				match(LPAREN);
				setState(120);
				expression(0);
				setState(121);
				match(RPAREN);
				setState(122);
				statement();
				}
				break;
			case FOR:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(FOR);
				setState(125);
				match(LPAREN);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << NUMBER) | (1L << STR) | (1L << BoolConstant) | (1L << NullLiteral) | (1L << ID))) != 0)) {
					{
					setState(126);
					((ForStmtContext)_localctx).init = expression(0);
					}
				}

				setState(129);
				match(SEMI);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << NUMBER) | (1L << STR) | (1L << BoolConstant) | (1L << NullLiteral) | (1L << ID))) != 0)) {
					{
					setState(130);
					((ForStmtContext)_localctx).cond = expression(0);
					}
				}

				setState(133);
				match(SEMI);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << NUMBER) | (1L << STR) | (1L << BoolConstant) | (1L << NullLiteral) | (1L << ID))) != 0)) {
					{
					setState(134);
					((ForStmtContext)_localctx).update = expression(0);
					}
				}

				setState(137);
				match(RPAREN);
				setState(138);
				statement();
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				match(CONTINUE);
				setState(140);
				match(SEMI);
				}
				break;
			case BREAK:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				match(BREAK);
				setState(142);
				match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(RETURN);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << NUMBER) | (1L << STR) | (1L << BoolConstant) | (1L << NullLiteral) | (1L << ID))) != 0)) {
					{
					setState(144);
					expression(0);
					}
				}

				setState(147);
				match(SEMI);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MStarTreeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MStarTreeParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LBRACE);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << NUMBER) | (1L << STR) | (1L << BoolConstant) | (1L << NullLiteral) | (1L << ID))) != 0)) {
				{
				{
				setState(151);
				blockStatement();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtContext extends BlockStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StmtContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclStmtContext extends BlockStatementContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public VarDeclStmtContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitVarDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockStatement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				statement();
				}
				break;
			case 2:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				variableDefinition();
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(MStarTreeParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrExprContext extends ExpressionContext {
		public TerminalNode STR() { return getToken(MStarTreeParser.STR, 0); }
		public StrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(MStarTreeParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExprContext extends ExpressionContext {
		public TerminalNode NullLiteral() { return getToken(MStarTreeParser.NullLiteral, 0); }
		public NullExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExpressionContext {
		public ExpressionContext arr;
		public ExpressionContext sub;
		public TerminalNode LBRACK() { return getToken(MStarTreeParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MStarTreeParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuffixExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELFINC() { return getToken(MStarTreeParser.SELFINC, 0); }
		public TerminalNode SELFDEC() { return getToken(MStarTreeParser.SELFDEC, 0); }
		public SuffixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterSuffixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitSuffixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitSuffixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MStarTreeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MStarTreeParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MStarTreeParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(MStarTreeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MStarTreeParser.SUB, 0); }
		public TerminalNode LSHIFT() { return getToken(MStarTreeParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(MStarTreeParser.RSHIFT, 0); }
		public TerminalNode LT() { return getToken(MStarTreeParser.LT, 0); }
		public TerminalNode GT() { return getToken(MStarTreeParser.GT, 0); }
		public TerminalNode LE() { return getToken(MStarTreeParser.LE, 0); }
		public TerminalNode GE() { return getToken(MStarTreeParser.GE, 0); }
		public TerminalNode EQ() { return getToken(MStarTreeParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MStarTreeParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(MStarTreeParser.AND, 0); }
		public TerminalNode OR() { return getToken(MStarTreeParser.OR, 0); }
		public TerminalNode XOR() { return getToken(MStarTreeParser.XOR, 0); }
		public TerminalNode LOGAND() { return getToken(MStarTreeParser.LOGAND, 0); }
		public TerminalNode LOGOR() { return getToken(MStarTreeParser.LOGOR, 0); }
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MStarTreeParser.DOT, 0); }
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public MemExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterMemExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitMemExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitMemExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FuncCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(MStarTreeParser.NUMBER, 0); }
		public NumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELFINC() { return getToken(MStarTreeParser.SELFINC, 0); }
		public TerminalNode SELFDEC() { return getToken(MStarTreeParser.SELFDEC, 0); }
		public TerminalNode ADD() { return getToken(MStarTreeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MStarTreeParser.SUB, 0); }
		public TerminalNode NEG() { return getToken(MStarTreeParser.NEG, 0); }
		public TerminalNode NOT() { return getToken(MStarTreeParser.NOT, 0); }
		public PrefixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExpressionContext {
		public TerminalNode BoolConstant() { return getToken(MStarTreeParser.BoolConstant, 0); }
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MStarTreeParser.ASSIGN, 0); }
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public BracketsExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBracketsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBracketsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBracketsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELFINC:
			case SELFDEC:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SELFINC || _la==SELFDEC) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				expression(23);
				}
				break;
			case ADD:
			case SUB:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				expression(22);
				}
				break;
			case NEG:
			case NOT:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NEG || _la==NOT) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				expression(21);
				}
				break;
			case NEW:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(NEW);
				setState(171);
				creator();
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(ID);
				}
				break;
			case THIS:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(THIS);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(NUMBER);
				}
				break;
			case STR:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(STR);
				}
				break;
			case NullLiteral:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(NullLiteral);
				}
				break;
			case BoolConstant:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(BoolConstant);
				}
				break;
			case LPAREN:
				{
				_localctx = new BracketsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(LPAREN);
				setState(179);
				expression(0);
				setState(180);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(185);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						((BinaryExprContext)_localctx).rhs = expression(20);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(188);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((BinaryExprContext)_localctx).rhs = expression(19);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(191);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((BinaryExprContext)_localctx).rhs = expression(18);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(194);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==GT) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						((BinaryExprContext)_localctx).rhs = expression(17);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(197);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LE || _la==GE) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						((BinaryExprContext)_localctx).rhs = expression(16);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(200);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((BinaryExprContext)_localctx).rhs = expression(15);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(203);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(204);
						((BinaryExprContext)_localctx).rhs = expression(14);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(206);
						((BinaryExprContext)_localctx).op = match(OR);
						setState(207);
						((BinaryExprContext)_localctx).rhs = expression(13);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(209);
						((BinaryExprContext)_localctx).op = match(XOR);
						setState(210);
						((BinaryExprContext)_localctx).rhs = expression(12);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(212);
						((BinaryExprContext)_localctx).op = match(LOGAND);
						setState(213);
						((BinaryExprContext)_localctx).rhs = expression(10);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(215);
						((BinaryExprContext)_localctx).op = match(LOGOR);
						setState(216);
						((BinaryExprContext)_localctx).rhs = expression(9);
						}
						break;
					case 12:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						((AssignExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(218);
						((AssignExprContext)_localctx).op = match(ASSIGN);
						setState(219);
						((AssignExprContext)_localctx).rhs = expression(8);
						}
						break;
					case 13:
						{
						_localctx = new SuffixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(221);
						((SuffixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SELFINC || _la==SELFDEC) ) {
							((SuffixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 14:
						{
						_localctx = new MemExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(223);
						match(DOT);
						setState(224);
						match(ID);
						}
						break;
					case 15:
						{
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayExprContext)_localctx).arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(226);
						match(LBRACK);
						setState(227);
						((ArrayExprContext)_localctx).sub = expression(0);
						setState(228);
						match(RBRACK);
						}
						break;
					case 16:
						{
						_localctx = new FuncCallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(231);
						match(LPAREN);
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << NUMBER) | (1L << STR) | (1L << BoolConstant) | (1L << NullLiteral) | (1L << ID))) != 0)) {
							{
							setState(232);
							parameterList();
							}
						}

						setState(235);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NonArrayTypeCreatorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MStarTreeParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MStarTreeParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MStarTreeParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MStarTreeParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public NonArrayTypeCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonArrayTypeCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterNonArrayTypeCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitNonArrayTypeCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitNonArrayTypeCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonArrayTypeCreatorContext nonArrayTypeCreator() throws RecognitionException {
		NonArrayTypeCreatorContext _localctx = new NonArrayTypeCreatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nonArrayTypeCreator);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(ID);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(245);
					match(LPAREN);
					setState(246);
					match(RPAREN);
					}
					break;
				}
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

	public static class CreatorContext extends ParserRuleContext {
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	 
		public CreatorContext() { }
		public void copyFrom(CreatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonArrayCreatorContext extends CreatorContext {
		public NonArrayTypeCreatorContext nonArrayTypeCreator() {
			return getRuleContext(NonArrayTypeCreatorContext.class,0);
		}
		public NonArrayCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterNonArrayCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitNonArrayCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitNonArrayCreator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreatorContext extends CreatorContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(MStarTreeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(MStarTreeParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(MStarTreeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(MStarTreeParser.RBRACK, i);
		}
		public ArrayCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterArrayCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitArrayCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitArrayCreator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorCreatorContext extends CreatorContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(MStarTreeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(MStarTreeParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(MStarTreeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(MStarTreeParser.RBRACK, i);
		}
		public ErrorCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterErrorCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitErrorCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitErrorCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_creator);
		try {
			int _alt;
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new ErrorCreatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				basicType();
				setState(256); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(252);
						match(LBRACK);
						setState(253);
						expression(0);
						setState(254);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(258); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(262); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(260);
						match(LBRACK);
						setState(261);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(264); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(270); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(266);
						match(LBRACK);
						setState(267);
						expression(0);
						setState(268);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(272); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new ArrayCreatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				basicType();
				setState(279); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(275);
						match(LBRACK);
						setState(276);
						expression(0);
						setState(277);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283);
						match(LBRACK);
						setState(284);
						match(RBRACK);
						}
						} 
					}
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new NonArrayCreatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				nonArrayTypeCreator();
				}
				break;
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MStarTreeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MStarTreeParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expression(0);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				expression(0);
				}
				}
				setState(300);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return typeType_sempred((TypeTypeContext)_localctx, predIndex);
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeType_sempred(TypeTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 27);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\5\3.\n\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\5\5G\n\5\3\5\3\5\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\7\7R\n\7\f\7\16"+
		"\7U\13\7\3\b\3\b\3\b\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nd\n"+
		"\n\f\n\16\ng\13\n\3\13\3\13\3\f\3\f\5\fm\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\fw\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\f"+
		"\3\f\5\f\u0086\n\f\3\f\3\f\5\f\u008a\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0094\n\f\3\f\5\f\u0097\n\f\3\r\3\r\7\r\u009b\n\r\f\r\16\r\u009e"+
		"\13\r\3\r\3\r\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00b9\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ec\n\17\3\17\7\17"+
		"\u00ef\n\17\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00fa\n\20\5\20\u00fc\n\20\3\21\3\21\3\21\3\21\3\21\6\21\u0103\n\21\r"+
		"\21\16\21\u0104\3\21\3\21\6\21\u0109\n\21\r\21\16\21\u010a\3\21\3\21\3"+
		"\21\3\21\6\21\u0111\n\21\r\21\16\21\u0112\3\21\3\21\3\21\3\21\3\21\6\21"+
		"\u011a\n\21\r\21\16\21\u011b\3\21\3\21\7\21\u0120\n\21\f\21\16\21\u0123"+
		"\13\21\3\21\5\21\u0126\n\21\3\22\3\22\3\22\7\22\u012b\n\22\f\22\16\22"+
		"\u012e\13\22\3\22\2\4\22\34\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\13\4\2/\61\67\67\3\2\30\31\3\2\32\33\3\2\37 \3\2\34\36\3\2!\"\3"+
		"\2#$\3\2%&\3\2\'(\2\u015f\2)\3\2\2\2\4-\3\2\2\2\6\67\3\2\2\2\bB\3\2\2"+
		"\2\nL\3\2\2\2\fN\3\2\2\2\16V\3\2\2\2\20[\3\2\2\2\22]\3\2\2\2\24h\3\2\2"+
		"\2\26\u0096\3\2\2\2\30\u0098\3\2\2\2\32\u00a3\3\2\2\2\34\u00b8\3\2\2\2"+
		"\36\u00fb\3\2\2\2 \u0125\3\2\2\2\"\u0127\3\2\2\2$(\5\6\4\2%(\5\b\5\2&"+
		"(\5\4\3\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*\3\3\2\2\2+)\3\2\2\2,.\5\20\t\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60"+
		"\7\67\2\2\60\62\7\r\2\2\61\63\5\f\7\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64"+
		"\3\2\2\2\64\65\7\16\2\2\65\66\5\30\r\2\66\5\3\2\2\2\678\7\n\2\289\7\67"+
		"\2\29=\7\21\2\2:<\5\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3"+
		"\2\2\2?=\3\2\2\2@A\7\22\2\2A\7\3\2\2\2BC\5\22\n\2CF\7\67\2\2DE\7\27\2"+
		"\2EG\5\34\17\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\23\2\2I\t\3\2\2\2JM\5"+
		"\4\3\2KM\5\b\5\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NS\5\16\b\2OP\7\24\2\2"+
		"PR\5\16\b\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\r\3\2\2\2US\3\2\2"+
		"\2VW\5\22\n\2WX\7\67\2\2X\17\3\2\2\2Y\\\5\22\n\2Z\\\7.\2\2[Y\3\2\2\2["+
		"Z\3\2\2\2\\\21\3\2\2\2]^\b\n\1\2^_\5\24\13\2_e\3\2\2\2`a\f\4\2\2ab\7\17"+
		"\2\2bd\7\20\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\23\3\2\2\2ge"+
		"\3\2\2\2hi\t\2\2\2i\25\3\2\2\2j\u0097\5\30\r\2km\5\34\17\2lk\3\2\2\2l"+
		"m\3\2\2\2mn\3\2\2\2n\u0097\7\23\2\2op\7\3\2\2pq\7\r\2\2qr\5\34\17\2rs"+
		"\7\16\2\2sv\5\26\f\2tu\7\4\2\2uw\5\26\f\2vt\3\2\2\2vw\3\2\2\2w\u0097\3"+
		"\2\2\2xy\7\6\2\2yz\7\r\2\2z{\5\34\17\2{|\7\16\2\2|}\5\26\f\2}\u0097\3"+
		"\2\2\2~\177\7\5\2\2\177\u0081\7\r\2\2\u0080\u0082\5\34\17\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\23\2\2"+
		"\u0084\u0086\5\34\17\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\7\23\2\2\u0088\u008a\5\34\17\2\u0089\u0088\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\16\2\2\u008c"+
		"\u0097\5\26\f\2\u008d\u008e\7\b\2\2\u008e\u0097\7\23\2\2\u008f\u0090\7"+
		"\7\2\2\u0090\u0097\7\23\2\2\u0091\u0093\7\t\2\2\u0092\u0094\5\34\17\2"+
		"\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\7\23\2\2\u0096j\3\2\2\2\u0096l\3\2\2\2\u0096o\3\2\2\2\u0096x\3\2\2\2"+
		"\u0096~\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0091\3"+
		"\2\2\2\u0097\27\3\2\2\2\u0098\u009c\7\21\2\2\u0099\u009b\5\32\16\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\22\2\2\u00a0"+
		"\31\3\2\2\2\u00a1\u00a4\5\26\f\2\u00a2\u00a4\5\b\5\2\u00a3\u00a1\3\2\2"+
		"\2\u00a3\u00a2\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\b\17\1\2\u00a6\u00a7"+
		"\t\3\2\2\u00a7\u00b9\5\34\17\31\u00a8\u00a9\t\4\2\2\u00a9\u00b9\5\34\17"+
		"\30\u00aa\u00ab\t\5\2\2\u00ab\u00b9\5\34\17\27\u00ac\u00ad\7\13\2\2\u00ad"+
		"\u00b9\5 \21\2\u00ae\u00b9\7\67\2\2\u00af\u00b9\7\f\2\2\u00b0\u00b9\7"+
		"\62\2\2\u00b1\u00b9\7\64\2\2\u00b2\u00b9\7\66\2\2\u00b3\u00b9\7\65\2\2"+
		"\u00b4\u00b5\7\r\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\7\16\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00a8\3\2\2\2\u00b8\u00aa\3\2"+
		"\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8"+
		"\u00b0\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2"+
		"\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00f0\3\2\2\2\u00ba\u00bb\f\25\2\2\u00bb"+
		"\u00bc\t\6\2\2\u00bc\u00ef\5\34\17\26\u00bd\u00be\f\24\2\2\u00be\u00bf"+
		"\t\4\2\2\u00bf\u00ef\5\34\17\25\u00c0\u00c1\f\23\2\2\u00c1\u00c2\t\7\2"+
		"\2\u00c2\u00ef\5\34\17\24\u00c3\u00c4\f\22\2\2\u00c4\u00c5\t\b\2\2\u00c5"+
		"\u00ef\5\34\17\23\u00c6\u00c7\f\21\2\2\u00c7\u00c8\t\t\2\2\u00c8\u00ef"+
		"\5\34\17\22\u00c9\u00ca\f\20\2\2\u00ca\u00cb\t\n\2\2\u00cb\u00ef\5\34"+
		"\17\21\u00cc\u00cd\f\17\2\2\u00cd\u00ce\7)\2\2\u00ce\u00ef\5\34\17\20"+
		"\u00cf\u00d0\f\16\2\2\u00d0\u00d1\7*\2\2\u00d1\u00ef\5\34\17\17\u00d2"+
		"\u00d3\f\r\2\2\u00d3\u00d4\7+\2\2\u00d4\u00ef\5\34\17\16\u00d5\u00d6\f"+
		"\f\2\2\u00d6\u00d7\7,\2\2\u00d7\u00ef\5\34\17\f\u00d8\u00d9\f\13\2\2\u00d9"+
		"\u00da\7-\2\2\u00da\u00ef\5\34\17\13\u00db\u00dc\f\n\2\2\u00dc\u00dd\7"+
		"\27\2\2\u00dd\u00ef\5\34\17\n\u00de\u00df\f\35\2\2\u00df\u00ef\t\3\2\2"+
		"\u00e0\u00e1\f\34\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00ef\7\67\2\2\u00e3"+
		"\u00e4\f\33\2\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6\5\34\17\2\u00e6\u00e7"+
		"\7\20\2\2\u00e7\u00ef\3\2\2\2\u00e8\u00e9\f\32\2\2\u00e9\u00eb\7\r\2\2"+
		"\u00ea\u00ec\5\"\22\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\7\16\2\2\u00ee\u00ba\3\2\2\2\u00ee\u00bd\3\2\2\2"+
		"\u00ee\u00c0\3\2\2\2\u00ee\u00c3\3\2\2\2\u00ee\u00c6\3\2\2\2\u00ee\u00c9"+
		"\3\2\2\2\u00ee\u00cc\3\2\2\2\u00ee\u00cf\3\2\2\2\u00ee\u00d2\3\2\2\2\u00ee"+
		"\u00d5\3\2\2\2\u00ee\u00d8\3\2\2\2\u00ee\u00db\3\2\2\2\u00ee\u00de\3\2"+
		"\2\2\u00ee\u00e0\3\2\2\2\u00ee\u00e3\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\35\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00fc\7\60\2\2\u00f4\u00fc\7/\2\2\u00f5\u00fc"+
		"\7\61\2\2\u00f6\u00f9\7\67\2\2\u00f7\u00f8\7\r\2\2\u00f8\u00fa\7\16\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f3"+
		"\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc"+
		"\37\3\2\2\2\u00fd\u0102\5\24\13\2\u00fe\u00ff\7\17\2\2\u00ff\u0100\5\34"+
		"\17\2\u0100\u0101\7\20\2\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0107\7\17\2\2\u0107\u0109\7\20\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\3\2"+
		"\2\2\u010c\u010d\7\17\2\2\u010d\u010e\5\34\17\2\u010e\u010f\7\20\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010c\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0126\3\2\2\2\u0114\u0119\5\24\13\2\u0115"+
		"\u0116\7\17\2\2\u0116\u0117\5\34\17\2\u0117\u0118\7\20\2\2\u0118\u011a"+
		"\3\2\2\2\u0119\u0115\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u0121\3\2\2\2\u011d\u011e\7\17\2\2\u011e\u0120\7"+
		"\20\2\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0126\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\5\36"+
		"\20\2\u0125\u00fd\3\2\2\2\u0125\u0114\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"!\3\2\2\2\u0127\u012c\5\34\17\2\u0128\u0129\7\24\2\2\u0129\u012b\5\34"+
		"\17\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d#\3\2\2\2\u012e\u012c\3\2\2\2\"\')-\62=FLS[elv\u0081"+
		"\u0085\u0089\u0093\u0096\u009c\u00a3\u00b8\u00eb\u00ee\u00f0\u00f9\u00fb"+
		"\u0104\u010a\u0112\u011b\u0121\u0125\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}