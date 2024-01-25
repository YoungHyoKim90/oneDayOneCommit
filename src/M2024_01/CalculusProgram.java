package M2024_01;

import java.util.Scanner;

interface MathFunction {
    double evaluate(double x);
}

class PolynomialFunction implements MathFunction {
    private double[] coefficients;

    public PolynomialFunction(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }
}

class Calculus {
    public static double differentiate(MathFunction function, double x, double epsilon) {
        double h = epsilon;
        double derivative = (function.evaluate(x + h) - function.evaluate(x)) / h;
        return derivative;
    }

    public static double integrate(MathFunction function, double a, double b, int numIntervals) {
        double deltaX = (b - a) / numIntervals;
        double sum = 0;

        for (int i = 0; i < numIntervals; i++) {
            double x1 = a + i * deltaX;
            double x2 = x1 + deltaX;
            sum += 0.5 * (function.evaluate(x1) + function.evaluate(x2)) * deltaX;
        }

        return sum;
    }
}

public class CalculusProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("미적분 프로그램을 시작합니다.");

        System.out.print("다항식의 차수를 입력하세요: ");
        int degree = scanner.nextInt();

        double[] coefficients = new double[degree + 1];

        for (int i = 0; i <= degree; i++) {
            System.out.print("x^" + i + " 계수를 입력하세요: ");
            coefficients[i] = scanner.nextDouble();
        }

        MathFunction polynomialFunction = new PolynomialFunction(coefficients);

        System.out.print("미분을 수행할 x 값 입력: ");
        double xForDifferentiation = scanner.nextDouble();
        double derivative = Calculus.differentiate(polynomialFunction, xForDifferentiation, 0.0001);
        System.out.println("미분 결과: " + derivative);

        System.out.print("적분을 수행할 구간의 시작값 입력: ");
        double startInterval = scanner.nextDouble();
        System.out.print("적분을 수행할 구간의 끝값 입력: ");
        double endInterval = scanner.nextDouble();
        System.out.print("구간을 나눌 간격의 개수 입력: ");
        int numIntervals = scanner.nextInt();
        double integral = Calculus.integrate(polynomialFunction, startInterval, endInterval, numIntervals);
        System.out.println("적분 결과: " + integral);

        scanner.close();
    }
}

