package blackjack;

public class BetMoney {
    private static final int MIN_UNIT = 100;
    private final int betMoney;

    public BetMoney(int betMoney, Asset playerAsset) {
        if ((betMoney % MIN_UNIT != 0) || !playerAsset.isBetAmountValid(betMoney)) {
            throw new IllegalArgumentException();
        }
        this.betMoney = betMoney;
    }

    public void increaseByWinning(Asset playerAsset) {
        playerAsset.increase(betMoney);
    }
}
