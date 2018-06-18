/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.prova01.conta;

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
public class ContaCorrenteDao implements ContaCorrenteDaoI {
    private Connection con;
    private PreparedStatement stmtInsert;
    private PreparedStatement stmtLista;
    public ContaCorrenteDao() throws SQLException{
        con = DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "");
        stmtInsert = con.prepareStatement("INSERT INTO CONTA_CORRENTE (NUMERO, DONO, SALDO, LIMITE) VALUES (?, ?, ?, ?)");
        stmtLista = con.prepareStatement("SELECT * FROM CONTA_CORRENTE WHERE SALDO>=?");
    }
    @Override
    public void criaConta(ContaCorrente conta){
        try {
            stmtInsert.setLong(1,  conta.getNumero());
            stmtInsert.setString(2, conta.getDono());
            stmtInsert.setDouble(3, conta.getSaldo());
            stmtInsert.setDouble(4, conta.getLimite());
            stmtInsert.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro ao incluir conta numero = "+conta.getNumero());
        }
    }
    @Override
    public List<ContaCorrente> listaContaPorSaldoMaior(double saldo) {
        List<ContaCorrente>listDeContas = new ArrayList();
        try {
            stmtLista.setDouble(1, saldo);
            ResultSet rs = stmtLista.executeQuery();
            while (rs.next()) {
                ContaCorrente conta = new ContaCorrente(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
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
