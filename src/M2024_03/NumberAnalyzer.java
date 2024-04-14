package M2024_03;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 숫자들을 입력받음
        System.out.println("숫자들을 입력하세요 (공백으로 구분): ");
        String input = scanner.nextLine();

        // 입력된 숫자들을 공백을 기준으로 분할하여 문자열 배열로 저장
        String[] numbersStr = input.split(" ");

        // 숫자들의 합과 개수 초기화
        int sum = 0;
        int count = 0;

        // 문자열 배열을 순회하며 각 숫자를 정수로 변환하여 합을 계산
        for (String numStr : numbersStr) {
            try {
                int num = Integer.parseInt(numStr);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("올바른 숫자 형식이 아닙니다: " + numStr);
            }
        }

        // 입력된 숫자들의 평균 계산
        double average = (double) sum / count;

        // 결과 출력
        System.out.println("입력된 숫자들의 평균: " + average);
        scanner.close();
    }
}

