package M2024_01;

public class ExecutionTimeMeasurement {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); // 코드 실행 시작 시간 기록

        // 여기에 측정하고자 하는 코드를 작성

        long endTime = System.nanoTime(); // 코드 실행 종료 시간 기록

        long executionTime = endTime - startTime; // 실행 시간 계산 (나노초 단위)

        // 실행 시간 출력 (초 단위로 변환)
        System.out.println("코드 실행 시간: " + (double) executionTime / 1_000_000_000 + " 초");
    }
}
