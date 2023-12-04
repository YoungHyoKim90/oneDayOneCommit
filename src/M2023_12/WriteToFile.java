package M2023_12;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String fileName = "파일경로/새파일.txt"; // 생성할 파일 경로와 이름 입력

        try {
            FileWriter writer = new FileWriter(fileName);

            // 파일에 쓸 데이터
            String data = "이것은 파일에 쓰는 예시 데이터입니다.";

            // 파일에 데이터 쓰기
            writer.write(data);

            // FileWriter 닫기
            writer.close();

            System.out.println("파일이 성공적으로 생성되고 데이터가 쓰였습니다.");
        } catch (IOException e) {
            System.out.println("파일을 생성하거나 데이터를 쓰는 도중에 오류가 발생했습니다: " + e.getMessage());
        }
    }
}

