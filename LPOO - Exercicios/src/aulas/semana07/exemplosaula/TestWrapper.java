package aulas.semana07.exemplosaula;
public class TestWrapper {
   public static void main(String[] args) {
      Float w = Float.valueOf("89f");
      int i = w.intValue();
      System.out.println(w.toString());
      System.out.println(i);
      String s1 = Integer.toString(511,28);
      String s2 = Integer.toString(256,2);
      System.out.println(s1);
      System.out.println(s2);
      int j = Integer.parseInt("54");
   }
}
