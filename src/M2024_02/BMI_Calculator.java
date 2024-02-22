package M2024_02;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 키와 몸무게 입력 받기
        System.out.print("키를 입력하세요 (미터 단위): ");
        double height = scanner.nextDouble();

        System.out.print("몸무게를 입력하세요 (킬로그램 단위): ");
        double weight = scanner.nextDouble();

        // BMI 계산
        double bmi = calculateBMI(height, weight);

        // BMI 결과 출력
        System.out.println("당신의 BMI 지수는 " + bmi + "입니다.");
        System.out.println("BMI 결과 해석:");
        System.out.println("저체중: 18.5 미만");
        System.out.println("정상: 18.5 이상 24.9 이하");
        System.out.println("과체중: 25 이상 29.9 이하");
        System.out.println("비만: 30 이상");
    }

    // BMI를 계산하는 메서드
    private static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
