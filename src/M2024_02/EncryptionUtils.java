package M2024_02;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionUtils {
    private static final String secretKey = "YourSecretKey"; // 암호화 키

    public static String encrypt(String strToEncrypt) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String strToDecrypt) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

//public class Main2 {
//    public static void main(String[] args) {
//        String originalString = "Hello, World!";
//        String encryptedString = EncryptionUtils.encrypt(originalString);
//        String decryptedString = EncryptionUtils.decrypt(encryptedString);
//        System.out.println("Original: " + originalString);
//        System.out.println("Encrypted: " + encryptedString);
//        System.out.println("Decrypted: " + decryptedString);
//    }
//}

