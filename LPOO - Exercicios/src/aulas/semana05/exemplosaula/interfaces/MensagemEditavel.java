package aulas.semana05.exemplosaula.interfaces;

public class MensagemEditavel extends Mensagem implements Editavel, Imprimivel {

    public MensagemEditavel(String conteudo) {
        super(conteudo);
    }

    public void editar(String conteudo) {
        setConteudo(conteudo);
    }

    public void imprimir() {
        imprimirNoConsole();
    }

    public void imprimirNoConsole() {
        System.out.println(getConteudo());
    }
}

