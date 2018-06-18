package aulas.semana10.exemlos;
import java.util.ArrayList;
public class Lista {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        lista.add(new Integer(0));
        lista.add("1");
        lista.add(new Integer(2));
        Integer i1 = (Integer) lista.get(0);
	Integer i2 = (Integer) lista.get(1);
    }
}
