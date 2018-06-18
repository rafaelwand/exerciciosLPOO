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
public class ClienteDAO {
    private Connection connection;

    public ClienteDAO() {
        this.connection = null;
    }


    public List<Cliente> listaClientes(){
        return null;
    }

    public Cliente getCliente(String cpf){
        return null;
    }

    public Cliente getClientePorPedido(int identificadorPedido){
        return null;
    }

    public void cadastraCliente(Cliente cliente){
        //Cadastra pedido se houver
    }

    public void atualizaCliente(Cliente cliente){
        //Atualiza cliente
        //Atualiza dados do pedido se houver pedido
    }

    public void excluiCliente(Cliente cliente){

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

    public void excluiPedidoDoCliente(Pedido pedido,String cpfCliente){

    }

}
