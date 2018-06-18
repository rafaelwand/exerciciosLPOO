package aulas.semana11.exemplos;

import java.awt.*;
import javax.swing.*;

public class BorderDemo extends JFrame {
    public BorderDemo() {
        setTitle("BorderDemo");
        setSize(200, 200);
        Container cp = getContentPane();
        // BorderLayout � default para JFrames
        cp.add(new JButton("Botão 1"), "North");
        cp.add(new JButton("Botão 2"), "South");
        cp.add(new JButton("Botão 3"), "East");
        cp.add(new JButton("Botão 4"), "West");
        cp.add(new JButton("Botão 5"), "Center");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new BorderDemo().setVisible(true);
    }
}
