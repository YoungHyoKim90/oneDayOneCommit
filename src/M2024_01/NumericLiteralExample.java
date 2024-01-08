package M2024_01;

public class NumericLiteralExample {
    public static void main(String[] args) {
        int million = 1_000_000;
        long creditCardNumber = 1234_5678_9012_3456L;
        float pi = 3.14_15F;
        double avogadro = 6.022_140_857e23;

        System.out.println(million); // 출력: 1000000
        System.out.println(creditCardNumber); // 출력: 1234567890123456
        System.out.println(pi); // 출력: 3.1415
        System.out.println(avogadro); // 출력: 6.022140857E23
    }
}

