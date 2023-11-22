package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    private static final int WIN = 1;
    private static final int LOSE = -1;
    private static final int DRAW = 0;

    public static void main(String[] args) {
        OutputView.printGameStart();
        while (true) {
            Card playerCard = new Card();
            Card dealerCard = new Card();
            System.out.println("playerNumber: "+playerCard.getNumber());
            System.out.println("dealerNumber: "+dealerCard.getNumber());
            if (playerCard.compareNumber(dealerCard) == WIN) {
                System.out.println("Win!");
            }
            if (playerCard.compareNumber(dealerCard) == LOSE) {
                System.out.println("Lose!");
            }
            if (playerCard.compareNumber(dealerCard) == DRAW) {
                System.out.println("Draw!");
            }
            if (!(InputView.getMoreGameOrNot())) {
                OutputView.printGameOver();
                return;
            }
        }
    }
}
