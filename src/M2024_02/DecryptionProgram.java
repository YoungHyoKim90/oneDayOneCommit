package M2024_02;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class DecryptionProgram {

    private static final String secretKey = "YourSecretKey"; // 16, 24, 32 bytes
    private static final String algorithm = "AES";

    public static String decrypt(String encryptedText) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), algorithm);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // 암호화된 텍스트
        String encryptedText = "EnterYourEncryptedTextHere";

        // 복호화 수행
        String decryptedText = decrypt(encryptedText);
        if (decryptedText != null) {
            System.out.println("Decrypted Text: " + decryptedText);
        } else {
            System.out.println("Decryption failed.");
        }
    }
}
