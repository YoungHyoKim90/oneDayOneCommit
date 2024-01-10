package M2024_01;

import java.util.function.UnaryOperator;

public class LambdaExamples4 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = (Integer x) -> x * x;
        System.out.println("Square of 5: " + square.apply(5));
    }
}

