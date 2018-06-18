/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package semana09_exemplos_swing.listacontatos;

import semana09_exemplos_swing.listacontatos.dao.ContatoDAO;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Rafael
 */
public class ListaDeContatosComBotoes extends JFrame{
    //Tabela
    private JTable tabelaContatos;
    private ModeloTabelaContatos modeloTabela;
    //Botões
    private JButton listarContatos;
    private JButton limparTabela;

    public ListaDeContatosComBotoes(){
        super("Tabela Contatos do Banco de Dados");
        //Instancia a tabela de acordo com o modelo
        modeloTabela = new ModeloTabelaContatos();
        tabelaContatos = new JTable(modeloTabela);
        //Inicia um botão para listar e outro para limpar
        listarContatos = new JButton("Listar");
        limparTabela = new JButton("Limpar");
        listarContatos.setToolTipText("Este botão lista os contatos do banco de dados e os coloca na tabela.");
        limparTabela.setToolTipText("Este botão limpa a tabela.");
        //Faz inicializações no JFrame
        setSize(600, 600);
        setLocation(50, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //Colocar a tabela em um scrooll pane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(tabelaContatos);
        //Adiciona o scrollPane com a tabela no centro do layout
        add(scrollPane, BorderLayout.CENTER);
        //Adiciona os botões no pé do layout.
        JPanel jPaneBotoes = new JPanel(new GridLayout(1,2));
        jPaneBotoes.add(listarContatos);
        jPaneBotoes.add(limparTabela);
        add(jPaneBotoes,BorderLayout.SOUTH);
        //Registra os eventos dos dois botões
        listarContatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarContatos();
            }
        });
        limparTabela.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparTabela();
            }


        });

    }

    private void listarContatos(){
        try {
            ContatoDAO dao = new ContatoDAO();
            modeloTabela.setListaContatos(dao.getLista());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparTabela() {
        modeloTabela.limpaTabela();
    }

    public static void main(String[] args) {
        new ListaDeContatosComBotoes().setVisible(true);
    }
}
