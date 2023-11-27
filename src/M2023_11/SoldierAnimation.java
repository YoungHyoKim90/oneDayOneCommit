package M2023_11;

public class SoldierAnimation {
    public static void main(String[] args) {
        // 10 프레임 동안 칼을 휘두르는 모습 출력
        for (int frame = 1; frame <= 10; frame++) {
            printSoldierWithSword(frame);
            try {
                Thread.sleep(200); // 0.2초마다 한 프레임씩 출력
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 칼을 휘두르는 병사 모습 출력
    private static void printSoldierWithSword(int frame) {
        System.out.println("Frame: " + frame);
        switch (frame) {
            case 1:
                System.out.println("     \\");
                System.out.println("      \\");
                System.out.println("       \\");
                System.out.println("        0");
                System.out.println("       /|\\");
                System.out.println("       / \\");
                break;
            case 2:
                System.out.println("    \\");
                System.out.println("     \\");
                System.out.println("      \\");
                System.out.println("       0");
                System.out.println("      /|\\");
                System.out.println("      / \\");
                break;
            case 3:
                // 추가 프레임에 따른 병사 모습 변경
                // 여기서부터 원하는 만큼 프레임 추가 및 변경 가능
                System.out.println("   \\");
                System.out.println("    \\");
                System.out.println("     0");
                System.out.println("    /|\\");
                System.out.println("    / \\");
                break;
            // 추가적인 프레임들은 필요에 따라 계속해서 추가할 수 있습니다.
            default:
                // 디폴트 설정
                System.out.println("    0");
                System.out.println("   /|\\");
                System.out.println("   / \\");
                break;
        }
        System.out.println("---------------");
    }
}
