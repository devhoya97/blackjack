package blackjack;

import blackjack.view.InputView;

public class Application {
    public static void main(String[] args) {
        Asset playerAsset = new Asset();
        BetMoney betMoney = InputView.getBetMoney(playerAsset);
    }
}
