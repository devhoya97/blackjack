package blackjack;

import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {
    private static final int CARD_DECK_MIN_SIZE = 11;
    private static final int PLAYER_LOSE = -1;

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Asset playerAsset = new Asset();
        Dealer dealer = new Dealer(playerAsset);
        OutputView.printGameStart(playerAsset);
        while (true) {
            if (cardDeck.size() < CARD_DECK_MIN_SIZE) {
                cardDeck = new CardDeck();
            }
            BetMoney betMoney = InputView.getBetMoney(playerAsset);
            int gameCount = 1;
            int winningResult = playRound(gameCount, playerAsset, dealer, betMoney, cardDeck);
            OutputView.printRoundResult(winningResult, playerAsset.getRemainedAmount());
            if (!playerAsset.canPlayMore() || !InputView.getMoreGameOrNot()) {
                OutputView.printGameOver(dealer.getWinCount(), dealer.getDrawCount(), dealer.getLoseCount(),
                        playerAsset.getRemainedAmount());
                return;
            }
        }
    }

    public static int playRound(int gameCount, Asset playerAsset, Dealer dealer, BetMoney betMoney, CardDeck cardDeck) {
        Cards playerCards = new Cards();
        while (true) {
            playerCards.addCard(cardDeck.pop());
            OutputView.printPlayerCards(playerCards, gameCount);
            if (playerCards.isTooMuch()) {
                betMoney.decreaseByLose(playerAsset);
                return PLAYER_LOSE;
            }
            if (!InputView.getMoreCardOrNot()) {
                Cards dealerCards = getDealerCards(cardDeck);
                OutputView.printDealerCards(dealerCards);
                return dealer.reflectResult(playerCards, dealerCards, betMoney);
            }
        }
    }

    private static Cards getDealerCards(CardDeck cardDeck) {
        Cards dealerCards = new Cards();
        while (true) {
            if (!dealerCards.addDealerCard(cardDeck.pop())) {
                break;
            }
        }
        return dealerCards;
    }
}
