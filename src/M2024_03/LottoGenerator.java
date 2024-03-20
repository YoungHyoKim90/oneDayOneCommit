package M2024_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGenerator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 46; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println("로또 번호를 추첨합니다.");
        System.out.print("추첨된 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
