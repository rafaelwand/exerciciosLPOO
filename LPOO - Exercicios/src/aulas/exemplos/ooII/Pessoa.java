package aulas.exemplos.ooII;
/**
 * Teste do Rafael
 * @author Rafael
 */
public class Pessoa {
    private String nome;
    private long rg;
    private long cpf;
    private String endereco;
    public Pessoa(String nome, long rg, long cpf, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getRg() {
        return rg;
    }
    public void setRg(long rg) {
        this.rg = rg;
    }
}
