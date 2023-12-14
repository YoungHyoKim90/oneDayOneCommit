package M2023_12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KNN {
    static class Point {
        double x, y;
        String label;

        public Point(double x, double y, String label) {
            this.x = x;
            this.y = y;
            this.label = label;
        }
    }

    public static void main(String[] args) {
        List<Point> dataset = new ArrayList<>();
        dataset.add(new Point(1, 2, "A"));
        dataset.add(new Point(2, 3, "A"));
        dataset.add(new Point(3, 4, "A"));
        dataset.add(new Point(5, 6, "B"));
        dataset.add(new Point(6, 7, "B"));
        dataset.add(new Point(7, 8, "B"));

        Point newPoint = new Point(4, 5, ""); // 새로운 데이터 포인트

        int k = 3; // K 설정

        // 새로운 데이터 포인트와의 거리 계산
        dataset.forEach(point -> point.label = getLabel(point, newPoint));

        // 가장 가까운 K개의 이웃 찾기
        dataset.sort(Comparator.comparingDouble(point -> distance(point, newPoint)));
        List<String> nearestLabels = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            nearestLabels.add(dataset.get(i).label);
        }

        // 이웃들 중 가장 많은 레이블 선택
        String predictedLabel = getMostCommonLabel(nearestLabels);
        System.out.println("새로운 데이터의 예측된 레이블: " + predictedLabel);
    }

    static String getLabel(Point p1, Point p2) {
        double dist = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        return dist <= 2 ? p1.label : "";
    }

    static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    static String getMostCommonLabel(List<String> labels) {
        return labels.stream()
                .max((a, b) -> (int) labels.stream().filter(label -> label.equals(a)).count() -
                               (int) labels.stream().filter(label -> label.equals(b)).count())
                .orElse("");
    }
}

