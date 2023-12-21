package M2023_12;

import java.util.Arrays;

public class ComplexJavaCode {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Grape", "Pineapple"};

        System.out.println("정렬 전:");
        printArray(fruits);

        // 문자열 배열 정렬
        Arrays.sort(fruits);

        System.out.println("정렬 후:");
        printArray(fruits);
    }

    // 문자열 배열 출력을 위한 메서드
    static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

