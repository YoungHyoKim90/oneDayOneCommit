package M2024_03;

import java.io.File;
import java.util.Scanner;

public class FolderManipulator {
    public static void main(String[] args) {
        String folderPath = "C:/Users/kised/Desktop/HSO10Patch/bms - 복사본"; // 폴더 경로 지정

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] filesAndFolders = folder.listFiles();

            if (filesAndFolders != null && filesAndFolders.length > 0) {
                int count = 1;
                for (File fileOrFolder : filesAndFolders) {
                    System.out.println(count + ". " + fileOrFolder.getName());
                    count++;
                }
//
                
                
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number of the file or folder you want to interact with:");
                int choice = scanner.nextInt();

                
                if (choice >= 1 && choice <= filesAndFolders.length) {
                    File selectedFileOrFolder = filesAndFolders[choice - 1];
                    System.out.println("Selected item: " + selectedFileOrFolder.getName());

                    System.out.println("1. Delete");
                    System.out.println("2. Read (Print content)");

                    int actionChoice = scanner.nextInt();

                    if (actionChoice == 1) {
                        if (selectedFileOrFolder.delete()) {
                            System.out.println("File or folder deleted successfully.");
                        } else {
                            System.out.println("Failed to delete file or folder.");
                        }
                    } else if (actionChoice == 2) {
                        // TODO: Implement read content functionality for files
                        System.out.println("Read content functionality will be implemented soon.");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + filesAndFolders.length);
                }
            } else {
                System.out.println("Folder is empty.");
            }
        } else {
            System.out.println("Folder does not exist or is not a directory.");
        }
    }
}

