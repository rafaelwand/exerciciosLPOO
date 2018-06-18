/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.testeprova;

class Pessoa{
    private String nome;
    private int cpf;
    public Pessoa(String nome, int cpf){
        this.nome=nome;
        this.cpf=cpf;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

}
public class Questao10 {
    public static void main(String[] args){
        Pessoa joao= new Pessoa("Joao",299);
        Pessoa paulo=joao;
        paulo.setNome("Paulo");
        paulo.setCpf(300);
        System.out.println("Nome = " + joao.getNome());
        System.out.println("Nome = " + paulo.getNome());
    }

}
