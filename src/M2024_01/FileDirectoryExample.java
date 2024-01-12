package M2024_01;

import java.io.File;

public class FileDirectoryExample {

    public static void main(String[] args) {
        FileDirectoryExample example = new FileDirectoryExample();
        
        // 파일 생성 예시
        example.createFile("example.txt");
        
        // 디렉토리 생성 예시
        example.createDirectory("example_directory");
        
        // 파일 및 디렉토리 목록 조회 예시
        example.listFilesAndDirectories(".");
    }

    // 파일 생성 메서드
    public void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 디렉토리 생성 메서드
    public void createDirectory(String directoryName) {
        File directory = new File(directoryName);
        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getAbsolutePath());
        } else {
            System.out.println("Failed to create directory.");
        }
    }

    // 파일 및 디렉토리 목록 조회 메서드
    public void listFilesAndDirectories(String path) {
        File directory = new File(path);

        // 디렉토리 내의 파일과 디렉토리 목록 가져오기
        File[] filesAndDirs = directory.listFiles();

        if (filesAndDirs != null) {
            System.out.println("Files and Directories in " + path + ":");
            for (File fileOrDir : filesAndDirs) {
                System.out.println(fileOrDir.getName());
            }
        } else {
            System.out.println("Invalid path or no files/directories found.");
        }
    }
}
