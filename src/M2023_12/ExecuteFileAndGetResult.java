package M2023_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteFileAndGetResult {
    public static void main(String[] args) {
        String command = "파일_실행_커맨드"; // 실행할 파일의 커맨드 혹은 명령어

        try {
            // 파일 실행
            Process process = Runtime.getRuntime().exec(command);

            // 실행 결과 가져오기
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            System.out.println("파일 실행 결과:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 프로세스 종료
            process.waitFor();
            process.destroy();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

