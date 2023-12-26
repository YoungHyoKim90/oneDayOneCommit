package M2023_12;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키보드 입력을 받습니다. 종료하려면 'exit'을 입력하세요.");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력된 값: " + userInput);
        }

        scanner.close();
    }
}
