package M2024_01;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단위 변환 프로그램을 시작합니다.");

        while (true) {
            System.out.println("\n1. 센티미터를 인치로 변환");
            System.out.println("2. 인치를 센티미터로 변환");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 변환을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
            
                case 1:
                    convertCmToInch();
                    break;
                    
                case 2:
                    convertInchToCm();
                    break;
                    
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }

    private static void convertCmToInch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("센티미터(cm) 값을 입력하세요: ");
        double cmValue = scanner.nextDouble();
        double inchValue = cmToInch(cmValue);
        System.out.println(cmValue + " 센티미터는 " + inchValue + " 인치입니다.");
        scanner.close();
    }

    private static void convertInchToCm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인치(inch) 값을 입력하세요: ");
        double inchValue = scanner.nextDouble();
        double cmValue = inchToCm(inchValue);
        System.out.println(inchValue + " 인치는 " + cmValue + " 센티미터입니다.");        
        scanner.close();
    }

    private static double cmToInch(double cmValue) {
        return cmValue / 2.54;
    }

    private static double inchToCm(double inchValue) {
        return inchValue * 2.54;
    }
}

