package aulas.semana06.exemplosaula.excecoes;

public class CriaRet {

    public static void main(String args[]) {
        try {
            float larg, alt;
            larg = Float.parseFloat(args[0]);
            alt = Float.parseFloat(args[1]);
            Retangulo2 retangulo = new Retangulo2(larg, alt);
            System.out.println("Retangulo: " + retangulo.getLargura() + "," + retangulo.getAltura());
        } catch (Exception exc) {
            System.out.println("Erro durante a execucao.\n" + exc.toString());
        }
    }
}
