package M2024_04;

public class CompoundInterest {
    public static void main(String[] args) {
        // 초기 투자금과 매월 투자금
        double initialInvestment = 0;
        double monthlyInvestment = 1000000;

        // 연평균 수익률
        double annualInterestRate = 0.07;

        // 투자 기간
        int investmentPeriod = 25;

        // 년별 투자 금액 계산
        double totalAmount = initialInvestment;
        for (int year = 0; year < investmentPeriod; year++) {
            for (int month = 0; month < 12; month++) {
                totalAmount *= (1 + annualInterestRate / 12);
                totalAmount += monthlyInvestment;
            }
            System.out.printf("Year %d: %.2f\n", year + 1, totalAmount / 1e9); // 결과를 10억 단위로 출력
        }
    }
}
