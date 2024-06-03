package M2024_06;

import java.util.Scanner;

public class AngleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 점의 x 좌표: ");
        double x1 = scanner.nextDouble();
        System.out.print("첫 번째 점의 y 좌표: ");
        double y1 = scanner.nextDouble();

        System.out.print("두 번째 점의 x 좌표: ");
        double x2 = scanner.nextDouble();
        System.out.print("두 번째 점의 y 좌표: ");
        double y2 = scanner.nextDouble();

        double angle = calculateAngle(x1, y1, x2, y2);
        System.out.printf("두 점 사이의 각도: %.2f도%n", angle);
    }

    private static double calculateAngle(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double angle = Math.atan2(dy, dx) * 180 / Math.PI;
        return angle;
    }
}

