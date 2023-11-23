package blackjack.view;

import blackjack.Asset;
import blackjack.Cards;

public class OutputView {
    private static final String NEW_LINE = "\n";
    private static final String SPACE = " ";
    private static final String LEFT_BRACKET = "[";
    private static final String RIGHT_BRACKET = "]";
    private static final int WIN = 1;
    private static final int DRAW = 0;

    public static void printGameStart(Asset playerAsset) {
        String message = "간단 카드 게임을 시작합니다."
                + NEW_LINE
                + "현재 재산: "
                + playerAsset.getRemainedAmount();
        System.out.println(message);
    }

    public static void printGameOver() {
        String message = "게임을 종료합니다."
                + NEW_LINE
                + "플레이해주셔서 감사합니다.";
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
        String message = "현재 전적: "
                + winCount + "승 "
                + drawCount + "무 "
                + loseCount + "패";
        System.out.println(message);
    }
}
