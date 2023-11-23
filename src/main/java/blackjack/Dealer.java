package blackjack;

public class Dealer {
    private static final int PLAYER_WIN = 1;
    private static final int DRAW = 0;
    private static final int PLAYER_LOSE = -1;
    private final Asset playerAsset;
    private int winCount;
    private int drawCount;
    private int loseCount;

    public Dealer(Asset playerAsset) {
        this.playerAsset = playerAsset;
        winCount = 0;
        drawCount = 0;
        loseCount = 0;
    }

    public int reflectResult(Cards playerCards, Cards dealerCards, BetMoney betMoney) {
        int result = playerCards.chooseWinner(dealerCards);
        if (result == PLAYER_WIN) {
            winCount++;
            if (playerCards.isBlackJack()) {
                betMoney.increaseByBlackJack(playerAsset);
                return PLAYER_WIN;
            }
            betMoney.increaseByWinning(playerAsset);
            return PLAYER_WIN;
        }
        if (result == DRAW) {
            if (!dealerCards.isBlackJack()) {
                drawCount++;
                return DRAW;
            }
        }
        loseCount++;
        betMoney.decreaseByLose(playerAsset);
        return PLAYER_LOSE;
    }

    public void reflectLose(BetMoney betMoney) {
        loseCount++;
        betMoney.decreaseByLose(playerAsset);
    }

    //view를 위한 getter
    public int getWinCount() {
        return winCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public int getLoseCount() {
        return loseCount;
    }
}
