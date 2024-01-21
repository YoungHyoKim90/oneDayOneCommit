package M2024_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KioskSimulation {
    private Map<Integer, String> menu;
    private Map<Integer, Double> prices;

    public KioskSimulation() {
        menu = new HashMap<>();
        prices = new HashMap<>();

        // 음료수 메뉴 설정
        menu.put(1, "콜라");
        menu.put(2, "오렌지 주스");
        menu.put(3, "커피");

        // 음료수 가격 설정
        prices.put(1, 2.50);
        prices.put(2, 3.00);
        prices.put(3, 2.00);
    }

    // 메뉴 출력 메서드
    public void displayMenu() {
        System.out.println("음료수 메뉴:");
        for (Map.Entry<Integer, String> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue() + " - $" + prices.get(entry.getKey()));
        }
    }

    // 주문 및 결제 메서드
    public void placeOrder(int selection) {
        if (menu.containsKey(selection)) {
            String selectedDrink = menu.get(selection);
            double price = prices.get(selection);

            System.out.println("주문하신 " + selectedDrink + "을(를) 선택하셨습니다.");
            System.out.println("총 결제 금액: $" + price);

            // 여기에서 결제 로직을 추가할 수 있습니다.

            System.out.println("결제가 완료되었습니다. 감사합니다!");
        } else {
            System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
        }
    }

    public static void main(String[] args) {
        KioskSimulation kiosk = new KioskSimulation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("음료수 주문을 위한 키오스크를 시작합니다.");

        while (true) {
            kiosk.displayMenu();
            System.out.print("음료수를 선택하세요 (종료하려면 0 입력): ");
            int selection = scanner.nextInt();

            if (selection == 0) {
                System.out.println("키오스크를 종료합니다.");
                break;
            }

            kiosk.placeOrder(selection);
        }

        scanner.close();
    }
}

