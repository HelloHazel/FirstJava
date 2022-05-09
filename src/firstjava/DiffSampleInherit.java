package firstjava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

public class DiffSampleInherit {
    public static void main(String[] args) {

        var f = new JFrame("차분 프로그래밍");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var img = new BufferedImage(600,400,
                BufferedImage.TYPE_INT_RGB);
        var g = img.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, 600, 400);
        g.drawImage(lineImage(), 10, 10, f);
        g.drawImage(rectImage(), 280, 100, f);
        var label = new JLabel(new ImageIcon(img));
        f.add(label);
        f.pack();
        f.setVisible(true);
            }

    static BufferedImage lineImage() {
        var image = new BufferedImage(250, 200,
                BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        graphics.drawLine(10, 10, 220, 180);
        return image;
    }

    static BufferedImage rectImage() {
        var image = new BufferedImage(250, 200,
                BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        graphics.drawRect(10, 10, 220, 180);
        return image;
    }
}
