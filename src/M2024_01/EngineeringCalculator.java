package M2024_01;

import java.util.Scanner;

public class EngineeringCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("공학용 계산기를 시작합니다.");

        while (true) {
            System.out.println("\n1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 제곱");
            System.out.println("6. 제곱근");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 연산을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    performExponentiation();
                    break;
                case 6:
                    performSquareRoot();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }

    private static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("덧셈을 수행할 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("더할 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("덧셈 결과: " + result);
    }

    private static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("뺄셈을 수행할 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("빼기할 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("뺄셈 결과: " + result);
    }

    private static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("곱셈을 수행할 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("곱할 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("곱셈 결과: " + result);
    }

    private static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나눗셈을 수행할 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("나눌 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("나눗셈 결과: " + result);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    private static void performExponentiation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("거듭제곱을 수행할 숫자를 입력하세요: ");
        double base = scanner.nextDouble();
        System.out.print("지수를 입력하세요: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("거듭제곱 결과: " + result);
    }

    private static void performSquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("제곱근을 구할 숫자를 입력하세요: ");
        double number = scanner.nextDouble();

        if (number >= 0) {
            double result = Math.sqrt(number);
            System.out.println("제곱근 결과: " + result);
        } else {
            System.out.println("음수의 제곱근은 실수 범위에서 정의되지 않습니다.");
        }
    }
}

