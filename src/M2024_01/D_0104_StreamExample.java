package M2024_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D_0104_StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 짝수만 필터링하여 새로운 리스트로 반환
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println(evenNumbers); // 출력: [2, 4]
    }
}

