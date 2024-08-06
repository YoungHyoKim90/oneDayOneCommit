/**
 * 
 */
package M2024_08;

import java.util.Scanner;
import java.lang.Math;


/**
 * @author NNPC999
 *
 */
public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n공학용 계산기입니다.");
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 제곱근");
            System.out.println("6. 로그");
            System.out.println("7. 사인");
            System.out.println("8. 코사인");
            System.out.println("9. 탄젠트");
            System.out.println("10. 종료");
            System.out.print("원하는 기능의 번호를 입력하세요: ");
            int choice = scanner.nextInt();

            if (choice == 10) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            double num1, num2, result;

            switch (choice) {
                case 1:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = scanner.nextDouble();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.printf("결과: %.2f + %.2f = %.2f\n", num1, num2, result);
                    break;

                case 2:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = scanner.nextDouble();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.printf("결과: %.2f - %.2f = %.2f\n", num1, num2, result);
                    break;

                case 3:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = scanner.nextDouble();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.printf("결과: %.2f * %.2f = %.2f\n", num1, num2, result);
                    break;

                case 4:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = scanner.nextDouble();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("결과: %.2f / %.2f = %.2f\n", num1, num2, result);
                    } else {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                    }
                    break;

                case 5:
                    System.out.print("숫자를 입력하세요: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.printf("결과: √%.2f = %.2f\n", num1, result);
                    } else {
                        System.out.println("오류: 음수의 제곱근은 계산할 수 없습니다.");
                    }
                    break;

                case 6:
                    System.out.print("숫자를 입력하세요: ");
                    num1 = scanner.nextDouble();
                    if (num1 > 0) {
                        result = Math.log10(num1);
                        System.out.printf("결과: log10(%.2f) = %.2f\n", num1, result);
                    } else {
                        System.out.println("오류: 로그의 입력값은 양수여야 합니다.");
                    }
                    break;

                case 7:
                    System.out.print("각도를 입력하세요 (도): ");
                    num1 = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(num1));
                    System.out.printf("결과: sin(%.2f°) = %.2f\n", num1, result);
                    break;

                case 8:
                    System.out.print("각도를 입력하세요 (도): ");
                    num1 = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(num1));
                    System.out.printf("결과: cos(%.2f°) = %.2f\n", num1, result);
                    break;

                case 9:
                    System.out.print("각도를 입력하세요 (도): ");
                    num1 = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(num1));
                    System.out.printf("결과: tan(%.2f°) = %.2f\n", num1, result);
                    break;

                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    break;
            }
        }

        scanner.close();
    }
}
