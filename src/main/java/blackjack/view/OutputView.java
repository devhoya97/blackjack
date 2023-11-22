package blackjack.view;

public class OutputView {
    private static final String NEW_LINE = "\n";
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
}
