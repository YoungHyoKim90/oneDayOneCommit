package M2024_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClassFileDecompiler {
    public static void main(String[] args) {
        String classFilePath = "path/to/YourClass.class"; // 디컴파일할 클래스 파일 경로
        decompileClassFile(classFilePath);
    }

    
    public static void decompileClassFile(String classFilePath) {
        try {
            Process process = Runtime.getRuntime().exec("java -jar cfr.jar " + classFilePath); // CFR 실행
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // 디컴파일된 Java 코드 출력
            }

            
            process.waitFor(); // 프로세스 완료 대기
            inputStream.close();
            reader.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
