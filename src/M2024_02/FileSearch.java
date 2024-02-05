package M2024_02;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
    public static void main(String[] args) {
        try {
            String directoryPath = "your_directory_path";
            String searchKeyword = "your_search_keyword";

            List<Path> foundFiles = searchFiles(directoryPath, searchKeyword);

            System.out.println("Files containing '" + searchKeyword + "':");
            for (Path path : foundFiles) {
                System.out.println(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        
    }

    private static List<Path> searchFiles(String directoryPath, String searchKeyword) throws IOException {
        List<Path> foundFiles = new ArrayList<>();

        Path directory = Paths.get(directoryPath);
        if (!Files.exists(directory) || !Files.isDirectory(directory)) {
            System.out.println("Invalid directory path.");
            return foundFiles;
        }

        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                try {
                    if (Files.lines(file).anyMatch(line -> line.contains(searchKeyword))) {
                        foundFiles.add(file);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return FileVisitResult.CONTINUE;
            }
        });

        return foundFiles;
    }
}
