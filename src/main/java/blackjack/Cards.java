package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private static final int DEALER_CARD_MAX_ALLOWED = 16;
    private static final int PLAYER_WIN = 1;
    private static final int DRAW = 0;
    private static final int PLAYER_LOSE = -1;
    private static final int BLACK_JACK = 21;
    private final List<Card> cards = new ArrayList<>();

    public Cards() {
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean addDealerCard(Card card) {
        if (sum() <= DEALER_CARD_MAX_ALLOWED) {
            cards.add(card);
            return true;
        }
        return false;
    }

    public int chooseWinner(Cards otherCards) {
        if (isTooMuch()) {
            return PLAYER_LOSE;
        }
        if (otherCards.isTooMuch()) {
            return PLAYER_WIN;
        }
        return Integer.compare(sum(), otherCards.sum());
    }

    public boolean isBlackJack() {
        return sum() == BLACK_JACK;
    }

    public boolean isTooMuch() {
        return sum() > BLACK_JACK;
    }

    public int sum() {
        return cards.stream()
                .mapToInt(Card::getNumber)
                .sum();
    }

    public List<Integer> getCardNumbers() {
        return cards.stream()
                .map(Card::getNumber)
                .toList();
    }

    public long getWinCount() {
        return cards.stream()
                .mapToInt(Card::getCompareResult)
                .filter(compareResult -> compareResult == PLAYER_WIN)
                .count();
    }

    public long getDrawCount() {
        return cards.stream()
                .mapToInt(Card::getCompareResult)
                .filter(compareResult -> compareResult == DRAW)
                .count();
    }

    public long getLoseCount() {
        return cards.stream()
                .mapToInt(Card::getCompareResult)
                .filter(compareResult -> compareResult == PLAYER_LOSE)
                .count();
    }
}
