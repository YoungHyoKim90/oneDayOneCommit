//package M2023_12;
//
//import opennlp.tools.langdetect.*;
//
//public class LanguageDetectionExample {
//    public static void main(String[] args) {
//        try {
//            // 감지 모델 불러오기
//            LanguageDetectorModel model = new LanguageDetectorModelLoader()
//                    .loadModel(new File("models/langdetect-183.bin")); // 감지 모델 파일 경로 지정
//
//            // 감지 모델로 감지기 생성
//            LanguageDetector languageDetector = new LanguageDetectorME(model);
//
//            // 감지할 텍스트 입력
//            String text = "여기에 한국어 텍스트를 입력하세요.";
//
//            // 텍스트의 언어 감지
//            Language[] languages = languageDetector.predictLanguages(text);
//
//            if (languages.length > 0) {
//                System.out.println("감지된 언어: " + languages[0].getLang());
//                System.out.println("신뢰도: " + languages[0].getConfidence());
//            } else {
//                System.out.println("언어를 감지할 수 없습니다.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
