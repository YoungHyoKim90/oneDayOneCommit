package M2023_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindLinesInFile {
    public static void main(String[] args) {
        String filePath = "파일_경로.txt"; // 파일 경로 설정
        String searchKeyword = "찾을_문자열"; // 찾을 문자열 설정

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            System.out.println("파일에서 '" + searchKeyword + "'를 포함하는 라인:");

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchKeyword)) {
                    System.out.println(line);
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
