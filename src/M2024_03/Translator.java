//package M2024_03;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.translate.Translate;
//import com.google.cloud.translate.TranslateOptions;
//import com.google.cloud.translate.Translation;
//
//import java.io.FileInputStream;
//
//public class Translator {
//    public static void main(String[] args) {
//        // 인증 파일 경로 설정
//        String credentialsFilePath = "path/to/your/credentials.json";
//
//        // 영어 문장
//        String englishText = "Hello, how are you?";
//
//        // 번역할 언어 설정
//        String targetLanguage = "es"; // 스페인어
//
//        // 번역 수행
//        String translatedText = translate(credentialsFilePath, englishText, targetLanguage);
//
//        // 번역 결과 출력
//        System.out.println("번역 전: " + englishText);
//        System.out.println("번역 후: " + translatedText);
//    }
//
//    public static String translate(String credentialsFilePath, String text, String targetLanguage) {
//        try {
//            // Google Cloud Translation API에 연결하기 위한 인증 설정
//            GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(credentialsFilePath));
//            Translate translate = TranslateOptions.newBuilder().setCredentials(credentials).build().getService();
//
//            // 번역 수행
//            Translation translation = translate.translate(text, Translate.TranslateOption.targetLanguage(targetLanguage));
//
//            // 번역된 텍스트 반환
//            return translation.getTranslatedText();
//        } catch (Exception e) {
//            System.out.println("번역 오류: " + e.getMessage());
//            return null;
//        }
//    }
//}
//
