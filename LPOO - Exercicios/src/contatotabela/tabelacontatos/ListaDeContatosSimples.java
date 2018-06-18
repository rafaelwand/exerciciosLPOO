/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package contatotabela.tabelacontatos;

import contatotabela.contato.Contato;
import contatotabela.contato.ContatoDAO;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class ListaDeContatosSimples {
    public static void main(String[] args) throws SQLException{
        JFrame frame = new JFrame("Teste JTable");
        frame.setSize(600, 600);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        ContatoDAO dao = new ContatoDAO();
        ModeloTabelaContatos tabelaModelo = new ModeloTabelaContatos(dao.getLista());
        JTable tabela = new JTable(tabelaModelo);


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(tabela);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);

        tabelaModelo.adicionaContato(new Contato(10L, "João", "joao@gmail.com", "Rua Patati", Calendar.getInstance()));
    }
}
