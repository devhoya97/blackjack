package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    public static void main(String[] args) {
//        Asset playerAsset = new Asset();
//        OutputView.printGameStart(playerAsset);
//        BetMoney betMoney = InputView.getBetMoney(playerAsset);
        int gameCount = 1;
        CardDeck cardDeck = new CardDeck();
        Cards playerCards = new Cards();
        playerCards.addCard(cardDeck.pop());
        System.out.println("cardDeck size: " + cardDeck.size());
        playerCards.addCard(cardDeck.pop());
        System.out.println("cardDeck size: " + cardDeck.size());
        playerCards.addCard(cardDeck.pop());
        System.out.println("cardDeck size: " + cardDeck.size());
        OutputView.printMiddleResult(playerCards, gameCount);
//        if (!playerAsset.canPlayMore()) {
//            return;
//        }
//        InputView.getMoreCardOrNot();
    }
}
