package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private static final int WIN = 1;
    private static final int DRAW = 0;
    private static final int LOSE = -1;
    private final List<Card> cards = new ArrayList<>();

    public Cards() {
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getMatchCount() {
        return cards.size();
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
                .filter(compareResult -> compareResult == WIN)
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
                .filter(compareResult -> compareResult == LOSE)
                .count();
    }
}
