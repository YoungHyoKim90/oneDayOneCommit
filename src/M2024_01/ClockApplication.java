package M2024_01;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class DigitalClock {
    private LocalTime currentTime;

    public DigitalClock() {
        this.currentTime = LocalTime.now();
    }

    public void displayTime() {
        System.out.println("현재 시각: " + currentTime);
    }

    public void updateCurrentTime() {
        currentTime = LocalTime.now();
    }
}

class AlarmClock extends DigitalClock {
    private LocalTime alarmTime;
    private boolean isAlarmSet;

    public AlarmClock() {
        this.alarmTime = LocalTime.now().plusMinutes(1); // 1분 뒤 알람 설정
        this.isAlarmSet = false;
    }

    public void setAlarm(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
        this.isAlarmSet = true;
        System.out.println("알람이 " + alarmTime + "으로 설정되었습니다.");
    }

    public void displayAlarmTime() {
        System.out.println("알람 설정 시각: " + alarmTime);
    }

    public void checkAlarm() {
        if (isAlarmSet && LocalTime.now().isAfter(alarmTime)) {
            System.out.println("알람이 울립니다!");
            isAlarmSet = false; // 알람 울리면 재설정을 방지하기 위해 초기화
        }
    }
}

public class ClockApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlarmClock alarmClock = new AlarmClock();

        Timer timer = new Timer(true);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                alarmClock.updateCurrentTime();
                alarmClock.displayTime();
                alarmClock.checkAlarm();
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // 1초마다 현재 시각과 알람 확인

        System.out.println("디지털 시계 및 알람 프로그램을 시작합니다.");

        while (true) {
            System.out.println("\n1. 현재 시각 확인");
            System.out.println("2. 알람 설정");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    alarmClock.displayTime();
                    break;
                case 2:
                    System.out.print("알람을 설정할 시각을 입력하세요 (HH:mm): ");
                    String alarmTimeInput = scanner.next();
                    LocalTime alarmTime = LocalTime.parse(alarmTimeInput);
                    alarmClock.setAlarm(alarmTime);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    timer.cancel();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }
}
