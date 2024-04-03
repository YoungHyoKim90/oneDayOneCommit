package M2024_04;

import java.util.Random;
import java.util.Scanner;

public class QuestionAnswerer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 질문 목록 정의
        String[] questions = {
            "오늘 날씨가 어떤가요?",
            "무슨 일 있으셨나요?",
            "어떤 계획을 가지고 계시나요?"
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

            // 랜덤한 답변 선택
            String randomAnswer = getRandomAnswer(questions, random);

            // 답변 출력
            System.out.println("답변: " + randomAnswer);
        }

        scanner.close();
    }

    // 질문 목록에서 랜덤하게 답변 선택하는 메서드
    public static String getRandomAnswer(String[] questions, Random random) {
        int index = random.nextInt(questions.length);
        return questions[index];
    }
}

