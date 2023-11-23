package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    private static final int PLAYER_WIN = 1;
    private static final int DRAW = 0;
    private static final int PLAYER_LOSE = -1;

    public static void main(String[] args) {
        Asset playerAsset = new Asset();
        Dealer dealer = new Dealer(playerAsset);
        OutputView.printGameStart(playerAsset);
        while (true) {
            BetMoney betMoney = InputView.getBetMoney(playerAsset);
            int gameCount = 1;
            int winningResult = playRound(gameCount, playerAsset, dealer, betMoney);
            OutputView.printRoundResult(winningResult, playerAsset.getRemainedAmount());
            if (!playerAsset.canPlayMore() || !InputView.getMoreGameOrNot()) {
                OutputView.printGameOver(dealer.getWinCount(), dealer.getDrawCount(), dealer.getLoseCount(),
                        playerAsset.getRemainedAmount());
                return;
            }
        }
    }

    public static int playRound(int gameCount, Asset playerAsset, Dealer dealer, BetMoney betMoney) {
        Cards playerCards = new Cards();
        while (true) {
            playerCards.addCard(new Card());
            OutputView.printPlayerCards(playerCards, gameCount);
            if (playerCards.isTooMuch()) {
                betMoney.decreaseByLose(playerAsset);
                return PLAYER_LOSE;
            }
            if (!InputView.getMoreCardOrNot()) {
                DealerCards dealerCards = getDealerCards();
                OutputView.printDealerCards(dealerCards);
                return dealer.reflectResult(playerCards, dealerCards, betMoney);
            }
        }
    }

    private static DealerCards getDealerCards() {
        DealerCards dealerCards = new DealerCards();
        while (true) {
            if (!dealerCards.addCard()) {
                break;
            }
        }
        return dealerCards;
    }
}
