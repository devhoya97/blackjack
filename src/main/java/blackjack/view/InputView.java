package blackjack.view;

import blackjack.Asset;
import blackjack.BetMoney;
import java.util.Scanner;

public class InputView {
    private static final Scanner console = new Scanner(System.in);
    public static BetMoney getBetMoney(Asset playerAsset) {
        while (true) {
            System.out.print("얼마를 거시겠습니까? ");
            String input = console.nextLine();
            try {
                return new BetMoney(Integer.parseInt(input), playerAsset);
            } catch (Exception e) {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public static boolean getMoreCardOrNot() {
        while (true) {
            System.out.println("카드를 더 받겠습니까? (Y / N) ");
            String input = console.nextLine().toUpperCase();
            if (input.equals("Y") || input.equals("N")) {
                return input.equals("Y");
            }
            System.out.println("잘못 입력하셨습니다.");
        }
    }
    public static boolean getMoreGameOrNot() {
        while (true) {
            System.out.print("한 게임 더 하시겠습니까? (Y / N) ");
            String input = console.nextLine().toUpperCase();
            if (input.equals("Y") || input.equals("N")) {
                return input.equals("Y");
            }
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
