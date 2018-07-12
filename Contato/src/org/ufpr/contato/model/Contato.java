package org.ufpr.contato.model;

import java.time.LocalDate;
public class Contato {

    private Long id;
    private String nome;
    private String email;
    private String endereco;
    private LocalDate dataNascimento;
    //private Calendar dataNascimento;

    public Contato(Long id, String nome, String email, String endereco, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public void clone(Contato contato){
        this.nome = contato.nome;
        this.email = contato.email;
        this.endereco = contato.endereco;
        this.dataNascimento = contato.dataNascimento;        
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
