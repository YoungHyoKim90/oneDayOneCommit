package M2024_08;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산기입니다.");
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("연산자(+, -, *, /)를 입력하세요: ");
        char operator = scanner.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    return;
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.printf("결과: %.2f %s %.2f = %.2f\n", num1, operator, num2, result);
    }
}
