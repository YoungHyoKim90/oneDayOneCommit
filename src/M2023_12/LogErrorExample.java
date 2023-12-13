package M2023_12;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogErrorExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("ErrorLog");
        FileHandler fh;

        try {
            // 파일 핸들러 초기화
            fh = new FileHandler("error_log.txt", true); // 로그 파일 이름 및 append 옵션
            logger.addHandler(fh);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // 오류 발생 시 로그 작성
            try {
                // 파일 실행 코드
                // ...

                // 만약 오류가 발생한다면
                throw new IOException("파일 실행 중 오류 발생");
            } catch (IOException e) {
                // 오류가 발생했을 때 로그 작성
                logger.severe("파일 실행 중 오류 발생: " + e.getMessage());
            }

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

