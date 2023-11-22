package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.printGameStart();
        while (true) {

            if (!(InputView.getMoreGameOrNot())) {
                OutputView.printGameOver();
                return;
            }
        }
    }
}
