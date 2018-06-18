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
public class Pedido {
    private int id;
    private String data;
    private Cliente cliente;
    private List<ProdutoDoPedido> produtos;

    public static class ProdutoDoPedido{
        Produto produto;
        int quantidade;
    }

    public Pedido(int id, String data, Cliente cliente, List<ProdutoDoPedido> produtos) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<ProdutoDoPedido> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDoPedido> produtos) {
        this.produtos = produtos;
    }

}
