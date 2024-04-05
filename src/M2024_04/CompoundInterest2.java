package M2024_04;

public class CompoundInterest2 {
    public static void main(String[] args) {
        // 초기 투자금과 매월 투자금
        double initialInvestment = 0;
        double monthlyInvestment = 1000000;

        // 투자 기간
        int investmentPeriod = 25;

        // 목표 금액
        double targetAmount = 10e9;

        // 연간 이율 후보 범위 설정 (0%에서 100%까지)
        double lowerBound = 0.0;
        double upperBound = 1.0;
        double annualInterestRate = (lowerBound + upperBound) / 2;

        // 이진 탐색을 사용하여 연간 이율 찾기
        while (true) {
            double totalAmount = initialInvestment;
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

        System.out.printf("Annual Interest Rate: %.2f%%\n", annualInterestRate * 100);
    }
}

