package M2024_01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExamples2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> printNumber = (Integer number) -> System.out.println(number);
        numbers.forEach(printNumber);
    }
}

