package M2023_11;
import java.util.Scanner;
import java.time.LocalTime; // 시간을 다루기 위한 Java 패키지

public class D_1117TestCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("텍스트를 입력해주세요.");
        String input = sc.next();
        System.out.println(input + "를 입력하셨습니다.");

        boolean shouldCloseScanner = false;

        do {
            System.out.println("Scanner 기능을 종료할까요? (yes/no)");
            String yNanswer = sc.next();

            if (yNanswer.equals("yes")) {
                System.out.println("Scanner 기능을 종료합니다.");
                shouldCloseScanner = true;
            } else {
                System.out.println("텍스트를 입력해주세요.");
                input = sc.next();
                System.out.println(input + "를 입력하셨습니다.");
            }

            // 현재 시간을 출력
            LocalTime currentTime = LocalTime.now();
            System.out.println("현재 시간: " + currentTime);

        } while (!shouldCloseScanner);

        sc.close();
        System.out.println("Scanner 기능이 종료되었습니다.");
        System.out.println("프로그램을 종료합니다.");
    }
}
