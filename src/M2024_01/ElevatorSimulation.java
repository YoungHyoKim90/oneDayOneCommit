package M2024_01;

import java.util.Scanner;

public class ElevatorSimulation {
    private int currentFloor;
    private boolean movingUp;

    public ElevatorSimulation() {
        this.currentFloor = 1;
        this.movingUp = true;
    }

    // 엘리베이터의 현재 상태 출력
    public void displayStatus() {
        System.out.println("현재 층: " + currentFloor + "층");
        System.out.println("이동 방향: " + (movingUp ? "상향" : "하향"));
    }

    // 엘리베이터 이동 메서드
    public void move() {
        if (movingUp) {
            currentFloor++;
        } else {
            currentFloor--;
        }
    }

    public static void main(String[] args) {
        ElevatorSimulation elevator = new ElevatorSimulation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("엘리베이터 시뮬레이션을 시작합니다.");

        while (true) {
            elevator.displayStatus();

            System.out.println("1층에서 5층까지의 목적지를 입력하세요 (0 입력 시 종료): ");
            int destination = scanner.nextInt();

            if (destination == 0) {
                System.out.println("시뮬레이션을 종료합니다.");
                break;
            }

            // 목적지까지 이동
            while (elevator.currentFloor != destination) {
                elevator.move();
                elevator.displayStatus();
            }
        }

        scanner.close();
    }
}

