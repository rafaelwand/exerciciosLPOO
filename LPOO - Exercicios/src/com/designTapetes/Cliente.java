/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designTapetes;

/**
 *
 * @author Rafael
 */
public class Cliente {
    private String nome;
    private String sobreNome;
    private int cpf;
    private Pedido pedido;

    public Cliente(String nome, String sobreNome, int cpf) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

}
