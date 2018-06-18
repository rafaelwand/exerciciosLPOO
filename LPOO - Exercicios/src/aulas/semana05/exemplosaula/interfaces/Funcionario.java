
package aulas.semana05.exemplosaula.interfaces;
public class Funcionario implements Pessoa {
    private String nome;
    private String endereco;
    private int idade;

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getIdade(){
        return idade;
    }
}  