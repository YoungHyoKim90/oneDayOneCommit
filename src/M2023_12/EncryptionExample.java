package M2023_12;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionExample {
    public static void main(String[] args) throws Exception {
        String originalString = "Hello, Java! This is an encryption example.";

        // AES 대칭키 생성
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // 키 크기 설정 (128, 192 또는 256)
        SecretKey secretKey = keyGenerator.generateKey();

        // 암호화
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(originalString.getBytes(StandardCharsets.UTF_8));

        // 암호화된 문자열을 Base64로 인코딩하여 출력
        String encryptedString = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("암호화된 문자열: " + encryptedString);

        // 복호화
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedString));

        // 복호화된 문자열 출력
        String decryptedString = new String(decryptedBytes, StandardCharsets.UTF_8);
        System.out.println("복호화된 문자열: " + decryptedString);
    }
}

