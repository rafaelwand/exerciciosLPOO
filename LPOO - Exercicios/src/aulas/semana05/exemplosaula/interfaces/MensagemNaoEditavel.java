package aulas.semana05.exemplosaula.interfaces;

public class MensagemNaoEditavel extends Mensagem implements Imprimivel {

    public MensagemNaoEditavel(String conteudo) {
        super(conteudo);
    }

    public void imprimir() {
        imprimirNoConsole();
    }

    public void imprimirNoConsole() {
        System.out.println(getConteudo());
    }
}
