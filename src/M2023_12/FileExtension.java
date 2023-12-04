package M2023_12;

public class FileExtension {
    public static void main(String[] args) {
        String fileName = "example.txt"; // 여기에 파일 이름 입력

        String fileExtension = getFileExtension(fileName);

        if (fileExtension != null) {
            System.out.println("파일 확장자: " + fileExtension);
        } else {
            System.out.println("확장자가 없는 파일입니다.");
        }
    }

    public static String getFileExtension(String fileName) {
        int lastIndex = fileName.lastIndexOf(".");
        if (lastIndex == -1 || lastIndex == fileName.length() - 1) {
            return null; // 확장자가 없거나 마지막 문자가 . 인 경우
        }

        return fileName.substring(lastIndex + 1);
    }
}

