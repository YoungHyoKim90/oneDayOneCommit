package M2024_01;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Java 7 이전에는 리소스를 닫는 코드를 별도로 작성해야 했습니다.
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Java 7부터는 try-with-resources를 사용하여 간결하게 작성할 수 있습니다.
        try (BufferedReader newReader = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println(newReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

