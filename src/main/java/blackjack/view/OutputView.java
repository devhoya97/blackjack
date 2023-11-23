package blackjack.view;

import blackjack.Asset;
import blackjack.Cards;

public class OutputView {
    private static final String NEW_LINE = "\n";
    private static final String SPACE = " ";
    private static final String LEFT_BRACKET = "[";
    private static final String RIGHT_BRACKET = "]";
    private static final int PLAYER_WIN = 1;
    private static final int DRAW = 0;
    private static final int PLAYER_LOSE = -1;

    public static void printGameStart(Asset playerAsset) {
        String message = "간단 카드 게임을 시작합니다."
                + NEW_LINE
                + "현재 재산: "
                + playerAsset.getRemainedAmount();
        System.out.println(message);
    }

    public static void printPlayerCards(Cards playerCards, int gameCount) {
        StringBuilder message = new StringBuilder();
        message.append(NEW_LINE).append("Game ").append(gameCount).append(NEW_LINE)
                .append("플레이어: ");
        addCardsMessage(playerCards, message);
        message.append("총합: ").append(playerCards.sum());
        System.out.println(message);
    }

    public static void printDealerCards(Cards dealerCards) {
        StringBuilder message = new StringBuilder();
        message.append("딜러 : ");
        addCardsMessage(dealerCards, message);
        message.append("딜러 카드의 합계는 ").append(dealerCards.sum()).append("입니다.");
        System.out.println(message);
    }

    public static void printRoundResult(int winningResult, int remainedAmount) {
        if (winningResult == PLAYER_WIN) {
            System.out.printf("당신의 승리입니다.\n남은 재산: %d\n", remainedAmount);
            return;
        }
        if (winningResult == DRAW) {
            System.out.printf("비겼습니다. 현재 재산: %d\n", remainedAmount);
            return;
        }
        if (winningResult == PLAYER_LOSE) {
            System.out.printf("당신의 패배입니다. 현재 재산: %d\n", remainedAmount);
        }
    }

    private static void addCardsMessage(Cards cards, StringBuilder message) {
        cards.getCardNumbers()
                .stream()
                .map(number -> LEFT_BRACKET + number + RIGHT_BRACKET)
                .forEach(message::append);
        message.append(NEW_LINE);
    }

    public static void printGameOver(long winCount, long drawCount, long loseCount, int remainedAmount) {
        String message =
                winCount + "승 "
                + drawCount + "무 "
                + loseCount + "패로 "
                + remainedAmount + "원의 자산이 남았습니다."
                + NEW_LINE + "플레이 해 주셔서 감사합니다.";
        System.out.println(message);
    }
}
