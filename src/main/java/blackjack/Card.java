package blackjack;

import java.util.Random;

public class Card {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 11;
    private final int number;
    private int compareResult;

    public Card() {
        this.number = createRandomNumber();
    }

    public Card(int number) {
        this.number = number;
    }

    private int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER) + MIN_NUMBER;
    }

    public int compareNumber(Card card) {
        compareResult = Integer.compare(number, card.number);
        return Integer.compare(number, card.number);
    }

    // view를 위한 getter
    public int getNumber() {
        return number;
    }

    public int getCompareResult() {
        return compareResult;
    }
}
