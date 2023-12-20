package M2023_12;

import java.util.Scanner;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나눌 숫자를 입력하세요:");

        try {
            int number = scanner.nextInt();
            int result = 10 / number;
            System.out.println("나눗셈 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
