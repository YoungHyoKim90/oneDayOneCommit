package M2024_03;

import java.io.File;


public class FileSizeCalculator {
    public static void main(String[] args) {
        String filePath = "C:/Users/kised/Desktop/HSO10Patch/bms - 복사본/sample.txt"; // 파일 경로 지정

        
        File file = new File(filePath);

        
        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length(); // 파일 크기를 바이트 단위로 가져옴
            long fileSizeInKB = fileSizeInBytes / 1024; // 바이트를 킬로바이트(KB)로 변환
            long fileSizeInMB = fileSizeInKB / 1024; // 킬로바이트(KB)를 메가바이트(MB)로 변환

            
            System.out.println("File Size: " + fileSizeInBytes + " bytes");
            System.out.println("File Size: " + fileSizeInKB + " KB");
            System.out.println("File Size: " + fileSizeInMB + " MB");
        } else {
            System.out.println("File does not exist or is not a regular file.");
        }
    }
}

