/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana06.exemplosaula.enumeracao;

/**
 *
 * @author Rafael
 */
public enum Opcoes {
    //Constantes enum: devem estar no começo, como lista
    COMPACTAR("Compactacao",0),
    DESCOMPACTAR("Descompactacao",1);
    //Campos devem ser final
    private final int valor;
    private final String nome;
    //Construtor não tem especificador de acesso
    Opcoes(String n, int v){
        nome=n;valor=v;
    }

    public int getValor(){return valor;}
    public String getNome() {return nome;}

    public String toString(){
        return nome + "("+valor+")";
    }

}
