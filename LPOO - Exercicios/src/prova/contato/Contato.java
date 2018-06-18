/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prova.contato;

/**
 *
 * @author Rafael
 */
public class Contato {
    private long cpf;
    private String nome;
    private String sobreNome;
    private String email;
    public Contato(long cpf,String nome, String sobreNome, String email) {
        this.cpf=cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
