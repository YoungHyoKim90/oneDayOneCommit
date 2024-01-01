package M2024_01;

import java.util.ArrayList;
import java.util.List;

public class D_0101DynamicDataExample {
    public static void main(String[] args) {
        List<String> dynamicList = new ArrayList<>();
        
        // 데이터 추가
        dynamicList.add("데이터1");
        dynamicList.add("데이터2");
        
        // 동적으로 데이터 처리
        for (String data : dynamicList) {
            System.out.println("처리 중: " + data);
        }
    }
}
