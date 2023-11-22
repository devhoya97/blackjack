package blackjack;

import blackjack.view.InputView;

public class Application {
    public static void main(String[] args) {
        boolean isMoreGame = InputView.getMoreGameOrNot();
        System.out.println(isMoreGame);
    }
}
