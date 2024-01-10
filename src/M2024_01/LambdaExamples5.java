package M2024_01;

import java.util.function.BinaryOperator;

public class LambdaExamples5 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (Integer x, Integer y) -> x + y;
        System.out.println("Sum of 3 and 7: " + sum.apply(3, 7));
    }
}

