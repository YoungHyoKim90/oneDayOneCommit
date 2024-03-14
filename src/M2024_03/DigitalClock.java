//package M2024_03;
//
//import javafx.animation.Animation;
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class DigitalClock extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        Label timeLabel = new Label();
//        timeLabel.setStyle("-fx-font-size: 24px;");
//
//        StackPane root = new StackPane(timeLabel);
//        Scene scene = new Scene(root, 200, 50);
//
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Digital Clock");
//        primaryStage.show();
//
//        Timeline timeline = new Timeline(
//                new KeyFrame(Duration.seconds(1), event -> {
//                    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//                    String currentTime = dateFormat.format(new Date());
//                    timeLabel.setText(currentTime);
//                })
//        );
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.play();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//
