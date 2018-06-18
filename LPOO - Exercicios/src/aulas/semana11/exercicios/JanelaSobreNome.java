package aulas.semana11.exercicios;


import aulas.semana11.exercicios.TesteKeyAdapter;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class JanelaSobreNome extends JFrame{

    private JTextField nome,sobreNome;
    private JLabel lnome,lsobreNome;
    private JLabel nomeSobreNome;

    public JanelaSobreNome(){
        super("Janela do Rafael");
        initComponents();

    }

    private void initComponents(){
        nome= new JTextField();
        sobreNome = new JTextField();
        lnome = new JLabel("Nome");
        lsobreNome = new JLabel("Sobrenome");
        nomeSobreNome = new JLabel();
        //Ajusta o tamanho da janela
        //setSize(500,500);
        //Ajuste do layout
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3,2,5,5));
        //Adiciona componentes no container
        cp.add(lnome);
        cp.add(nome);
        cp.add(lsobreNome);
        cp.add(sobreNome);
        cp.add(nomeSobreNome);
        
        //Inclui os eventos
        nome.addKeyListener(new TesteKeyAdapter(this));
        
        sobreNome.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                trataDigitacao(evt);
            }
 
        });

        sobreNome.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                System.out.println("Testa evento");
            }
        });


   //     KeyAdapter teste = new KeyAdapter();
        //Ajustes para a janela

        setMinimumSize(new Dimension(300,100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();





    }

    public void trataDigitacao(KeyEvent evt){
        String nomeSobreNome = this.nome.getText() + " " + this.sobreNome.getText();
        this.nomeSobreNome.setText(nomeSobreNome);
        System.out.println("Digitou letra: " + evt.getKeyChar());
    }

    public static void main(String[] args){
        JanelaSobreNome janela = new JanelaSobreNome();

        janela.setVisible(true);

    }

}
