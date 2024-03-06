package M2024_03;
//package M2024_03;
//
//package Project_2024;
//
//import javafx.application.Application;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.stage.Stage;
//import java.io.*;
//import java.util.*;
//
//public class MergeTextFiles extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        // 현재 작업 디렉토리의 경로를 얻어와서 사용합니다.
//        String folderPath = System.getProperty("user.dir");
//
//        try {
//            File folder = new File(folderPath);
//            File[] files = folder.listFiles(new FilenameFilter() {
//                @Override
//                public boolean accept(File dir, String name) {
//                    return name.toLowerCase().endsWith(".txt");
//                }
//            });
//
//            Arrays.sort(files);
//
//            String mergedFileName = folderPath + "/통합파일.txt";
//
//            FileWriter mergedFileWriter = new FileWriter(mergedFileName);
//
//            for (File file : files) {
//                // 파일명을 구분하기 위해 파일명 작성
//                mergedFileWriter.write("===== " + file.getName() + " =====\n");
//
//                BufferedReader reader = new BufferedReader(new FileReader(file));
//                String line;
//
//                while ((line = reader.readLine()) != null) {
//                    mergedFileWriter.write(line);
//                    mergedFileWriter.write("\n"); // 각 줄을 쓸 때마다 줄 바꿈 문자를 추가.
//                }
//
//                mergedFileWriter.write("\n");
//
//                reader.close();
//            }
//
//            mergedFileWriter.close();
//
//            // 알림 창 표시
//            Alert alert = new Alert(AlertType.INFORMATION);
//            alert.setTitle("작업 완료");
//            alert.setHeaderText(null);
//            alert.setContentText("텍스트 파일들이 성공적으로 통합되어 통합파일.txt로 저장되었습니다.");
//            alert.showAndWait();
//        } catch (IOException e) {
//            // 파일 처리 중 오류 발생 시 예외 처리
//            Alert alert = new Alert(AlertType.ERROR);
//            alert.setTitle("오류 발생");
//            alert.setHeaderText(null);
//            alert.setContentText("파일 처리 중 오류가 발생했습니다: " + e.getMessage());
//            alert.showAndWait();
//            e.printStackTrace();
//        }
//    }
//}
