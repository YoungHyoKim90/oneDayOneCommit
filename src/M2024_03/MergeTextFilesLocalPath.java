package M2024_03;

import java.io.*;
import java.util.*;

public class MergeTextFilesLocalPath {
    public static void main(String[] args) {
        String folderPath = "LocalPath";
        
        try {
            File folder = new File(folderPath);
            File[] files = folder.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".txt");
                }
            });
            
            Arrays.sort(files);
            
            String mergedFileName = folderPath + "/통합파일.txt";

            FileWriter mergedFileWriter = new FileWriter(mergedFileName);

            for (File file : files) {
                // 파일명을 구분하기 위해 파일명 작성
                mergedFileWriter.write("===== " + file.getName() + " =====\n");

                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;

                while ((line = reader.readLine()) != null) {
                    mergedFileWriter.write(line);
                    mergedFileWriter.write("\n"); // 각 줄을 쓸 때마다 줄 바꿈 문자를 추가.
                }
                mergedFileWriter.write("\n");
                reader.close();
            }
            mergedFileWriter.close();

            System.out.println("텍스트 파일들이 성공적으로 통합되어 통합파일.txt로 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

