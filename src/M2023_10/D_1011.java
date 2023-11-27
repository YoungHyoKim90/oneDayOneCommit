//package M2023_10;
//
//
//	import org.deeplearning4j.nn.api.OptimizationAlgorithm;
//	import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
//	import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
//	import org.deeplearning4j.nn.conf.layers.DenseLayer;
//	import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
//	import org.deeplearning4j.nn.weights.WeightInit;
//	import org.nd4j.linalg.activations.Activation;
//	import org.nd4j.linalg.lossfunctions.LossFunctions;
//	import org.nd4j.linalg.dataset.DataSet;
//	import org.nd4j.linalg.factory.Nd4j;
//
//	public class D_1011 {
//	    public static void main(String[] args) {
//	        // Define the neural network configuration
//	        MultiLayerConfiguration config = new NeuralNetConfiguration.Builder()
//	            .seed(123) // 랜덤 초기화를 위한 시드값
//	            .iterations(10000) // 반복 학습 횟수
//	            .optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT) // 최적화 알고리즘
//	            .learningRate(0.1) // 학습률
//	            .updater(org.deeplearning4j.nn.conf.Updater.SGD) // 업데이터 알고리즘
//	            .list()
//	            .layer(0, new DenseLayer.Builder()
//	                .nIn(2) // 입력 뉴런 수
//	                .nOut(2) // 출력 뉴런 수
//	                .weightInit(WeightInit.XAVIER) // 가중치 초기화 방법
//	                .activation(Activation.SIGMOID) // 활성화 함수
//	                .build())
//	            .layer(1, new DenseLayer.Builder()
//	                .nIn(2) // 이전 레이어의 출력 뉴런 수와 일치
//	                .nOut(1) // 출력 뉴런 수
//	                .weightInit(WeightInit.XAVIER)
//	                .activation(Activation.SIGMOID)
//	                .build())
//	            .pretrain(false) // 사전 훈련 사용 안 함
//	            .backprop(true) // 역전파 사용
//	            .build();
//
//	        // Create and initialize the neural network
//	        MultiLayerNetwork model = new MultiLayerNetwork(config);
//	        model.init(); // 신경망 초기화
//
//	        // Define the training data (XOR gate)
//	        Nd4j.ENFORCE_NUMERICAL_STABILITY = true; // 수치 안정성 활성화
//	        DataSet dataSet = new DataSet(Nd4j.create(new double[][]{{0, 0}, {0, 1}, {1, 0}, {1, 1}}),
//	                Nd4j.create(new double[][]{{0}, {1}, {1}, {0}})); // XOR 게이트 데이터
//
//	        // Train the model
//	        for (int i = 0; i < 10000; i++) {
//	            model.fit(dataSet); // 모델 훈련
//	        }
//
//	        // Test the trained model
//	        System.out.println("Prediction for [0, 0]: " + model.output(Nd4j.create(new double[]{0, 0}, new int[]{1, 2}));
//	        System.out.println("Prediction for [0, 1]: " + model.output(Nd4j.create(new double[]{0, 1}, new int[]{1, 2}));
//	        System.out.println("Prediction for [1, 0]: " + model.output(Nd4j.create(new double[]{1, 0}, new int[]{1, 2}));
//	        System.out.println("Prediction for [1, 1]: " + model.output(Nd4j.create(new double[]{1, 1}, new int[]{1, 2}));
//	    }
//	}
//
//	
//}
