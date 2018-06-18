/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana11.exemplos;

/**
 *
 * @author Rafael
 */
class Contato {
    private String nome;
    private String sobreNome;

    public Contato(String nome, String sobreNome){
        this.nome=nome;
        this.sobreNome=sobreNome;
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
