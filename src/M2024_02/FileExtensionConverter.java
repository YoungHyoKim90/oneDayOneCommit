package M2024_02;

import java.io.File;
import java.util.Objects;

public class FileExtensionConverter {
    public static void main(String[] args) {
        // 변환할 디렉토리 경로와 원래 확장자, 바꿀 확장자 지정
        String directoryPath = "your_directory_path";
        String originalExtension = ".txt";
        String newExtension = ".csv";

        // 변환 작업 실행
        convertFileExtensions(directoryPath, originalExtension, newExtension);
    }

    private static void convertFileExtensions(String directoryPath, String originalExtension, String newExtension) {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("No files found in the directory.");
            return;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(originalExtension)) {
                String newName = file.getName().replace(originalExtension, newExtension);
                File newFile = new File(directoryPath + File.separator + newName);
                if (file.renameTo(newFile)) {
                    System.out.println("File " + file.getName() + " renamed to " + newName);
                } else {
                    System.out.println("Failed to rename file " + file.getName());
                }
            }
        }
    }
}

