package M2023_12;

public class LinearRegression {
    public static void main(String[] args) {
        // 예제 데이터
        double[] x = { 1, 2, 3, 4, 5 };
        double[] y = { 2, 4, 5, 4, 5 };

        double learningRate = 0.01; // 학습률
        int epochs = 1000; // 반복 횟수

        double m = 0; // 기울기 초기화
        double b = 0; // 절편 초기화

        // Gradient Descent 알고리즘
        for (int i = 0; i < epochs; i++) {
            double mGradient = 0;
            double bGradient = 0;

            for (int j = 0; j < x.length; j++) {
                // 예측 값 계산
                double predicted = m * x[j] + b;

                // 오차 계산
                double error = predicted - y[j];

                // Gradient 계산
                mGradient += (2 * x[j] * error) / x.length;
                bGradient += (2 * error) / x.length;
            }

            // 매개변수 업데이트
            m -= learningRate * mGradient;
            b -= learningRate * bGradient;
        }

        // 결과 출력
        System.out.println("최종 선형 회귀식: y = " + m + "x + " + b);
    }
}

