package M2024_08;

import java.util.Scanner;

public class StockEvaluation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PER (주가수익비율) 입력 받기
        System.out.print("PER (주가수익비율)을 입력하세요: ");
        double per = scanner.nextDouble();

        // PBR (주가순자산비율) 입력 받기
        System.out.print("PBR (주가순자산비율)을 입력하세요: ");
        double pbr = scanner.nextDouble();

        // EPS (주당순이익) 입력 받기
        System.out.print("EPS (주당순이익)을 입력하세요: ");
        double eps = scanner.nextDouble();

        // BPS (주당순자산) 입력 받기
        System.out.print("BPS (주당순자산)을 입력하세요: ");
        double bps = scanner.nextDouble();

        // 주식 가격 입력 받기
        System.out.print("주식 가격을 입력하세요: ");
        double stockPrice = scanner.nextDouble();

        // 평가 결과 계산
        String perEvaluation = evaluatePER(per);
        String pbrEvaluation = evaluatePBR(pbr);
        String priceEvaluation = evaluateStockPrice(stockPrice, eps, bps);

        // 결과 출력
        System.out.println("\nPER 평가: " + perEvaluation);
        System.out.println("PBR 평가: " + pbrEvaluation);
        System.out.println("주식 가격 평가: " + priceEvaluation);
    }

    // PER 평가 함수
    public static String evaluatePER(double per) {
        if (per < 15) {
            return "저평가";
        } else if (per <= 25) {
            return "적정 평가";
        } else {
            return "고평가";
        }
    }

    // PBR 평가 함수
    public static String evaluatePBR(double pbr) {
        if (pbr < 1.0) {
            return "저평가";
        } else if (pbr <= 2.0) {
            return "적정 평가";
        } else {
            return "고평가";
        }
    }

    // 주식 가격 평가 함수
    public static String evaluateStockPrice(double stockPrice, double eps, double bps) {
        double expectedPrice = eps * 10; // PER 10으로 가정
        if (stockPrice < expectedPrice) {
            return "저평가";
        } else if (stockPrice == expectedPrice) {
            return "적정 평가";
        } else {
            return "고평가";
        }
    }
}
