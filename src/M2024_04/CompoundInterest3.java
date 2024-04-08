package M2024_04;

import java.util.Scanner;

public class CompoundInterest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 월투자금, 투자기간, 목표금액 입력받기
        System.out.print("월 투자 금액을 입력하세요 (원): ");
        double monthlyInvestment = scanner.nextDouble();
        System.out.print("투자 기간을 입력하세요 (년): ");
        int investmentPeriod = scanner.nextInt();
        System.out.print("목표 금액을 입력하세요 (원): ");
        double targetAmount = scanner.nextDouble();

        // 연간 이율 후보 범위 설정 (0%에서 100%까지)
        double lowerBound = 0.0;
        double upperBound = 1.0;
        double annualInterestRate = (lowerBound + upperBound) / 2;

        // 이진 탐색을 사용하여 연간 이율 찾기
        while (true) {
            double totalAmount = 0;
            for (int year = 0; year < investmentPeriod; year++) {
                for (int month = 0; month < 12; month++) {
                    totalAmount *= (1 + annualInterestRate / 12);
                    totalAmount += monthlyInvestment;
                }
            }

            // 목표 금액에 도달하거나 수렴할 때까지 이진 탐색 수행
            if (Math.abs(totalAmount - targetAmount) < 0.01 * targetAmount) {
                break;
            } else if (totalAmount < targetAmount) {
                lowerBound = annualInterestRate;
            } else {
                upperBound = annualInterestRate;
            }

            
            annualInterestRate = (lowerBound + upperBound) / 2;
        }

        // 결과 출력
        System.out.printf("목표 금액 %.2f 원을 달성하기 위한 수익률:\n", targetAmount);
        System.out.printf("일일 수익률: %.2f%%\n", Math.pow(1 + annualInterestRate, 1.0 / 365) * 100 - 100);
        System.out.printf("주간 수익률: %.2f%%\n", Math.pow(1 + annualInterestRate, 1.0 / 52) * 100 - 100);
        System.out.printf("연간 수익률: %.2f%%\n", annualInterestRate * 100);
    }
}

