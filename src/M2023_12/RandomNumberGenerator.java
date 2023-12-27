package M2023_12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        System.out.println("1부터 45까지의 숫자 중에서 6개를 무작위로 뽑습니다:");

        while (numbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 숫자 생성
            numbers.add(randomNumber); // Set에 숫자 추가 (중복 방지)
        }

        System.out.println("뽑힌 숫자: " + numbers);
    }
}
