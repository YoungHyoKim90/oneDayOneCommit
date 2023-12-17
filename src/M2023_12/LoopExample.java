package M2023_12;

public class LoopExample {
    public static void main(String[] args) {
        // for 반복문
        for (int i = 0; i < 5; i++) {
            System.out.println("현재 숫자는 " + i + "입니다.");
        }

        // while 반복문
        int j = 0;
        while (j < 5) {
            System.out.println("현재 숫자는 " + j + "입니다.");
            j++;
        }

        // do-while 반복문
        int k = 0;
        do {
            System.out.println("현재 숫자는 " + k + "입니다.");
            k++;
        } while (k < 5);
    }
}

