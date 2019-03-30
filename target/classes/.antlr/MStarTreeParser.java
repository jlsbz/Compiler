// Generated from c:\Users\93739\IdeaProjects\Mx\src\main\resources\MStarTree.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MStarTreeParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_programSection = 1, RULE_classDefinition = 2, RULE_memberVariable = 3, 
		RULE_constructionMethodDefinition = 4, RULE_methodDefinition = 5, RULE_formalParameterList = 6, 
		RULE_formalParameter = 7, RULE_actualParameterList = 8, RULE_block = 9, 
		RULE_blockOrStatement = 10, RULE_statement = 11, RULE_statementDefinition = 12, 
		RULE_expression = 13, RULE_definitionExpression = 14, RULE_creator = 15, 
		RULE_variableType = 16, RULE_arrayCreatorRest = 17, RULE_primitiveType = 18, 
		RULE_constant = 19;
	public static final String[] ruleNames = {
		"program", "programSection", "classDefinition", "memberVariable", "constructionMethodDefinition", 
		"methodDefinition", "formalParameterList", "formalParameter", "actualParameterList", 
		"block", "blockOrStatement", "statement", "statementDefinition", "expression", 
		"definitionExpression", "creator", "variableType", "arrayCreatorRest", 
		"primitiveType", "constant"
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

	@Override
	public String getGrammarFileName() { return "src/main/MStarTree.g4"; }

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
		public TerminalNode EOF() { return getToken(MStarTreeParser.EOF, 0); }
		public List<ProgramSectionContext> programSection() {
			return getRuleContexts(ProgramSectionContext.class);
		}
		public ProgramSectionContext programSection(int i) {
			return getRuleContext(ProgramSectionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << CLASS) | (1L << Identifier))) != 0)) {
				{
				{
				setState(40);
				programSection();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(EOF);
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

	public static class ProgramSectionContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public StatementDefinitionContext statementDefinition() {
			return getRuleContext(StatementDefinitionContext.class,0);
		}
		public ProgramSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programSection; }
	}

	public final ProgramSectionContext programSection() throws RecognitionException {
		ProgramSectionContext _localctx = new ProgramSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programSection);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				classDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				methodDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				statementDefinition();
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
			match(Identifier);
			setState(55);
			match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << Identifier))) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(56);
					memberVariable();
					}
					break;
				case 2:
					{
					setState(57);
					constructionMethodDefinition();
					}
					break;
				case 3:
					{
					setState(58);
					methodDefinition();
					}
					break;
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
	}

	public final MemberVariableContext memberVariable() throws RecognitionException {
		MemberVariableContext _localctx = new MemberVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_memberVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			variableType();
			setState(67);
			match(Identifier);
			setState(68);
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
	}

	public final ConstructionMethodDefinitionContext constructionMethodDefinition() throws RecognitionException {
		ConstructionMethodDefinitionContext _localctx = new ConstructionMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructionMethodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Identifier);
			setState(71);
			match(LPAREN);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << Identifier))) != 0)) {
				{
				setState(72);
				formalParameterList();
				}
			}

			setState(75);
			match(RPAREN);
			setState(76);
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
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			variableType();
			setState(79);
			match(Identifier);
			setState(80);
			match(LPAREN);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << Identifier))) != 0)) {
				{
				setState(81);
				formalParameterList();
				}
			}

			setState(84);
			match(RPAREN);
			setState(85);
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			formalParameter();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				formalParameter();
				}
				}
				setState(94);
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			variableType();
			setState(96);
			match(Identifier);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(97);
				match(ASSIGN);
				setState(98);
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
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			expression(0);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				expression(0);
				}
				}
				setState(108);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LBRACE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
				{
				{
				setState(110);
				blockOrStatement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
	}

	public final BlockOrStatementContext blockOrStatement() throws RecognitionException {
		BlockOrStatementContext _localctx = new BlockOrStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockOrStatement);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				block();
				}
				break;
			case BOOL:
			case INT:
			case STRING:
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
				setState(119);
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
	}
	public static class ExpressionStatContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ExpressionStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MStarTreeParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DefinitionStatContext extends StatementContext {
		public StatementDefinitionContext statementDefinition() {
			return getRuleContext(StatementDefinitionContext.class,0);
		}
		public DefinitionStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MStarTreeParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public ContinueStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStatContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MStarTreeParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public BreakStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyStatContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public EmptyStatContext(StatementContext ctx) { copyFrom(ctx); }
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DefinitionStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				statementDefinition();
				}
				break;
			case 2:
				_localctx = new ExpressionStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				expression(0);
				setState(124);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(IF);
				setState(127);
				match(LPAREN);
				setState(128);
				expression(0);
				setState(129);
				match(RPAREN);
				setState(130);
				blockOrStatement();
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(131);
					match(ELSE);
					setState(132);
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
				setState(135);
				match(FOR);
				setState(136);
				match(LPAREN);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(137);
					((ForStatContext)_localctx).init = expression(0);
					}
				}

				setState(140);
				match(SEMI);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(141);
					((ForStatContext)_localctx).condition = expression(0);
					}
				}

				setState(144);
				match(SEMI);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(145);
					((ForStatContext)_localctx).after_block = expression(0);
					}
				}

				setState(148);
				match(RPAREN);
				setState(149);
				blockOrStatement();
				}
				break;
			case 5:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(WHILE);
				setState(151);
				match(LPAREN);
				setState(152);
				expression(0);
				setState(153);
				match(RPAREN);
				setState(154);
				blockOrStatement();
				}
				break;
			case 6:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				match(RETURN);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(157);
					expression(0);
					}
				}

				setState(160);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new BreakStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				match(BREAK);
				setState(162);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new ContinueStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				match(CONTINUE);
				setState(164);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new EmptyStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
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
		public DefinitionExpressionContext definitionExpression() {
			return getRuleContext(DefinitionExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MStarTreeParser.SEMI, 0); }
		public StatementDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDefinition; }
	}

	public final StatementDefinitionContext statementDefinition() throws RecognitionException {
		StatementDefinitionContext _localctx = new StatementDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			definitionExpression();
			setState(169);
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
	}
	public static class DefinitionExprContext extends ExpressionContext {
		public DefinitionExpressionContext definitionExpression() {
			return getRuleContext(DefinitionExpressionContext.class,0);
		}
		public DefinitionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(MStarTreeParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class ParensExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MStarTreeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MStarTreeParser.RPAREN, 0); }
		public ParensExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExprContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantExprContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(172);
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
				setState(173);
				expression(20);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
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
				setState(175);
				expression(19);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
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
				setState(177);
				expression(18);
				}
				break;
			case 4:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(NEW);
				setState(179);
				creator();
				}
				break;
			case 5:
				{
				_localctx = new DefinitionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				definitionExpression();
				}
				break;
			case 6:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(THIS);
				}
				break;
			case 9:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(LPAREN);
				setState(185);
				expression(0);
				setState(186);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MemberAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((MemberAccessExprContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(191);
						((MemberAccessExprContext)_localctx).op = match(DOT);
						setState(192);
						((MemberAccessExprContext)_localctx).member = expression(24);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(194);
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
						setState(195);
						((BinaryExprContext)_localctx).rhs = expression(17);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(197);
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
						setState(198);
						((BinaryExprContext)_localctx).rhs = expression(16);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(200);
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
						setState(201);
						((BinaryExprContext)_localctx).rhs = expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(203);
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
						setState(204);
						((BinaryExprContext)_localctx).rhs = expression(14);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(206);
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
						setState(207);
						((BinaryExprContext)_localctx).rhs = expression(13);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(209);
						((BinaryExprContext)_localctx).op = match(AND);
						setState(210);
						((BinaryExprContext)_localctx).rhs = expression(12);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(212);
						((BinaryExprContext)_localctx).op = match(XOR);
						setState(213);
						((BinaryExprContext)_localctx).rhs = expression(11);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(215);
						((BinaryExprContext)_localctx).op = match(OR);
						setState(216);
						((BinaryExprContext)_localctx).rhs = expression(10);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(218);
						((BinaryExprContext)_localctx).op = match(LOGAND);
						setState(219);
						((BinaryExprContext)_localctx).rhs = expression(9);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(221);
						((BinaryExprContext)_localctx).op = match(LOGOR);
						setState(222);
						((BinaryExprContext)_localctx).rhs = expression(8);
						}
						break;
					case 12:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(224);
						((BinaryExprContext)_localctx).op = match(ASSIGN);
						setState(225);
						((BinaryExprContext)_localctx).rhs = expression(6);
						}
						break;
					case 13:
						{
						_localctx = new MethodCallExprContext(new ExpressionContext(_parentctx, _parentState));
						((MethodCallExprContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(227);
						match(LPAREN);
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
							{
							setState(228);
							actualParameterList();
							}
						}

						setState(231);
						match(RPAREN);
						}
						break;
					case 14:
						{
						_localctx = new IndexAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((IndexAccessExprContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(233);
						match(LBRACK);
						setState(234);
						((IndexAccessExprContext)_localctx).index = expression(0);
						setState(235);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new UnaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(238);
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
				setState(243);
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

	public static class DefinitionExpressionContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MStarTreeParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MStarTreeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionExpression; }
	}

	public final DefinitionExpressionContext definitionExpression() throws RecognitionException {
		DefinitionExpressionContext _localctx = new DefinitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definitionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			variableType();
			setState(245);
			match(Identifier);
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(246);
				match(ASSIGN);
				setState(247);
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
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_creator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			variableType();
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(251);
				match(LPAREN);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << NEW) | (1L << THIS) | (1L << LPAREN) | (1L << SELFINC) | (1L << SELFDEC) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << NOT) | (1L << LogicConstant) | (1L << IntegerConstant) | (1L << StringConstant) | (1L << NullConstant) | (1L << Identifier))) != 0)) {
					{
					setState(252);
					actualParameterList();
					}
				}

				setState(255);
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
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableType);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ArrayVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(258);
					match(Identifier);
					}
					break;
				case BOOL:
				case INT:
				case STRING:
				case VOID:
					{
					setState(259);
					primitiveType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(262);
				arrayCreatorRest();
				}
				break;
			case 2:
				_localctx = new NonArrayVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(263);
					match(Identifier);
					}
					break;
				case BOOL:
				case INT:
				case STRING:
				case VOID:
					{
					setState(264);
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
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayCreatorRest);
		try {
			int _alt;
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(269);
						match(LBRACK);
						setState(270);
						expression(0);
						setState(271);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(275); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						match(LBRACK);
						setState(278);
						match(RBRACK);
						}
						} 
					}
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(284);
						match(LBRACK);
						setState(285);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(288); 
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
		public TerminalNode STRING() { return getToken(MStarTreeParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) ) {
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
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7U\n\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\t\3\t\3"+
		"\t\3\t\5\tf\n\t\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3\13\7\13r\n"+
		"\13\f\13\16\13u\13\13\3\13\3\13\3\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\r\3\r\3\r\5\r\u008d\n\r\3\r\3\r"+
		"\5\r\u0091\n\r\3\r\3\r\5\r\u0095\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00a1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00bf\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00f2\n\17\f\17\16\17\u00f5\13\17\3\20\3\20\3\20\3\20\5\20"+
		"\u00fb\n\20\3\21\3\21\3\21\5\21\u0100\n\21\3\21\5\21\u0103\n\21\3\22\3"+
		"\22\5\22\u0107\n\22\3\22\3\22\3\22\5\22\u010c\n\22\5\22\u010e\n\22\3\23"+
		"\3\23\3\23\3\23\6\23\u0114\n\23\r\23\16\23\u0115\3\23\3\23\7\23\u011a"+
		"\n\23\f\23\16\23\u011d\13\23\3\23\3\23\6\23\u0121\n\23\r\23\16\23\u0122"+
		"\5\23\u0125\n\23\3\24\3\24\3\25\3\25\3\25\2\3\34\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\13\3\2\34\35\3\2\36\37\3\2#$\3\2 \"\3\2"+
		"%&\3\2\'*\3\2+,\3\2\3\6\3\2\62\65\2\u0152\2-\3\2\2\2\4\65\3\2\2\2\6\67"+
		"\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20a\3\2\2\2\22g"+
		"\3\2\2\2\24o\3\2\2\2\26z\3\2\2\2\30\u00a8\3\2\2\2\32\u00aa\3\2\2\2\34"+
		"\u00be\3\2\2\2\36\u00f6\3\2\2\2 \u00fc\3\2\2\2\"\u010d\3\2\2\2$\u0124"+
		"\3\2\2\2&\u0126\3\2\2\2(\u0128\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61\3\3\2\2\2\62"+
		"\66\5\6\4\2\63\66\5\f\7\2\64\66\5\32\16\2\65\62\3\2\2\2\65\63\3\2\2\2"+
		"\65\64\3\2\2\2\66\5\3\2\2\2\678\7\16\2\289\7\66\2\29?\7\25\2\2:>\5\b\5"+
		"\2;>\5\n\6\2<>\5\f\7\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\26\2\2C\7\3\2\2\2DE\5\"\22\2EF\7"+
		"\66\2\2FG\7\27\2\2G\t\3\2\2\2HI\7\66\2\2IK\7\21\2\2JL\5\16\b\2KJ\3\2\2"+
		"\2KL\3\2\2\2LM\3\2\2\2MN\7\22\2\2NO\5\24\13\2O\13\3\2\2\2PQ\5\"\22\2Q"+
		"R\7\66\2\2RT\7\21\2\2SU\5\16\b\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\22"+
		"\2\2WX\5\24\13\2X\r\3\2\2\2Y^\5\20\t\2Z[\7\30\2\2[]\5\20\t\2\\Z\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\17\3\2\2\2`^\3\2\2\2ab\5\"\22\2be\7"+
		"\66\2\2cd\7\33\2\2df\5\34\17\2ec\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gl\5\34"+
		"\17\2hi\7\30\2\2ik\5\34\17\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m"+
		"\23\3\2\2\2nl\3\2\2\2os\7\25\2\2pr\5\26\f\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\26\2\2w\25\3\2\2\2x{\5\24\13\2"+
		"y{\5\30\r\2zx\3\2\2\2zy\3\2\2\2{\27\3\2\2\2|\u00a9\5\32\16\2}~\5\34\17"+
		"\2~\177\7\27\2\2\177\u00a9\3\2\2\2\u0080\u0081\7\7\2\2\u0081\u0082\7\21"+
		"\2\2\u0082\u0083\5\34\17\2\u0083\u0084\7\22\2\2\u0084\u0087\5\26\f\2\u0085"+
		"\u0086\7\b\2\2\u0086\u0088\5\26\f\2\u0087\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u00a9\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008c\7\21\2\2\u008b"+
		"\u008d\5\34\17\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u0090\7\27\2\2\u008f\u0091\5\34\17\2\u0090\u008f\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\27\2\2\u0093\u0095"+
		"\5\34\17\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0097\7\22\2\2\u0097\u00a9\5\26\f\2\u0098\u0099\7\n\2\2\u0099\u009a"+
		"\7\21\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7\22\2\2\u009c\u009d\5\26"+
		"\f\2\u009d\u00a9\3\2\2\2\u009e\u00a0\7\r\2\2\u009f\u00a1\5\34\17\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a9\7\27"+
		"\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a9\7\27\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\u00a9\7\27\2\2\u00a7\u00a9\7\27\2\2\u00a8|\3\2\2\2\u00a8}\3\2\2\2\u00a8"+
		"\u0080\3\2\2\2\u00a8\u0089\3\2\2\2\u00a8\u0098\3\2\2\2\u00a8\u009e\3\2"+
		"\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\31\3\2\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\7\27\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\b\17\1\2\u00ae\u00af\t\2\2\2\u00af\u00bf\5\34\17\26\u00b0"+
		"\u00b1\t\3\2\2\u00b1\u00bf\5\34\17\25\u00b2\u00b3\t\4\2\2\u00b3\u00bf"+
		"\5\34\17\24\u00b4\u00b5\7\17\2\2\u00b5\u00bf\5 \21\2\u00b6\u00bf\5\36"+
		"\20\2\u00b7\u00bf\7\66\2\2\u00b8\u00bf\5(\25\2\u00b9\u00bf\7\20\2\2\u00ba"+
		"\u00bb\7\21\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\22\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00ad\3\2\2\2\u00be\u00b0\3\2\2\2\u00be\u00b2\3\2\2\2\u00be"+
		"\u00b4\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00b8\3\2"+
		"\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00f3\3\2\2\2\u00c0"+
		"\u00c1\f\31\2\2\u00c1\u00c2\7\32\2\2\u00c2\u00f2\5\34\17\32\u00c3\u00c4"+
		"\f\22\2\2\u00c4\u00c5\t\5\2\2\u00c5\u00f2\5\34\17\23\u00c6\u00c7\f\21"+
		"\2\2\u00c7\u00c8\t\3\2\2\u00c8\u00f2\5\34\17\22\u00c9\u00ca\f\20\2\2\u00ca"+
		"\u00cb\t\6\2\2\u00cb\u00f2\5\34\17\21\u00cc\u00cd\f\17\2\2\u00cd\u00ce"+
		"\t\7\2\2\u00ce\u00f2\5\34\17\20\u00cf\u00d0\f\16\2\2\u00d0\u00d1\t\b\2"+
		"\2\u00d1\u00f2\5\34\17\17\u00d2\u00d3\f\r\2\2\u00d3\u00d4\7-\2\2\u00d4"+
		"\u00f2\5\34\17\16\u00d5\u00d6\f\f\2\2\u00d6\u00d7\7/\2\2\u00d7\u00f2\5"+
		"\34\17\r\u00d8\u00d9\f\13\2\2\u00d9\u00da\7.\2\2\u00da\u00f2\5\34\17\f"+
		"\u00db\u00dc\f\n\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00f2\5\34\17\13\u00de"+
		"\u00df\f\t\2\2\u00df\u00e0\7\61\2\2\u00e0\u00f2\5\34\17\n\u00e1\u00e2"+
		"\f\7\2\2\u00e2\u00e3\7\33\2\2\u00e3\u00f2\5\34\17\b\u00e4\u00e5\f\32\2"+
		"\2\u00e5\u00e7\7\21\2\2\u00e6\u00e8\5\22\n\2\u00e7\u00e6\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f2\7\22\2\2\u00ea\u00eb\f"+
		"\30\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed\5\34\17\2\u00ed\u00ee\7\24\2"+
		"\2\u00ee\u00f2\3\2\2\2\u00ef\u00f0\f\27\2\2\u00f0\u00f2\t\2\2\2\u00f1"+
		"\u00c0\3\2\2\2\u00f1\u00c3\3\2\2\2\u00f1\u00c6\3\2\2\2\u00f1\u00c9\3\2"+
		"\2\2\u00f1\u00cc\3\2\2\2\u00f1\u00cf\3\2\2\2\u00f1\u00d2\3\2\2\2\u00f1"+
		"\u00d5\3\2\2\2\u00f1\u00d8\3\2\2\2\u00f1\u00db\3\2\2\2\u00f1\u00de\3\2"+
		"\2\2\u00f1\u00e1\3\2\2\2\u00f1\u00e4\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\35\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\"\22\2\u00f7\u00fa"+
		"\7\66\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00fb\5\34\17\2\u00fa\u00f8\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\37\3\2\2\2\u00fc\u0102\5\"\22\2\u00fd\u00ff"+
		"\7\21\2\2\u00fe\u0100\5\22\n\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u0103\7\22\2\2\u0102\u00fd\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103!\3\2\2\2\u0104\u0107\7\66\2\2\u0105\u0107\5&\24\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010e\5$"+
		"\23\2\u0109\u010c\7\66\2\2\u010a\u010c\5&\24\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e#\3\2\2\2\u010f\u0110\7\23\2\2\u0110\u0111\5\34\17\2\u0111\u0112"+
		"\7\24\2\2\u0112\u0114\3\2\2\2\u0113\u010f\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011b\3\2\2\2\u0117\u0118"+
		"\7\23\2\2\u0118\u011a\7\24\2\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0125\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011e\u011f\7\23\2\2\u011f\u0121\7\24\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0113\3\2\2\2\u0124\u0120\3\2\2\2\u0125%\3\2\2\2\u0126"+
		"\u0127\t\t\2\2\u0127\'\3\2\2\2\u0128\u0129\t\n\2\2\u0129)\3\2\2\2!-\65"+
		"=?KT^elsz\u0087\u008c\u0090\u0094\u00a0\u00a8\u00be\u00e7\u00f1\u00f3"+
		"\u00fa\u00ff\u0102\u0106\u010b\u010d\u0115\u011b\u0122\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}