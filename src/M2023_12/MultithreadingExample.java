package M2023_12;

public class MultithreadingExample {
    public static void main(String[] args) {
        // 스레드 객체 생성 및 실행
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();
    }
}

// Runnable 인터페이스 구현
class MyRunnable implements Runnable {
    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);

            try {
                // 일시 정지하여 다른 스레드에게 CPU 양보
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("스레드가 중단되었습니다: " + e.getMessage());
            }
        }
    }
}
