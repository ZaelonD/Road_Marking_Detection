import javax.swing.*;
import java.awt.*;

public class Form {
    private final JFrame frame;
    private final int WIDTH = 960;
    private final int HEIGHT = 640;
    private static final String title = "Обнаружение разметки";

    public Form() {
        this.frame = new JFrame(title);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JButton openButton = new JButton("Открыть изображение");
        JButton discoverButton = new JButton("Обнаружить");
        frame.getContentPane().add(BorderLayout.NORTH, openButton);
        frame.getContentPane().add(BorderLayout.SOUTH, discoverButton);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("resources/solidWhiteCurve.jpg"));
        frame.getContentPane().add(BorderLayout.CENTER, label);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}
