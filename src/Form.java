import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Form {
    private final JFrame frame;
    private final JLabel label;
    private final int WIDTH = 960;
    private final int HEIGHT = 640;
    private final JButton openButton = new JButton("Выбрать изображение");
    private final JButton discoverButton = new JButton("Обнаружить");
    private static final String title = "Обнаружение разметки";
    private String path;

    public Form() {
        this.frame = new JFrame(title);
        this.label = new JLabel();
        label.setText("ИЗОБРАЖЕНИЕ");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH, openButton);
        frame.getContentPane().add(BorderLayout.SOUTH, discoverButton);
        frame.getContentPane().add(BorderLayout.CENTER, label);
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileOpen = new JFileChooser();
                int ret = fileOpen.showDialog(null, "Выбрать файл");
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File file = fileOpen.getSelectedFile();
                    Image.setPath(file.getPath());
                    label.setIcon(new ImageIcon(Image.getPath()));
                }
            }
        });
        discoverButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setIcon(new ImageIcon(Image.getPath()));
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
