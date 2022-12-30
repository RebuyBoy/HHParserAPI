package com.hhparser.parser;// Generated from /Users/sergey/projects/HHParserAPI/src/main/antlr4/HH.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HHParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HHVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HHParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(HHParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#hand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHand(HHParser.HandContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#pocketCards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPocketCards(HHParser.PocketCardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(HHParser.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#baseHandInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseHandInfo(HHParser.BaseHandInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HHParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#gameInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameInfo(HHParser.GameInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(HHParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#stake}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStake(HHParser.StakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#buttonInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonInfo(HHParser.ButtonInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#tableSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSize(HHParser.TableSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#buttonPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonPosition(HHParser.ButtonPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#positionStackSizeInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionStackSizeInfo(HHParser.PositionStackSizeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(HHParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#stakeSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStakeSize(HHParser.StakeSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#postBlindInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostBlindInfo(HHParser.PostBlindInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#blindSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlindSize(HHParser.BlindSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#dealtCards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDealtCards(HHParser.DealtCardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#preflopActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreflopActions(HHParser.PreflopActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#postflopActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostflopActions(HHParser.PostflopActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#flop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlop(HHParser.FlopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#turn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn(HHParser.TurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#river}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRiver(HHParser.RiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#moves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoves(HHParser.MovesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#flop_street_cards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlop_street_cards(HHParser.Flop_street_cardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#turn_street_cards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn_street_cards(HHParser.Turn_street_cardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#river_street_cards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRiver_street_cards(HHParser.River_street_cardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#cashout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCashout(HHParser.CashoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(HHParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#action_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_type(HHParser.Action_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#uncalledBet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncalledBet(HHParser.UncalledBetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#fold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold(HHParser.FoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(HHParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(HHParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#bets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBets(HHParser.BetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#raise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise(HHParser.RaiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(HHParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#receive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive(HHParser.ReceiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#chooses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooses(HHParser.ChoosesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#pays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPays(HHParser.PaysContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#showdowns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowdowns(HHParser.ShowdownsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#showdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowdown(HHParser.ShowdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#collected}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollected(HHParser.CollectedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#summary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary(HHParser.SummaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#rio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRio(HHParser.RioContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#times}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(HHParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#boards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoards(HHParser.BoardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#board}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoard(HHParser.BoardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#playerSummary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerSummary(HHParser.PlayerSummaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#folded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolded(HHParser.FoldedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#foldPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoldPosition(HHParser.FoldPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#showed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowed(HHParser.ShowedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#summaryCollected}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummaryCollected(HHParser.SummaryCollectedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#cashoutEV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCashoutEV(HHParser.CashoutEVContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#cashoutRisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCashoutRisk(HHParser.CashoutRiskContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#summaryWon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummaryWon(HHParser.SummaryWonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#showedCombination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowedCombination(HHParser.ShowedCombinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(HHParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#summaryInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummaryInfo(HHParser.SummaryInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#fortune}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFortune(HHParser.FortuneContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#jackpot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJackpot(HHParser.JackpotContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#bingo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBingo(HHParser.BingoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#rake}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRake(HHParser.RakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#totalPot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalPot(HHParser.TotalPotContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(HHParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HHParser#cash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCash(HHParser.CashContext ctx);
}
