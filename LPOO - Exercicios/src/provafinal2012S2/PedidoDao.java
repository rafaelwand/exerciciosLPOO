/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal2012S2;

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
public class PedidoDao {

    private String stmtSelectPedido = "select * from pedido where id_cliente=?";
    private String stmtSelectProduto = "SELECT prova2.produto.id,prova2.produto.descricao, prova2.item_do_pedido.qtdade "+
                                                        "FROM prova2.produto "+
                                                            "INNER JOIN prova2.item_do_pedido "+
                                                                "ON prova2.produto.id = prova2.item_do_pedido.id_produto "+
                                                        "WHERE prova2.item_do_pedido.id_pedido = ?";
    private String stmtSelectCliente = "select * from cliente where id=?";
     
    public List<ItemDoPedido> obterItensDoPedido(int idPedido) throws SQLException{
        Connection con;
        PreparedStatement stmt;
        List<ItemDoPedido> produtosDoPedido = new ArrayList();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prova2", "root", "");
            stmt = con.prepareStatement(stmtSelectProduto);
            stmt.setInt(1, idPedido);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // criando o objeto Pedido
                Produto produto = new Produto(rs.getInt(1),rs.getString(2));
                int quantidade = rs.getInt(3);
                ItemDoPedido produtoDoPedido = new ItemDoPedido(produto,quantidade);
                // adicionando o objeto à lista
                produtosDoPedido.add(produtoDoPedido);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
         return produtosDoPedido;

    }

    public Cliente obterCliente(int idCliente){
        Connection con;
        PreparedStatement stmt;
        Cliente cliente=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prova2", "root", "");
            stmt = con.prepareStatement(stmtSelectCliente);

            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // criando o objeto Cliente
                cliente = new Cliente(idCliente,rs.getString(1),rs.getString(2),rs.getString(3));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
         return cliente;
    }
}
    
    
    
    /*
    public List<Pedido> obterPedidosDoCliente(int idCliente){
        List<Pedido> pedidos = new ArrayList();
        try {
            stmtSelectPedido.setInt(1, idCliente);
            ResultSet rs = stmtSelectPedido.executeQuery();
            while (rs.next()) {
                int idPedido = rs.getInt("id");
                List<ItemDoPedido> produtosDoPedido = obterItensDoPedido(idPedido);
                Cliente cliente = obterCliente(idCliente);
                // criando o objeto Pedido
                Pedido contato = new Pedido(idPedido, rs.getString("data"),cliente,produtosDoPedido);
                // adicionando o objeto à lista
                pedidos.add(contato);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
         return pedidos;
    }*/
