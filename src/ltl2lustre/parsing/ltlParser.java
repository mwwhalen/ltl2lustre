// Generated from C:\Users\whalen\eclipse-workspace\LTL2Lustre\src\ltl2lustre\parsing\ltl.g4 by ANTLR 4.4

package ltl2lustre.parsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ltlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__40=1, T__39=2, T__38=3, T__37=4, T__36=5, T__35=6, T__34=7, T__33=8, 
		T__32=9, T__31=10, T__30=11, T__29=12, T__28=13, T__27=14, T__26=15, T__25=16, 
		T__24=17, T__23=18, T__22=19, T__21=20, T__20=21, T__19=22, T__18=23, 
		T__17=24, T__16=25, T__15=26, T__14=27, T__13=28, T__12=29, T__11=30, 
		T__10=31, T__9=32, T__8=33, T__7=34, T__6=35, T__5=36, T__4=37, T__3=38, 
		T__2=39, T__1=40, T__0=41, REAL=42, BOOL=43, INT=44, ID=45, WS=46, SL_COMMENT=47, 
		ML_COMMENT=48, ERROR=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'xnor'", "'T'", "'V'", "'!='", "'X'", "'Z'", "';'", 
		"'>>'", "'<<'", "'='", "'?'", "':='", "'<='", "'&'", "'G'", "'('", "'*'", 
		"','", "'O'", "'->'", "'S'", "'U'", "'LTLSPEC'", "'Y'", "':'", "'mod'", 
		"'>='", "'<'", "'|'", "'>'", "'xor'", "'!'", "'count'", "'next'", "'H'", 
		"')'", "'+'", "'NAME'", "'-'", "'<->'", "REAL", "BOOL", "INT", "ID", "WS", 
		"SL_COMMENT", "ML_COMMENT", "ERROR"
	};
	public static final int
		RULE_program = 0, RULE_ltl_spec = 1, RULE_ltl_expr = 2, RULE_basicexpr = 3, 
		RULE_constant = 4, RULE_intconstant = 5, RULE_realconstant = 6, RULE_boolconstant = 7, 
		RULE_variable_identifier = 8;
	public static final String[] ruleNames = {
		"program", "ltl_spec", "ltl_expr", "basicexpr", "constant", "intconstant", 
		"realconstant", "boolconstant", "variable_identifier"
	};

	@Override
	public String getGrammarFileName() { return "ltl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ltlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ltlParser.EOF, 0); }
		public Ltl_specContext ltl_spec(int i) {
			return getRuleContext(Ltl_specContext.class,i);
		}
		public List<Ltl_specContext> ltl_spec() {
			return getRuleContexts(Ltl_specContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitProgram(this);
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
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(18); ltl_spec();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(24); match(EOF);
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

	public static class Ltl_specContext extends ParserRuleContext {
		public Ltl_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltl_spec; }
	 
		public Ltl_specContext() { }
		public void copyFrom(Ltl_specContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnonymousLtlExprContext extends Ltl_specContext {
		public Ltl_exprContext expr;
		public Ltl_exprContext ltl_expr() {
			return getRuleContext(Ltl_exprContext.class,0);
		}
		public AnonymousLtlExprContext(Ltl_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterAnonymousLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitAnonymousLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitAnonymousLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedLtlExprContext extends Ltl_specContext {
		public Token name;
		public Ltl_exprContext expr;
		public TerminalNode ID() { return getToken(ltlParser.ID, 0); }
		public Ltl_exprContext ltl_expr() {
			return getRuleContext(Ltl_exprContext.class,0);
		}
		public NamedLtlExprContext(Ltl_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterNamedLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitNamedLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitNamedLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ltl_specContext ltl_spec() throws RecognitionException {
		Ltl_specContext _localctx = new Ltl_specContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ltl_spec);
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AnonymousLtlExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26); match(T__17);
				setState(27); ((AnonymousLtlExprContext)_localctx).expr = ltl_expr(0);
				setState(28); match(T__33);
				}
				break;
			case 2:
				_localctx = new NamedLtlExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30); match(T__17);
				setState(31); match(T__2);
				setState(32); ((NamedLtlExprContext)_localctx).name = match(ID);
				setState(33); match(T__28);
				setState(34); ((NamedLtlExprContext)_localctx).expr = ltl_expr(0);
				setState(35); match(T__33);
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

	public static class Ltl_exprContext extends ParserRuleContext {
		public Ltl_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltl_expr; }
	 
		public Ltl_exprContext() { }
		public void copyFrom(Ltl_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicLtlExprContext extends Ltl_exprContext {
		public BasicexprContext basicexpr() {
			return getRuleContext(BasicexprContext.class,0);
		}
		public BasicLtlExprContext(Ltl_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterBasicLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitBasicLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitBasicLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedLtlExprContext extends Ltl_exprContext {
		public Ltl_exprContext ltl_expr() {
			return getRuleContext(Ltl_exprContext.class,0);
		}
		public NestedLtlExprContext(Ltl_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterNestedLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitNestedLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitNestedLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnyLtlExprContext extends Ltl_exprContext {
		public Token op;
		public Ltl_exprContext sub;
		public Ltl_exprContext ltl_expr() {
			return getRuleContext(Ltl_exprContext.class,0);
		}
		public UnyLtlExprContext(Ltl_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterUnyLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitUnyLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitUnyLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLtlExprContext extends Ltl_exprContext {
		public Ltl_exprContext lhs;
		public Token op;
		public Ltl_exprContext rhs;
		public List<Ltl_exprContext> ltl_expr() {
			return getRuleContexts(Ltl_exprContext.class);
		}
		public Ltl_exprContext ltl_expr(int i) {
			return getRuleContext(Ltl_exprContext.class,i);
		}
		public BinaryLtlExprContext(Ltl_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterBinaryLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitBinaryLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitBinaryLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ltl_exprContext ltl_expr() throws RecognitionException {
		return ltl_expr(0);
	}

	private Ltl_exprContext ltl_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ltl_exprContext _localctx = new Ltl_exprContext(_ctx, _parentState);
		Ltl_exprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_ltl_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new UnyLtlExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(40);
				((UnyLtlExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__34) | (1L << T__25) | (1L << T__21) | (1L << T__16) | (1L << T__8) | (1L << T__5))) != 0)) ) {
					((UnyLtlExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(41); ((UnyLtlExprContext)_localctx).sub = ltl_expr(8);
				}
				break;
			case 2:
				{
				_localctx = new BasicLtlExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42); basicexpr(0);
				}
				break;
			case 3:
				{
				_localctx = new NestedLtlExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43); match(T__24);
				setState(44); ltl_expr(0);
				setState(45); match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryLtlExprContext(new Ltl_exprContext(_parentctx, _parentState));
						((BinaryLtlExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl_expr);
						setState(49);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(50);
						((BinaryLtlExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__37) | (1L << T__19) | (1L << T__18))) != 0)) ) {
							((BinaryLtlExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(51); ((BinaryLtlExprContext)_localctx).rhs = ltl_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new BinaryLtlExprContext(new Ltl_exprContext(_parentctx, _parentState));
						((BinaryLtlExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl_expr);
						setState(52);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(53); ((BinaryLtlExprContext)_localctx).op = match(T__26);
						setState(54); ((BinaryLtlExprContext)_localctx).rhs = ltl_expr(7);
						}
						break;
					case 3:
						{
						_localctx = new BinaryLtlExprContext(new Ltl_exprContext(_parentctx, _parentState));
						((BinaryLtlExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl_expr);
						setState(55);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(56);
						((BinaryLtlExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__11) | (1L << T__9))) != 0)) ) {
							((BinaryLtlExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(57); ((BinaryLtlExprContext)_localctx).rhs = ltl_expr(6);
						}
						break;
					case 4:
						{
						_localctx = new BinaryLtlExprContext(new Ltl_exprContext(_parentctx, _parentState));
						((BinaryLtlExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl_expr);
						setState(58);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(59); ((BinaryLtlExprContext)_localctx).op = match(T__20);
						setState(60); ((BinaryLtlExprContext)_localctx).rhs = ltl_expr(4);
						}
						break;
					case 5:
						{
						_localctx = new BinaryLtlExprContext(new Ltl_exprContext(_parentctx, _parentState));
						((BinaryLtlExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl_expr);
						setState(61);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(62); ((BinaryLtlExprContext)_localctx).op = match(T__0);
						setState(63); ((BinaryLtlExprContext)_localctx).rhs = ltl_expr(4);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class BasicexprContext extends ParserRuleContext {
		public BasicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicexpr; }
	 
		public BasicexprContext() { }
		public void copyFrom(BasicexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NestedExprContext extends BasicexprContext {
		public BasicexprContext basicexpr() {
			return getRuleContext(BasicexprContext.class,0);
		}
		public NestedExprContext(BasicexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitNestedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitNestedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseExprContext extends BasicexprContext {
		public BasicexprContext cond;
		public BasicexprContext thene;
		public BasicexprContext elsee;
		public List<BasicexprContext> basicexpr() {
			return getRuleContexts(BasicexprContext.class);
		}
		public BasicexprContext basicexpr(int i) {
			return getRuleContext(BasicexprContext.class,i);
		}
		public IfThenElseExprContext(BasicexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterIfThenElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitIfThenElseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitIfThenElseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends BasicexprContext {
		public BasicexprContext lhs;
		public Token op;
		public BasicexprContext rhs;
		public List<BasicexprContext> basicexpr() {
			return getRuleContexts(BasicexprContext.class);
		}
		public BasicexprContext basicexpr(int i) {
			return getRuleContext(BasicexprContext.class,i);
		}
		public BinaryExprContext(BasicexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnyExprContext extends BasicexprContext {
		public Token op;
		public BasicexprContext sub;
		public BasicexprContext basicexpr() {
			return getRuleContext(BasicexprContext.class,0);
		}
		public UnyExprContext(BasicexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterUnyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitUnyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitUnyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExprContext extends BasicexprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExprContext(BasicexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterConstantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitConstantExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends BasicexprContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public IdExprContext(BasicexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountExprContext extends BasicexprContext {
		public BasicexprContext basicexpr;
		public List<BasicexprContext> el = new ArrayList<BasicexprContext>();
		public List<BasicexprContext> basicexpr() {
			return getRuleContexts(BasicexprContext.class);
		}
		public BasicexprContext basicexpr(int i) {
			return getRuleContext(BasicexprContext.class,i);
		}
		public CountExprContext(BasicexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterCountExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitCountExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitCountExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicexprContext basicexpr() throws RecognitionException {
		return basicexpr(0);
	}

	private BasicexprContext basicexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasicexprContext _localctx = new BasicexprContext(_ctx, _parentState);
		BasicexprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_basicexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new UnyExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70); ((UnyExprContext)_localctx).op = match(T__8);
				setState(71); ((UnyExprContext)_localctx).sub = basicexpr(14);
				}
				break;
			case T__1:
				{
				_localctx = new UnyExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72); ((UnyExprContext)_localctx).op = match(T__1);
				setState(73); ((UnyExprContext)_localctx).sub = basicexpr(13);
				}
				break;
			case REAL:
			case BOOL:
			case INT:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74); constant();
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75); variable_identifier();
				}
				break;
			case T__6:
				{
				_localctx = new UnyExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76); ((UnyExprContext)_localctx).op = match(T__6);
				setState(77); match(T__24);
				setState(78); ((UnyExprContext)_localctx).sub = basicexpr(0);
				setState(79); match(T__4);
				}
				break;
			case T__24:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81); match(T__24);
				setState(82); basicexpr(0);
				setState(83); match(T__4);
				}
				break;
			case T__7:
				{
				_localctx = new CountExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85); match(T__7);
				setState(86); match(T__24);
				setState(87); ((CountExprContext)_localctx).basicexpr = basicexpr(0);
				((CountExprContext)_localctx).el.add(((CountExprContext)_localctx).basicexpr);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(88); match(T__22);
					setState(89); ((CountExprContext)_localctx).basicexpr = basicexpr(0);
					((CountExprContext)_localctx).el.add(((CountExprContext)_localctx).basicexpr);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95); match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(99);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(100);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__23) | (1L << T__14))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(101); ((BinaryExprContext)_localctx).rhs = basicexpr(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(102);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(103);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__1) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(104); ((BinaryExprContext)_localctx).rhs = basicexpr(12);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(105);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(106);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__31) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(107); ((BinaryExprContext)_localctx).rhs = basicexpr(11);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(108);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(109);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__30) | (1L << T__27) | (1L << T__13) | (1L << T__12) | (1L << T__10))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(110); ((BinaryExprContext)_localctx).rhs = basicexpr(10);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(111);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(112); ((BinaryExprContext)_localctx).op = match(T__26);
						setState(113); ((BinaryExprContext)_localctx).rhs = basicexpr(9);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(114);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(115);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__11) | (1L << T__9))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(116); ((BinaryExprContext)_localctx).rhs = basicexpr(8);
						}
						break;
					case 7:
						{
						_localctx = new IfThenElseExprContext(new BasicexprContext(_parentctx, _parentState));
						((IfThenElseExprContext)_localctx).cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(118); match(T__29);
						setState(119); ((IfThenElseExprContext)_localctx).thene = basicexpr(0);
						setState(120); match(T__15);
						setState(121); ((IfThenElseExprContext)_localctx).elsee = basicexpr(7);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124); ((BinaryExprContext)_localctx).op = match(T__0);
						setState(125); ((BinaryExprContext)_localctx).rhs = basicexpr(6);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new BasicexprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_basicexpr);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127); ((BinaryExprContext)_localctx).op = match(T__20);
						setState(128); ((BinaryExprContext)_localctx).rhs = basicexpr(5);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public RealconstantContext realconstant() {
			return getRuleContext(RealconstantContext.class,0);
		}
		public BoolconstantContext boolconstant() {
			return getRuleContext(BoolconstantContext.class,0);
		}
		public IntconstantContext intconstant() {
			return getRuleContext(IntconstantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constant);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); intconstant();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); realconstant();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); boolconstant();
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

	public static class IntconstantContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ltlParser.INT, 0); }
		public IntconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intconstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterIntconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitIntconstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitIntconstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntconstantContext intconstant() throws RecognitionException {
		IntconstantContext _localctx = new IntconstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intconstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(INT);
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

	public static class RealconstantContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(ltlParser.REAL, 0); }
		public RealconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realconstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterRealconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitRealconstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitRealconstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealconstantContext realconstant() throws RecognitionException {
		RealconstantContext _localctx = new RealconstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_realconstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(REAL);
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

	public static class BoolconstantContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(ltlParser.BOOL, 0); }
		public BoolconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolconstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterBoolconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitBoolconstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitBoolconstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolconstantContext boolconstant() throws RecognitionException {
		BoolconstantContext _localctx = new BoolconstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolconstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(BOOL);
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

	public static class Variable_identifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ltlParser.ID, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ltlListener ) ((ltlListener)listener).exitVariable_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ltlVisitor ) return ((ltlVisitor<? extends T>)visitor).visitVariable_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(ID);
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
		case 2: return ltl_expr_sempred((Ltl_exprContext)_localctx, predIndex);
		case 3: return basicexpr_sempred((BasicexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean basicexpr_sempred(BasicexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 12);
		case 6: return precpred(_ctx, 11);
		case 7: return precpred(_ctx, 10);
		case 8: return precpred(_ctx, 9);
		case 9: return precpred(_ctx, 8);
		case 10: return precpred(_ctx, 7);
		case 11: return precpred(_ctx, 6);
		case 12: return precpred(_ctx, 5);
		case 13: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean ltl_expr_sempred(Ltl_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7"+
		"\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\5\3\5\5\5d\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0084\n\5\f\5\16\5\u0087"+
		"\13\5\3\6\3\6\3\6\5\6\u008c\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2"+
		"\4\6\b\13\2\4\6\b\n\f\16\20\22\2\t\b\2\b\t\22\22\26\26\33\33##&&\4\2\5"+
		"\6\30\31\5\2\4\4  \"\"\5\2\3\3\24\24\35\35\4\2((**\3\2\13\f\7\2\7\7\r"+
		"\r\20\20\36\37!!\u00a7\2\27\3\2\2\2\4\'\3\2\2\2\6\61\3\2\2\2\bc\3\2\2"+
		"\2\n\u008b\3\2\2\2\f\u008d\3\2\2\2\16\u008f\3\2\2\2\20\u0091\3\2\2\2\22"+
		"\u0093\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2"+
		"\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2"+
		"\34\35\7\32\2\2\35\36\5\6\4\2\36\37\7\n\2\2\37(\3\2\2\2 !\7\32\2\2!\""+
		"\7)\2\2\"#\7/\2\2#$\7\17\2\2$%\5\6\4\2%&\7\n\2\2&(\3\2\2\2\'\34\3\2\2"+
		"\2\' \3\2\2\2(\5\3\2\2\2)*\b\4\1\2*+\t\2\2\2+\62\5\6\4\n,\62\5\b\5\2-"+
		".\7\23\2\2./\5\6\4\2/\60\7\'\2\2\60\62\3\2\2\2\61)\3\2\2\2\61,\3\2\2\2"+
		"\61-\3\2\2\2\62D\3\2\2\2\63\64\f\t\2\2\64\65\t\3\2\2\65C\5\6\4\n\66\67"+
		"\f\b\2\2\678\7\21\2\28C\5\6\4\t9:\f\7\2\2:;\t\4\2\2;C\5\6\4\b<=\f\6\2"+
		"\2=>\7\27\2\2>C\5\6\4\6?@\f\5\2\2@A\7+\2\2AC\5\6\4\6B\63\3\2\2\2B\66\3"+
		"\2\2\2B9\3\2\2\2B<\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7"+
		"\3\2\2\2FD\3\2\2\2GH\b\5\1\2HI\7#\2\2Id\5\b\5\20JK\7*\2\2Kd\5\b\5\17L"+
		"d\5\n\6\2Md\5\22\n\2NO\7%\2\2OP\7\23\2\2PQ\5\b\5\2QR\7\'\2\2Rd\3\2\2\2"+
		"ST\7\23\2\2TU\5\b\5\2UV\7\'\2\2Vd\3\2\2\2WX\7$\2\2XY\7\23\2\2Y^\5\b\5"+
		"\2Z[\7\25\2\2[]\5\b\5\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3"+
		"\2\2\2`^\3\2\2\2ab\7\'\2\2bd\3\2\2\2cG\3\2\2\2cJ\3\2\2\2cL\3\2\2\2cM\3"+
		"\2\2\2cN\3\2\2\2cS\3\2\2\2cW\3\2\2\2d\u0085\3\2\2\2ef\f\16\2\2fg\t\5\2"+
		"\2g\u0084\5\b\5\17hi\f\r\2\2ij\t\6\2\2j\u0084\5\b\5\16kl\f\f\2\2lm\t\7"+
		"\2\2m\u0084\5\b\5\rno\f\13\2\2op\t\b\2\2p\u0084\5\b\5\fqr\f\n\2\2rs\7"+
		"\21\2\2s\u0084\5\b\5\13tu\f\t\2\2uv\t\4\2\2v\u0084\5\b\5\nwx\f\b\2\2x"+
		"y\7\16\2\2yz\5\b\5\2z{\7\34\2\2{|\5\b\5\t|\u0084\3\2\2\2}~\f\7\2\2~\177"+
		"\7+\2\2\177\u0084\5\b\5\b\u0080\u0081\f\6\2\2\u0081\u0082\7\27\2\2\u0082"+
		"\u0084\5\b\5\7\u0083e\3\2\2\2\u0083h\3\2\2\2\u0083k\3\2\2\2\u0083n\3\2"+
		"\2\2\u0083q\3\2\2\2\u0083t\3\2\2\2\u0083w\3\2\2\2\u0083}\3\2\2\2\u0083"+
		"\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\t\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008c\5\f\7\2\u0089\u008c"+
		"\5\16\b\2\u008a\u008c\5\20\t\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\13\3\2\2\2\u008d\u008e\7.\2\2\u008e\r\3\2\2"+
		"\2\u008f\u0090\7,\2\2\u0090\17\3\2\2\2\u0091\u0092\7-\2\2\u0092\21\3\2"+
		"\2\2\u0093\u0094\7/\2\2\u0094\23\3\2\2\2\f\27\'\61BD^c\u0083\u0085\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}