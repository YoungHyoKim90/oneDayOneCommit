package M2024_08;

import java.util.Scanner;

public class StockPrediction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 주식 가격 입력 받기
        System.out.print("현재 주식 가격을 입력하세요: ");
        double currentPrice = scanner.nextDouble();

        // 예상 성장률 입력 받기
        System.out.print("예상 성장률(%)을 입력하세요: ");
        double growthRate = scanner.nextDouble();

        // 예상 주식 가격 계산
        double predictedPrice = predictStockPrice(currentPrice, growthRate);

        // 결과 출력
        System.out.printf("예상 주식 가격: %.2f%n", predictedPrice);
    }

    // 주식 가격 예측 함수
    public static double predictStockPrice(double currentPrice, double growthRate) {
        // 성장률을 백분율로 변환
        double growthFactor = growthRate / 100;
        // 예상 주식 가격 계산
        return currentPrice * (1 + growthFactor);
    }
}

