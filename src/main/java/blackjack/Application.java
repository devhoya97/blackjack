package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.printGameStart();
        Cards playerCards = new Cards();
        Cards dealerCards = new Cards();
        while (true) {
            Card playerCard = new Card();
            playerCards.addCard(playerCard);
            Card dealerCard = new Card();
            dealerCards.addCard(dealerCard);

            OutputView.printResult(playerCards, dealerCards, playerCard.compareNumber(dealerCard));
            OutputView.printHistory(playerCards.getWinCount(), playerCards.getDrawCount(), playerCards.getLoseCount());
            if (!(InputView.getMoreGameOrNot())) {
                OutputView.printGameOver();
                return;
            }
        }
    }
}
