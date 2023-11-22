package blackjack.view;

import java.util.Scanner;

public class InputView {
    public static boolean getMoreGameOrNot() {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("한 게임 더 하시겠습니까? (Y / N) ");
            String input = console.nextLine();
            char yesOrNo = Character.toUpperCase(input.charAt(0));
            if ((input.length() != 1) || (yesOrNo != 'Y' && yesOrNo != 'N')) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            return yesOrNo == 'Y';
        }
    }
}
