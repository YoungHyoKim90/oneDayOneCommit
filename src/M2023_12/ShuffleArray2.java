package M2023_12;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // 섞을 배열

        shuffleArray(array);

        System.out.println("배열을 섞은 후:");
        System.out.println(Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}

