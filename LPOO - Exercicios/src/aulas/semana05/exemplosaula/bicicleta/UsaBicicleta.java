/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana05.exemplosaula.bicicleta;

/**
 *
 * @author Rafael
 */
public class UsaBicicleta {
    public static void main(String[] args ) throws MarchaException, RpmException, VelocidadeException{
                // Cria 2 objetos bicicletas diferentes
        Bicicleta bicicletaDoRafael = new Bicicleta(1, 2, 0);
        Bicicleta bicicletaDaMaria = new Bicicleta(0, 2, 0);
        
        
        if(bicicletaDaMaria.equals(bicicletaDoRafael)){
            System.out.println("São iguais.");
        }else{
            System.out.println("São diferentes.");
        }

        System.out.println(bicicletaDoRafael.equals(bicicletaDaMaria));

        // Invoca os métodos destes 2 objetos criados
        bicicletaDoRafael.setRpm(50);
        bicicletaDoRafael.setVelocidade(10);
        bicicletaDoRafael.setMarcha(3);
        System.out.println("Rafael:\n"+bicicletaDoRafael.toString());


        bicicletaDaMaria.setRpm(100);
        bicicletaDaMaria.setVelocidade(20);
        bicicletaDaMaria.setMarcha(3);
        bicicletaDaMaria.setMarcha(4);
        System.out.println("Maria:\n"+bicicletaDaMaria.toString());
        
        bicicletaDoRafael = bicicletaDaMaria;
        bicicletaDoRafael.setVelocidade(40);
        bicicletaDaMaria.setVelocidade(50);
        System.out.println(bicicletaDoRafael.equals(bicicletaDaMaria));
        
        System.out.println("A velocidade da bicicleta da Maria é="+bicicletaDaMaria.getVelocidade());
        System.out.println("A velocidade da bicicleta do Rafael é="+bicicletaDoRafael.getVelocidade());
    }
}
