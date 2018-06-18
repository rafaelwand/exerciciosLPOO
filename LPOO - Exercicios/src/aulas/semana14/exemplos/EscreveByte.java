/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana14.exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Rafael
 */
public class EscreveByte {

    public static void main(String[] args) throws IOException {
        //OutputStream os = new FileOutputStream("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\ExerciciosLOO\\src\\aulas\\semana14\\exemplos\\arquivoEscrita.txt");
        OutputStream os = new FileOutputStream("./src/aulas/semana14/exemplos/arquivoEscrita3.txt");
        os.write(67);
        os.write(68);
        os.close();
        //System.out.println(b);
    }
}
