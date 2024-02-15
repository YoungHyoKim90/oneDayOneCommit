package M2024_02;

public class SingletonMain {
    public static void main(String[] args) {
        // 싱글톤 인스턴스를 가져와서 작업 수행
        Singleton singleton = Singleton.getInstance();
        singleton.performTask();
    }
}