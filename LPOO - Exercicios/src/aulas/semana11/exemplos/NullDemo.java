package aulas.semana11.exemplos;

import java.awt.*;
import javax.swing.*;

public class NullDemo extends JFrame {
    public NullDemo() {
        setTitle("NullDemo");
        setSize(200, 150);
        Container cp = getContentPane(); // container
        cp.setLayout(null); // layout desativado
        for (int i=0; i<5; i++) {
            JButton b = new JButton("Botão "+(i+1));
            b.setBounds(10+i*90, 30, 80, 20); // x, y, larg, alt
            cp.add(b);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new NullDemo().setVisible(true);
    }
}
