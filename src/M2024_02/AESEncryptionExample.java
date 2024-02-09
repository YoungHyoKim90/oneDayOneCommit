package M2024_02;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESEncryptionExample {

    private static final String secretKey = "YourSecretKey"; // 16, 24, 32 bytes
    private static final String algorithm = "AES";

    public static String encrypt(String data) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), algorithm);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    

    public static String decrypt(String encryptedData) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), algorithm);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
    public static void main(String[] args) {
        String originalData = "Hello, World!";
        String encryptedData = encrypt(originalData);
        System.out.println("Encrypted data: " + encryptedData);
        String decryptedData = decrypt(encryptedData);
        System.out.println("Decrypted data: " + decryptedData);
    }
}

