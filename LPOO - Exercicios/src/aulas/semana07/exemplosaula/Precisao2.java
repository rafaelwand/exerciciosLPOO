package aulas.semana07.exemplosaula;
import java.math.BigDecimal;
public class Precisao2 {
    public static void main(String[] args){
        BigDecimal a= new BigDecimal("100");
        BigDecimal b=a.add(new BigDecimal("0.1"));
        b=b.subtract(a);
        System.out.printf ("b= %.3f \n", b.doubleValue());
        System.out.printf ("a= %.3f \n", a.doubleValue());
        if(b.doubleValue()==0.1){
            System.out.println("Resultado Correto");
        }else{
            System.out.println("Resultado Errado");
        }
    }
}