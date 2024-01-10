package M2024_01;

import java.util.function.Supplier;

public class LambdaExamples3 {
    public static void main(String[] args) {
        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println("Random number: " + getRandomNumber.get());
    }
}

