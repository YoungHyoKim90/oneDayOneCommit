package M2023_11;

public class RunningAnimation {
	public static void main(String[] args) {
		// 계속해서 반복하여 달리기 모션 출력
		while (true) {
			for (int i = 0; i < 8; i++) {
				printRunningMan(i);
				try {
					Thread.sleep(200); // 0.2초마다 한 프레임씩 출력
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 달리기 모션을 출력하는 함수
	private static void printRunningMan(int frame) {
		System.out.println("Frame: " + frame);
		switch (frame % 8) {
		case 0:
			System.out.println("    O---");
			System.out.println("   / | \\");
			System.out.println("     |");
			break;
		case 1:
			System.out.println("   \\ O---");
			System.out.println("     / | \\");
			System.out.println("       |");
			break;
		case 2:
			System.out.println("     O---");
			System.out.println("   / | \\");
			System.out.println("     |");
			break;
		case 3:
			System.out.println("   / O---");
			System.out.println("     / | \\");
			System.out.println("       |");
			break;
		case 4:
			System.out.println("    O---");
			System.out.println("   / | \\");
			System.out.println("     |");
			break;
		case 5:
			System.out.println("   \\ O---");
			System.out.println("     / | \\");
			System.out.println("       |");
			break;
		case 6:
			System.out.println("     O---");
			System.out.println("   / | \\");
			System.out.println("     |");
			break;
		case 7:
			System.out.println("   / O---");
			System.out.println("     / | \\");
			System.out.println("       |");
			break;
		default:
			break;
		}
		System.out.println("------");
	}
}
