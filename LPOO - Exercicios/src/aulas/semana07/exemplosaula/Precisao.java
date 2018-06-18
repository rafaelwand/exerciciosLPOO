package aulas.semana07.exemplosaula;
public class Precisao {
    public static void main(String[] args){
        double a=100.0;
        double b = a + 0.1;
        b=b-a;
        System.out.printf ("b= %.20f \n", b);
        System.out.printf ("a= %.20f \n", a);
        if(b==0.1){
            System.out.println("Resultado Correto");
        }else{
            System.out.println("Resultado Errado");
        }
     }
}