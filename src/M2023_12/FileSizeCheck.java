package M2023_12;

import java.io.File;

public class FileSizeCheck {
    public static void main(String[] args) {
        String filePath = "파일 경로"; // 파일 경로 지정

        File file = new File(filePath);

        if (file.exists()) {
            long bytes = file.length(); // 파일 크기(바이트)

            // 파일 크기를 다양한 단위로 변환하여 출력
            System.out.println("파일 크기 (바이트): " + bytes + " bytes");
            System.out.println("파일 크기 (킬로바이트): " + (bytes / 1024) + " KB");
            System.out.println("파일 크기 (메가바이트): " + (bytes / (1024 * 1024)) + " MB");
            System.out.println("파일 크기 (기가바이트): " + (bytes / (1024 * 1024 * 1024)) + " GB");
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}

