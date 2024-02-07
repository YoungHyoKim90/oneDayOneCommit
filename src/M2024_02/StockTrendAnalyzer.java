package M2024_02;

import java.util.Arrays;

public class StockTrendAnalyzer {
    public static void main(String[] args) {
        // 주식 가격 데이터
        double[] stockPrices = {100.0, 105.0, 110.0, 115.0, 120.0, 125.0, 130.0, 135.0, 140.0, 145.0};

        // 이동평균 기간 설정 (예: 5일 이동평균)
        int period = 5;

        // 이동평균 계산
        double[] movingAverages = calculateMovingAverage(stockPrices, period);

        // 추세 분석
        analyzeTrend(stockPrices, movingAverages);
    }

    // 이동평균 계산 메서드
    private static double[] calculateMovingAverage(double[] stockPrices, int period) {
        double[] movingAverages = new double[stockPrices.length - period + 1];

        for (int i = 0; i <= stockPrices.length - period; i++) {
            double sum = 0;
            for (int j = i; j < i + period; j++) {
                sum += stockPrices[j];
            }
            movingAverages[i] = sum / period;
        }

        return movingAverages;
    }

    // 추세 분석 메서드
    private static void analyzeTrend(double[] stockPrices, double[] movingAverages) {
        System.out.println("Stock Prices: " + Arrays.toString(stockPrices));
        System.out.println("Moving Averages: " + Arrays.toString(movingAverages));

        if (stockPrices.length != movingAverages.length) {
            System.out.println("Error: Unable to analyze trend. Data length mismatch.");
            return;
        }

        boolean uptrend = true;
        boolean downtrend = true;

        for (int i = 1; i < movingAverages.length; i++) {
            if (movingAverages[i] > movingAverages[i - 1]) {
                downtrend = false;
            } else if (movingAverages[i] < movingAverages[i - 1]) {
                uptrend = false;
            }
        }

        if (uptrend) {
            System.out.println("Trend: Upward");
        } else if (downtrend) {
            System.out.println("Trend: Downward");
        } else {
            System.out.println("Trend: Mixed or Sideways");
        }
    }
}

