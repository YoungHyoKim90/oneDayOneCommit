package M2024_01;

import java.util.Scanner;

public class D_0101DynamicCodeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("어떤 작업을 수행하시겠습니까? (A 또는 B)");
        String userInput = scanner.nextLine();
        
        // 사용자 입력에 따라 다른 작업 실행
        if (userInput.equalsIgnoreCase("A")) {
            System.out.println("A 작업을 실행합니다.");
        } else if (userInput.equalsIgnoreCase("B")) {
            System.out.println("B 작업을 실행합니다.");
        } else {
            System.out.println("올바른 선택이 아닙니다.");
        }
        
        scanner.close();
    }
}
