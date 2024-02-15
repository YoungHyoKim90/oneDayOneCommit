package M2024_02;

public class Singleton {
    // 인스턴스를 보관하는 private 정적 변수
    private static class SingletonHolder {
        // 싱글톤 인스턴스
        private static final Singleton INSTANCE = new Singleton();
    }

    // private 생성자로 외부에서 직접 인스턴스를 생성하는 것을 방지
    private Singleton() {
    }

    // 싱글톤 인스턴스를 반환하는 정적 메서드
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 싱글톤의 기능을 수행하는 메서드
    public void performTask() {
        System.out.println("Singleton instance performing task.");
    }
}



