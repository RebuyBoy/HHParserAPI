package com.hhparser.parser;// Generated from /Users/sergey/projects/HHParserAPI/src/main/antlr4/HH.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HHParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, START_HAND=31, 
		ID=32, ID_TYPE=33, GAME_TYPE=34, RESTRICTION=35, DATE=36, START_BUTTON_INFO=37, 
		WON=38, LOSE=39, FOLDS=40, CALLS=41, CHECKS=42, RAISES=43, BETS=44, SHOWS=45, 
		SUMMARY_MARKER=46, HOLE_CARD_MARKER=47, RIO=48, FIRST=49, SECOND=50, THIRD=51, 
		THREE_STARS=52, RIVER=53, TURN=54, FLOP=55, SHOWDOWN=56, ALLIN_MARKER=57, 
		DEALT_CARDS=58, POST_BLIND_TEXT=59, HASHTAG=60, COLON=61, DASH=62, SEAT=63, 
		SEPARATOR=64, CARDS=65, COMBINATION=66, CURRENCY=67, NUMBER=68, DIGIT_LETTER=69, 
		WORD=70, WS=71, SPACE=72, LEFT_SQUARED_BRACKET=73, LEFT_ROUNDED_BRACKET=74, 
		RIGHT_SQUARED_BRACKET=75, RIGHT_ROUNDED_BRACKET=76;
	public static final int
		RULE_parse = 0, RULE_hand = 1, RULE_pocketCards = 2, RULE_info = 3, RULE_baseHandInfo = 4, 
		RULE_id = 5, RULE_gameInfo = 6, RULE_date = 7, RULE_stake = 8, RULE_buttonInfo = 9, 
		RULE_tableSize = 10, RULE_buttonPosition = 11, RULE_positionStackSizeInfo = 12, 
		RULE_position = 13, RULE_stakeSize = 14, RULE_postBlindInfo = 15, RULE_blindSize = 16, 
		RULE_dealtCards = 17, RULE_preflopActions = 18, RULE_postflopActions = 19, 
		RULE_flop = 20, RULE_turn = 21, RULE_river = 22, RULE_moves = 23, RULE_flop_street_cards = 24, 
		RULE_turn_street_cards = 25, RULE_river_street_cards = 26, RULE_cashout = 27, 
		RULE_action = 28, RULE_action_type = 29, RULE_uncalledBet = 30, RULE_fold = 31, 
		RULE_call = 32, RULE_check = 33, RULE_bets = 34, RULE_raise = 35, RULE_show = 36, 
		RULE_receive = 37, RULE_chooses = 38, RULE_pays = 39, RULE_showdowns = 40, 
		RULE_showdown = 41, RULE_collected = 42, RULE_summary = 43, RULE_rio = 44, 
		RULE_times = 45, RULE_boards = 46, RULE_board = 47, RULE_playerSummary = 48, 
		RULE_folded = 49, RULE_foldPosition = 50, RULE_showed = 51, RULE_summaryCollected = 52, 
		RULE_cashoutEV = 53, RULE_cashoutRisk = 54, RULE_summaryWon = 55, RULE_showedCombination = 56, 
		RULE_result = 57, RULE_summaryInfo = 58, RULE_fortune = 59, RULE_jackpot = 60, 
		RULE_bingo = 61, RULE_rake = 62, RULE_totalPot = 63, RULE_name = 64, RULE_cash = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "hand", "pocketCards", "info", "baseHandInfo", "id", "gameInfo", 
			"date", "stake", "buttonInfo", "tableSize", "buttonPosition", "positionStackSizeInfo", 
			"position", "stakeSize", "postBlindInfo", "blindSize", "dealtCards", 
			"preflopActions", "postflopActions", "flop", "turn", "river", "moves", 
			"flop_street_cards", "turn_street_cards", "river_street_cards", "cashout", 
			"action", "action_type", "uncalledBet", "fold", "call", "check", "bets", 
			"raise", "show", "receive", "chooses", "pays", "showdowns", "showdown", 
			"collected", "summary", "rio", "times", "boards", "board", "playerSummary", 
			"folded", "foldPosition", "showed", "summaryCollected", "cashoutEV", 
			"cashoutRisk", "summaryWon", "showedCombination", "result", "summaryInfo", 
			"fortune", "jackpot", "bingo", "rake", "totalPot", "name", "cash"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-max'", "' is the button'", "'in chips)'", "'Uncalled bet'", 
			"'returned to'", "'to '", "'Receives Cashout'", "'Chooses to EV Cashout'", 
			"'Pays Cashout Risk'", "'collected'", "'from pot'", "'Hand was run'", 
			"'times'", "'two'", "'three'", "'Board'", "'(button)'", "'folded before Flop'", 
			"'folded on the'", "'showed'", "','", "'and'", "'with'", "'EV Cashout'", 
			"'Cashout Risk'", "'Fortune'", "'Jackpot'", "'Bingo'", "'Rake'", "'Total pot'", 
			"'Poker Hand #'", null, null, null, null, null, null, "'won'", "'lost'", 
			"'folds'", "'calls'", "'checks'", "'raises'", "'bets'", "'shows'", "'*** SUMMARY ***'", 
			"'*** HOLE CARDS ***'", null, "'FIRST'", "'SECOND'", "'THIRD'", "'***'", 
			null, null, null, "'SHOWDOWN'", "'and is all-in'", "'Dealt to'", null, 
			"'#'", "':'", "'-'", "'Seat'", "'|'", null, null, null, null, null, null, 
			null, "' '", "'['", "'('", "']'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "START_HAND", "ID", "ID_TYPE", 
			"GAME_TYPE", "RESTRICTION", "DATE", "START_BUTTON_INFO", "WON", "LOSE", 
			"FOLDS", "CALLS", "CHECKS", "RAISES", "BETS", "SHOWS", "SUMMARY_MARKER", 
			"HOLE_CARD_MARKER", "RIO", "FIRST", "SECOND", "THIRD", "THREE_STARS", 
			"RIVER", "TURN", "FLOP", "SHOWDOWN", "ALLIN_MARKER", "DEALT_CARDS", "POST_BLIND_TEXT", 
			"HASHTAG", "COLON", "DASH", "SEAT", "SEPARATOR", "CARDS", "COMBINATION", 
			"CURRENCY", "NUMBER", "DIGIT_LETTER", "WORD", "WS", "SPACE", "LEFT_SQUARED_BRACKET", 
			"LEFT_ROUNDED_BRACKET", "RIGHT_SQUARED_BRACKET", "RIGHT_ROUNDED_BRACKET"
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
	public String getGrammarFileName() { return "HH.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HHParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HHParser.EOF, 0); }
		public List<HandContext> hand() {
			return getRuleContexts(HandContext.class);
		}
		public HandContext hand(int i) {
			return getRuleContext(HandContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				hand();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==START_HAND );
			setState(137);
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

	public static class HandContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public PocketCardsContext pocketCards() {
			return getRuleContext(PocketCardsContext.class,0);
		}
		public PreflopActionsContext preflopActions() {
			return getRuleContext(PreflopActionsContext.class,0);
		}
		public ShowdownsContext showdowns() {
			return getRuleContext(ShowdownsContext.class,0);
		}
		public SummaryContext summary() {
			return getRuleContext(SummaryContext.class,0);
		}
		public PostflopActionsContext postflopActions() {
			return getRuleContext(PostflopActionsContext.class,0);
		}
		public HandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterHand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitHand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitHand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandContext hand() throws RecognitionException {
		HandContext _localctx = new HandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			info();
			setState(140);
			pocketCards();
			setState(141);
			preflopActions();
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(142);
				postflopActions();
				}
				break;
			}
			setState(145);
			showdowns();
			setState(146);
			summary();
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

	public static class PocketCardsContext extends ParserRuleContext {
		public TerminalNode HOLE_CARD_MARKER() { return getToken(HHParser.HOLE_CARD_MARKER, 0); }
		public List<DealtCardsContext> dealtCards() {
			return getRuleContexts(DealtCardsContext.class);
		}
		public DealtCardsContext dealtCards(int i) {
			return getRuleContext(DealtCardsContext.class,i);
		}
		public PocketCardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pocketCards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPocketCards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPocketCards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPocketCards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PocketCardsContext pocketCards() throws RecognitionException {
		PocketCardsContext _localctx = new PocketCardsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pocketCards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(HOLE_CARD_MARKER);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				dealtCards();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEALT_CARDS );
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

	public static class InfoContext extends ParserRuleContext {
		public BaseHandInfoContext baseHandInfo() {
			return getRuleContext(BaseHandInfoContext.class,0);
		}
		public ButtonInfoContext buttonInfo() {
			return getRuleContext(ButtonInfoContext.class,0);
		}
		public List<PositionStackSizeInfoContext> positionStackSizeInfo() {
			return getRuleContexts(PositionStackSizeInfoContext.class);
		}
		public PositionStackSizeInfoContext positionStackSizeInfo(int i) {
			return getRuleContext(PositionStackSizeInfoContext.class,i);
		}
		public List<PostBlindInfoContext> postBlindInfo() {
			return getRuleContexts(PostBlindInfoContext.class);
		}
		public PostBlindInfoContext postBlindInfo(int i) {
			return getRuleContext(PostBlindInfoContext.class,i);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			baseHandInfo();
			setState(155);
			buttonInfo();
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				positionStackSizeInfo();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEAT );
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				postBlindInfo();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==DIGIT_LETTER );
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

	public static class BaseHandInfoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public GameInfoContext gameInfo() {
			return getRuleContext(GameInfoContext.class,0);
		}
		public TerminalNode DASH() { return getToken(HHParser.DASH, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public BaseHandInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseHandInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterBaseHandInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitBaseHandInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitBaseHandInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseHandInfoContext baseHandInfo() throws RecognitionException {
		BaseHandInfoContext _localctx = new BaseHandInfoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_baseHandInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			id();
			setState(167);
			gameInfo();
			setState(168);
			match(DASH);
			setState(169);
			date();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode START_HAND() { return getToken(HHParser.START_HAND, 0); }
		public TerminalNode ID() { return getToken(HHParser.ID, 0); }
		public TerminalNode COLON() { return getToken(HHParser.COLON, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(START_HAND);
			setState(172);
			match(ID);
			setState(173);
			match(COLON);
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

	public static class GameInfoContext extends ParserRuleContext {
		public TerminalNode GAME_TYPE() { return getToken(HHParser.GAME_TYPE, 0); }
		public TerminalNode RESTRICTION() { return getToken(HHParser.RESTRICTION, 0); }
		public StakeContext stake() {
			return getRuleContext(StakeContext.class,0);
		}
		public GameInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterGameInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitGameInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitGameInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameInfoContext gameInfo() throws RecognitionException {
		GameInfoContext _localctx = new GameInfoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gameInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(GAME_TYPE);
			setState(176);
			match(RESTRICTION);
			setState(177);
			stake();
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(HHParser.DATE, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(DATE);
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

	public static class StakeContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public StakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterStake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitStake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitStake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StakeContext stake() throws RecognitionException {
		StakeContext _localctx = new StakeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			cash();
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

	public static class ButtonInfoContext extends ParserRuleContext {
		public TerminalNode START_BUTTON_INFO() { return getToken(HHParser.START_BUTTON_INFO, 0); }
		public TableSizeContext tableSize() {
			return getRuleContext(TableSizeContext.class,0);
		}
		public ButtonPositionContext buttonPosition() {
			return getRuleContext(ButtonPositionContext.class,0);
		}
		public ButtonInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterButtonInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitButtonInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitButtonInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonInfoContext buttonInfo() throws RecognitionException {
		ButtonInfoContext _localctx = new ButtonInfoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_buttonInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(START_BUTTON_INFO);
			setState(184);
			tableSize();
			setState(185);
			buttonPosition();
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

	public static class TableSizeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HHParser.NUMBER, 0); }
		public TableSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterTableSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitTableSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitTableSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSizeContext tableSize() throws RecognitionException {
		TableSizeContext _localctx = new TableSizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(NUMBER);
			setState(188);
			match(T__0);
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

	public static class ButtonPositionContext extends ParserRuleContext {
		public TerminalNode SEAT() { return getToken(HHParser.SEAT, 0); }
		public TerminalNode HASHTAG() { return getToken(HHParser.HASHTAG, 0); }
		public TerminalNode NUMBER() { return getToken(HHParser.NUMBER, 0); }
		public ButtonPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterButtonPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitButtonPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitButtonPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonPositionContext buttonPosition() throws RecognitionException {
		ButtonPositionContext _localctx = new ButtonPositionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_buttonPosition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(SEAT);
			setState(191);
			match(HASHTAG);
			setState(192);
			match(NUMBER);
			setState(193);
			match(T__1);
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

	public static class PositionStackSizeInfoContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StakeSizeContext stakeSize() {
			return getRuleContext(StakeSizeContext.class,0);
		}
		public PositionStackSizeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionStackSizeInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPositionStackSizeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPositionStackSizeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPositionStackSizeInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionStackSizeInfoContext positionStackSizeInfo() throws RecognitionException {
		PositionStackSizeInfoContext _localctx = new PositionStackSizeInfoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_positionStackSizeInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			position();
			setState(196);
			name();
			setState(197);
			stakeSize();
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

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode SEAT() { return getToken(HHParser.SEAT, 0); }
		public TerminalNode NUMBER() { return getToken(HHParser.NUMBER, 0); }
		public TerminalNode COLON() { return getToken(HHParser.COLON, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SEAT);
			setState(200);
			match(NUMBER);
			setState(201);
			match(COLON);
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

	public static class StakeSizeContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public StakeSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stakeSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterStakeSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitStakeSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitStakeSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StakeSizeContext stakeSize() throws RecognitionException {
		StakeSizeContext _localctx = new StakeSizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stakeSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			cash();
			setState(204);
			match(T__2);
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

	public static class PostBlindInfoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HHParser.COLON, 0); }
		public TerminalNode POST_BLIND_TEXT() { return getToken(HHParser.POST_BLIND_TEXT, 0); }
		public BlindSizeContext blindSize() {
			return getRuleContext(BlindSizeContext.class,0);
		}
		public TerminalNode ALLIN_MARKER() { return getToken(HHParser.ALLIN_MARKER, 0); }
		public PostBlindInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postBlindInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPostBlindInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPostBlindInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPostBlindInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostBlindInfoContext postBlindInfo() throws RecognitionException {
		PostBlindInfoContext _localctx = new PostBlindInfoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_postBlindInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			name();
			setState(207);
			match(COLON);
			setState(208);
			match(POST_BLIND_TEXT);
			setState(209);
			blindSize();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALLIN_MARKER) {
				{
				setState(210);
				match(ALLIN_MARKER);
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

	public static class BlindSizeContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public BlindSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blindSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterBlindSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitBlindSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitBlindSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlindSizeContext blindSize() throws RecognitionException {
		BlindSizeContext _localctx = new BlindSizeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blindSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			cash();
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

	public static class DealtCardsContext extends ParserRuleContext {
		public TerminalNode DEALT_CARDS() { return getToken(HHParser.DEALT_CARDS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CARDS() { return getToken(HHParser.CARDS, 0); }
		public DealtCardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dealtCards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterDealtCards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitDealtCards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitDealtCards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DealtCardsContext dealtCards() throws RecognitionException {
		DealtCardsContext _localctx = new DealtCardsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dealtCards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(DEALT_CARDS);
			setState(216);
			name();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARDS) {
				{
				setState(217);
				match(CARDS);
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

	public static class PreflopActionsContext extends ParserRuleContext {
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public PreflopActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preflopActions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPreflopActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPreflopActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPreflopActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreflopActionsContext preflopActions() throws RecognitionException {
		PreflopActionsContext _localctx = new PreflopActionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_preflopActions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			moves();
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

	public static class PostflopActionsContext extends ParserRuleContext {
		public List<FlopContext> flop() {
			return getRuleContexts(FlopContext.class);
		}
		public FlopContext flop(int i) {
			return getRuleContext(FlopContext.class,i);
		}
		public List<TurnContext> turn() {
			return getRuleContexts(TurnContext.class);
		}
		public TurnContext turn(int i) {
			return getRuleContext(TurnContext.class,i);
		}
		public List<RiverContext> river() {
			return getRuleContexts(RiverContext.class);
		}
		public RiverContext river(int i) {
			return getRuleContext(RiverContext.class,i);
		}
		public PostflopActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postflopActions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPostflopActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPostflopActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPostflopActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostflopActionsContext postflopActions() throws RecognitionException {
		PostflopActionsContext _localctx = new PostflopActionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_postflopActions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(222);
						flop();
						}
						break;
					case 2:
						{
						setState(223);
						turn();
						}
						break;
					case 3:
						{
						setState(224);
						river();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FlopContext extends ParserRuleContext {
		public Flop_street_cardsContext flop_street_cards() {
			return getRuleContext(Flop_street_cardsContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public FlopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterFlop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitFlop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitFlop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlopContext flop() throws RecognitionException {
		FlopContext _localctx = new FlopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_flop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			flop_street_cards();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==NUMBER || _la==DIGIT_LETTER) {
				{
				setState(230);
				moves();
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

	public static class TurnContext extends ParserRuleContext {
		public Turn_street_cardsContext turn_street_cards() {
			return getRuleContext(Turn_street_cardsContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitTurn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			turn_street_cards();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==NUMBER || _la==DIGIT_LETTER) {
				{
				setState(234);
				moves();
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

	public static class RiverContext extends ParserRuleContext {
		public River_street_cardsContext river_street_cards() {
			return getRuleContext(River_street_cardsContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public RiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_river; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterRiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitRiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitRiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RiverContext river() throws RecognitionException {
		RiverContext _localctx = new RiverContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_river);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			river_street_cards();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==NUMBER || _la==DIGIT_LETTER) {
				{
				setState(238);
				moves();
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

	public static class MovesContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<UncalledBetContext> uncalledBet() {
			return getRuleContexts(UncalledBetContext.class);
		}
		public UncalledBetContext uncalledBet(int i) {
			return getRuleContext(UncalledBetContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<CashoutContext> cashout() {
			return getRuleContexts(CashoutContext.class);
		}
		public CashoutContext cashout(int i) {
			return getRuleContext(CashoutContext.class,i);
		}
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterMoves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitMoves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitMoves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_moves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(241);
					action();
					}
					break;
				case 2:
					{
					setState(242);
					uncalledBet();
					}
					break;
				case 3:
					{
					setState(243);
					show();
					}
					break;
				case 4:
					{
					setState(244);
					cashout();
					}
					break;
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==NUMBER || _la==DIGIT_LETTER );
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

	public static class Flop_street_cardsContext extends ParserRuleContext {
		public List<TerminalNode> THREE_STARS() { return getTokens(HHParser.THREE_STARS); }
		public TerminalNode THREE_STARS(int i) {
			return getToken(HHParser.THREE_STARS, i);
		}
		public TerminalNode FLOP() { return getToken(HHParser.FLOP, 0); }
		public TerminalNode RIO() { return getToken(HHParser.RIO, 0); }
		public List<TerminalNode> CARDS() { return getTokens(HHParser.CARDS); }
		public TerminalNode CARDS(int i) {
			return getToken(HHParser.CARDS, i);
		}
		public Flop_street_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flop_street_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterFlop_street_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitFlop_street_cards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitFlop_street_cards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flop_street_cardsContext flop_street_cards() throws RecognitionException {
		Flop_street_cardsContext _localctx = new Flop_street_cardsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_flop_street_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(THREE_STARS);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIO) {
				{
				setState(250);
				match(RIO);
				}
			}

			setState(253);
			match(FLOP);
			setState(254);
			match(THREE_STARS);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				match(CARDS);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CARDS );
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

	public static class Turn_street_cardsContext extends ParserRuleContext {
		public List<TerminalNode> THREE_STARS() { return getTokens(HHParser.THREE_STARS); }
		public TerminalNode THREE_STARS(int i) {
			return getToken(HHParser.THREE_STARS, i);
		}
		public TerminalNode TURN() { return getToken(HHParser.TURN, 0); }
		public TerminalNode RIO() { return getToken(HHParser.RIO, 0); }
		public List<TerminalNode> CARDS() { return getTokens(HHParser.CARDS); }
		public TerminalNode CARDS(int i) {
			return getToken(HHParser.CARDS, i);
		}
		public Turn_street_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_street_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterTurn_street_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitTurn_street_cards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitTurn_street_cards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Turn_street_cardsContext turn_street_cards() throws RecognitionException {
		Turn_street_cardsContext _localctx = new Turn_street_cardsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_turn_street_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(THREE_STARS);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIO) {
				{
				setState(261);
				match(RIO);
				}
			}

			setState(264);
			match(TURN);
			setState(265);
			match(THREE_STARS);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				match(CARDS);
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CARDS );
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

	public static class River_street_cardsContext extends ParserRuleContext {
		public List<TerminalNode> THREE_STARS() { return getTokens(HHParser.THREE_STARS); }
		public TerminalNode THREE_STARS(int i) {
			return getToken(HHParser.THREE_STARS, i);
		}
		public TerminalNode RIVER() { return getToken(HHParser.RIVER, 0); }
		public TerminalNode RIO() { return getToken(HHParser.RIO, 0); }
		public List<TerminalNode> CARDS() { return getTokens(HHParser.CARDS); }
		public TerminalNode CARDS(int i) {
			return getToken(HHParser.CARDS, i);
		}
		public River_street_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_river_street_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterRiver_street_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitRiver_street_cards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitRiver_street_cards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final River_street_cardsContext river_street_cards() throws RecognitionException {
		River_street_cardsContext _localctx = new River_street_cardsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_river_street_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(THREE_STARS);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIO) {
				{
				setState(272);
				match(RIO);
				}
			}

			setState(275);
			match(RIVER);
			setState(276);
			match(THREE_STARS);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				match(CARDS);
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CARDS );
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

	public static class CashoutContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HHParser.COLON, 0); }
		public ReceiveContext receive() {
			return getRuleContext(ReceiveContext.class,0);
		}
		public ChoosesContext chooses() {
			return getRuleContext(ChoosesContext.class,0);
		}
		public PaysContext pays() {
			return getRuleContext(PaysContext.class,0);
		}
		public CashoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cashout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterCashout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitCashout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitCashout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CashoutContext cashout() throws RecognitionException {
		CashoutContext _localctx = new CashoutContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cashout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			name();
			setState(283);
			match(COLON);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(284);
				receive();
				}
				break;
			case T__7:
				{
				setState(285);
				chooses();
				}
				break;
			case T__8:
				{
				setState(286);
				pays();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ActionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HHParser.COLON, 0); }
		public Action_typeContext action_type() {
			return getRuleContext(Action_typeContext.class,0);
		}
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public TerminalNode ALLIN_MARKER() { return getToken(HHParser.ALLIN_MARKER, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			name();
			setState(290);
			match(COLON);
			setState(291);
			action_type();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURRENCY || _la==LEFT_ROUNDED_BRACKET) {
				{
				setState(292);
				cash();
				}
			}

			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALLIN_MARKER) {
				{
				setState(295);
				match(ALLIN_MARKER);
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

	public static class Action_typeContext extends ParserRuleContext {
		public FoldContext fold() {
			return getRuleContext(FoldContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public RaiseContext raise() {
			return getRuleContext(RaiseContext.class,0);
		}
		public BetsContext bets() {
			return getRuleContext(BetsContext.class,0);
		}
		public Action_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterAction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitAction_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitAction_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_typeContext action_type() throws RecognitionException {
		Action_typeContext _localctx = new Action_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_action_type);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOLDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				fold();
				}
				break;
			case CALLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				call();
				}
				break;
			case CHECKS:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				check();
				}
				break;
			case RAISES:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				raise();
				}
				break;
			case BETS:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				bets();
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

	public static class UncalledBetContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public UncalledBetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncalledBet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterUncalledBet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitUncalledBet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitUncalledBet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UncalledBetContext uncalledBet() throws RecognitionException {
		UncalledBetContext _localctx = new UncalledBetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_uncalledBet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__3);
			setState(306);
			cash();
			setState(307);
			match(T__4);
			setState(308);
			name();
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

	public static class FoldContext extends ParserRuleContext {
		public TerminalNode FOLDS() { return getToken(HHParser.FOLDS, 0); }
		public FoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterFold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitFold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitFold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoldContext fold() throws RecognitionException {
		FoldContext _localctx = new FoldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FOLDS);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALLS() { return getToken(HHParser.CALLS, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(CALLS);
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

	public static class CheckContext extends ParserRuleContext {
		public TerminalNode CHECKS() { return getToken(HHParser.CHECKS, 0); }
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CHECKS);
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

	public static class BetsContext extends ParserRuleContext {
		public TerminalNode BETS() { return getToken(HHParser.BETS, 0); }
		public BetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterBets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitBets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitBets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetsContext bets() throws RecognitionException {
		BetsContext _localctx = new BetsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(BETS);
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

	public static class RaiseContext extends ParserRuleContext {
		public TerminalNode RAISES() { return getToken(HHParser.RAISES, 0); }
		public List<CashContext> cash() {
			return getRuleContexts(CashContext.class);
		}
		public CashContext cash(int i) {
			return getRuleContext(CashContext.class,i);
		}
		public RaiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterRaise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitRaise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitRaise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseContext raise() throws RecognitionException {
		RaiseContext _localctx = new RaiseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_raise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(RAISES);
			setState(319);
			cash();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(320);
				match(T__5);
				setState(321);
				cash();
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

	public static class ShowContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HHParser.COLON, 0); }
		public TerminalNode SHOWS() { return getToken(HHParser.SHOWS, 0); }
		public TerminalNode CARDS() { return getToken(HHParser.CARDS, 0); }
		public TerminalNode COMBINATION() { return getToken(HHParser.COMBINATION, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			name();
			setState(325);
			match(COLON);
			setState(326);
			match(SHOWS);
			setState(327);
			match(CARDS);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMBINATION) {
				{
				setState(328);
				match(COMBINATION);
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

	public static class ReceiveContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public ReceiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterReceive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitReceive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitReceive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiveContext receive() throws RecognitionException {
		ReceiveContext _localctx = new ReceiveContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_receive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__6);
			setState(332);
			cash();
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

	public static class ChoosesContext extends ParserRuleContext {
		public ChoosesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterChooses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitChooses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitChooses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoosesContext chooses() throws RecognitionException {
		ChoosesContext _localctx = new ChoosesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_chooses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__7);
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

	public static class PaysContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public PaysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaysContext pays() throws RecognitionException {
		PaysContext _localctx = new PaysContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pays);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__8);
			setState(337);
			cash();
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

	public static class ShowdownsContext extends ParserRuleContext {
		public List<ShowdownContext> showdown() {
			return getRuleContexts(ShowdownContext.class);
		}
		public ShowdownContext showdown(int i) {
			return getRuleContext(ShowdownContext.class,i);
		}
		public List<CollectedContext> collected() {
			return getRuleContexts(CollectedContext.class);
		}
		public CollectedContext collected(int i) {
			return getRuleContext(CollectedContext.class,i);
		}
		public ShowdownsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showdowns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterShowdowns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitShowdowns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitShowdowns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowdownsContext showdowns() throws RecognitionException {
		ShowdownsContext _localctx = new ShowdownsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_showdowns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				showdown();
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					collected();
					}
					}
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER || _la==DIGIT_LETTER );
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==THREE_STARS );
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

	public static class ShowdownContext extends ParserRuleContext {
		public List<TerminalNode> THREE_STARS() { return getTokens(HHParser.THREE_STARS); }
		public TerminalNode THREE_STARS(int i) {
			return getToken(HHParser.THREE_STARS, i);
		}
		public TerminalNode SHOWDOWN() { return getToken(HHParser.SHOWDOWN, 0); }
		public TerminalNode RIO() { return getToken(HHParser.RIO, 0); }
		public ShowdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterShowdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitShowdown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitShowdown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowdownContext showdown() throws RecognitionException {
		ShowdownContext _localctx = new ShowdownContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_showdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(THREE_STARS);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIO) {
				{
				setState(350);
				match(RIO);
				}
			}

			setState(353);
			match(SHOWDOWN);
			setState(354);
			match(THREE_STARS);
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

	public static class CollectedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public CollectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterCollected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitCollected(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitCollected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectedContext collected() throws RecognitionException {
		CollectedContext _localctx = new CollectedContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_collected);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			name();
			setState(357);
			match(T__9);
			setState(358);
			cash();
			setState(359);
			match(T__10);
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

	public static class SummaryContext extends ParserRuleContext {
		public TerminalNode SUMMARY_MARKER() { return getToken(HHParser.SUMMARY_MARKER, 0); }
		public SummaryInfoContext summaryInfo() {
			return getRuleContext(SummaryInfoContext.class,0);
		}
		public RioContext rio() {
			return getRuleContext(RioContext.class,0);
		}
		public BoardsContext boards() {
			return getRuleContext(BoardsContext.class,0);
		}
		public List<PlayerSummaryContext> playerSummary() {
			return getRuleContexts(PlayerSummaryContext.class);
		}
		public PlayerSummaryContext playerSummary(int i) {
			return getRuleContext(PlayerSummaryContext.class,i);
		}
		public SummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummaryContext summary() throws RecognitionException {
		SummaryContext _localctx = new SummaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_summary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(SUMMARY_MARKER);
			setState(362);
			summaryInfo();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(363);
				rio();
				}
			}

			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15 || _la==RIO) {
				{
				setState(366);
				boards();
				}
			}

			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(369);
				playerSummary();
				}
				}
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEAT );
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

	public static class RioContext extends ParserRuleContext {
		public TimesContext times() {
			return getRuleContext(TimesContext.class,0);
		}
		public RioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterRio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitRio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitRio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RioContext rio() throws RecognitionException {
		RioContext _localctx = new RioContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__11);
			setState(375);
			times();
			setState(376);
			match(T__12);
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

	public static class TimesContext extends ParserRuleContext {
		public TimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesContext times() throws RecognitionException {
		TimesContext _localctx = new TimesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_times);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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

	public static class BoardsContext extends ParserRuleContext {
		public List<BoardContext> board() {
			return getRuleContexts(BoardContext.class);
		}
		public BoardContext board(int i) {
			return getRuleContext(BoardContext.class,i);
		}
		public BoardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterBoards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitBoards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitBoards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardsContext boards() throws RecognitionException {
		BoardsContext _localctx = new BoardsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_boards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				board();
				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 || _la==RIO );
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

	public static class BoardContext extends ParserRuleContext {
		public TerminalNode CARDS() { return getToken(HHParser.CARDS, 0); }
		public TerminalNode RIO() { return getToken(HHParser.RIO, 0); }
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitBoard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_board);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIO) {
				{
				setState(385);
				match(RIO);
				}
			}

			setState(388);
			match(T__15);
			setState(389);
			match(CARDS);
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

	public static class PlayerSummaryContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FoldedContext folded() {
			return getRuleContext(FoldedContext.class,0);
		}
		public ShowedContext showed() {
			return getRuleContext(ShowedContext.class,0);
		}
		public SummaryCollectedContext summaryCollected() {
			return getRuleContext(SummaryCollectedContext.class,0);
		}
		public SummaryWonContext summaryWon() {
			return getRuleContext(SummaryWonContext.class,0);
		}
		public PlayerSummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerSummary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterPlayerSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitPlayerSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitPlayerSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerSummaryContext playerSummary() throws RecognitionException {
		PlayerSummaryContext _localctx = new PlayerSummaryContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_playerSummary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			position();
			setState(392);
			name();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(393);
				match(T__16);
				}
			}

			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
				{
				setState(396);
				folded();
				}
				break;
			case T__19:
				{
				setState(397);
				showed();
				}
				break;
			case T__9:
				{
				setState(398);
				summaryCollected();
				}
				break;
			case WON:
				{
				setState(399);
				summaryWon();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FoldedContext extends ParserRuleContext {
		public FoldPositionContext foldPosition() {
			return getRuleContext(FoldPositionContext.class,0);
		}
		public FoldedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterFolded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitFolded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitFolded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoldedContext folded() throws RecognitionException {
		FoldedContext _localctx = new FoldedContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_folded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(402);
				match(T__17);
				}
				break;
			case T__18:
				{
				setState(403);
				match(T__18);
				setState(404);
				foldPosition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FoldPositionContext extends ParserRuleContext {
		public TerminalNode FLOP() { return getToken(HHParser.FLOP, 0); }
		public TerminalNode TURN() { return getToken(HHParser.TURN, 0); }
		public TerminalNode RIVER() { return getToken(HHParser.RIVER, 0); }
		public FoldPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foldPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterFoldPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitFoldPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitFoldPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoldPositionContext foldPosition() throws RecognitionException {
		FoldPositionContext _localctx = new FoldPositionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_foldPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RIVER) | (1L << TURN) | (1L << FLOP))) != 0)) ) {
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

	public static class ShowedContext extends ParserRuleContext {
		public TerminalNode CARDS() { return getToken(HHParser.CARDS, 0); }
		public List<SummaryCollectedContext> summaryCollected() {
			return getRuleContexts(SummaryCollectedContext.class);
		}
		public SummaryCollectedContext summaryCollected(int i) {
			return getRuleContext(SummaryCollectedContext.class,i);
		}
		public List<CashoutEVContext> cashoutEV() {
			return getRuleContexts(CashoutEVContext.class);
		}
		public CashoutEVContext cashoutEV(int i) {
			return getRuleContext(CashoutEVContext.class,i);
		}
		public List<CashoutRiskContext> cashoutRisk() {
			return getRuleContexts(CashoutRiskContext.class);
		}
		public CashoutRiskContext cashoutRisk(int i) {
			return getRuleContext(CashoutRiskContext.class,i);
		}
		public List<ResultContext> result() {
			return getRuleContexts(ResultContext.class);
		}
		public ResultContext result(int i) {
			return getRuleContext(ResultContext.class,i);
		}
		public List<ShowedCombinationContext> showedCombination() {
			return getRuleContexts(ShowedCombinationContext.class);
		}
		public ShowedCombinationContext showedCombination(int i) {
			return getRuleContext(ShowedCombinationContext.class,i);
		}
		public ShowedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterShowed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitShowed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitShowed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowedContext showed() throws RecognitionException {
		ShowedContext _localctx = new ShowedContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_showed);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__19);
			setState(410);
			match(CARDS);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(425);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__20:
					case T__21:
						{
						setState(412);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__20) {
							{
							setState(411);
							match(T__20);
							}
						}

						setState(414);
						match(T__21);
						{
						setState(419);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WON || _la==LOSE) {
							{
							setState(415);
							result();
							setState(417);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__22) {
								{
								setState(416);
								match(T__22);
								}
							}

							}
						}

						setState(422);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DIGIT_LETTER) {
							{
							setState(421);
							showedCombination();
							}
						}

						}
						}
						break;
					case T__9:
						{
						setState(424);
						summaryCollected();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(430);
				match(T__20);
				setState(433);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(431);
					cashoutEV();
					}
					break;
				case T__24:
					{
					setState(432);
					cashoutRisk();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(439);
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

	public static class SummaryCollectedContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public SummaryCollectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summaryCollected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterSummaryCollected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitSummaryCollected(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitSummaryCollected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummaryCollectedContext summaryCollected() throws RecognitionException {
		SummaryCollectedContext _localctx = new SummaryCollectedContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_summaryCollected);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__9);
			setState(441);
			cash();
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

	public static class CashoutEVContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public CashoutEVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cashoutEV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterCashoutEV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitCashoutEV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitCashoutEV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CashoutEVContext cashoutEV() throws RecognitionException {
		CashoutEVContext _localctx = new CashoutEVContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cashoutEV);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__23);
			setState(444);
			cash();
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

	public static class CashoutRiskContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public CashoutRiskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cashoutRisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterCashoutRisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitCashoutRisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitCashoutRisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CashoutRiskContext cashoutRisk() throws RecognitionException {
		CashoutRiskContext _localctx = new CashoutRiskContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cashoutRisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__24);
			setState(447);
			cash();
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

	public static class SummaryWonContext extends ParserRuleContext {
		public TerminalNode WON() { return getToken(HHParser.WON, 0); }
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public SummaryWonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summaryWon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterSummaryWon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitSummaryWon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitSummaryWon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummaryWonContext summaryWon() throws RecognitionException {
		SummaryWonContext _localctx = new SummaryWonContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_summaryWon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(WON);
			setState(450);
			cash();
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

	public static class ShowedCombinationContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT_LETTER() { return getTokens(HHParser.DIGIT_LETTER); }
		public TerminalNode DIGIT_LETTER(int i) {
			return getToken(HHParser.DIGIT_LETTER, i);
		}
		public List<TerminalNode> DASH() { return getTokens(HHParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(HHParser.DASH, i);
		}
		public ShowedCombinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showedCombination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterShowedCombination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitShowedCombination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitShowedCombination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowedCombinationContext showedCombination() throws RecognitionException {
		ShowedCombinationContext _localctx = new ShowedCombinationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_showedCombination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(452);
				match(DIGIT_LETTER);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DASH) {
					{
					setState(453);
					match(DASH);
					}
				}

				}
				}
				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT_LETTER );
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

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode WON() { return getToken(HHParser.WON, 0); }
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public TerminalNode LOSE() { return getToken(HHParser.LOSE, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WON:
				{
				setState(460);
				match(WON);
				setState(461);
				cash();
				}
				break;
			case LOSE:
				{
				setState(462);
				match(LOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SummaryInfoContext extends ParserRuleContext {
		public TotalPotContext totalPot() {
			return getRuleContext(TotalPotContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(HHParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(HHParser.SEPARATOR, i);
		}
		public RakeContext rake() {
			return getRuleContext(RakeContext.class,0);
		}
		public JackpotContext jackpot() {
			return getRuleContext(JackpotContext.class,0);
		}
		public BingoContext bingo() {
			return getRuleContext(BingoContext.class,0);
		}
		public FortuneContext fortune() {
			return getRuleContext(FortuneContext.class,0);
		}
		public SummaryInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summaryInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterSummaryInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitSummaryInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitSummaryInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummaryInfoContext summaryInfo() throws RecognitionException {
		SummaryInfoContext _localctx = new SummaryInfoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_summaryInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			totalPot();
			setState(466);
			match(SEPARATOR);
			setState(467);
			rake();
			setState(468);
			match(SEPARATOR);
			setState(469);
			jackpot();
			setState(470);
			match(SEPARATOR);
			setState(471);
			bingo();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(472);
				match(SEPARATOR);
				setState(473);
				fortune();
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

	public static class FortuneContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public FortuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fortune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterFortune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitFortune(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitFortune(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FortuneContext fortune() throws RecognitionException {
		FortuneContext _localctx = new FortuneContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fortune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__25);
			setState(477);
			cash();
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

	public static class JackpotContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public JackpotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jackpot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterJackpot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitJackpot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitJackpot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JackpotContext jackpot() throws RecognitionException {
		JackpotContext _localctx = new JackpotContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_jackpot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__26);
			setState(480);
			cash();
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

	public static class BingoContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public BingoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bingo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterBingo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitBingo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitBingo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BingoContext bingo() throws RecognitionException {
		BingoContext _localctx = new BingoContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_bingo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__27);
			setState(483);
			cash();
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

	public static class RakeContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public RakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterRake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitRake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitRake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RakeContext rake() throws RecognitionException {
		RakeContext _localctx = new RakeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_rake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__28);
			setState(486);
			cash();
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

	public static class TotalPotContext extends ParserRuleContext {
		public CashContext cash() {
			return getRuleContext(CashContext.class,0);
		}
		public TotalPotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalPot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterTotalPot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitTotalPot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitTotalPot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalPotContext totalPot() throws RecognitionException {
		TotalPotContext _localctx = new TotalPotContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_totalPot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__29);
			setState(489);
			cash();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode DIGIT_LETTER() { return getToken(HHParser.DIGIT_LETTER, 0); }
		public TerminalNode NUMBER() { return getToken(HHParser.NUMBER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==DIGIT_LETTER) ) {
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

	public static class CashContext extends ParserRuleContext {
		public TerminalNode CURRENCY() { return getToken(HHParser.CURRENCY, 0); }
		public TerminalNode NUMBER() { return getToken(HHParser.NUMBER, 0); }
		public TerminalNode LEFT_ROUNDED_BRACKET() { return getToken(HHParser.LEFT_ROUNDED_BRACKET, 0); }
		public TerminalNode RIGHT_ROUNDED_BRACKET() { return getToken(HHParser.RIGHT_ROUNDED_BRACKET, 0); }
		public CashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).enterCash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HHListener ) ((HHListener)listener).exitCash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HHVisitor ) return ((HHVisitor<? extends T>)visitor).visitCash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CashContext cash() throws RecognitionException {
		CashContext _localctx = new CashContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ROUNDED_BRACKET) {
				{
				setState(493);
				match(LEFT_ROUNDED_BRACKET);
				}
			}

			setState(496);
			match(CURRENCY);
			setState(497);
			match(NUMBER);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHT_ROUNDED_BRACKET) {
				{
				setState(498);
				match(RIGHT_ROUNDED_BRACKET);
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

	public static final String _serializedATN =
		"\u0004\u0001L\u01f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0001\u0000\u0004\u0000\u0086\b\u0000\u000b\u0000\f\u0000\u0087"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0090\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u0097\b\u0002\u000b\u0002\f\u0002\u0098\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u009e\b\u0003\u000b\u0003\f"+
		"\u0003\u009f\u0001\u0003\u0004\u0003\u00a3\b\u0003\u000b\u0003\f\u0003"+
		"\u00a4\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d4\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00db\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u00e2\b\u0013\u000b\u0013\f\u0013\u00e3\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00e8\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00ec"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00f0\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u00f6\b\u0017\u000b\u0017"+
		"\f\u0017\u00f7\u0001\u0018\u0001\u0018\u0003\u0018\u00fc\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u0101\b\u0018\u000b\u0018\f"+
		"\u0018\u0102\u0001\u0019\u0001\u0019\u0003\u0019\u0107\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0004\u0019\u010c\b\u0019\u000b\u0019\f\u0019"+
		"\u010d\u0001\u001a\u0001\u001a\u0003\u001a\u0112\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0004\u001a\u0117\b\u001a\u000b\u001a\f\u001a\u0118"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0120\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0126\b\u001c\u0001\u001c\u0003\u001c\u0129\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0130\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u0143\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u014a"+
		"\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0004(\u0156\b(\u000b(\f(\u0157\u0004(\u015a\b(\u000b(\f(\u015b"+
		"\u0001)\u0001)\u0003)\u0160\b)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u016d\b+\u0001+\u0003+\u0170"+
		"\b+\u0001+\u0004+\u0173\b+\u000b+\f+\u0174\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001.\u0004.\u017e\b.\u000b.\f.\u017f\u0001/\u0003/\u0183"+
		"\b/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00030\u018b\b0\u00010\u0001"+
		"0\u00010\u00010\u00030\u0191\b0\u00011\u00011\u00011\u00031\u0196\b1\u0001"+
		"2\u00012\u00013\u00013\u00013\u00033\u019d\b3\u00013\u00013\u00013\u0003"+
		"3\u01a2\b3\u00033\u01a4\b3\u00013\u00033\u01a7\b3\u00013\u00053\u01aa"+
		"\b3\n3\f3\u01ad\t3\u00013\u00013\u00013\u00033\u01b2\b3\u00053\u01b4\b"+
		"3\n3\f3\u01b7\t3\u00014\u00014\u00014\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00018\u00018\u00038\u01c7\b8\u00048\u01c9"+
		"\b8\u000b8\f8\u01ca\u00019\u00019\u00019\u00039\u01d0\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u01db\b:\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001A\u0003A\u01ef\bA\u0001"+
		"A\u0001A\u0001A\u0003A\u01f4\bA\u0001A\u0000\u0000B\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0000\u0003"+
		"\u0001\u0000\u000e\u000f\u0001\u000057\u0001\u0000DE\u01ef\u0000\u0085"+
		"\u0001\u0000\u0000\u0000\u0002\u008b\u0001\u0000\u0000\u0000\u0004\u0094"+
		"\u0001\u0000\u0000\u0000\u0006\u009a\u0001\u0000\u0000\u0000\b\u00a6\u0001"+
		"\u0000\u0000\u0000\n\u00ab\u0001\u0000\u0000\u0000\f\u00af\u0001\u0000"+
		"\u0000\u0000\u000e\u00b3\u0001\u0000\u0000\u0000\u0010\u00b5\u0001\u0000"+
		"\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014\u00bb\u0001\u0000"+
		"\u0000\u0000\u0016\u00be\u0001\u0000\u0000\u0000\u0018\u00c3\u0001\u0000"+
		"\u0000\u0000\u001a\u00c7\u0001\u0000\u0000\u0000\u001c\u00cb\u0001\u0000"+
		"\u0000\u0000\u001e\u00ce\u0001\u0000\u0000\u0000 \u00d5\u0001\u0000\u0000"+
		"\u0000\"\u00d7\u0001\u0000\u0000\u0000$\u00dc\u0001\u0000\u0000\u0000"+
		"&\u00e1\u0001\u0000\u0000\u0000(\u00e5\u0001\u0000\u0000\u0000*\u00e9"+
		"\u0001\u0000\u0000\u0000,\u00ed\u0001\u0000\u0000\u0000.\u00f5\u0001\u0000"+
		"\u0000\u00000\u00f9\u0001\u0000\u0000\u00002\u0104\u0001\u0000\u0000\u0000"+
		"4\u010f\u0001\u0000\u0000\u00006\u011a\u0001\u0000\u0000\u00008\u0121"+
		"\u0001\u0000\u0000\u0000:\u012f\u0001\u0000\u0000\u0000<\u0131\u0001\u0000"+
		"\u0000\u0000>\u0136\u0001\u0000\u0000\u0000@\u0138\u0001\u0000\u0000\u0000"+
		"B\u013a\u0001\u0000\u0000\u0000D\u013c\u0001\u0000\u0000\u0000F\u013e"+
		"\u0001\u0000\u0000\u0000H\u0144\u0001\u0000\u0000\u0000J\u014b\u0001\u0000"+
		"\u0000\u0000L\u014e\u0001\u0000\u0000\u0000N\u0150\u0001\u0000\u0000\u0000"+
		"P\u0159\u0001\u0000\u0000\u0000R\u015d\u0001\u0000\u0000\u0000T\u0164"+
		"\u0001\u0000\u0000\u0000V\u0169\u0001\u0000\u0000\u0000X\u0176\u0001\u0000"+
		"\u0000\u0000Z\u017a\u0001\u0000\u0000\u0000\\\u017d\u0001\u0000\u0000"+
		"\u0000^\u0182\u0001\u0000\u0000\u0000`\u0187\u0001\u0000\u0000\u0000b"+
		"\u0195\u0001\u0000\u0000\u0000d\u0197\u0001\u0000\u0000\u0000f\u0199\u0001"+
		"\u0000\u0000\u0000h\u01b8\u0001\u0000\u0000\u0000j\u01bb\u0001\u0000\u0000"+
		"\u0000l\u01be\u0001\u0000\u0000\u0000n\u01c1\u0001\u0000\u0000\u0000p"+
		"\u01c8\u0001\u0000\u0000\u0000r\u01cf\u0001\u0000\u0000\u0000t\u01d1\u0001"+
		"\u0000\u0000\u0000v\u01dc\u0001\u0000\u0000\u0000x\u01df\u0001\u0000\u0000"+
		"\u0000z\u01e2\u0001\u0000\u0000\u0000|\u01e5\u0001\u0000\u0000\u0000~"+
		"\u01e8\u0001\u0000\u0000\u0000\u0080\u01eb\u0001\u0000\u0000\u0000\u0082"+
		"\u01ee\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0002\u0001\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0000\u0000\u0001\u008a"+
		"\u0001\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u0006\u0003\u0000\u008c"+
		"\u008d\u0003\u0004\u0002\u0000\u008d\u008f\u0003$\u0012\u0000\u008e\u0090"+
		"\u0003&\u0013\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0003"+
		"P(\u0000\u0092\u0093\u0003V+\u0000\u0093\u0003\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0005/\u0000\u0000\u0095\u0097\u0003\"\u0011\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u0005\u0001\u0000\u0000\u0000\u009a\u009b\u0003\b\u0004\u0000\u009b\u009d"+
		"\u0003\u0012\t\u0000\u009c\u009e\u0003\u0018\f\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0003\u001e\u000f\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0007\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0003\n\u0005\u0000\u00a7\u00a8\u0003\f"+
		"\u0006\u0000\u00a8\u00a9\u0005>\u0000\u0000\u00a9\u00aa\u0003\u000e\u0007"+
		"\u0000\u00aa\t\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000\u0000"+
		"\u00ac\u00ad\u0005 \u0000\u0000\u00ad\u00ae\u0005=\u0000\u0000\u00ae\u000b"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\"\u0000\u0000\u00b0\u00b1\u0005"+
		"#\u0000\u0000\u00b1\u00b2\u0003\u0010\b\u0000\u00b2\r\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005$\u0000\u0000\u00b4\u000f\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0003\u0082A\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005%\u0000\u0000\u00b8\u00b9\u0003\u0014\n\u0000\u00b9\u00ba"+
		"\u0003\u0016\u000b\u0000\u00ba\u0013\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005D\u0000\u0000\u00bc\u00bd\u0005\u0001\u0000\u0000\u00bd\u0015\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005?\u0000\u0000\u00bf\u00c0\u0005<\u0000"+
		"\u0000\u00c0\u00c1\u0005D\u0000\u0000\u00c1\u00c2\u0005\u0002\u0000\u0000"+
		"\u00c2\u0017\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u001a\r\u0000\u00c4"+
		"\u00c5\u0003\u0080@\u0000\u00c5\u00c6\u0003\u001c\u000e\u0000\u00c6\u0019"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005?\u0000\u0000\u00c8\u00c9\u0005"+
		"D\u0000\u0000\u00c9\u00ca\u0005=\u0000\u0000\u00ca\u001b\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0003\u0082A\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000"+
		"\u00cd\u001d\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u0080@\u0000\u00cf"+
		"\u00d0\u0005=\u0000\u0000\u00d0\u00d1\u0005;\u0000\u0000\u00d1\u00d3\u0003"+
		" \u0010\u0000\u00d2\u00d4\u00059\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u001f\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0003\u0082A\u0000\u00d6!\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005:\u0000\u0000\u00d8\u00da\u0003\u0080@\u0000\u00d9\u00db\u0005"+
		"A\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db#\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003.\u0017\u0000"+
		"\u00dd%\u0001\u0000\u0000\u0000\u00de\u00e2\u0003(\u0014\u0000\u00df\u00e2"+
		"\u0003*\u0015\u0000\u00e0\u00e2\u0003,\u0016\u0000\u00e1\u00de\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\'\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e7\u00030\u0018\u0000\u00e6\u00e8\u0003.\u0017\u0000\u00e7"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		")\u0001\u0000\u0000\u0000\u00e9\u00eb\u00032\u0019\u0000\u00ea\u00ec\u0003"+
		".\u0017\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec+\u0001\u0000\u0000\u0000\u00ed\u00ef\u00034\u001a\u0000"+
		"\u00ee\u00f0\u0003.\u0017\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0-\u0001\u0000\u0000\u0000\u00f1\u00f6"+
		"\u00038\u001c\u0000\u00f2\u00f6\u0003<\u001e\u0000\u00f3\u00f6\u0003H"+
		"$\u0000\u00f4\u00f6\u00036\u001b\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8/\u0001\u0000\u0000\u0000\u00f9\u00fb\u00054\u0000\u0000\u00fa\u00fc"+
		"\u00050\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"7\u0000\u0000\u00fe\u0100\u00054\u0000\u0000\u00ff\u0101\u0005A\u0000"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u01031\u0001\u0000\u0000\u0000\u0104\u0106\u00054\u0000\u0000\u0105"+
		"\u0107\u00050\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u00056\u0000\u0000\u0109\u010b\u00054\u0000\u0000\u010a\u010c\u0005A"+
		"\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e3\u0001\u0000\u0000\u0000\u010f\u0111\u00054\u0000\u0000"+
		"\u0110\u0112\u00050\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u00055\u0000\u0000\u0114\u0116\u00054\u0000\u0000\u0115\u0117\u0005"+
		"A\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u01195\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u0080@\u0000"+
		"\u011b\u011f\u0005=\u0000\u0000\u011c\u0120\u0003J%\u0000\u011d\u0120"+
		"\u0003L&\u0000\u011e\u0120\u0003N\'\u0000\u011f\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000"+
		"\u0000\u01207\u0001\u0000\u0000\u0000\u0121\u0122\u0003\u0080@\u0000\u0122"+
		"\u0123\u0005=\u0000\u0000\u0123\u0125\u0003:\u001d\u0000\u0124\u0126\u0003"+
		"\u0082A\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0129\u00059\u0000"+
		"\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u01299\u0001\u0000\u0000\u0000\u012a\u0130\u0003>\u001f\u0000\u012b"+
		"\u0130\u0003@ \u0000\u012c\u0130\u0003B!\u0000\u012d\u0130\u0003F#\u0000"+
		"\u012e\u0130\u0003D\"\u0000\u012f\u012a\u0001\u0000\u0000\u0000\u012f"+
		"\u012b\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		";\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0004\u0000\u0000\u0132\u0133"+
		"\u0003\u0082A\u0000\u0133\u0134\u0005\u0005\u0000\u0000\u0134\u0135\u0003"+
		"\u0080@\u0000\u0135=\u0001\u0000\u0000\u0000\u0136\u0137\u0005(\u0000"+
		"\u0000\u0137?\u0001\u0000\u0000\u0000\u0138\u0139\u0005)\u0000\u0000\u0139"+
		"A\u0001\u0000\u0000\u0000\u013a\u013b\u0005*\u0000\u0000\u013bC\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005,\u0000\u0000\u013dE\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0005+\u0000\u0000\u013f\u0142\u0003\u0082A\u0000\u0140"+
		"\u0141\u0005\u0006\u0000\u0000\u0141\u0143\u0003\u0082A\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143G\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0003\u0080@\u0000\u0145\u0146\u0005=\u0000"+
		"\u0000\u0146\u0147\u0005-\u0000\u0000\u0147\u0149\u0005A\u0000\u0000\u0148"+
		"\u014a\u0005B\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014aI\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"\u0007\u0000\u0000\u014c\u014d\u0003\u0082A\u0000\u014dK\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0005\b\u0000\u0000\u014fM\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0005\t\u0000\u0000\u0151\u0152\u0003\u0082A\u0000\u0152"+
		"O\u0001\u0000\u0000\u0000\u0153\u0155\u0003R)\u0000\u0154\u0156\u0003"+
		"T*\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0153\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015cQ\u0001\u0000\u0000\u0000"+
		"\u015d\u015f\u00054\u0000\u0000\u015e\u0160\u00050\u0000\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u00058\u0000\u0000\u0162\u0163\u0005"+
		"4\u0000\u0000\u0163S\u0001\u0000\u0000\u0000\u0164\u0165\u0003\u0080@"+
		"\u0000\u0165\u0166\u0005\n\u0000\u0000\u0166\u0167\u0003\u0082A\u0000"+
		"\u0167\u0168\u0005\u000b\u0000\u0000\u0168U\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0005.\u0000\u0000\u016a\u016c\u0003t:\u0000\u016b\u016d\u0003"+
		"X,\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0170\u0003\\.\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u0173\u0003`0\u0000\u0172\u0171"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175W\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\f\u0000\u0000\u0177\u0178\u0003Z"+
		"-\u0000\u0178\u0179\u0005\r\u0000\u0000\u0179Y\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0007\u0000\u0000\u0000\u017b[\u0001\u0000\u0000\u0000\u017c"+
		"\u017e\u0003^/\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001"+
		"\u0000\u0000\u0000\u0180]\u0001\u0000\u0000\u0000\u0181\u0183\u00050\u0000"+
		"\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u0010\u0000"+
		"\u0000\u0185\u0186\u0005A\u0000\u0000\u0186_\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0003\u001a\r\u0000\u0188\u018a\u0003\u0080@\u0000\u0189\u018b"+
		"\u0005\u0011\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u0190\u0001\u0000\u0000\u0000\u018c\u0191"+
		"\u0003b1\u0000\u018d\u0191\u0003f3\u0000\u018e\u0191\u0003h4\u0000\u018f"+
		"\u0191\u0003n7\u0000\u0190\u018c\u0001\u0000\u0000\u0000\u0190\u018d\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u018f\u0001"+
		"\u0000\u0000\u0000\u0191a\u0001\u0000\u0000\u0000\u0192\u0196\u0005\u0012"+
		"\u0000\u0000\u0193\u0194\u0005\u0013\u0000\u0000\u0194\u0196\u0003d2\u0000"+
		"\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0196c\u0001\u0000\u0000\u0000\u0197\u0198\u0007\u0001\u0000\u0000\u0198"+
		"e\u0001\u0000\u0000\u0000\u0199\u019a\u0005\u0014\u0000\u0000\u019a\u01ab"+
		"\u0005A\u0000\u0000\u019b\u019d\u0005\u0015\u0000\u0000\u019c\u019b\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u01a3\u0005\u0016\u0000\u0000\u019f\u01a1\u0003"+
		"r9\u0000\u01a0\u01a2\u0005\u0017\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a3\u019f\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003p8\u0000\u01a6"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a8\u01aa\u0003h4\u0000\u01a9\u019c\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u01b5\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ae\u01b1\u0005\u0015\u0000\u0000\u01af\u01b2\u0003"+
		"j5\u0000\u01b0\u01b2\u0003l6\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01ae\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b6g\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0005\n\u0000\u0000\u01b9\u01ba\u0003\u0082A\u0000\u01bai\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0005\u0018\u0000\u0000\u01bc\u01bd\u0003"+
		"\u0082A\u0000\u01bdk\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\u0019\u0000"+
		"\u0000\u01bf\u01c0\u0003\u0082A\u0000\u01c0m\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005&\u0000\u0000\u01c2\u01c3\u0003\u0082A\u0000\u01c3o\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c6\u0005E\u0000\u0000\u01c5\u01c7\u0005>\u0000"+
		"\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cbq\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0005&\u0000\u0000\u01cd\u01d0\u0003\u0082A\u0000\u01ce\u01d0"+
		"\u0005\'\u0000\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d0s\u0001\u0000\u0000\u0000\u01d1\u01d2\u0003~?"+
		"\u0000\u01d2\u01d3\u0005@\u0000\u0000\u01d3\u01d4\u0003|>\u0000\u01d4"+
		"\u01d5\u0005@\u0000\u0000\u01d5\u01d6\u0003x<\u0000\u01d6\u01d7\u0005"+
		"@\u0000\u0000\u01d7\u01da\u0003z=\u0000\u01d8\u01d9\u0005@\u0000\u0000"+
		"\u01d9\u01db\u0003v;\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01dbu\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005"+
		"\u001a\u0000\u0000\u01dd\u01de\u0003\u0082A\u0000\u01dew\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0005\u001b\u0000\u0000\u01e0\u01e1\u0003\u0082A\u0000"+
		"\u01e1y\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u001c\u0000\u0000\u01e3"+
		"\u01e4\u0003\u0082A\u0000\u01e4{\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005"+
		"\u001d\u0000\u0000\u01e6\u01e7\u0003\u0082A\u0000\u01e7}\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e9\u0005\u001e\u0000\u0000\u01e9\u01ea\u0003\u0082A\u0000"+
		"\u01ea\u007f\u0001\u0000\u0000\u0000\u01eb\u01ec\u0007\u0002\u0000\u0000"+
		"\u01ec\u0081\u0001\u0000\u0000\u0000\u01ed\u01ef\u0005J\u0000\u0000\u01ee"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005C\u0000\u0000\u01f1\u01f3"+
		"\u0005D\u0000\u0000\u01f2\u01f4\u0005L\u0000\u0000\u01f3\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u0083\u0001\u0000"+
		"\u0000\u00003\u0087\u008f\u0098\u009f\u00a4\u00d3\u00da\u00e1\u00e3\u00e7"+
		"\u00eb\u00ef\u00f5\u00f7\u00fb\u0102\u0106\u010d\u0111\u0118\u011f\u0125"+
		"\u0128\u012f\u0142\u0149\u0157\u015b\u015f\u016c\u016f\u0174\u017f\u0182"+
		"\u018a\u0190\u0195\u019c\u01a1\u01a3\u01a6\u01a9\u01ab\u01b1\u01b5\u01c6"+
		"\u01ca\u01cf\u01da\u01ee\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
