package Lab_5;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        frame.add(label);
        frame.setSize(400, 400);
        frame.setVisible(true);

        ImageIcon[] frames = new ImageIcon[args.length];
        for (int i = 0; i < args.length; i++) frames[i] = new ImageIcon(args[i]);

        Timer timer = new Timer(150, new java.awt.event.ActionListener() {
            int index = 0;
            public void actionPerformed(java.awt.event.ActionEvent e) {
                label.setIcon(frames[index]);
                index = (index + 1) % frames.length;
            }
        });

        timer.start();
    }
}
