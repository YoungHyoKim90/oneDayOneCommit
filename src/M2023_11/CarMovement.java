package M2023_11;

import java.awt.*;
import java.awt.event.*;

public class CarMovement extends Frame implements KeyListener {
    private int carX = 200; // 자동차의 x 좌표
    private int carY = 200; // 자동차의 y 좌표

    public CarMovement() {
        setSize(500, 500);
        setVisible(true);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_UP) {
            carY -= 10; // 위 화살표를 누르면 y 좌표를 감소시켜 자동차를 위로 이동
        } else if (keyCode == KeyEvent.VK_DOWN) {
            carY += 10; // 아래 화살표를 누르면 y 좌표를 증가시켜 자동차를 아래로 이동
        }

        repaint(); // 화면을 다시 그리기 위해 repaint 호출
    }

    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillRect(carX, carY, 50, 30); // 자동차를 그림
    }

    public static void main(String[] args) {
        new CarMovement();
    }
}
