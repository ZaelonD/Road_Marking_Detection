import javax.swing.*;
import java.awt.*;

public class Form {
    private final JFrame frame;
    private final JLabel label;
    private final int WIDTH = 960;
    private final int HEIGHT = 640;
    private final JButton openButton = new JButton("Открыть изображение");
    private final JButton discoverButton = new JButton("Обнаружить");
    private static final String title = "Обнаружение разметки";

    public Form() {
        this.frame = new JFrame(title);
        this.label = new JLabel();
        label.setIcon(new ImageIcon("resources/solidWhiteCurve.jpg"));
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH, openButton);
        frame.getContentPane().add(BorderLayout.SOUTH, discoverButton);
        frame.getContentPane().add(BorderLayout.CENTER, label);
        frame.setLocationRelativeTo(null);
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

    public JButton getOpenButton() {
        return openButton;
    }

    public JButton getDiscoverButton() {
        return discoverButton;
    }
}
