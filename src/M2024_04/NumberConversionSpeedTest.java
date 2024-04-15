package M2024_04;

public class NumberConversionSpeedTest {

    public static void main(String[] args) {
        final int MAX_NUM = 1_000_000;

        long startTime, endTime;
        double duration;

        // 10진수 -> 2진수 변환 속도 테스트
        startTime = System.nanoTime();
        for (int i = 1; i <= MAX_NUM; i++) {
            Integer.toBinaryString(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;  // ns to ms
        System.out.println("10진수 -> 2진수 변환 시간: " + duration + "ms");

        // 10진수 -> 16진수 변환 속도 테스트
        startTime = System.nanoTime();
        for (int i = 1; i <= MAX_NUM; i++) {
            Integer.toHexString(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;  // ns to ms
        System.out.println("10진수 -> 16진수 변환 시간: " + duration + "ms");
    }
}
