package M2024_06;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256Hash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("해시할 내용을 입력하세요: ");
        String input = scanner.nextLine();

        try {
            String hash = getSHA256Hash(input);
            System.out.println("해시된 내용: " + hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("해시 알고리즘을 찾을 수 없습니다: " + e.getMessage());
        }
    }

    public static String getSHA256Hash(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(data.getBytes());
        return bytesToHex(hashBytes);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}

