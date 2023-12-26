package M2023_12;

import java.util.Random;
import java.util.Scanner;

public class TypingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"apple", "banana", "orange", "grape", "strawberry", "melon", "pineapple"};
        int score = 0;

        System.out.println("타자 연습 게임을 시작합니다. 종료하려면 'exit'을 입력하세요.");

        while (true) {
            String word = words[random.nextInt(words.length)];
            System.out.println("단어를 입력하세요: " + word);

            long startTime = System.currentTimeMillis();
            String userInput = scanner.nextLine();
            long endTime = System.currentTimeMillis();

            if (userInput.equals("exit")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            if (userInput.equals(word)) {
                long timeTaken = endTime - startTime;
                double timeInSeconds = timeTaken / 1000.0;
                score += (int) (100 / timeInSeconds);
                System.out.println("정확합니다! 시간: " + timeInSeconds + "초, 점수: " + score);
            } else {
                System.out.println("올바르지 않습니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
