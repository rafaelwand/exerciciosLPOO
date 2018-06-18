/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana10.exemlos;

import aulas.semana08.exemplosaula.livroautor.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class TestaArrayList {
    
    public static void main(String[] args){
        List lista = new ArrayList();
        lista.add(new Autor(""));
        lista.add("String");
        Autor primeiro = (Autor)lista.get(1);
        String segundo = (String)lista.get(1);
    }
    
}
