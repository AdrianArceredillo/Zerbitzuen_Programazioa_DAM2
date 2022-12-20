/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garceta_adibidea3;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author arceredillo.adrian
 */
public class Garceta_Adibidea3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        //le pasas el argumento \"Hola Mundo!!\"  a la GacetaUnSaludo.jar
        //String comando = "java -jar UnSaludo.jar \"Hola Mundo!!\" ";
        String comando = "java -jar UnSaludo2.jar \"Hola Mundo!!\"  ";
        Process p = null;
        //Si sale error aparece este mensaje 
        if (args.length < 1) {
            System.out.println("SE NECESITA UN NOMBRE DE FICHERO...");
            System.exit(1);
        }
        try {
//fichero al que se enviará la salida del programa Unsaludo
            //FileOutputStream fos = new FileOutputStream(args[0]);
            FileOutputStream fos = new FileOutputStream("prueba");
            PrintWriter pw = new PrintWriter(fos);
            p = r.exec(comando);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;

            while ((linea = br.readLine()) != null) //lee la salida de Unsaludo
            {
                System.out.println("INSERTO EN " + args[0] + " > " + linea);
                pw.println(linea); //la inserta en el fichero
            }
            br.close();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
// COMPROBACION DE ERROR - 0 bien 1 -mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
