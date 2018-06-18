package aulas.semana05.exemplosaula.interfaces;

public abstract class Mensagem {

    private String conteudo;

    public Mensagem(String conteudo) {
        setConteudo(conteudo);
    }

    protected void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
