/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal2012S2_2;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class UsaPedido {
    public static void main(String[] args){
        try {
            PedidoDao pedidoDao = new PedidoDao();
            List<Pedido> pedidos = pedidoDao.obterPedidosDoCliente(0);
            for(Pedido pedido:pedidos){
                System.out.println("Cliente =" + pedido.getCliente().getNome());
                System.out.println("Lista de produtos");
                for(Pedido.ProdutoDoPedido produtoDoPedido:pedido.getProdutos()){
                    System.out.println("produto="+produtoDoPedido.produto.getDescricao());
                    System.out.println("qtdqde="+produtoDoPedido.quantidade);
                }
                
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
