/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal2012S2_2;

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
public class PedidoDao implements PedidoDaoInterface{

    private Connection connection;
    private PreparedStatement stmtSelectPedido;
    private PreparedStatement stmtSelectProduto;
    private PreparedStatement stmtSelectCliente;
    public PedidoDao() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/prova2", "root", "");
        stmtSelectPedido = connection.prepareStatement("select * from pedido where id_cliente=?");
        stmtSelectCliente = connection.prepareStatement("select * from cliente where id=?");
        stmtSelectProduto = connection.prepareStatement("SELECT prova2.produto.id,prova2.produto.descricao, prova2.pedido_produto.qtdade "+
                                                        "FROM prova2.produto "+
                                                            "INNER JOIN prova2.pedido_produto "+
                                                                "ON prova2.produto.id = prova2.pedido_produto.id_produto "+
                                                        "WHERE prova2.pedido_produto.id_pedido = ?");
    }

    public List<Pedido.ProdutoDoPedido> obterProdutosDoPedido(int idPedido){
        List<Pedido.ProdutoDoPedido> produtosDoPedido = new ArrayList();
        try {
            stmtSelectProduto.setInt(1, idPedido);
            ResultSet rs = stmtSelectProduto.executeQuery();
            while (rs.next()) {
                // criando o objeto Pedido
                Pedido.ProdutoDoPedido pedidoDoProduto = new Pedido.ProdutoDoPedido();
                pedidoDoProduto.produto = new Produto(rs.getInt(1),rs.getString(2));
                pedidoDoProduto.quantidade = rs.getInt(3);
                // adicionando o objeto à lista
                produtosDoPedido.add(pedidoDoProduto);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
         return produtosDoPedido;

    }

    public Cliente obterCliente(int idCliente){
        Cliente cliente=null;
        try {
            stmtSelectCliente.setInt(1, idCliente);
            ResultSet rs = stmtSelectCliente.executeQuery();

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

    public List<Pedido> obterPedidosDoCliente(int idCliente){
        List<Pedido> pedidos = new ArrayList();
        try {
            stmtSelectPedido.setInt(1, idCliente);
            ResultSet rs = stmtSelectPedido.executeQuery();
            while (rs.next()) {
                int idPedido = rs.getInt("id");
                List<Pedido.ProdutoDoPedido> produtosDoPedido = obterProdutosDoPedido(idPedido);
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
    }
}
