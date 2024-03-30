package M2024_03;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class RobotExampleWithComments {
    public static void main(String[] args) {
        try {
            // 로봇 객체 생성
            Robot robot = new Robot();

            // 3초 대기
            Thread.sleep(3000);

            // 마우스 이동하여 클릭
            robot.mouseMove(500, 500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // 3초 대기
            Thread.sleep(3000);

            // "Hello, World!" 메시지를 화면에 출력하는 과정
            // 이미지를 생성하여 메시지를 그림
            String message = "Hello, World!";
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(800, 600, Transparency.TRANSLUCENT);
            Graphics2D g2d = image.createGraphics();
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("Arial", Font.BOLD, 36));
            FontMetrics fm = g2d.getFontMetrics();
            int x = (image.getWidth() - fm.stringWidth(message)) / 2;
            int y = (image.getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g2d.drawString(message, x, y);
            g2d.dispose();

            // 윈도우 키를 사용하여 화면을 최소화
            robot.setAutoDelay(1000);
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(1000);

            // 다시 윈도우 키를 사용하여 화면을 복원
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(1000);

            // 한 번 더 윈도우 키를 사용하여 화면을 복원
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
