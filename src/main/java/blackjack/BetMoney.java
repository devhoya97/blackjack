package blackjack;

public class BetMoney {
    private static final int MIN_UNIT = 100;
    private final int money;

    public BetMoney(int money, Asset playerAsset) {
        if ((money % MIN_UNIT != 0) || !playerAsset.isBetAmountValid(money)) {
            throw new IllegalArgumentException();
        }
        this.money = money;
    }
}
