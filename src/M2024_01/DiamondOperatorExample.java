package M2024_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondOperatorExample {
    public static void main(String[] args) {
        // Java 7 이전에는 제네릭 타입을 다음과 같이 명시해야 했습니다.
        List<String> oldList = new ArrayList<String>();
        Map<Integer, String> oldMap = new HashMap<Integer, String>();

        // Java 7부터는 다이아몬드 연산자를 사용하여 더 간결하게 작성할 수 있습니다.
        List<String> newList = new ArrayList<>();
        Map<Integer, String> newMap = new HashMap<>();
    }
}


