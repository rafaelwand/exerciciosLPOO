/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.prova01.containvestimento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ContaInvestimentoDao implements ContaInvestimentoDaoI {
    private Connection con;
    private PreparedStatement stmtInsert;
    private PreparedStatement stmtLista;
    public ContaInvestimentoDao() throws SQLException{
        con = DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "");
        stmtInsert = con.prepareStatement("INSERT INTO CONTA_INVESTIMENTO (NUMERO, DONO, SALDO, MONTANTE_MINIMO, DEPOSITO_MINIMO) VALUES (?, ?, ?, ?, ?)");
        stmtLista = con.prepareStatement("SELECT * FROM CONTA_INVESTIMENTO WHERE SALDO>=?");
    }
    @Override
    public void criaConta(ContaInvestimento conta){
        try {
            stmtInsert.setLong(1,  conta.getNumero());
            stmtInsert.setString(2, conta.getDono());
            stmtInsert.setDouble(3, conta.getSaldo());
            stmtInsert.setDouble(4, conta.getMontanteMinimo());
            stmtInsert.setDouble(5, conta.getDepositoMinimo());
            stmtInsert.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro ao incluir conta numero = "+conta.getNumero());
        }
    }
    @Override
    public List<ContaInvestimento> listaContaPorSaldoMaior(double saldo) {
        List<ContaInvestimento>listDeContas = new ArrayList();
        try {
            stmtLista.setDouble(1, saldo);
            ResultSet rs = stmtLista.executeQuery();
            while (rs.next()) {
                ContaInvestimento conta = new ContaInvestimento(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5));
                listDeContas.add(conta);
            }
         }
         catch (SQLException ex) {
             ex.printStackTrace();
            System.out.println("Erro ao listar contas.");
        }
        return listDeContas;
    }
}
