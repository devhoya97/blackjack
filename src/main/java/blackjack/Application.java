package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    public static void main(String[] args) {
        Asset playerAsset = new Asset();
//        OutputView.printGameStart(playerAsset);
//        BetMoney betMoney = InputView.getBetMoney(playerAsset);
        int gameCount = 1;
        playRound(gameCount, playerAsset);
//        if (!playerAsset.canPlayMore()) {
//            return;
//        }
//        InputView.getMoreCardOrNot();
    }

    public static void playRound(int gameCount, Asset playerAsset) {
        Cards playerCards = new Cards();
        while (true) {
            playerCards.addCard(new Card());
            OutputView.printMiddleResult(playerCards, gameCount);
            if (playerCards.isTooMuch()) {
                OutputView.printLose(playerAsset.getRemainedAmount());
                return;
            }
            if (!InputView.getMoreCardOrNot()) {
                return;
            }
        }
    }
}
