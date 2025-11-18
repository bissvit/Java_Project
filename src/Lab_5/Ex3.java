package Lab_5;
import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("картинка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(args[0]);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
