package M2024_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinancialStatementAnalyzer {

	public static void main(String[] args) {
		// 재무제표 파일 경로
		String filePath = "financial_statement.txt";

		try {
			// 재무제표 파일을 읽기 위한 BufferedReader 생성
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			// 손익계산서 분석
			analyzeIncomeStatement(reader);

			// 재무상태표 분석
			analyzeBalanceSheet(reader);

			// 현금흐름표 분석
			analyzeCashFlowStatement(reader);

			// BufferedReader 닫기
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 손익계산서 분석 메서드
	private static void analyzeIncomeStatement(BufferedReader reader) throws IOException {
		System.out.println("===== 손익계산서 분석 =====");

		// 손익계산서 항목별 수익 및 비용 추적 변수
		double totalRevenue = 0.0; // 총수익
		double totalCost = 0.0; // 총비용

		// 손익계산서 파일을 한 줄씩 읽어오며 분석
		String line;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(","); // 예시: "매출,10000" 형태로 되어 있다고 가정

			// 손익계산서 항목과 금액 추출
			String item = parts[0];
			double amount = Double.parseDouble(parts[1]);

			// 손익계산서 항목에 따라 수익 또는 비용으로 분류하여 총수익 또는 총비용에 더함
			if (item.equals("매출") || item.equals("수익")) {
				totalRevenue += amount;
			} else {
				totalCost += amount;
			}
		}

		// 손익계산서 분석 결과 출력
		double netIncome = totalRevenue - totalCost; // 순이익 계산
		System.out.println("총수익: " + totalRevenue);
		System.out.println("총비용: " + totalCost);
		System.out.println("순이익: " + netIncome);

		// 이익 여부 판단
		if (netIncome > 0) {
			System.out.println("이익 발생!");
		} else if (netIncome < 0) {
			System.out.println("손실 발생!");
		} else {
			System.out.println("손익분기점 도달: 수익과 비용이 같음");
		}
	}

	// 재무상태표 분석 메서드
	private static void analyzeBalanceSheet(BufferedReader reader) throws IOException {
		System.out.println("===== 재무상태표 분석 =====");
		// 재무상태표 분석 로직 구현
	}

	// 현금흐름표 분석 메서드
	private static void analyzeCashFlowStatement(BufferedReader reader) throws IOException {
		System.out.println("===== 현금흐름표 분석 =====");
		// 현금흐름표 분석 로직 구현
	}
}
