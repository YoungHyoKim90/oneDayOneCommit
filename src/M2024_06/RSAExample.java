package M2024_06;

import java.security.*;
import javax.crypto.Cipher;
import java.util.Base64;

public class RSAExample {
    public static void main(String[] args) {
        try {
            // 키 쌍 생성
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            KeyPair pair = keyGen.generateKeyPair();
            PublicKey publicKey = pair.getPublic();
            PrivateKey privateKey = pair.getPrivate();

            // 원본 텍스트
            String originalText = "암호화할 내용입니다.";

            // 암호화
            String encryptedText = encrypt(originalText, publicKey);
            System.out.println("암호화된 내용: " + encryptedText);

            // 복호화
            String decryptedText = decrypt(encryptedText, privateKey);
            System.out.println("복호화된 내용: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String data, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String data, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decodedBytes = Base64.getDecoder().decode(data);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}
