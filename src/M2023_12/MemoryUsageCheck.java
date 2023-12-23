package M2023_12;

public class MemoryUsageCheck {
    public static void main(String[] args) {
        // 런타임 객체 생성
        Runtime runtime = Runtime.getRuntime();

        // 전체 사용 가능한 메모리
        long totalMemory = runtime.totalMemory();
        System.out.println("전체 메모리: " + totalMemory / (1024 * 1024) + "MB");

        // 사용 중인 메모리
        long usedMemory = totalMemory - runtime.freeMemory();
        System.out.println("사용 중인 메모리: " + usedMemory / (1024 * 1024) + "MB");

        // 사용 가능한 메모리
        long freeMemory = runtime.freeMemory();
        System.out.println("사용 가능한 메모리: " + freeMemory / (1024 * 1024) + "MB");
    }
}

