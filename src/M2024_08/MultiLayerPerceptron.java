package M2024_08;

import java.util.Random;

public class MultiLayerPerceptron {
    private static final int INPUT_NODES = 4; // iris 데이터셋의 피처 수
    private static final int HIDDEN_NODES = 5; // 은닉층 노드 수
    private static final int OUTPUT_NODES = 3; // 클래스 수 (3종류의 꽃)
    private static final double LEARNING_RATE = 0.01;
    private static final int EPOCHS = 1000;
    
    private double[][] inputToHiddenWeights;
    private double[] hiddenBiases;
    private double[][] hiddenToOutputWeights;
    private double[] outputBiases;

    private Random random = new Random();

    public MultiLayerPerceptron() {
        // Initialize weights and biases
        inputToHiddenWeights = new double[INPUT_NODES][HIDDEN_NODES];
        hiddenBiases = new double[HIDDEN_NODES];
        hiddenToOutputWeights = new double[HIDDEN_NODES][OUTPUT_NODES];
        outputBiases = new double[OUTPUT_NODES];

        // Randomize weights and biases
        initializeWeights(inputToHiddenWeights);
        initializeWeights(hiddenToOutputWeights);
        initializeBiases(hiddenBiases);
        initializeBiases(outputBiases);
    }

    private void initializeWeights(double[][] weights) {
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights[i].length; j++) {
                weights[i][j] = random.nextDouble() - 0.5; // Values between -0.5 and 0.5
            }
        }
    }

    private void initializeBiases(double[] biases) {
        for (int i = 0; i < biases.length; i++) {
            biases[i] = random.nextDouble() - 0.5; // Values between -0.5 and 0.5
        }
    }

    private double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }

    private double sigmoidDerivative(double x) {
        return x * (1 - x);
    }

    private double softmax(double x, double[] outputs) {
        double expSum = 0;
        for (double output : outputs) {
            expSum += Math.exp(output);
        }
        return Math.exp(x) / expSum;
    }

    private double[] softmax(double[] outputs) {
        double[] result = new double[outputs.length];
        double expSum = 0;
        for (double output : outputs) {
            expSum += Math.exp(output);
        }
        for (int i = 0; i < outputs.length; i++) {
            result[i] = Math.exp(outputs[i]) / expSum;
        }
        return result;
    }

    public void train(double[][] inputs, int[] targets) {
        for (int epoch = 0; epoch < EPOCHS; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                double[] input = inputs[i];
                int target = targets[i];
                
                // Forward pass
                double[] hiddenLayerOutputs = new double[HIDDEN_NODES];
                for (int j = 0; j < HIDDEN_NODES; j++) {
                    double sum = hiddenBiases[j];
                    for (int k = 0; k < INPUT_NODES; k++) {
                        sum += input[k] * inputToHiddenWeights[k][j];
                    }
                    hiddenLayerOutputs[j] = sigmoid(sum);
                }

                double[] outputLayerInputs = new double[OUTPUT_NODES];
                for (int j = 0; j < OUTPUT_NODES; j++) {
                    double sum = outputBiases[j];
                    for (int k = 0; k < HIDDEN_NODES; k++) {
                        sum += hiddenLayerOutputs[k] * hiddenToOutputWeights[k][j];
                    }
                    outputLayerInputs[j] = sum;
                }
                double[] outputLayerOutputs = softmax(outputLayerInputs);
                
                // Compute errors and deltas
                double[] outputDeltas = new double[OUTPUT_NODES];
                for (int j = 0; j < OUTPUT_NODES; j++) {
                    double target = (j == target) ? 1 : 0;
                    outputDeltas[j] = (target - outputLayerOutputs[j]) * outputLayerOutputs[j] * (1 - outputLayerOutputs[j]);
                }

                double[] hiddenDeltas = new double[HIDDEN_NODES];
                for (int j = 0; j < HIDDEN_NODES; j++) {
                    double sum = 0;
                    for (int k = 0; k < OUTPUT_NODES; k++) {
                        sum += outputDeltas[k] * hiddenToOutputWeights[j][k];
                    }
                    hiddenDeltas[j] = sum * sigmoidDerivative(hiddenLayerOutputs[j]);
                }

                // Update weights and biases
                for (int j = 0; j < OUTPUT_NODES; j++) {
                    outputBiases[j] += LEARNING_RATE * outputDeltas[j];
                    for (int k = 0; k < HIDDEN_NODES; k++) {
                        hiddenToOutputWeights[k][j] += LEARNING_RATE * outputDeltas[j] * hiddenLayerOutputs[k];
                    }
                }

                for (int j = 0; j < HIDDEN_NODES; j++) {
                    hiddenBiases[j] += LEARNING_RATE * hiddenDeltas[j];
                    for (int k = 0; k < INPUT_NODES; k++) {
                        inputToHiddenWeights[k][j] += LEARNING_RATE * hiddenDeltas[j] * input[k];
                    }
                }
            }
        }
    }

    public int predict(double[] input) {
        double[] hiddenLayerOutputs = new double[HIDDEN_NODES];
        for (int j = 0; j < HIDDEN_NODES; j++) {
            double sum = hiddenBiases[j];
            for (int k = 0; k < INPUT_NODES; k++) {
                sum += input[k] * inputToHiddenWeights[k][j];
            }
            hiddenLayerOutputs[j] = sigmoid(sum);
        }

        double[] outputLayerInputs = new double[OUTPUT_NODES];
        for (int j = 0; j < OUTPUT_NODES; j++) {
            double sum = outputBiases[j];
            for (int k = 0; k < HIDDEN_NODES; k++) {
                sum += hiddenLayerOutputs[k] * hiddenToOutputWeights[k][j];
            }
            outputLayerInputs[j] = sum;
        }
        double[] outputLayerOutputs = softmax(outputLayerInputs);

        int predictedClass = 0;
        double maxOutput = outputLayerOutputs[0];
        for (int i = 1; i < outputLayerOutputs.length; i++) {
            if (outputLayerOutputs[i] > maxOutput) {
                maxOutput = outputLayerOutputs[i];
                predictedClass = i;
            }
        }
        return predictedClass;
    }

    public static void main(String[] args) {
        MultiLayerPerceptron model = new MultiLayerPerceptron();

        // iris 데이터셋의 일부 샘플 (입력값은 피처, 정답은 클래스 인덱스)
        double[][] inputs = {
            {5.1, 3.5, 1.4, 0.2}, // Iris-setosa
            {7.0, 3.2, 4.7, 1.4}, // Iris-versicolor
            {6.3, 3.3, 6.0, 2.5}  // Iris-virginica
        };
        int[] targets = {0, 1, 2}; // 0: Iris-setosa, 1: Iris-versicolor, 2: Iris-virginica

        // 모델 훈련
        model.train(inputs, targets);

        // 테스트
        System.out.println("Testing predictions:");
        double[][] testInputs = {
            {5.9, 3.0, 5.1, 1.8}, // Test input
            {5.5, 2.5, 4.0, 1.3}  // Test input
        };
        for (double[] input : testInputs) {
            int prediction = model.predict(input);
            System.out.printf("Input: %.1f, %.1f, %.1f, %.1f -> Predicted Class: %d%n",
                input[0], input[1], input[2], input[3], prediction);
        }
    }
}
