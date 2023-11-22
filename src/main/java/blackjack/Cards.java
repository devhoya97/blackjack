package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private List<Card> cards = new ArrayList<>();

    public Cards() {
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getMatchCount() {
        return cards.size();
    }

    public List<Integer> getCardNumbers() {
        List<Integer> cardNumbers = new ArrayList<>(cards.size());
        for (int cardIndex = 0; cardIndex < cards.size(); cardIndex++) {
            Card card = cards.get(cardIndex);
            cardNumbers.add(card.getNumber());
        }
        return cardNumbers;
    }
}
