package M2024_07;
import java.util.Scanner;

public class TestVsCode {


        public static void main(String[] args) {
            System.out.println("안녕 브이에스 코드야");
    
            Scanner scan = new Scanner(System.in);
            int intValue = 0;
    
            while (true) {
                try {
                    System.out.println("값을 입력하세요");
                    intValue = scan.nextInt();
    
                    if (intValue <= 0) {
                        System.out.println("양수를 입력하세요.");
                        continue;
                    }
    
                    System.out.println(intValue + " 을 입력하였습니다.");
                    break;
                } catch (Exception e) {
                    System.out.println("유효한 숫자를 입력하세요.");
                    scan.next(); // 입력 버퍼 초기화
                }
            }
    
            for (int i = 0; i < intValue; i++) {
                System.out.println(i + " 후아");
            }
    
            System.out.println("입력한 숫자만큼 별을 출력합니다.");
            for (int i = 0; i < intValue; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            scan.close();
        }
    }
    
