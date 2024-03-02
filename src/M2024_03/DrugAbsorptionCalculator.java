package M2024_03;

import java.util.Scanner;

public class DrugAbsorptionCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 약물의 흡수 속도 상수 입력 받기 (예: 0.1은 10%가 1시간에 흡수됨을 의미)
		System.out.print("약물의 흡수 속도를 입력하세요 (단위: 시간당 흡수 비율, 예: 0.1): ");
		double absorptionRate = scanner.nextDouble();

		// 약물의 반감기 입력 받기 (반감기: 약물의 농도가 처음 농도의 절반으로 감소하는 시간)
		System.out.print("약물의 반감기를 입력하세요 (단위: 시간): ");
		double halfLife = scanner.nextDouble();

		// 흡수 시간 계산 (반감기의 5배로 설정)
		double absorptionTime = 5 * halfLife;

		// 흡수가 완료되는 시간 계산
		double completionTime = calculateCompletionTime(absorptionRate, absorptionTime);

		// 결과 출력
		System.out.println("약물이 흡수되는 데 걸리는 시간: " + completionTime + "시간");
	}

	// 약물의 흡수가 완료되는 시간을 계산하는 메서드
	public static double calculateCompletionTime(double absorptionRate, double absorptionTime) {
		// 약물의 농도가 흡수되는 속도를 고려하여 지수 함수로 계산
		return absorptionTime / Math.log(1 / (1 - absorptionRate));
	}
}
