package M2023_12;

import java.io.File;

public class FileInfoExample {
    public static void main(String[] args) {
        String filePath = "파일_경로_여기에_입력";

        File file = new File(filePath);

        if (file.exists()) {
            // 파일명 출력
            System.out.println("파일명: " + file.getName());

            // 파일 크기 출력 (바이트 단위)
            long fileSizeInBytes = file.length();
            System.out.println("파일 크기: " + fileSizeInBytes + " 바이트");

            // 파일 확장자 출력
            String fileName = file.getName();
            if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
                String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
                System.out.println("파일 확장자: " + fileExtension);
            } else {
                System.out.println("확장자를 찾을 수 없습니다.");
            }
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}

