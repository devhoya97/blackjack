package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    public static void main(String[] args) {
        Asset playerAsset = new Asset();
        OutputView.printGameStart(playerAsset);
        BetMoney betMoney = InputView.getBetMoney(playerAsset);
    }
}
