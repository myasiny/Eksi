import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame bg = new JFrame();
        Content fg = new Content(bg);
        fg.setVisible(true);
        bg.setVisible(false);
        bg.setLayout(new FlowLayout());
        bg.setSize(500, 500);
        bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}