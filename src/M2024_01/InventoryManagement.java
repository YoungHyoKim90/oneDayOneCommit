package M2024_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagement {
    private Map<String, Integer> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
        // 초기 재고 설정
        inventory.put("사과", 50);
        inventory.put("바나나", 30);
        inventory.put("우유", 20);
    }

    // 재고 상태 출력 메서드
    public void displayInventory() {
        System.out.println("현재 재고 상태:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "개");
        }
    }

    // 제품 추가 메서드
    public void addProduct(String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            int currentQuantity = inventory.get(productName);
            inventory.put(productName, currentQuantity + quantity);
            System.out.println(productName + " " + quantity + "개가 재고에 추가되었습니다.");
        } else {
            inventory.put(productName, quantity);
            System.out.println(productName + " " + quantity + "개가 신규로 재고에 추가되었습니다.");
        }
    }

    // 제품 판매 메서드
    public void sellProduct(String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            int currentQuantity = inventory.get(productName);
            if (currentQuantity >= quantity) {
                inventory.put(productName, currentQuantity - quantity);
                System.out.println(productName + " " + quantity + "개가 판매되었습니다.");
            } else {
                System.out.println("재고가 부족하여 판매할 수 없습니다.");
            }
        } else {
            System.out.println("해당 제품이 재고에 없습니다.");
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventoryManager = new InventoryManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("매장 재고 관리 프로그램을 시작합니다.");

        while (true) {
            System.out.println("\n1. 재고 상태 출력");
            System.out.println("2. 제품 추가");
            System.out.println("3. 제품 판매");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inventoryManager.displayInventory();
                    break;
                case 2:
                    System.out.print("추가할 제품명을 입력하세요: ");
                    String addProductName = scanner.next();
                    System.out.print("추가할 수량을 입력하세요: ");
                    int addQuantity = scanner.nextInt();
                    inventoryManager.addProduct(addProductName, addQuantity);
                    break;
                case 3:
                    System.out.print("판매할 제품명을 입력하세요: ");
                    String sellProductName = scanner.next();
                    System.out.print("판매할 수량을 입력하세요: ");
                    int sellQuantity = scanner.nextInt();
                    inventoryManager.sellProduct(sellProductName, sellQuantity);
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
}
