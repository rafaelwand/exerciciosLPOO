/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal2012S2_2;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface PedidoDaoInterface {
    public List<Pedido.ProdutoDoPedido> obterProdutosDoPedido(int idPedido);
    public Cliente obterCliente(int idCliente);
}
