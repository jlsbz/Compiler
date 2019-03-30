// Generated from C:/Users/93739/IdeaProjects/Mx/src/main/resources\MStarTree.g4 by ANTLR 4.7.2
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
		BOOL=1, INT=2, VOID=3, IF=4, ELSE=5, FOR=6, WHILE=7, BREAK=8, CONTINUE=9, 
		RETURN=10, CLASS=11, NEW=12, THIS=13, LPAREN=14, RPAREN=15, LBRACK=16, 
		RBRACK=17, LBRACE=18, RBRACE=19, SEMI=20, COMMA=21, COLON=22, DOT=23, 
		ASSIGN=24, SELFINC=25, SELFDEC=26, ADD=27, SUB=28, MUL=29, DIV=30, MOD=31, 
		NEG=32, NOT=33, LSHIFT=34, RSHIFT=35, LT=36, GT=37, LE=38, GE=39, EQ=40, 
		NEQ=41, AND=42, OR=43, XOR=44, LOGAND=45, LOGOR=46, LogicConstant=47, 
		IntegerConstant=48, StringConstant=49, NullConstant=50, Identifier=51, 
		WhiteSpace=52, NewLine=53, LineComment=54, BlockComment=55;
	public static final int
		RULE_program = 0, RULE_classDefinition = 1, RULE_memberVariable = 2, RULE_constructionMethodDefinition = 3, 
		RULE_methodDefinition = 4, RULE_formalParameterList = 5, RULE_formalParameter = 6, 
		RULE_actualParameterList = 7, RULE_block = 8, RULE_blockOrStatement = 9, 
		RULE_statement = 10, RULE_statementDefinition = 11, RULE_expression = 12, 
		RULE_expressionDefinition = 13, RULE_creator = 14, RULE_variableType = 15, 
		RULE_arrayCreatorRest = 16, RULE_primitiveType = 17, RULE_constant = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefinition", "memberVariable", "constructionMethodDefinition", 
			"methodDefinition", "formalParameterList", "formalParameter", "actualParameterList", 
			"block", "blockOrStatement", "statement", "statementDefinition", "expression", 
			"expressionDefinition", "creator", "variableType", "arrayCreatorRest", 
			"primitiveType", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'void'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'", "'class'", "'new'", "'this'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", "'.'", "'='", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'<<'", 
			"'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'^'", 
			"'&&'", "'||'", null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "INT", "VOID", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "CLASS", "NEW", "THIS", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"LBRACE", "RBRACE", "SEMI", "COMMA", "COLON", "DOT", "ASSIGN", "SELFINC", 
			"SELFDEC", "ADD", "SUB", "MUL", "DIV", "MOD", "NEG", "NOT", "LSHIFT", 
			"RSHIFT", "LT", "GT", "LE", "GE", "EQ", "NEQ", "AND", "OR", "XOR", "LOGAND", 
			"LOGOR", "LogicConstant", "IntegerConstant", "StringConstant", "NullConstant", 
			"Identifier", "WhiteSpace", "NewLine", "LineComment", "BlockComment"
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
		public List<MethodDefinitionContext> methodDefinition() {
			return getRuleContexts(MethodDefinitionContext.class);
		}
		public MethodDefinitionContext methodDefinition(int i) {
			return getRuleContext(MethodDefinitionContext.class,i);
		}
		public List<StatementDefinitionContext> statementDefinition() {
			return getRuleContexts(StatementDefinitionContext.class);
		}
		public StatementDefinitionContext statementDefinition(int i) {
			return getRuleContext(StatementDefinitionContext.class,i);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << CLASS) | (1L << Identifier))) != 0)) {
				{
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					classDefinition();
					}
					break;
				case 2:
					{
					setState(39);
					methodDefinition();
					}
					break;
				case 3:
					{
					setState(40);
					statementDefinition();
					}
					break;
				}
				}
				setState(45);
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MStarTreeParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(MStarTreeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MStarTreeParser.RBRACE, 0); }
		public List<MemberVariableContext> memberVariable() {
			return getRuleContexts(MemberVariableContext.class);
		}
		public MemberVariableContext memberVariable(int i) {
			return getRuleContext(MemberVariableContext.class,i);
		}
		public List<ConstructionMethodDefinitionContext> constructionMethodDefinition() {
			return getRuleContexts(ConstructionMethodDefinitionContext.class);
		}
		public ConstructionMethodDefinitionContext constructionMethodDefinition(int i) {
			return getRuleContext(ConstructionMethodDefinitionContext.class,i);
		}
		public List<MethodDefinitionContext> methodDefinition() {
			return getRuleContexts(MethodDefinitionContext.class);
		}
		public MethodDefinitionContext methodDefinition(int i) {
			return getRuleContext(MethodDefinitionContext.class,i);
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
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CLASS);
			setState(47);
			match(Identifier);
			setState(48);
			match(LBRACE);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << Identifier))) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(49);
					memberVariable();
					}
					break;
				case 2:
					{
					setState(50);
					constructionMethodDefinition();
					}
					break;
				case 3:
					{
					setState(51);
					methodDefinition();
					}
					break;
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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

	public static class MemberVariableContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public MemberVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterMemberVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitMemberVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitMemberVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberVariableContext memberVariable() throws RecognitionException {
		MemberVariableContext _localctx = new MemberVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_memberVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			variableType();
			setState(60);
			match(Identifier);
			setState(61);
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

	public static class ConstructionMethodDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructionMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructionMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterConstructionMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitConstructionMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitConstructionMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructionMethodDefinitionContext constructionMethodDefinition() throws RecognitionException {
		ConstructionMethodDefinitionContext _localctx = new ConstructionMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constructionMethodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Identifier);
			setState(64);
			match(LPAREN);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << Identifier))) != 0)) {
				{
				setState(65);
				formalParameterList();
				}
			}

			setState(68);
			match(RPAREN);
			setState(69);
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

	public static class MethodDefinitionContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			variableType();
			setState(72);
			match(Identifier);
			setState(73);
			match(LPAREN);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << Identifier))) != 0)) {
				{
				setState(74);
				formalParameterList();
				}
			}

			setState(77);
			match(RPAREN);
			setState(78);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MStarTreeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MStarTreeParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			formalParameter();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				formalParameter();
				}
				}
				setState(87);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MStarTreeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			variableType();
			setState(89);
			match(Identifier);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(90);
				match(ASSIGN);
				setState(91);
				expression(0);
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

	public static class ActualParameterListContext extends ParserRuleContext {
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
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitActualParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitActualParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			expression(0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				expression(0);
				}
				}
				setState(101);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MStarTreeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MStarTreeParser.RBRACE, 0); }
		public List<BlockOrStatementContext> blockOrStatement() {
			return getRuleContexts(BlockOrStatementContext.class);
		}
		public BlockOrStatementContext blockOrStatement(int i) {
			return getRuleContext(BlockOrStatementContext.class,i);
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
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LBRACE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
				{
				{
				setState(103);
				blockOrStatement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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

	public static class BlockOrStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockOrStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOrStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBlockOrStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBlockOrStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBlockOrStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOrStatementContext blockOrStatement() throws RecognitionException {
		BlockOrStatementContext _localctx = new BlockOrStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockOrStatement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				block();
				}
				break;
			case BOOL:
			case INT:
			case VOID:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
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
			case LogicConstant:
			case IntegerConstant:
			case StringConstant:
			case NullConstant:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				statement();
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
	public static class IfStatContext extends StatementContext {
		public TerminalNode IF() { return getToken(MStarTreeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public List<BlockOrStatementContext> blockOrStatement() {
			return getRuleContexts(BlockOrStatementContext.class);
		}
		public BlockOrStatementContext blockOrStatement(int i) {
			return getRuleContext(BlockOrStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MStarTreeParser.ELSE, 0); }
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ExpressionStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterExpressionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitExpressionStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitExpressionStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MStarTreeParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionStatContext extends StatementContext {
		public StatementDefinitionContext statementDefinition() {
			return getRuleContext(StatementDefinitionContext.class,0);
		}
		public DefinitionStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterDefinitionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitDefinitionStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitDefinitionStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MStarTreeParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ContinueStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterContinueStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitContinueStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitContinueStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MStarTreeParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public BreakStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterBreakStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitBreakStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public EmptyStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterEmptyStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitEmptyStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitEmptyStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatContext extends StatementContext {
		public ExpressionContext init;
		public ExpressionContext condition;
		public ExpressionContext after_block;
		public TerminalNode FOR() { return getToken(MStarTreeParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(MStarTreeParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MStarTreeParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public BlockOrStatementContext blockOrStatement() {
			return getRuleContext(BlockOrStatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitForStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MStarTreeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public BlockOrStatementContext blockOrStatement() {
			return getRuleContext(BlockOrStatementContext.class,0);
		}
		public WhileStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DefinitionStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				statementDefinition();
				}
				break;
			case 2:
				_localctx = new ExpressionStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expression(0);
				setState(117);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(IF);
				setState(120);
				match(LPAREN);
				setState(121);
				expression(0);
				setState(122);
				match(RPAREN);
				setState(123);
				blockOrStatement();
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(124);
					match(ELSE);
					setState(125);
					blockOrStatement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(FOR);
				setState(129);
				match(LPAREN);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(130);
					((ForStatContext)_localctx).init = expression(0);
					}
				}

				setState(133);
				match(SEMI);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(134);
					((ForStatContext)_localctx).condition = expression(0);
					}
				}

				setState(137);
				match(SEMI);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(138);
					((ForStatContext)_localctx).after_block = expression(0);
					}
				}

				setState(141);
				match(RPAREN);
				setState(142);
				blockOrStatement();
				}
				break;
			case 5:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(WHILE);
				setState(144);
				match(LPAREN);
				setState(145);
				expression(0);
				setState(146);
				match(RPAREN);
				setState(147);
				blockOrStatement();
				}
				break;
			case 6:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(RETURN);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(150);
					expression(0);
					}
				}

				setState(153);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new BreakStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				match(BREAK);
				setState(155);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new ContinueStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(CONTINUE);
				setState(157);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new EmptyStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
				match(SEMI);
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

	public static class StatementDefinitionContext extends ParserRuleContext {
		public ExpressionDefinitionContext expressionDefinition() {
			return getRuleContext(ExpressionDefinitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public StatementDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterStatementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitStatementDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitStatementDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDefinitionContext statementDefinition() throws RecognitionException {
		StatementDefinitionContext _localctx = new StatementDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expressionDefinition();
			setState(162);
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
	public static class DefinitionExprContext extends ExpressionContext {
		public ExpressionDefinitionContext expressionDefinition() {
			return getRuleContext(ExpressionDefinitionContext.class,0);
		}
		public DefinitionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitDefinitionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitDefinitionExpr(this);
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
	public static class MethodCallExprContext extends ExpressionContext {
		public ExpressionContext caller;
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public MethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public Token prefix;
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELFINC() { return getToken(MStarTreeParser.SELFINC, 0); }
		public TerminalNode SELFDEC() { return getToken(MStarTreeParser.SELFDEC, 0); }
		public TerminalNode ADD() { return getToken(MStarTreeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MStarTreeParser.SUB, 0); }
		public TerminalNode NEG() { return getToken(MStarTreeParser.NEG, 0); }
		public TerminalNode NOT() { return getToken(MStarTreeParser.NOT, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexAccessExprContext extends ExpressionContext {
		public ExpressionContext caller;
		public ExpressionContext index;
		public TerminalNode LBRACK() { return getToken(MStarTreeParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MStarTreeParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterIndexAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitIndexAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitIndexAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessExprContext extends ExpressionContext {
		public ExpressionContext caller;
		public Token op;
		public ExpressionContext member;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(MStarTreeParser.DOT, 0); }
		public MemberAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterMemberAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitMemberAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitMemberAccessExpr(this);
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
		public TerminalNode XOR() { return getToken(MStarTreeParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MStarTreeParser.OR, 0); }
		public TerminalNode LOGAND() { return getToken(MStarTreeParser.LOGAND, 0); }
		public TerminalNode LOGOR() { return getToken(MStarTreeParser.LOGOR, 0); }
		public TerminalNode ASSIGN() { return getToken(MStarTreeParser.ASSIGN, 0); }
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
	public static class ParensExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public ParensExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExprContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterConstantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitConstantExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitConstantExpr(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165);
				((UnaryExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SELFINC || _la==SELFDEC) ) {
					((UnaryExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				expression(20);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				((UnaryExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				expression(19);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				((UnaryExprContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NEG || _la==NOT) ) {
					((UnaryExprContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				expression(18);
				}
				break;
			case 4:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(NEW);
				setState(172);
				creator();
				}
				break;
			case 5:
				{
				_localctx = new DefinitionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				expressionDefinition();
				}
				break;
			case 6:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(THIS);
				}
				break;
			case 9:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(LPAREN);
				setState(178);
				expression(0);
				setState(179);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MemberAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((MemberAccessExprContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(184);
						((MemberAccessExprContext)_localctx).op = match(DOT);
						setState(185);
						((MemberAccessExprContext)_localctx).member = expression(24);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(187);
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
						setState(188);
						((BinaryExprContext)_localctx).rhs = expression(17);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(190);
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
						setState(191);
						((BinaryExprContext)_localctx).rhs = expression(16);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(193);
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
						setState(194);
						((BinaryExprContext)_localctx).rhs = expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(196);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((BinaryExprContext)_localctx).rhs = expression(14);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(199);
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
						setState(200);
						((BinaryExprContext)_localctx).rhs = expression(13);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(202);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(203);
						((BinaryExprContext)_localctx).rhs = expression(12);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(205);
						((BinaryExprContext)_localctx).op = match(XOR);
						setState(206);
						((BinaryExprContext)_localctx).rhs = expression(11);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(208);
						((BinaryExprContext)_localctx).op = match(OR);
						setState(209);
						((BinaryExprContext)_localctx).rhs = expression(10);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(211);
						((BinaryExprContext)_localctx).op = match(LOGAND);
						setState(212);
						((BinaryExprContext)_localctx).rhs = expression(9);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(214);
						((BinaryExprContext)_localctx).op = match(LOGOR);
						setState(215);
						((BinaryExprContext)_localctx).rhs = expression(8);
						}
						break;
					case 12:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(217);
						((BinaryExprContext)_localctx).op = match(ASSIGN);
						setState(218);
						((BinaryExprContext)_localctx).rhs = expression(6);
						}
						break;
					case 13:
						{
						_localctx = new MethodCallExprContext(new ExpressionContext(_parentctx, _parentState));
						((MethodCallExprContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(220);
						match(LPAREN);
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
							{
							setState(221);
							actualParameterList();
							}
						}

						setState(224);
						match(RPAREN);
						}
						break;
					case 14:
						{
						_localctx = new IndexAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((IndexAccessExprContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(226);
						match(LBRACK);
						setState(227);
						((IndexAccessExprContext)_localctx).index = expression(0);
						setState(228);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new UnaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(231);
						((UnaryExprContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SELFINC || _la==SELFDEC) ) {
							((UnaryExprContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ExpressionDefinitionContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MStarTreeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterExpressionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitExpressionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitExpressionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionDefinitionContext expressionDefinition() throws RecognitionException {
		ExpressionDefinitionContext _localctx = new ExpressionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			variableType();
			setState(238);
			match(Identifier);
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(239);
				match(ASSIGN);
				setState(240);
				expression(0);
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

	public static class CreatorContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_creator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			variableType();
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(244);
				match(LPAREN);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(245);
					actualParameterList();
					}
				}

				setState(248);
				match(RPAREN);
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

	public static class VariableTypeContext extends ParserRuleContext {
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
	 
		public VariableTypeContext() { }
		public void copyFrom(VariableTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonArrayVariableTypeContext extends VariableTypeContext {
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public NonArrayVariableTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterNonArrayVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitNonArrayVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitNonArrayVariableType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayVariableTypeContext extends VariableTypeContext {
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayVariableTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterArrayVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitArrayVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitArrayVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableType);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ArrayVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(251);
					match(Identifier);
					}
					break;
				case BOOL:
				case INT:
				case VOID:
					{
					setState(252);
					primitiveType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255);
				arrayCreatorRest();
				}
				break;
			case 2:
				_localctx = new NonArrayVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(256);
					match(Identifier);
					}
					break;
				case BOOL:
				case INT:
				case VOID:
					{
					setState(257);
					primitiveType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
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
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayCreatorRest);
		try {
			int _alt;
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						match(LBRACK);
						setState(263);
						expression(0);
						setState(264);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(268); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270);
						match(LBRACK);
						setState(271);
						match(RBRACK);
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(277);
						match(LBRACK);
						setState(278);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(MStarTreeParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(MStarTreeParser.INT, 0); }
		public TerminalNode VOID() { return getToken(MStarTreeParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << VOID))) != 0)) ) {
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode LogicConstant() { return getToken(MStarTreeParser.LogicConstant, 0); }
		public TerminalNode IntegerConstant() { return getToken(MStarTreeParser.IntegerConstant, 0); }
		public TerminalNode StringConstant() { return getToken(MStarTreeParser.StringConstant, 0); }
		public TerminalNode NullConstant() { return getToken(MStarTreeParser.NullConstant, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MStarTreeListener ) ((MStarTreeListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MStarTreeVisitor ) return ((MStarTreeVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 24);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5E\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7V\n\7\f\7\16\7Y\13\7\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\7\td\n"+
		"\t\f\t\16\tg\13\t\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\3\13\3\13\5"+
		"\13t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3"+
		"\f\3\f\3\f\5\f\u0086\n\f\3\f\3\f\5\f\u008a\n\f\3\f\3\f\5\f\u008e\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009a\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e1\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00eb\n\16\f\16\16\16\u00ee\13"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00f4\n\17\3\20\3\20\3\20\5\20\u00f9\n\20"+
		"\3\20\5\20\u00fc\n\20\3\21\3\21\5\21\u0100\n\21\3\21\3\21\3\21\5\21\u0105"+
		"\n\21\5\21\u0107\n\21\3\22\3\22\3\22\3\22\6\22\u010d\n\22\r\22\16\22\u010e"+
		"\3\22\3\22\7\22\u0113\n\22\f\22\16\22\u0116\13\22\3\22\3\22\6\22\u011a"+
		"\n\22\r\22\16\22\u011b\5\22\u011e\n\22\3\23\3\23\3\24\3\24\3\24\2\3\32"+
		"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\13\3\2\33\34\3\2\35"+
		"\36\3\2\"#\3\2\37!\3\2$%\3\2&)\3\2*+\3\2\3\5\3\2\61\64\2\u014c\2-\3\2"+
		"\2\2\4\60\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nI\3\2\2\2\fR\3\2\2\2\16Z\3\2"+
		"\2\2\20`\3\2\2\2\22h\3\2\2\2\24s\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2"+
		"\2\2\32\u00b7\3\2\2\2\34\u00ef\3\2\2\2\36\u00f5\3\2\2\2 \u0106\3\2\2\2"+
		"\"\u011d\3\2\2\2$\u011f\3\2\2\2&\u0121\3\2\2\2(,\5\4\3\2),\5\n\6\2*,\5"+
		"\30\r\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3"+
		"\3\2\2\2/-\3\2\2\2\60\61\7\r\2\2\61\62\7\65\2\2\628\7\24\2\2\63\67\5\6"+
		"\4\2\64\67\5\b\5\2\65\67\5\n\6\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\25\2\2"+
		"<\5\3\2\2\2=>\5 \21\2>?\7\65\2\2?@\7\26\2\2@\7\3\2\2\2AB\7\65\2\2BD\7"+
		"\20\2\2CE\5\f\7\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\21\2\2GH\5\22\n\2"+
		"H\t\3\2\2\2IJ\5 \21\2JK\7\65\2\2KM\7\20\2\2LN\5\f\7\2ML\3\2\2\2MN\3\2"+
		"\2\2NO\3\2\2\2OP\7\21\2\2PQ\5\22\n\2Q\13\3\2\2\2RW\5\16\b\2ST\7\27\2\2"+
		"TV\5\16\b\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YW\3\2\2"+
		"\2Z[\5 \21\2[^\7\65\2\2\\]\7\32\2\2]_\5\32\16\2^\\\3\2\2\2^_\3\2\2\2_"+
		"\17\3\2\2\2`e\5\32\16\2ab\7\27\2\2bd\5\32\16\2ca\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2f\21\3\2\2\2ge\3\2\2\2hl\7\24\2\2ik\5\24\13\2ji\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\25\2\2p\23\3"+
		"\2\2\2qt\5\22\n\2rt\5\26\f\2sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2u\u00a2\5"+
		"\30\r\2vw\5\32\16\2wx\7\26\2\2x\u00a2\3\2\2\2yz\7\6\2\2z{\7\20\2\2{|\5"+
		"\32\16\2|}\7\21\2\2}\u0080\5\24\13\2~\177\7\7\2\2\177\u0081\5\24\13\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u00a2\3\2\2\2\u0082\u0083\7"+
		"\b\2\2\u0083\u0085\7\20\2\2\u0084\u0086\5\32\16\2\u0085\u0084\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7\26\2\2\u0088\u008a"+
		"\5\32\16\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008d\7\26\2\2\u008c\u008e\5\32\16\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\21\2\2\u0090\u00a2\5"+
		"\24\13\2\u0091\u0092\7\t\2\2\u0092\u0093\7\20\2\2\u0093\u0094\5\32\16"+
		"\2\u0094\u0095\7\21\2\2\u0095\u0096\5\24\13\2\u0096\u00a2\3\2\2\2\u0097"+
		"\u0099\7\f\2\2\u0098\u009a\5\32\16\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a2\7\26\2\2\u009c\u009d\7\n\2\2\u009d"+
		"\u00a2\7\26\2\2\u009e\u009f\7\13\2\2\u009f\u00a2\7\26\2\2\u00a0\u00a2"+
		"\7\26\2\2\u00a1u\3\2\2\2\u00a1v\3\2\2\2\u00a1y\3\2\2\2\u00a1\u0082\3\2"+
		"\2\2\u00a1\u0091\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\5\34\17"+
		"\2\u00a4\u00a5\7\26\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\b\16\1\2\u00a7\u00a8"+
		"\t\2\2\2\u00a8\u00b8\5\32\16\26\u00a9\u00aa\t\3\2\2\u00aa\u00b8\5\32\16"+
		"\25\u00ab\u00ac\t\4\2\2\u00ac\u00b8\5\32\16\24\u00ad\u00ae\7\16\2\2\u00ae"+
		"\u00b8\5\36\20\2\u00af\u00b8\5\34\17\2\u00b0\u00b8\7\65\2\2\u00b1\u00b8"+
		"\5&\24\2\u00b2\u00b8\7\17\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\5\32\16"+
		"\2\u00b5\u00b6\7\21\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a6\3\2\2\2\u00b7"+
		"\u00a9\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00af\3\2"+
		"\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7"+
		"\u00b3\3\2\2\2\u00b8\u00ec\3\2\2\2\u00b9\u00ba\f\31\2\2\u00ba\u00bb\7"+
		"\31\2\2\u00bb\u00eb\5\32\16\32\u00bc\u00bd\f\22\2\2\u00bd\u00be\t\5\2"+
		"\2\u00be\u00eb\5\32\16\23\u00bf\u00c0\f\21\2\2\u00c0\u00c1\t\3\2\2\u00c1"+
		"\u00eb\5\32\16\22\u00c2\u00c3\f\20\2\2\u00c3\u00c4\t\6\2\2\u00c4\u00eb"+
		"\5\32\16\21\u00c5\u00c6\f\17\2\2\u00c6\u00c7\t\7\2\2\u00c7\u00eb\5\32"+
		"\16\20\u00c8\u00c9\f\16\2\2\u00c9\u00ca\t\b\2\2\u00ca\u00eb\5\32\16\17"+
		"\u00cb\u00cc\f\r\2\2\u00cc\u00cd\7,\2\2\u00cd\u00eb\5\32\16\16\u00ce\u00cf"+
		"\f\f\2\2\u00cf\u00d0\7.\2\2\u00d0\u00eb\5\32\16\r\u00d1\u00d2\f\13\2\2"+
		"\u00d2\u00d3\7-\2\2\u00d3\u00eb\5\32\16\f\u00d4\u00d5\f\n\2\2\u00d5\u00d6"+
		"\7/\2\2\u00d6\u00eb\5\32\16\13\u00d7\u00d8\f\t\2\2\u00d8\u00d9\7\60\2"+
		"\2\u00d9\u00eb\5\32\16\n\u00da\u00db\f\7\2\2\u00db\u00dc\7\32\2\2\u00dc"+
		"\u00eb\5\32\16\b\u00dd\u00de\f\32\2\2\u00de\u00e0\7\20\2\2\u00df\u00e1"+
		"\5\20\t\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00eb\7\21\2\2\u00e3\u00e4\f\30\2\2\u00e4\u00e5\7\22\2\2\u00e5"+
		"\u00e6\5\32\16\2\u00e6\u00e7\7\23\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e9"+
		"\f\27\2\2\u00e9\u00eb\t\2\2\2\u00ea\u00b9\3\2\2\2\u00ea\u00bc\3\2\2\2"+
		"\u00ea\u00bf\3\2\2\2\u00ea\u00c2\3\2\2\2\u00ea\u00c5\3\2\2\2\u00ea\u00c8"+
		"\3\2\2\2\u00ea\u00cb\3\2\2\2\u00ea\u00ce\3\2\2\2\u00ea\u00d1\3\2\2\2\u00ea"+
		"\u00d4\3\2\2\2\u00ea\u00d7\3\2\2\2\u00ea\u00da\3\2\2\2\u00ea\u00dd\3\2"+
		"\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ef\u00f0\5 \21\2\u00f0\u00f3\7\65\2\2\u00f1\u00f2\7\32\2\2\u00f2"+
		"\u00f4\5\32\16\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\35\3\2"+
		"\2\2\u00f5\u00fb\5 \21\2\u00f6\u00f8\7\20\2\2\u00f7\u00f9\5\20\t\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\7\21"+
		"\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\37\3\2\2\2\u00fd\u0100"+
		"\7\65\2\2\u00fe\u0100\5$\23\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u0107\5\"\22\2\u0102\u0105\7\65\2\2\u0103\u0105"+
		"\5$\23\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u00ff\3\2\2\2\u0106\u0104\3\2\2\2\u0107!\3\2\2\2\u0108\u0109\7\22\2\2"+
		"\u0109\u010a\5\32\16\2\u010a\u010b\7\23\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0108\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0114\3\2\2\2\u0110\u0111\7\22\2\2\u0111\u0113\7\23\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u011e\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\22\2\2\u0118"+
		"\u011a\7\23\2\2\u0119\u0117\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u010c\3\2\2\2\u011d"+
		"\u0119\3\2\2\2\u011e#\3\2\2\2\u011f\u0120\t\t\2\2\u0120%\3\2\2\2\u0121"+
		"\u0122\t\n\2\2\u0122\'\3\2\2\2!+-\668DMW^els\u0080\u0085\u0089\u008d\u0099"+
		"\u00a1\u00b7\u00e0\u00ea\u00ec\u00f3\u00f8\u00fb\u00ff\u0104\u0106\u010e"+
		"\u0114\u011b\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}