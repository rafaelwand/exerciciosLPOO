package aulas.semana09.prova;
abstract class Navio {
    protected static int i;
    private int j;
    abstract void f();
    final void q() {};
    //final void h() {};//LINHA 6
}
final class Fragata extends Navio{
    int m;
    void f() {}
    void h() {}
     void k() {i++;} //LINHA 12
    // void l() {j++;} //LINHA 13
    // Fragata(int n) {m=n;} //LINHA 14
      public static void main(String args[]){
        Navio mc = new Fragata();
    }
}
