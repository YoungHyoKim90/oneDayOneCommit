package M2024_02;

public class CodeComparator {
    public static void main(String[] args) {
        String code1 = "public class Hello {\n" +
                       "    public static void main(String[] args) {\n" +
                       "        System.out.println(\"Hello, World!\");\n" +
                       "    }\n" +
                       "}";
        
        String code2 = "public class HelloWorld {\n" +
                       "    public static void main(String[] args) {\n" +
                       "        System.out.println(\"Hello, World!\");\n" +
                       "    }\n" +
                       "}";
        
        compareCodes(code1, code2);
    }
    
    public static void compareCodes(String code1, String code2) {
        String[] lines1 = code1.split("\n");
        String[] lines2 = code2.split("\n");
        
        int maxLength = Math.max(lines1.length, lines2.length);
        
        for (int i = 0; i < maxLength; i++) {
            if (i < lines1.length && i < lines2.length) {
                if (!lines1[i].equals(lines2[i])) {
                    System.out.println("Difference at line " + (i + 1) + ":");
                    System.out.println("Code 1: " + lines1[i]);
                    System.out.println("Code 2: " + lines2[i]);
                    System.out.println();
                }
            } else if (i < lines1.length) {
                System.out.println("Extra line in code 1 at line " + (i + 1) + ":");
                System.out.println("Code 1: " + lines1[i]);
                System.out.println();
            } else {
                System.out.println("Extra line in code 2 at line " + (i + 1) + ":");
                System.out.println("Code 2: " + lines2[i]);
                System.out.println();
            }
        }
    }
}

