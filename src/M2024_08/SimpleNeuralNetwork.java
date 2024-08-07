package M2024_08;

import java.util.Random;

public class SimpleNeuralNetwork {
    private static final int INPUT_NODES = 2;
    private static final int HIDDEN_NODES = 2;
    private static final int OUTPUT_NODES = 1;
    private static final double LEARNING_RATE = 0.5;
    private static final int EPOCHS = 10000;
    
    private double[][] inputToHiddenWeights;
    private double[] hiddenBiases;
    private double[][] hiddenToOutputWeights;
    private double outputBias;

    private Random random = new Random();

    public SimpleNeuralNetwork() {
        // Initialize weights and biases
        inputToHiddenWeights = new double[INPUT_NODES][HIDDEN_NODES];
        hiddenBiases = new double[HIDDEN_NODES];
        hiddenToOutputWeights = new double[HIDDEN_NODES][OUTPUT_NODES];
        outputBias = random.nextDouble();
        
        // Randomize weights and biases
        initializeWeights(inputToHiddenWeights);
        initializeWeights(hiddenToOutputWeights);
        initializeBiases(hiddenBiases);
        outputBias = random.nextDouble();
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

    public void train(double[][] inputs, double[] outputs) {
        for (int epoch = 0; epoch < EPOCHS; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                double[] input = inputs[i];
                double target = outputs[i];
                
                // Forward pass
                double[] hiddenLayerOutputs = new double[HIDDEN_NODES];
                for (int j = 0; j < HIDDEN_NODES; j++) {
                    double sum = hiddenBiases[j];
                    for (int k = 0; k < INPUT_NODES; k++) {
                        sum += input[k] * inputToHiddenWeights[k][j];
                    }
                    hiddenLayerOutputs[j] = sigmoid(sum);
                }

                double outputLayerInput = outputBias;
                for (int j = 0; j < HIDDEN_NODES; j++) {
                    outputLayerInput += hiddenLayerOutputs[j] * hiddenToOutputWeights[j][0];
                }
                double output = sigmoid(outputLayerInput);
                
                // Compute error
                double error = target - output;
                
                // Backward pass
                double outputDelta = error * sigmoidDerivative(output);
                
                for (int j = 0; j < HIDDEN_NODES; j++) {
                    double hiddenDelta = outputDelta * hiddenToOutputWeights[j][0] * sigmoidDerivative(hiddenLayerOutputs[j]);
                    for (int k = 0; k < INPUT_NODES; k++) {
                        inputToHiddenWeights[k][j] += LEARNING_RATE * hiddenDelta * input[k];
                    }
                    hiddenBiases[j] += LEARNING_RATE * hiddenDelta;
                    hiddenToOutputWeights[j][0] += LEARNING_RATE * outputDelta * hiddenLayerOutputs[j];
                }
                outputBias += LEARNING_RATE * outputDelta;
            }
        }
    }

    public double predict(double[] input) {
        double[] hiddenLayerOutputs = new double[HIDDEN_NODES];
        for (int j = 0; j < HIDDEN_NODES; j++) {
            double sum = hiddenBiases[j];
            for (int k = 0; k < INPUT_NODES; k++) {
                sum += input[k] * inputToHiddenWeights[k][j];
            }
            hiddenLayerOutputs[j] = sigmoid(sum);
        }

        double outputLayerInput = outputBias;
        for (int j = 0; j < HIDDEN_NODES; j++) {
            outputLayerInput += hiddenLayerOutputs[j] * hiddenToOutputWeights[j][0];
        }
        return sigmoid(outputLayerInput);
    }

    public static void main(String[] args) {
        SimpleNeuralNetwork nn = new SimpleNeuralNetwork();

        double[][] inputs = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        };

        double[] outputs = {0, 1, 1, 0};

        nn.train(inputs, outputs);

        System.out.println("Testing predictions:");
        for (double[] input : inputs) {
            double prediction = nn.predict(input);
            System.out.printf("Input: %.0f, %.0f -> Prediction: %.4f%n", input[0], input[1], prediction);
        }
    }
}

