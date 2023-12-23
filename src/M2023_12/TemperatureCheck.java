package M2023_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureCheck {
    public static void main(String[] args) {
        try {
            // 명령어 실행
            Process process = Runtime.getRuntime().exec("sensors");

            // 명령어 실행 결과 읽기
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Core")) { // CPU 코어 온도 정보 찾기
                    System.out.println(line);
                }
            }

            // 프로세스 종료 및 자원 해제
            reader.close();
            process.destroy();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
