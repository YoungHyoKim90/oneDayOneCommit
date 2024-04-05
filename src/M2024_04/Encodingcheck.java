package M2024_04;

import java.nio.charset.Charset;

public class Encodingcheck {
    public static void main(String[] args) {
    	
        // 현재 클래스 파일의 인코딩 종류 확인
        String classFileEncoding = System.getProperty("file.encoding");
        System.out.println("현재 클래스 파일의 인코딩 종류: " + classFileEncoding);

        
        // 출력 프로그램이 사용하고 있는 인코딩 종류 확인
        String defaultCharset = Charset.defaultCharset().name();
        System.out.println("출력 프로그램이 사용하고 있는 인코딩 종류: " + defaultCharset);
    }
}

