package M2023_12;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("섞기 전 배열: " + Arrays.toString(array));

        shuffleArray(array);

        System.out.println("섞은 후 배열: " + Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        Random rnd = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);

            // 현재 위치의 원소와 무작위로 선택한 위치의 원소를 교환
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}

