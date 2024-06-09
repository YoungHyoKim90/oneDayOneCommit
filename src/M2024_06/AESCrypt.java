package M2024_06;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class AESCrypt {

    private static final String ALGORITHM = "AES";

    public static void main(String[] args) {
        try {
            // AES 키 생성
            KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
            keyGen.init(128); // AES-128
            SecretKey secretKey = keyGen.generateKey();

            // 사용자 입력 받기
            Scanner scanner = new Scanner(System.in);
            System.out.print("암호화할 내용을 입력하세요: ");
            String originalText = scanner.nextLine();

            // 암호화
            String encryptedText = encrypt(originalText, secretKey);
            System.out.println("암호화된 내용: " + encryptedText);

            // 복호화 여부 묻기
            System.out.print("복호화 하시겠습니까? (y/n): ");
            String response = scanner.nextLine();
            if ("y".equalsIgnoreCase(response)) {
                // 복호화
                String decryptedText = decrypt(encryptedText, secretKey);
                System.out.println("복호화된 내용: " + decryptedText);
            } else {
                System.out.println("프로그램을 종료합니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String data, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    
    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}
