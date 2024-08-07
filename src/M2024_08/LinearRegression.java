package M2024_08;

import java.util.Random;

public class LinearRegression {
    private static final int INPUT_NODES = 1; // 입력 노드의 수
    private static final int OUTPUT_NODES = 1; // 출력 노드의 수
    private static final double LEARNING_RATE = 0.01; // 학습률
    private static final int EPOCHS = 1000; // 에포크 수
    
    private double weight;
    private double bias;
    private Random random = new Random();

    public LinearRegression() {
        // 가중치와 편향을 랜덤으로 초기화
        weight = random.nextDouble();
        bias = random.nextDouble();
    }

    public void train(double[][] inputs, double[] targets) {
        for (int epoch = 0; epoch < EPOCHS; epoch++) {
            double totalError = 0;
            for (int i = 0; i < inputs.length; i++) {
                double input = inputs[i][0];
                double target = targets[i];
                
                // 예측값 계산
                double prediction = weight * input + bias;
                
                // 오차 계산
                double error = target - prediction;
                totalError += error * error;
                
                // 경량화와 편향 업데이트
                weight += LEARNING_RATE * error * input;
                bias += LEARNING_RATE * error;
            }
            
            // 에포크마다 총 오차 출력
            if (epoch % 100 == 0) {
                System.out.printf("Epoch %d: Total Error = %.4f%n", epoch, totalError);
            }
        }
    }

    public double predict(double input) {
        return weight * input + bias;
    }

    public static void main(String[] args) {
        LinearRegression model = new LinearRegression();

        // 간단한 데이터셋
        double[][] inputs = {
            {1},
            {2},
            {3},
            {4},
            {5}
        };
        double[] targets = {2, 4, 6, 8, 10}; // y = 2x (실제 함수)

        // 모델 훈련
        model.train(inputs, targets);

        // 테스트
        System.out.println("Testing predictions:");
        for (double[] input : inputs) {
            double prediction = model.predict(input[0]);
            System.out.printf("Input: %.1f -> Prediction: %.2f%n", input[0], prediction);
        }
    }
}
