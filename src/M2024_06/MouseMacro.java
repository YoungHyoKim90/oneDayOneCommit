package M2024_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseMacro extends JFrame {

    private boolean running = false;
    private int delay = 100;
    private int mouseButton = InputEvent.BUTTON1_DOWN_MASK;
    private Robot robot;

    public MouseMacro() {
        setTitle("Mouse Macro");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel speedLabel = new JLabel("Click Speed (ms):");
        JSlider speedSlider = new JSlider(JSlider.HORIZONTAL, 10, 1000, 100);
        speedSlider.setMajorTickSpacing(100);
        speedSlider.setMinorTickSpacing(10);
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);

        JRadioButton leftClickButton = new JRadioButton("Left Click");
        leftClickButton.setSelected(true);
        JRadioButton rightClickButton = new JRadioButton("Right Click");

        ButtonGroup group = new ButtonGroup();
        group.add(leftClickButton);
        group.add(rightClickButton);

        JButton startButton = new JButton("Start (F1)");
        JButton stopButton = new JButton("Stop (F2)");

        add(speedLabel);
        add(speedSlider);
        add(leftClickButton);
        add(rightClickButton);
        add(startButton);
        add(stopButton);

        speedSlider.addChangeListener(e -> delay = speedSlider.getValue());
        leftClickButton.addActionListener(e -> mouseButton = InputEvent.BUTTON1_DOWN_MASK);
        rightClickButton.addActionListener(e -> mouseButton = InputEvent.BUTTON3_DOWN_MASK);

        startButton.addActionListener(e -> startClicking());
        stopButton.addActionListener(e -> stopClicking());

        KeyListener keyListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    startClicking();
                } else if (e.getKeyCode() == KeyEvent.VK_F2) {
                    stopClicking();
                }
            }
        };

        addKeyListener(keyListener);
        setFocusable(true);

        try {
            robot = new Robot();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void startClicking() {
        running = true;
        new Thread(() -> {
            while (running) {
                robot.mousePress(mouseButton);
                robot.mouseRelease(mouseButton);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void stopClicking() {
        running = false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseMacro macro = new MouseMacro();
            macro.addWindowListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    macro.requestFocus();
                }
            });
            macro.setVisible(true);
        });
    }
}
