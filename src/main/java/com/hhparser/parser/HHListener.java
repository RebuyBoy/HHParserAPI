package com.hhparser.parser;// Generated from /Users/sergey/projects/HHParserAPI/src/main/antlr4/HH.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HHParser}.
 */
public interface HHListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HHParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(HHParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(HHParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#hand}.
	 * @param ctx the parse tree
	 */
	void enterHand(HHParser.HandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#hand}.
	 * @param ctx the parse tree
	 */
	void exitHand(HHParser.HandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#pocketCards}.
	 * @param ctx the parse tree
	 */
	void enterPocketCards(HHParser.PocketCardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#pocketCards}.
	 * @param ctx the parse tree
	 */
	void exitPocketCards(HHParser.PocketCardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(HHParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(HHParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#baseHandInfo}.
	 * @param ctx the parse tree
	 */
	void enterBaseHandInfo(HHParser.BaseHandInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#baseHandInfo}.
	 * @param ctx the parse tree
	 */
	void exitBaseHandInfo(HHParser.BaseHandInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(HHParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(HHParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#gameInfo}.
	 * @param ctx the parse tree
	 */
	void enterGameInfo(HHParser.GameInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#gameInfo}.
	 * @param ctx the parse tree
	 */
	void exitGameInfo(HHParser.GameInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(HHParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(HHParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#stake}.
	 * @param ctx the parse tree
	 */
	void enterStake(HHParser.StakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#stake}.
	 * @param ctx the parse tree
	 */
	void exitStake(HHParser.StakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#buttonInfo}.
	 * @param ctx the parse tree
	 */
	void enterButtonInfo(HHParser.ButtonInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#buttonInfo}.
	 * @param ctx the parse tree
	 */
	void exitButtonInfo(HHParser.ButtonInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#tableSize}.
	 * @param ctx the parse tree
	 */
	void enterTableSize(HHParser.TableSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#tableSize}.
	 * @param ctx the parse tree
	 */
	void exitTableSize(HHParser.TableSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#buttonPosition}.
	 * @param ctx the parse tree
	 */
	void enterButtonPosition(HHParser.ButtonPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#buttonPosition}.
	 * @param ctx the parse tree
	 */
	void exitButtonPosition(HHParser.ButtonPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#positionStackSizeInfo}.
	 * @param ctx the parse tree
	 */
	void enterPositionStackSizeInfo(HHParser.PositionStackSizeInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#positionStackSizeInfo}.
	 * @param ctx the parse tree
	 */
	void exitPositionStackSizeInfo(HHParser.PositionStackSizeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(HHParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(HHParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#stakeSize}.
	 * @param ctx the parse tree
	 */
	void enterStakeSize(HHParser.StakeSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#stakeSize}.
	 * @param ctx the parse tree
	 */
	void exitStakeSize(HHParser.StakeSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#postBlindInfo}.
	 * @param ctx the parse tree
	 */
	void enterPostBlindInfo(HHParser.PostBlindInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#postBlindInfo}.
	 * @param ctx the parse tree
	 */
	void exitPostBlindInfo(HHParser.PostBlindInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#blindSize}.
	 * @param ctx the parse tree
	 */
	void enterBlindSize(HHParser.BlindSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#blindSize}.
	 * @param ctx the parse tree
	 */
	void exitBlindSize(HHParser.BlindSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#dealtCards}.
	 * @param ctx the parse tree
	 */
	void enterDealtCards(HHParser.DealtCardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#dealtCards}.
	 * @param ctx the parse tree
	 */
	void exitDealtCards(HHParser.DealtCardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#preflopActions}.
	 * @param ctx the parse tree
	 */
	void enterPreflopActions(HHParser.PreflopActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#preflopActions}.
	 * @param ctx the parse tree
	 */
	void exitPreflopActions(HHParser.PreflopActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#postflopActions}.
	 * @param ctx the parse tree
	 */
	void enterPostflopActions(HHParser.PostflopActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#postflopActions}.
	 * @param ctx the parse tree
	 */
	void exitPostflopActions(HHParser.PostflopActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#flop}.
	 * @param ctx the parse tree
	 */
	void enterFlop(HHParser.FlopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#flop}.
	 * @param ctx the parse tree
	 */
	void exitFlop(HHParser.FlopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#turn}.
	 * @param ctx the parse tree
	 */
	void enterTurn(HHParser.TurnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#turn}.
	 * @param ctx the parse tree
	 */
	void exitTurn(HHParser.TurnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#river}.
	 * @param ctx the parse tree
	 */
	void enterRiver(HHParser.RiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#river}.
	 * @param ctx the parse tree
	 */
	void exitRiver(HHParser.RiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#moves}.
	 * @param ctx the parse tree
	 */
	void enterMoves(HHParser.MovesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#moves}.
	 * @param ctx the parse tree
	 */
	void exitMoves(HHParser.MovesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#flop_street_cards}.
	 * @param ctx the parse tree
	 */
	void enterFlop_street_cards(HHParser.Flop_street_cardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#flop_street_cards}.
	 * @param ctx the parse tree
	 */
	void exitFlop_street_cards(HHParser.Flop_street_cardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#turn_street_cards}.
	 * @param ctx the parse tree
	 */
	void enterTurn_street_cards(HHParser.Turn_street_cardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#turn_street_cards}.
	 * @param ctx the parse tree
	 */
	void exitTurn_street_cards(HHParser.Turn_street_cardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#river_street_cards}.
	 * @param ctx the parse tree
	 */
	void enterRiver_street_cards(HHParser.River_street_cardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#river_street_cards}.
	 * @param ctx the parse tree
	 */
	void exitRiver_street_cards(HHParser.River_street_cardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#cashout}.
	 * @param ctx the parse tree
	 */
	void enterCashout(HHParser.CashoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#cashout}.
	 * @param ctx the parse tree
	 */
	void exitCashout(HHParser.CashoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(HHParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(HHParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#action_type}.
	 * @param ctx the parse tree
	 */
	void enterAction_type(HHParser.Action_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#action_type}.
	 * @param ctx the parse tree
	 */
	void exitAction_type(HHParser.Action_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#uncalledBet}.
	 * @param ctx the parse tree
	 */
	void enterUncalledBet(HHParser.UncalledBetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#uncalledBet}.
	 * @param ctx the parse tree
	 */
	void exitUncalledBet(HHParser.UncalledBetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#fold}.
	 * @param ctx the parse tree
	 */
	void enterFold(HHParser.FoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#fold}.
	 * @param ctx the parse tree
	 */
	void exitFold(HHParser.FoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(HHParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(HHParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(HHParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(HHParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#bets}.
	 * @param ctx the parse tree
	 */
	void enterBets(HHParser.BetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#bets}.
	 * @param ctx the parse tree
	 */
	void exitBets(HHParser.BetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#raise}.
	 * @param ctx the parse tree
	 */
	void enterRaise(HHParser.RaiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#raise}.
	 * @param ctx the parse tree
	 */
	void exitRaise(HHParser.RaiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(HHParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(HHParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#receive}.
	 * @param ctx the parse tree
	 */
	void enterReceive(HHParser.ReceiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#receive}.
	 * @param ctx the parse tree
	 */
	void exitReceive(HHParser.ReceiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#chooses}.
	 * @param ctx the parse tree
	 */
	void enterChooses(HHParser.ChoosesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#chooses}.
	 * @param ctx the parse tree
	 */
	void exitChooses(HHParser.ChoosesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#pays}.
	 * @param ctx the parse tree
	 */
	void enterPays(HHParser.PaysContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#pays}.
	 * @param ctx the parse tree
	 */
	void exitPays(HHParser.PaysContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#showdowns}.
	 * @param ctx the parse tree
	 */
	void enterShowdowns(HHParser.ShowdownsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#showdowns}.
	 * @param ctx the parse tree
	 */
	void exitShowdowns(HHParser.ShowdownsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#showdown}.
	 * @param ctx the parse tree
	 */
	void enterShowdown(HHParser.ShowdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#showdown}.
	 * @param ctx the parse tree
	 */
	void exitShowdown(HHParser.ShowdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#collected}.
	 * @param ctx the parse tree
	 */
	void enterCollected(HHParser.CollectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#collected}.
	 * @param ctx the parse tree
	 */
	void exitCollected(HHParser.CollectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#summary}.
	 * @param ctx the parse tree
	 */
	void enterSummary(HHParser.SummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#summary}.
	 * @param ctx the parse tree
	 */
	void exitSummary(HHParser.SummaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#rio}.
	 * @param ctx the parse tree
	 */
	void enterRio(HHParser.RioContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#rio}.
	 * @param ctx the parse tree
	 */
	void exitRio(HHParser.RioContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#times}.
	 * @param ctx the parse tree
	 */
	void enterTimes(HHParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#times}.
	 * @param ctx the parse tree
	 */
	void exitTimes(HHParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#boards}.
	 * @param ctx the parse tree
	 */
	void enterBoards(HHParser.BoardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#boards}.
	 * @param ctx the parse tree
	 */
	void exitBoards(HHParser.BoardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#board}.
	 * @param ctx the parse tree
	 */
	void enterBoard(HHParser.BoardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#board}.
	 * @param ctx the parse tree
	 */
	void exitBoard(HHParser.BoardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#playerSummary}.
	 * @param ctx the parse tree
	 */
	void enterPlayerSummary(HHParser.PlayerSummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#playerSummary}.
	 * @param ctx the parse tree
	 */
	void exitPlayerSummary(HHParser.PlayerSummaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#folded}.
	 * @param ctx the parse tree
	 */
	void enterFolded(HHParser.FoldedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#folded}.
	 * @param ctx the parse tree
	 */
	void exitFolded(HHParser.FoldedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#foldPosition}.
	 * @param ctx the parse tree
	 */
	void enterFoldPosition(HHParser.FoldPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#foldPosition}.
	 * @param ctx the parse tree
	 */
	void exitFoldPosition(HHParser.FoldPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#showed}.
	 * @param ctx the parse tree
	 */
	void enterShowed(HHParser.ShowedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#showed}.
	 * @param ctx the parse tree
	 */
	void exitShowed(HHParser.ShowedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#summaryCollected}.
	 * @param ctx the parse tree
	 */
	void enterSummaryCollected(HHParser.SummaryCollectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#summaryCollected}.
	 * @param ctx the parse tree
	 */
	void exitSummaryCollected(HHParser.SummaryCollectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#cashoutEV}.
	 * @param ctx the parse tree
	 */
	void enterCashoutEV(HHParser.CashoutEVContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#cashoutEV}.
	 * @param ctx the parse tree
	 */
	void exitCashoutEV(HHParser.CashoutEVContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#cashoutRisk}.
	 * @param ctx the parse tree
	 */
	void enterCashoutRisk(HHParser.CashoutRiskContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#cashoutRisk}.
	 * @param ctx the parse tree
	 */
	void exitCashoutRisk(HHParser.CashoutRiskContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#summaryWon}.
	 * @param ctx the parse tree
	 */
	void enterSummaryWon(HHParser.SummaryWonContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#summaryWon}.
	 * @param ctx the parse tree
	 */
	void exitSummaryWon(HHParser.SummaryWonContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#showedCombination}.
	 * @param ctx the parse tree
	 */
	void enterShowedCombination(HHParser.ShowedCombinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#showedCombination}.
	 * @param ctx the parse tree
	 */
	void exitShowedCombination(HHParser.ShowedCombinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(HHParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(HHParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#summaryInfo}.
	 * @param ctx the parse tree
	 */
	void enterSummaryInfo(HHParser.SummaryInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#summaryInfo}.
	 * @param ctx the parse tree
	 */
	void exitSummaryInfo(HHParser.SummaryInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#fortune}.
	 * @param ctx the parse tree
	 */
	void enterFortune(HHParser.FortuneContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#fortune}.
	 * @param ctx the parse tree
	 */
	void exitFortune(HHParser.FortuneContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#jackpot}.
	 * @param ctx the parse tree
	 */
	void enterJackpot(HHParser.JackpotContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#jackpot}.
	 * @param ctx the parse tree
	 */
	void exitJackpot(HHParser.JackpotContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#bingo}.
	 * @param ctx the parse tree
	 */
	void enterBingo(HHParser.BingoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#bingo}.
	 * @param ctx the parse tree
	 */
	void exitBingo(HHParser.BingoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#rake}.
	 * @param ctx the parse tree
	 */
	void enterRake(HHParser.RakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#rake}.
	 * @param ctx the parse tree
	 */
	void exitRake(HHParser.RakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#totalPot}.
	 * @param ctx the parse tree
	 */
	void enterTotalPot(HHParser.TotalPotContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#totalPot}.
	 * @param ctx the parse tree
	 */
	void exitTotalPot(HHParser.TotalPotContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HHParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HHParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HHParser#cash}.
	 * @param ctx the parse tree
	 */
	void enterCash(HHParser.CashContext ctx);
	/**
	 * Exit a parse tree produced by {@link HHParser#cash}.
	 * @param ctx the parse tree
	 */
	void exitCash(HHParser.CashContext ctx);
}
