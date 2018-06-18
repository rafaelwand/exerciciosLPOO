package aulas.semana11.exemplos;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderDemo2 extends JFrame {
    private JButton bAbrir, bSalvar, bFechar;
    private JTextArea taEditor;

    public BorderDemo2() {
        super("BorderDemo2");
        setSize(300, 200);
        setBackground(SystemColor.control);
        Container cp = getContentPane();
        // Painel Topo
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        for(int i=0; i<3; i++) {
        	p1.add(new JLabel(new ImageIcon(getClass().getResource("selected.gif"))));
        	p1.add(new JLabel(new ImageIcon(getClass().getResource("deselected.gif"))));
	}
        cp.add(p1, "North");
        // Painel Lateral
        p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(3, 1, 5, 5));
        p2.add(bAbrir = new JButton("Abrir"));
        p2.add(bSalvar = new JButton("Salvar"));
        p2.add(bFechar = new JButton("Fechar"));
        p1.add(p2);
        cp.add("East", p1);
        // Componente central
        cp.add(new JScrollPane(taEditor = new JTextArea()), "Center");
        // Listener
        bFechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bFecharClick(); // implementado na outer-class
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // C�digo executado pelo bot�o
    private void bFecharClick() {
        System.exit(0);
    }

    public static void main(String args[]) {
        new BorderDemo2().setVisible(true);
    }
}
