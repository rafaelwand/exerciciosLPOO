package aulas.semana09.prova;

public class AdivinheAPalavra {
    private int a, b;
    public AdivinheAPalavra() throws Exception {
        this(0, 1);
    }
    public AdivinheAPalavra(int a, int b) throws Exception {
        System.out.print("P");
        this.setValores(a, b);
    }
    public void setValores(int a, int b) throws Exception {
        if (a >= 0 && b >= 0) {
            this.a = a;
            this.b = b;
        } else {
            throw new Exception("L");
        }
        System.out.print("U");
    }
    public static void main(String args[]) {
        try {
            AdivinheAPalavra obj = new AdivinheAPalavra();
            obj.setValores(1,-1);
            obj.setValores(2,2);
            AdivinheAPalavra obj2 = new AdivinheAPalavra(3,3);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.print("A");
        } finally {
            System.out.print("R");
        }
    }
}