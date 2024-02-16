package M2024_02;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// 배열의 합을 병렬로 계산하는 예시
public class ParallelProcessingExample {
    private static final ForkJoinPool pool = new ForkJoinPool();

    public int sumArray(int[] arr) {
        return pool.invoke(new SumArrayTask(arr, 0, arr.length));
    }

    private static class SumArrayTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start;
        private final int end;

        public SumArrayTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= 1000) { // 작은 배열은 직접 계산
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else { // 큰 배열은 재귀적으로 분할하여 병렬로 계산
                int mid = (start + end) / 2;
                SumArrayTask leftTask = new SumArrayTask(array, start, mid);
                SumArrayTask rightTask = new SumArrayTask(array, mid, end);
                leftTask.fork();
                int rightResult = rightTask.compute();
                int leftResult = leftTask.join();
                return leftResult + rightResult;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[1000000];
        Arrays.fill(array, 1); // 배열 초기화

        ParallelProcessingExample example = new ParallelProcessingExample();
        long startTime = System.currentTimeMillis();
        int sum = example.sumArray(array); // 병렬로 배열의 합 계산
        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}
