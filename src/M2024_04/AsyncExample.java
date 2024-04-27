package M2024_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncExample {

	
	public static void main(String[] args) {
		// ExecutorService 생성
		ExecutorService executor = Executors.newSingleThreadExecutor();

		
		// Callable 객체 생성 및 비동기 실행
		Future<String> future = executor.submit(() -> {
			try {
				// 2초 대기
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Async data from server!";
		});

		
		// 작업이 완료될 때까지 대기
		while (!future.isDone()) {
			try {
				Thread.sleep(500); // 0.5초 대기
				System.out.println("Waiting for async task to complete...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			// 작업 완료 후 결과 가져오기
			String result = future.get();
			System.out.println("Async Task Result: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ExecutorService 종료
		executor.shutdown();
	}
}
