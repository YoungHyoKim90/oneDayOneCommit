package M2023_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MissileDodger extends JPanel implements KeyListener, ActionListener {
    private int playerX = 250; // 플레이어의 x 좌표
    private int playerY = 480; // 플레이어의 y 좌표
    private Timer timer;
    private List<Integer> missileX = new ArrayList<>();
    private List<Integer> missileY = new ArrayList<>();
    private List<Integer> missileSpeed = new ArrayList<>();
    private boolean gameOver = false;
    private int score = 0;

    public MissileDodger() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(50, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // 게임 화면 그리기
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 600);

        // 플레이어 그리기
        g.setColor(Color.WHITE);
        g.fillRect(playerX, playerY, 50, 50);

        // 미사일 그리기
        for (int i = 0; i < missileX.size(); i++) {
            g.setColor(Color.RED);
            g.fillRect(missileX.get(i), missileY.get(i), 10, 10);
        }

        // 게임 오버 시 화면에 게임 오버 메시지 출력
        if (gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over! Score: " + score, 180, 300);
        }

        // 점수 표시
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 20, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            // 미사일 움직이기
            for (int i = 0; i < missileY.size(); i++) {
                missileY.set(i, missileY.get(i) + missileSpeed.get(i));
                if (missileY.get(i) > 600) {
                    missileY.remove(i);
                    missileX.remove(i);
                    missileSpeed.remove(i);
                    score++; // 미사일이 땅에 닿으면 점수 추가
                }
            }

            // 새로운 미사일 생성
            Random rand = new Random();
            if (rand.nextInt(10) == 0) {
                int positionX = rand.nextInt(550);
                int speed = rand.nextInt(5) + 1;
                missileX.add(positionX);
                missileY.add(0);
                missileSpeed.add(speed);
            }

            // 플레이어와 미사일 충돌 확인
            for (int i = 0; i < missileX.size(); i++) {
                if (missileY.get(i) >= playerY && missileY.get(i) <= playerY + 50
                        && missileX.get(i) >= playerX && missileX.get(i) <= playerX + 50) {
                    gameOver = true;
                    timer.stop();
                }
            }

            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT && playerX > 0) {
            playerX -= 20;
        }
        if (key == KeyEvent.VK_RIGHT && playerX < 550) {
            playerX += 20;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Missile Dodger");
        MissileDodger game = new MissileDodger();
        frame.add(game);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

