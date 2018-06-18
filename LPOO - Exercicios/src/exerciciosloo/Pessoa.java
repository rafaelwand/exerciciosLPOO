/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosloo;

/**
 *
 * @author Rafael
 */
public class Pessoa implements Cloneable{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa retornaClone() {
        try {
            return (Pessoa) this.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
