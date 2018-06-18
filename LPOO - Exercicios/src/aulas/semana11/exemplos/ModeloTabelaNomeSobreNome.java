/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana11.exemplos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael
 */
class ModeloTabelaNomeSobreNome extends AbstractTableModel{
    private String[] colunas = {"Nome","SobreNome"};
    private List<Contato> contatos = new ArrayList();


    public ModeloTabelaNomeSobreNome() {
    }

    @Override
    public int getRowCount() {
        return this.contatos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Contato customer = contatos.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getNome();//if column 0 (code)
            case 1: return customer.getSobreNome();//if column 1 (name)
            default : return null;
        }
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    public boolean removeContato(Contato customer) {
        boolean result = this.contatos.remove(customer);
        this.fireTableDataChanged();//update JTable
        return result;
    }

    public void adicionaContato(Contato customer) {
        this.contatos.add(customer);
        this.fireTableDataChanged();//update JTable
    }

    public void setListaContatos(List<Contato> contatos) {
        this.contatos = contatos;
        this.fireTableDataChanged();//update JTable
    }

    public void limpaTabela() {
        this.contatos = new ArrayList();
        this.fireTableDataChanged();//update JTable
    }

    public Contato getContato(int linha){
        return contatos.get(linha);
    }

}
