package M2023_12;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("1부터 100 사이의 숫자를 맞혀보세요!");

        while (!hasGuessed) {
            System.out.print("숫자를 입력하세요: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("더 큰 숫자를 입력하세요.");
            } else if (userGuess > numberToGuess) {
                System.out.println("더 작은 숫자를 입력하세요.");
            } else {
                hasGuessed = true;
                System.out.println("축하합니다! " + attempts + "번 만에 숫자를 맞혔습니다!");
            }
        }

        scanner.close();
    }
}

