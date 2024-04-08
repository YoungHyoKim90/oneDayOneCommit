package M2023_11;

import java.util.Scanner;

public class D_1107CodingTestSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a + b;

		System.out.println(a + " + " + b + " = " + c);
		System.out.println(a + " + " + b + " = " + (a + b));
		
		int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
        
//        String c = String.format("%d + %d = %d", a, b, a+b);
        System.out.println(c);
        System.out.println(String.format("%d + %d = %d", a, b, a+b));
        sc.close();
	}

}
