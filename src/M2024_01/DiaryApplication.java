package M2024_01;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DiaryEntry {
    private String title;
    private String content;

    public DiaryEntry(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "제목: " + title + "\n내용: " + content;
    }
}

class Diary {
    private Map<String, DiaryEntry> entries;

    public Diary() {
        entries = new HashMap<>();
    }

    public void addEntry(String date, DiaryEntry entry) {
        entries.put(date, entry);
        System.out.println("새로운 다이어리 항목이 추가되었습니다.");
    }

    public void viewEntry(String date) {
        if (entries.containsKey(date)) {
            System.out.println(entries.get(date));
        } else {
            System.out.println("해당 날짜에 다이어리 항목이 없습니다.");
        }
    }

    public void viewAllEntries() {
        if (entries.isEmpty()) {
            System.out.println("다이어리에 항목이 없습니다.");
        } else {
            for (Map.Entry<String, DiaryEntry> entry : entries.entrySet()) {
                System.out.println("날짜: " + entry.getKey());
                System.out.println(entry.getValue() + "\n");
            }
        }
    }
}

public class DiaryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diary diary = new Diary();

        System.out.println("다이어리 프로그램을 시작합니다.");

        while (true) {
            System.out.println("\n1. 다이어리 항목 추가");
            System.out.println("2. 특정 날짜의 다이어리 항목 보기");
            System.out.println("3. 모든 다이어리 항목 보기");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("날짜를 입력하세요 (yyyy-MM-dd): ");
                    String date = scanner.next();
                    scanner.nextLine(); // 버퍼 비우기
                    System.out.print("제목을 입력하세요: ");
                    String title = scanner.nextLine();
                    System.out.print("내용을 입력하세요: ");
                    String content = scanner.nextLine();
                    DiaryEntry newEntry = new DiaryEntry(title, content);
                    diary.addEntry(date, newEntry);
                    break;
                case 2:
                    System.out.print("보고 싶은 날짜를 입력하세요 (yyyy-MM-dd): ");
                    String viewDate = scanner.next();
                    diary.viewEntry(viewDate);
                    break;
                case 3:
                    diary.viewAllEntries();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }
}
