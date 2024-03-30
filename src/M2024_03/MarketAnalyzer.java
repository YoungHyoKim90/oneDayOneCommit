package M2024_03;

import java.util.Scanner;

public class MarketAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수요와 공급을 입력하세요.");
        System.out.print("수요: ");
        int demand = scanner.nextInt();

        System.out.print("공급: ");
        int supply = scanner.nextInt();

        MarketStatus status = analyzeMarket(demand, supply);
        System.out.println("현재 시장 상태: " + status);
        
        scanner.close();
    }

    public static MarketStatus analyzeMarket(int demand, int supply) {
        if (demand == supply) {
            return MarketStatus.BALANCED;
        } else if (demand > supply) {
            return MarketStatus.UNDER_SUPPLY;
        } else {
            return MarketStatus.OVER_SUPPLY;
        }
    }
}

enum MarketStatus {
    BALANCED("균형"),
    UNDER_SUPPLY("수요부족"),
    OVER_SUPPLY("과잉공급");

    private final String status;

    MarketStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}

