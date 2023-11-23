package blackjack;

public class Dealer {
    private static final int PLAYER_WIN = 1;
    private static final int DRAW = 0;
    private static final int PLAYER_LOSE = -1;
    private final Asset playerAsset;

    public Dealer(Asset playerAsset) {
        this.playerAsset = playerAsset;
    }

    public int reflectResult(Cards playerCards, Cards dealerCards, BetMoney betMoney) {
        int result = playerCards.chooseWinner(dealerCards);
        if (result == PLAYER_WIN) {
            if (playerCards.isBlackJack()) {
                betMoney.increaseByBlackJack(playerAsset);
                return PLAYER_WIN;
            }
            betMoney.increaseByWinning(playerAsset);
            return PLAYER_WIN;
        }
        if (result == DRAW) {
            if (!dealerCards.isBlackJack()) {
                return DRAW;
            }
        }
        betMoney.decreaseByLose(playerAsset);
        return PLAYER_LOSE;
    }
}
