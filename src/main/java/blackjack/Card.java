package blackjack;

import java.util.Random;

public class Card {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 11;
    private final int number;

    public Card() {
        this.number = createRandomNumber();
    }

    private int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER) + MIN_NUMBER;
    }
}
