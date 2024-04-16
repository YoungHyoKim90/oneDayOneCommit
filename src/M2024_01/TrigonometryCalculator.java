package M2024_01;

import java.util.Scanner;

public class TrigonometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각함수 계산기를 시작합니다.");

        while (true) {
            System.out.println("\n1. 싸인(Sine) 값 계산");
            System.out.println("2. 코사인(Cosine) 값 계산");
            System.out.println("3. 탄젠트(Tangent) 값 계산");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 삼각함수를 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSine();
                    break;
                case 2:
                    calculateCosine();
                    break;
                case 3:
                    calculateTangent();
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

    private static void calculateSine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("각도를 입력하세요 (도): ");
        double degree = scanner.nextDouble();
        double radian = Math.toRadians(degree);
        double sineValue = Math.sin(radian);
        System.out.println("싸인(" + degree + "도) 값: " + sineValue);
        System.out.println("라디안 값: " + radian);
        System.out.println("역싸인 값: " + Math.asin(sineValue) + " 라디안");
    }

    private static void calculateCosine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("각도를 입력하세요 (도): ");
        double degree = scanner.nextDouble();
        double radian = Math.toRadians(degree);
        double cosineValue = Math.cos(radian);
        System.out.println("코사인(" + degree + "도) 값: " + cosineValue);
        System.out.println("라디안 값: " + radian);
        System.out.println("역코사인 값: " + Math.acos(cosineValue) + " 라디안");
        scanner.close();
    }

    private static void calculateTangent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("각도를 입력하세요 (도): ");
        double degree = scanner.nextDouble();
        double radian = Math.toRadians(degree);
        double tangentValue = Math.tan(radian);
        System.out.println("탄젠트(" + degree + "도) 값: " + tangentValue);
        System.out.println("라디안 값: " + radian);
        System.out.println("역탄젠트 값: " + Math.atan(tangentValue) + " 라디안");
        scanner.close();
    }
}

