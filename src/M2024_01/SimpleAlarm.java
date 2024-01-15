package M2024_01;

import java.util.Timer;
import java.util.TimerTask;

public class SimpleAlarm {
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        // 5초 후에 알람이 울립니다.
        int delayInSeconds = 5;
        
        // TimerTask를 상속받은 익명 클래스를 생성하여 원하는 동작을 정의합니다.
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("알람! 지금 시각: " + System.currentTimeMillis());
            }
        };
        
        // 지정된 시간 이후에 주기적으로 실행될 TimerTask를 설정합니다.
        timer.schedule(task, delayInSeconds * 1000);

        System.out.println("프로그램이 실행 중입니다.");
    }
}

