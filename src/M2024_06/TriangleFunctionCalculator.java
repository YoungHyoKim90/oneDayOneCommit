package M2024_06;

	import java.util.Scanner;

	public class TriangleFunctionCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("삼각 함수 값 (sin, cos, tan) 중 하나를 입력하세요: ");
	        String input = scanner.nextLine();

	        double value;
	        switch (input.toLowerCase()) {
	            case "sin":
	                System.out.print("사인 값을 입력하세요: ");
	                value = scanner.nextDouble();
	                calculateCosAndTan(value);
	                break;
	            case "cos":
	                System.out.print("코사인 값을 입력하세요: ");
	                value = scanner.nextDouble();
	                calculateSinAndTan(value);
	                break;
	            case "tan":
	                System.out.print("탄젠트 값을 입력하세요: ");
	                value = scanner.nextDouble();
	                calculateSinAndCos(value);
	                break;
	            default:
	                System.out.println("잘못된 입력입니다.");
	                return;
	        }
	    }

	    private static void calculateCosAndTan(double sin) {
	        double cos = Math.cos(sin);
	        double tan = Math.tan(sin);
	        System.out.printf("사인: %.4f, 코사인: %.4f, 탄젠트: %.4f%n", sin, cos, tan);
	    }

	    private static void calculateSinAndTan(double cos) {
	        double sin = Math.sin(cos);
	        double tan = Math.tan(cos);
	        System.out.printf("사인: %.4f, 코사인: %.4f, 탄젠트: %.4f%n", sin, cos, tan);
	    }

	    private static void calculateSinAndCos(double tan) {
	        double sin = Math.sin(tan);
	        double cos = Math.cos(tan);
            System.out.print("탄젠트 값 계산 결과입니다. ");
	        System.out.printf("사인: %.4f, 코사인: %.4f, 탄젠트: %.4f%n", sin, cos, tan);
	    }
	}
