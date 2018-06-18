/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designTapetes;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class PedidoDAO {
    private Connection connection;

    public PedidoDAO() {
        this.connection = null;
    }
    public List<Pedido> listaPedidos(){
        return null;
    }


    public Pedido getPedidoDoCliente(Cliente cliente){
        return null;
    }

    public void atualizaPedido(Pedido pedido){
        //Implementar para excluir tapetes do pedido
        //Implementar para incluir tapetes no pedido
    }

    public void adicionaPedidoAoCliente(Pedido pedido,String cpfCliente){

    }

    public void excluiPedidoDoCliente(Pedido pedido){
        
    }



}
