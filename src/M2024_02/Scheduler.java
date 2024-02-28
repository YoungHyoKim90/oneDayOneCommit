package M2024_02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scheduler {
    private List<Schedule> scheduleList;

    public Scheduler() {
        this.scheduleList = new ArrayList<>();
    }

    public void addSchedule(Schedule schedule) {
        scheduleList.add(schedule);
        System.out.println("일정이 추가되었습니다.");
    }

    public void displaySchedules() {
        System.out.println("현재 등록된 일정:");
        for (Schedule schedule : scheduleList) {
            System.out.println(schedule);
        }
    }

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 일정 추가");
            System.out.println("2. 등록된 일정 보기");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1:
                    System.out.print("일정 날짜를 입력하세요 (yyyy-MM-dd): ");
                    String dateString = scanner.nextLine();
                    LocalDate date = LocalDate.parse(dateString);
                    System.out.print("일정 내용을 입력하세요: ");
                    String content = scanner.nextLine();
                    Schedule newSchedule = new Schedule(date, content);
                    scheduler.addSchedule(newSchedule);
                    break;
                case 2:
                    scheduler.displaySchedules();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}

class Schedule {
    private LocalDate date;
    private String content;

    public Schedule(LocalDate date, String content) {
        this.date = date;
        this.content = content;
    }

    @Override
    public String toString() {
        return "일정 날짜: " + date + ", 내용: " + content;
    }
}

