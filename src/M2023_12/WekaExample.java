package M2023_12;

//import weka.core.Instances;
//import weka.core.converters.ConverterUtils.DataSource;
//import weka.classifiers.Classifier;
//import weka.classifiers.Evaluation;
//
//public class WekaExample {
//    public static void main(String[] args) {
//        try {
//            // 데이터 로드
//            DataSource source = new DataSource("데이터_파일_경로.arff");
//            Instances data = source.getDataSet();
//            if (data.classIndex() == -1) {
//                data.setClassIndex(data.numAttributes() - 1);
//            }
//
//            // 분류기 선택 (여기서는 J48를 사용합니다)
//            Classifier classifier = new weka.classifiers.trees.J48();
//            classifier.buildClassifier(data);
//
//            // 모델 평가
//            Evaluation eval = new Evaluation(data);
//            eval.crossValidateModel(classifier, data, 10, new java.util.Random(1));
//            System.out.println(eval.toSummaryString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
