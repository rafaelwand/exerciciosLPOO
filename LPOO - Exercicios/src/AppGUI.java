/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class AppGUI  extends JFrame{
	public static void main(String a[]){
		new AppGUI().setVisible(true);
	}
	public AppGUI(){
		setSize(400,300);
                Container cp = getContentPane();
                cp.setLayout(new GridLayout(2,2));
 //             cp.setLayout(new FlowLayout());
		add(new JButton("Botão 1"));
		add(new JButton("Botão 2"));
		add(new JButton("Botão 3"));
		add(new JButton("Botão 4"));
    }
}
