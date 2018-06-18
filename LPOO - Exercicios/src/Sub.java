/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
class Super{
	public void escreva(){
   	System.out.print("Super");
	}
}

public class Sub extends Super{
	public static void main(String a[]){
Sub s = new Sub();		// AQUI É O COMENTÁRIO
    	s.escreva();
	}

   public void escreva(){
		System.out.print("Sub");
   }
}

