package blackjack.view;

import blackjack.Cards;
import java.util.StringJoiner;

public class OutputView {
    private static final String NEW_LINE = "\n";
    private static final String SPACE = " ";
    private static final String LEFT_BRACKET = "[";
    private static final String RIGHT_BRACKET = "]";

    public static void printGameStart() {
        System.out.println("간단 카드 게임을 시작합니다.");
    }

    public static void printGameOver() {
        StringBuilder message = new StringBuilder();
        message.append("게임을 종료합니다.")
                .append(NEW_LINE)
                .append("플레이해주셔서 감사합니다.");
        System.out.println(message);
    }

    public static void printResult(Cards playerCards, Cards dealerCards, int result) {
        StringBuilder message = new StringBuilder();
        message.append(NEW_LINE).append("Game ").append(playerCards.getMatchCount()).append(NEW_LINE)
                .append("You   : ");
        addCardsMessage(playerCards, message);
        message.append("Dealer: ");
        addCardsMessage(dealerCards, message);
        System.out.println(message);
    }

    public static void addCardsMessage(Cards cards, StringBuilder message) {
        cards.getCardNumbers()
                .stream()
                .map(number -> LEFT_BRACKET + String.format("%2d", number) + RIGHT_BRACKET + SPACE)
                .forEach(message::append);
        message.append(NEW_LINE);
    }
}
