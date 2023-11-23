package blackjack;

import java.util.Collections;
import java.util.Stack;

public class CardDeck {
    private static final int MIN_CARD_NUMBER = 1;
    private static final int MAX_CARD_NUMBER = 11;
    private static final int SAME_CARD_COUNT = 4;
    private static final int SAME_MAX_CARD_COUNT = 12;
    private Stack<Card> cardDeck;
    public CardDeck() {
        cardDeck = new Stack<>();
        for (int cardNumber = MIN_CARD_NUMBER; cardNumber < MAX_CARD_NUMBER; cardNumber++) {
            for (int sameCount = 0; sameCount < SAME_CARD_COUNT; sameCount++) {
                cardDeck.push(new Card(cardNumber));
            }
        }
        for (int sameCount = 0; sameCount < SAME_MAX_CARD_COUNT; sameCount++) {
            cardDeck.push(new Card(MAX_CARD_NUMBER));
        }
        Collections.shuffle(cardDeck);
    }

    public Card pop() {
        return cardDeck.pop();
    }

    public int size() {
        return cardDeck.size();
    }
}
