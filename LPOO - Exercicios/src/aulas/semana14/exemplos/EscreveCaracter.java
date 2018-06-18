/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulas.semana14.exemplos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 *
 * @author Rafael
 */
public class EscreveCaracter {
    private static OutputStream os;

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("./src/aulas/semana14/exemplos/arquivoEscrita3.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
        System.out.println(osw.getEncoding());
        osw.write('Ç');
        osw.write('A');
        osw.close();
    }
}
