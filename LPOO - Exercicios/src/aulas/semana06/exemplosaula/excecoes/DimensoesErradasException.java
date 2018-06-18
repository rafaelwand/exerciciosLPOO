package aulas.semana06.exemplosaula.excecoes;

public class DimensoesErradasException extends Exception {

    public DimensoesErradasException() {
        super("Voce informou dimensoes incorretas para o retangulo. Nao e permitido 0 ou valores negativos.");
    }
}
