package M2024_02;

//두 정수 배열의 합 구하기
public class AlgorithmOptimizationExample {
 public int[] sumArrays(int[] arr1, int[] arr2) {
     int n = arr1.length;
     int[] result = new int[n];
     for (int i = 0; i < n; i++) {
         result[i] = arr1[i] + arr2[i]; // 배열 합 구하기
     }
     return result;
 }
}
