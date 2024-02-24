package M2024_02;

import java.time.LocalDateTime;

public class PlanetPositionCalculator {

    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("현재 시간: " + currentTime);

        // 각 행성의 xyz 좌표 계산
        double[] earthPosition = calculatePlanetPosition("Earth", currentTime);
        double[] marsPosition = calculatePlanetPosition("Mars", currentTime);
        double[] venusPosition = calculatePlanetPosition("Venus", currentTime);

        // 결과 출력
        System.out.println("지구의 위치: x=" + earthPosition[0] + ", y=" + earthPosition[1] + ", z=" + earthPosition[2]);
        System.out.println("화성의 위치: x=" + marsPosition[0] + ", y=" + marsPosition[1] + ", z=" + marsPosition[2]);
        System.out.println("금성의 위치: x=" + venusPosition[0] + ", y=" + venusPosition[1] + ", z=" + venusPosition[2]);
    }

    // 행성의 위치 계산 메서드
    private static double[] calculatePlanetPosition(String planet, LocalDateTime time) {
        // 간단한 예시로 각 행성의 좌표를 랜덤하게 계산합니다.
        double[] position = new double[3];
        position[0] = Math.random() * 1000; // x 좌표
        position[1] = Math.random() * 1000; // y 좌표
        position[2] = Math.random() * 1000; // z 좌표
        return position;
    }
}

