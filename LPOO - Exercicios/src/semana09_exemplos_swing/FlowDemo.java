package semana09_exemplos_swing;

import java.awt.*;
import javax.swing.*;

public class FlowDemo extends JFrame {
    public FlowDemo() {
        setTitle("FlowDemo");
        setSize(200, 150);
        Container cp = getContentPane(); // container
        cp.setLayout(new FlowLayout()); // layout FlowLayout
        for (int i=0; i<5; i++) {
            JButton b = new JButton("Botão "+(i+1));
            b.setSize(80, 20); // x, y, larg, alt
            cp.add(b);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new FlowDemo().setVisible(true);
    }
}
