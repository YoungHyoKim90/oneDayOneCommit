package M2024_01;

import java.util.Arrays;
import java.util.List;

public class D_0103_LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 람다식으로 제곱 연산
        numbers.forEach(n -> System.out.print(n * n + " "));
        // 출력: 1 4 9 16 25
    }
}

