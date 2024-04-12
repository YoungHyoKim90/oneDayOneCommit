package M2024_02;

import java.util.Scanner;

public class EconomicIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // 각 요소의 가중치 입력 받기
        System.out.println("경제 지표 요소의 가중치를 입력하세요.");
        System.out.print("실업률의 가중치: ");
        double unemploymentWeight = scanner.nextDouble();
        System.out.print("소비자 신뢰 지수의 가중치: ");
        double consumerConfidenceWeight = scanner.nextDouble();
        System.out.print("경기 순환 지수의 가중치: ");
        double businessCycleIndexWeight = scanner.nextDouble();

        
        // 각 요소의 예측치 입력 받기
        System.out.println("경제 지표 요소의 예측치를 입력하세요.");
        System.out.print("예상 실업률: ");
        double unemploymentRate = scanner.nextDouble();
        System.out.print("예상 소비자 신뢰 지수: ");
        double consumerConfidenceIndex = scanner.nextDouble();
        System.out.print("예상 경기 순환 지수: ");
        double businessCycleIndex = scanner.nextDouble();

        
        // 가중 평균을 사용하여 경제 예상 지수 계산
        double economicIndex = (unemploymentRate * unemploymentWeight +
                                consumerConfidenceIndex * consumerConfidenceWeight +
                                businessCycleIndex * businessCycleIndexWeight) /
                                (unemploymentWeight + consumerConfidenceWeight + businessCycleIndexWeight);

        System.out.println("경제 예상 지수: " + economicIndex);
        scanner.close();
    }
}


