package M2024_01;

//import weka.classifiers.Classifier;
//import weka.classifiers.Evaluation;
//import weka.classifiers.trees.J48;
//import weka.core.Instances;
//import weka.core.converters.ConverterUtils.DataSource;
//
//public class WekaExample {
//
//    public static void main(String[] args) throws Exception {
//        // 데이터 로드
//        DataSource source = new DataSource("path/to/iris.arff"); // 적절한 데이터셋 경로로 변경
//        Instances data = source.getDataSet();
//
//        // 클래스 속성을 설정
//        data.setClassIndex(data.numAttributes() - 1);
//
//        // 분류 모델 생성 (여기에서는 결정 트리 사용)
//        Classifier classifier = new J48();
//
//        // 모델 학습
//        classifier.buildClassifier(data);
//
//        // 교차 검증 평가
//        Evaluation evaluation = new Evaluation(data);
//        evaluation.crossValidateModel(classifier, data, 10, new Random(1));
//
//        // 결과 출력
//        System.out.println("=== Cross-Validation ===");
//        System.out.println("Correctly Classified Instances: " + evaluation.correct());
//        System.out.println("Incorrectly Classified Instances: " + evaluation.incorrect());
//        System.out.println("Accuracy: " + evaluation.pctCorrect() + "%");
//    }
//}
