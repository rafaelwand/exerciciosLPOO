/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosloo.testeprova;

/**
 *
 * @author Rafael
 */
public class C {
	private Integer l, a;
	public C () throws Exception {
		this (0,1);
	}
	public C (int pl, int pa) throws Exception {
		this.setValores (pl, pa);
	}
	public void setValores (int pl, int pa) throws Exception {
		if (pl>=0 && pa >=0) {
			l = pl;
			a = pa;
		}else {
			throw new Exception ("2");
		}
                System.out.println(this.l);
                System.out.println(this.a);
	}
	public static void main (String args[]){
		try {
			C obj = new C();
			C obj2 = new C (-1, 3);
                        C obj3 = new C (2,6);
		}catch (Exception e) {
                        System.out.println(e.getMessage());
			System.out.println ("4");
		}finally {
			System.out.println ("5");
		}
	}
}
