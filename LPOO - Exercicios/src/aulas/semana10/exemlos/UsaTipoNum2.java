/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana10.exemlos;

import aulas.semana05.exemplosaula.bicicleta.Bicicleta;
import aulas.semana08.exemplosaula.livroautor.Autor;

/**
 *
 * @author Rafael
 */
public class UsaTipoNum2 {
   public static void main(String[] args) throws Exception{
       Bicicleta b = new Bicicleta(1,1,1);
       TipoNum<Autor> tipoNum = new TipoNum(1,new Autor("Eu"));
       tipoNum.setValor(null);
       
       TipoNum<Bicicleta> tipoNum2 = new TipoNum(1,b);
       
       Bicicleta b2 = tipoNum2.getValor();
       
   }
    
}
