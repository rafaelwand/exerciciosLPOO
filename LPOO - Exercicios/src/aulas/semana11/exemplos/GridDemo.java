package aulas.semana11.exemplos;

import java.awt.*;
import javax.swing.*;

public class GridDemo extends JFrame {
    public GridDemo() {
        setTitle("GridDemo");
        setSize(200, 150);
        Container cp = getContentPane(); // container
        cp.setLayout(new GridLayout(3, 2)); // layout GridLayout
        for (int i=0; i<5; i++) {
            JButton b = new JButton("Botão "+(i+1));
            cp.add(b);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new GridDemo().setVisible(true);
    }
}
