package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private List<Card> cards;

    public Cards(Card card) {
        cards = new ArrayList<>();
        cards.add(card);
    }
}
