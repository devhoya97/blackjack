package blackjack;

import blackjack.view.InputView;

public class Application {
    public static void main(String[] args) {
        while (true) {

            if (!(InputView.getMoreGameOrNot())) {
                return;
            }
        }
    }
}
