package M2024_01;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class D_0102_CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        future.thenApplyAsync(s -> s + " World")
                .thenAccept(System.out::println)
                .get(); // 결과 기다림
    }
}

