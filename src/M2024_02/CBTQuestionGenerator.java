package M2024_02;

import java.util.*;

public class CBTQuestionGenerator {
    public static void main(String[] args) {
        // 문제와 답안 리스트 생성
        Map<String, String> questionsAndAnswers = new HashMap<>();
        questionsAndAnswers.put("What is the capital of France?", "Paris");
        questionsAndAnswers.put("What is the square root of 16?", "4");
        questionsAndAnswers.put("Who wrote 'Romeo and Juliet'?", "Shakespeare");
        questionsAndAnswers.put("What is the chemical symbol for water?", "H2O");

        // 랜덤 문제 출제
        generateRandomQuestion(questionsAndAnswers);
    }

    
    public static void generateRandomQuestion(Map<String, String> questionsAndAnswers) {
        // 문제 리스트를 배열로 변환
        List<String> questions = new ArrayList<>(questionsAndAnswers.keySet());

        // 랜덤으로 문제 선택
        Random random = new Random();
        String randomQuestion = questions.get(random.nextInt(questions.size()));

        // 선택된 문제 출력
        System.out.println("Question: " + randomQuestion);

        // 해당 문제의 정답 출력
        String correctAnswer = questionsAndAnswers.get(randomQuestion);
        System.out.println("Enter your answer:");

        // 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();

        // 정답 확인
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer. The correct answer is: " + correctAnswer);
        }
    }
}
