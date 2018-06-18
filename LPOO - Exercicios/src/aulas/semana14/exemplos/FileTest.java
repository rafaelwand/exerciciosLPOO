

package aulas.semana14.exemplos;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

// Java extension packages
import javax.swing.*;

public class FileTest extends JFrame
   implements ActionListener {

   private JTextField enterField;
   private JTextArea outputArea;

   // set up GUI
   public FileTest()
   {
      super( "Testando um caminho" );

      enterField = new JTextField(
         "Entre com um caminho de arquivo ou diretório" );
      enterField.addActionListener( this );
      outputArea = new JTextArea();

      ScrollPane scrollPane = new ScrollPane();
      scrollPane.add( outputArea );

      Container container = getContentPane();
      container.add( enterField, BorderLayout.NORTH );
      container.add( scrollPane, BorderLayout.CENTER );

      setSize( 400, 400 );
      show();
   }

   // display information about file user specifies
   public void actionPerformed( ActionEvent actionEvent )
   {
      File name = new File( actionEvent.getActionCommand() );

      // if name exists, output information about it
      if ( name.exists() ) {
         outputArea.setText(
            name.getName() + " existe\n" +
            ( name.isFile() ?
               "é um arquivo\n" : "não é um arquivo\n" ) +
            ( name.isDirectory() ?
               "é um diretório\n" : "não é um diretório\n" ) +
            ( name.isAbsolute() ? "é caminho absoluto\n" :
               "não é caminho absoluto\n" ) +
            "Última modificação: " + name.lastModified() +
            "\nTamanho: " + name.length() +
            "\nCaminho: " + name.getPath() +
            "\nCaminho absoluto: " + name.getAbsolutePath() +
            "\nPai: " + name.getParent() );

         // output information if name is a file
         if ( name.isFile() ) {

            // append contents of file to outputArea
            try {
               BufferedReader input = new BufferedReader(
                  new FileReader( name ) );
               StringBuffer buffer = new StringBuffer();
               String text;
               outputArea.append( "\n\n" );

               while ( ( text = input.readLine() ) != null )
                  buffer.append( text + "\n" );

               outputArea.append( buffer.toString() );
            }

            // process file processing problems
            catch( IOException ioException ) {
               JOptionPane.showMessageDialog( this,
                  "FILE ERROR",
                  "FILE ERROR", JOptionPane.ERROR_MESSAGE );
            }
         }

         // output directory listing
         else if ( name.isDirectory() ) {
            String directory[] = name.list();

            outputArea.append( "\n\nConteúdo do diretório:\n");

            for ( int i = 0; i < directory.length; i++ )
               outputArea.append( directory[ i ] + "\n" );
         }
      }

      // not file or directory, output error message
      else {
         JOptionPane.showMessageDialog( this,
            actionEvent.getActionCommand() + " Não existe",
            "ERROR", JOptionPane.ERROR_MESSAGE );
      }

   }  // end method actionPerformed

   // execute application
   public static void main( String args[] )
   {
      FileTest application = new FileTest();

      application.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE );
   }

}  // end class FileTest

/**************************************************************************
 * (C) Copyright 2002 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
