package blackjack;

public class Asset {
    private static final int INITIAL_MONEY = 1000;
    private int money;

    public Asset() {
        this.money = INITIAL_MONEY;
    }

    public boolean isBetAmountValid(int money) {
        return this.money >= money;
    }

    public void increase(int money) {
        this.money += money;
    }

    public void decrease(int money) {
        this.money -= money;
    }

    // view를 위한 getter
    public int getRemainedAmount() {
        return money;
    }
}
