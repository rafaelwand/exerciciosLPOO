/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package semana09_exemplos_swing.listacontatos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael
 */
public class ModeloTabelaContatos extends AbstractTableModel{
    private String[] colunas=new String[]{"id","Nome", "email", "Nascimento","Endereco"};

    public List<Contato> lista=new ArrayList();

    public ModeloTabelaContatos(List<Contato> lista){
        this.lista=lista;
    }

    public ModeloTabelaContatos(){
    }


    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contato customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getId();//if column 0 (code)
            case 1: return customer.getNome();//if column 1 (name)
            case 2: return customer.getEmail();//if column 2 (birthday)
            case 3: return new SimpleDateFormat( "dd/MM/YYYY" ).format(customer.getDataNascimento().getTime()) ;
            case 4: return customer.getEndereco() ;
            default : return null;
        }
    }

    public boolean removeContato(Contato customer) {
        boolean result = this.lista.remove(customer);
        this.fireTableDataChanged();//update JTable
        return result;
    }

    public void adicionaContato(Contato customer) {
        this.lista.add(customer);
        this.fireTableDataChanged();//update JTable
    }

    public void setListaContatos(List<Contato> contatos) {
        this.lista = contatos;
        this.fireTableDataChanged();//update JTable
    }

    public void limpaTabela() {
        this.lista = new ArrayList();
        this.fireTableDataChanged();//update JTable
    }

    public Contato getContato(int linha){
        return lista.get(linha);
    }

}
