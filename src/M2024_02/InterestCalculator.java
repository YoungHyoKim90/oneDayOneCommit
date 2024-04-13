package M2024_02;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이자율 입력 받기
        System.out.print("이자율을 입력하세요 (단위: %): ");
        double interestRate = scanner.nextDouble();

        // 이자율을 소수로 변환
        double rate = interestRate / 100.0;

        // 두 배가 되는 시간 계산
        int yearsToDouble = calculateYearsToDouble(rate);

        // 결과 출력
        System.out.println("입력한 이자율로 원금이 두 배가 되는 데 걸리는 시간: " + yearsToDouble + "년");
        scanner.close();
    }

    // 두 배가 되는 시간을 계산하는 메서드
    public static int calculateYearsToDouble(double rate) {
        // 초기 원금
        double principal = 1.0;

        // 현재 원금
        double currentAmount = principal;

        // 두 배가 되는 시간
        int years = 0;

        // 원금이 두 배가 될 때까지 반복
        while (currentAmount < principal * 2) {
            currentAmount *= (1 + rate);
            years++;
        }

        return years;
    }
}
