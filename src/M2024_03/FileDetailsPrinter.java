package M2024_03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDetailsPrinter {
    public static void main(String[] args) {
        String folderPath = "C:/Users/kised/Desktop/HSO10Patch/bms - 복사본";

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                String fileName = file.getName();
                String extension = getFileExtension(fileName);
                Date lastModified = new Date(file.lastModified());

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedDate = dateFormat.format(lastModified);

                System.out.println("File Name: " + fileName);
                System.out.println("Extension: " + extension);
                System.out.println("Last Modified: " + formattedDate);
                System.out.println();
            }
        } else {
        	
            System.out.println("No files found in the specified directory.");
        }
    }

    // 파일의 확장자를 반환하는 메서드
    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex != -1 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex + 1);
        }
        
        return "";
    }
}

