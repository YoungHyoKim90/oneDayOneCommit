package M2024_01;

public class ExecutionTimeLogger {
    private static long startTime;

    public static void startLogging() {
        startTime = System.nanoTime();
        System.out.println("Logging started.");
    }

    public static void stopLogging(String className) {
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        // 실행 시간을 초 단위로 변환
        double executionTimeInSeconds = (double) executionTime / 1_000_000_000;

        System.out.println("Class: " + className);
        System.out.println("Execution Time: " + executionTimeInSeconds + " seconds");
        System.out.println("Logging stopped.");
    }
}

