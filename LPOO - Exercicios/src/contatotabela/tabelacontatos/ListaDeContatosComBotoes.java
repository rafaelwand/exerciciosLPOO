/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package contatotabela.tabelacontatos;


import contatotabela.contato.Contato;
import contatotabela.contato.ContatoDAO;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
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
    private JButton incluirContato;
    private JButton excluirContato;

    public ListaDeContatosComBotoes(){
        super("Tabela Contatos do Banco de Dados");
        //Instancia a tabela de acordo com o modelo
        modeloTabela = new ModeloTabelaContatos();
        tabelaContatos = new JTable(modeloTabela);
        //Inicia um botão para listar e outro para limpar
        listarContatos = new JButton("Listar");
        limparTabela = new JButton("Limpar Lista");
        incluirContato = new JButton("Incluir Contato");
        excluirContato = new JButton("Excluir Contato");
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
        jPaneBotoes.add(incluirContato);
        jPaneBotoes.add(excluirContato);
        add(jPaneBotoes,BorderLayout.SOUTH);
        //Registra os eventos para os botões
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
        incluirContato.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Contato contato = new Contato();
                modeloTabela.adicionaContato(contato);
            }
        });

        excluirContato.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ContatoDAO dao = new ContatoDAO();
                    int[] linhasSelecionadas = tabelaContatos.getSelectedRows();
                    List<Contato> listaExcluir = new ArrayList();
                    for (int i = 0; i < linhasSelecionadas.length; i++) {
                        Contato contato = modeloTabela.getContato(linhasSelecionadas[i]);
                        dao.excluir(contato);
                        listaExcluir.add(contato);
                        
                    }
                    for(Contato contato:listaExcluir){
                        modeloTabela.removeContato(contato);
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        //Registra o evento da modificação da tabela
        TabelaEscutadorEvento escutador = new TabelaEscutadorEvento();
        modeloTabela.addTableModelListener(escutador);


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
