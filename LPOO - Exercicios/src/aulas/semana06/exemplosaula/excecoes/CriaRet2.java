package aulas.semana06.exemplosaula.excecoes;
public class CriaRet2 {

    public static void main(String args[]) {
        try {
            float larg, alt;
            larg = Float.parseFloat(args[0]);
            alt = Float.parseFloat(args[1]);
            Retangulo2 retangulo = new Retangulo2(larg, alt);
            System.out.println("Retangulo: " + retangulo.getLargura() + "," + retangulo.getAltura());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRO: Numero insuficiente de argumentos.");
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Argumento(s) invalido(s).");
        } catch (Exception e) {
            //Trata erros de instanciacao do retangulo
            System.out.println("ERRO: Dimensoes invalidas.");
        }
    }
}
