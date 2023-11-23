package blackjack;

public class DealerCards extends Cards{
    private static final int MAX_CARD_SUM_ALLOWED = 16;
    public DealerCards() {
        super();
    }

    public boolean addCard() {
        Card card = new Card();
        if (sum() <= MAX_CARD_SUM_ALLOWED) {
            cards.add(card);
            return true;
        }
        return false;
    }
}
