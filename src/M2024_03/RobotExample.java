package M2024_03;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class RobotExample {
    public static void main(String[] args) {
        try {
            // 로봇 객체 생성
            Robot robot = new Robot();

            // 3초 뒤에 마우스 이동 및 클릭
            Thread.sleep(3000);
            robot.mouseMove(500, 500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // 3초 뒤에 "Hello, World!" 메시지를 화면에 출력
            Thread.sleep(3000);
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
            robot.setAutoDelay(1000);
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

