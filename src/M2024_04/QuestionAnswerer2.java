package M2024_04;

import java.util.Random;
import java.util.Scanner;

public class QuestionAnswerer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 질문과 답변을 매핑한 배열
        String[] questions = {
            "날씨", "오늘 날씨가 어떤가요?",
            "일", "무슨 일 있으셨나요?",
            "계획", "어떤 계획을 가지고 계시나요?"
        };

        // 랜덤 객체 생성
        Random random = new Random();

        while (true) {
            // 사용자에게 질문 입력 받기
            System.out.print("질문을 입력하세요 (종료하려면 '종료'를 입력하세요): ");
            String userInput = scanner.nextLine();

            // 종료 조건 확인
            if (userInput.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 사용자 입력에 대한 답변 찾기
            String answer = findAnswer(userInput, questions);

            // 답변 출력
            System.out.println("답변: " + answer);
        }

        scanner.close();
    }

    // 사용자 입력에 대한 답변 찾는 메서드
    public static String findAnswer(String userInput, String[] questions) {
        // 사용자 입력과 질문과의 일치 확인
        for (int i = 0; i < questions.length; i += 2) {
            if (userInput.contains(questions[i])) {
                return questions[i + 1];
            }
        }
        // 일치하는 질문이 없을 경우 기본 답변 반환
        return "죄송합니다. 이해할 수 없는 질문입니다.";
    }
}

