package blackjack.view;

import blackjack.Cards;
import java.util.StringJoiner;

public class OutputView {
    private static final String NEW_LINE = "\n";
    private static final String SPACE = " ";
    private static final String LEFT_BRACKET = "[";
    private static final String RIGHT_BRACKET = "]";
    private static final int WIN = 1;
    private static final int DRAW = 0;
    private static final int LOSE = -1;

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

    public static void printResult(Cards playerCards, Cards dealerCards, int winningResult) {
        StringBuilder message = new StringBuilder();
        message.append(NEW_LINE).append("Game ").append(playerCards.getMatchCount()).append(NEW_LINE)
                .append("You   : ");
        addCardsMessage(playerCards, message);
        message.append("Dealer: ");
        addCardsMessage(dealerCards, message);
        addWinningResult(winningResult, message);
        System.out.println(message);
    }

    private static void addCardsMessage(Cards cards, StringBuilder message) {
        cards.getCardNumbers()
                .stream()
                .map(number -> LEFT_BRACKET + String.format("%2d", number) + RIGHT_BRACKET + SPACE)
                .forEach(message::append);
        message.append(NEW_LINE);
    }

    private static void addWinningResult(int winningResult, StringBuilder message) {
        if (winningResult == WIN) {
            message.append("당신이 이겼습니다.");
            return;
        }
        if (winningResult == DRAW) {
            message.append("비겼습니다.");
            return;
        }
        message.append("딜러가 이겼습니다.");
    }

    public static void printHistory(long winCount, long drawCount, long loseCount) {
        StringBuilder message = new StringBuilder();
        message.append("현재 전적: ")
                .append(winCount).append("승 ")
                .append(drawCount).append("무 ")
                .append(loseCount).append("패");
        System.out.println(message);
    }
}
