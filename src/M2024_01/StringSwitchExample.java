package M2024_01;

public class StringSwitchExample {
    public static void main(String[] args) {
        String fruit = "apple";

        switch (fruit) {
            case "apple":
                System.out.println("Selected fruit is an apple");
                break;
            case "orange":
                System.out.println("Selected fruit is an orange");
                break;
            case "banana":
                System.out.println("Selected fruit is a banana");
                break;
            default:
                System.out.println("Selected fruit is unknown");
        }
    }
}

