package M2024_02;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Car car = new Car.Builder("Toyota", "Camry")
                    .year(2020)
                    .build();
    }
}