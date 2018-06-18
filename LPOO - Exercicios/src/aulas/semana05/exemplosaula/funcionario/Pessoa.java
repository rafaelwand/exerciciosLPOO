/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.semana05.exemplosaula.funcionario;

/**
 *
 * @author Rafael
 */
public abstract class Pessoa {
    private String nome;
    private int cpf;
    private int rg;
    private String endereco;

    public Pessoa(String nome, int cpf, int rg, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
