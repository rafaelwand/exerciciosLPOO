/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.tabelacontato;

import exerciciosloo.tabelacontato.contato.Contato;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael
 */
public class ModeloTabelaContatos extends AbstractTableModel{
    private String[] colunas=new String[]{"id","Nome", "email", "Nascimento","Endereco"};

    private List<Contato> lista=new ArrayList();

    
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
    public boolean isCellEditable(int row, int column) {
        if(column==0)
            return false;
        return true;
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

    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            Contato customer = lista.get(row);
            switch (col) {
                case 0:
                    customer.setId((Long) value); //if column 0 (code)
                    break;
                case 1:
                    customer.setNome((String) value);
                    break;
                case 2:
                    customer.setEmail((String) value);
                    break;
                case 3:
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    Date data = format.parse((String) value);
                    cal.setTime(data);
                    customer.setDataNascimento(cal);
                    break;
                case 4:
                    customer.setEndereco((String) value);
                    break;
                default:
            }
            this.fireTableCellUpdated(row, col);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public boolean removeContato(Contato customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaContato(Contato customer) {
        this.lista.add(customer);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaContatos(List<Contato> contatos) {
        this.lista = contatos;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Contato getContato(int linha){
        return lista.get(linha);
    }

}
