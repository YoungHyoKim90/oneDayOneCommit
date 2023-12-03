package M2023_12;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 정수를 저장하는 ArrayList 생성
        ArrayList<Integer> numbers = new ArrayList<>();

        // 데이터 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 데이터 조회 및 출력
        System.out.println("ArrayList에 저장된 데이터:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // 특정 데이터 제거
        numbers.remove(1); // 인덱스 1의 데이터 제거

        // 수정된 데이터 조회 및 출력
        System.out.println("수정된 ArrayList에 저장된 데이터:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

