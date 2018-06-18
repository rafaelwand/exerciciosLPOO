/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provafinal2012S2;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class Pedido {
    private int id;
    private String data;
    private Cliente cliente;
    private List<ItemDoPedido> itens;

    public Pedido(int id, String data, Cliente cliente, List<ItemDoPedido> itens) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itens = itens;
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

    public List<ItemDoPedido> getProdutos() {
        return itens;
    }

    public void setProdutos(List<ItemDoPedido> itens) {
        this.itens = itens;
    }

}
