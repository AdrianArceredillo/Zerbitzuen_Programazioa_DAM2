/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_1_5;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author arceredillo.adrian
 */
public class Actividad1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runtime r = Runtime.getRuntime();

        //String comando = "java -jar Actividad_1_5.jar \"2\" ";
        //String comando = "java -jar Agurra.jar \"Hola Mundo!!\" ";
        String comando = "java -jar UnSaludo.jar ";
        
        Process p = null;
        
        /*for (int i = 0; i < 1; i++) {
            System.out.println(i + 1 + ".Agurra " + args[0]);
            System.out.println(i + 2 + ".Agurra " + args[1]);  
        }
        
        int eragiketa = (Integer.parseInt(args[0])) + Integer.parseInt(args[1]);
        System.out.println("----------------");
        System.out.println("Emaitza: " + eragiketa);*/
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        try {
            System.out.println("Introduce dos valores: ");
            args[0] = br.readLine();
            args[1] = br.readLine();

            int resultado = (Integer.parseInt(args[0])) + Integer.parseInt(args[1]);
            //System.out.println("Zenb1: " + zenb1 + ", Zenb2: " + zenb2);
            System.out.println("Emaitza: " + resultado);
            //zenb1 = br.readLine();
            //System.out.printIn("Cadena escrita:'"ttexto);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        /*try {
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
        }*/
        

        
        /*
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        try {
            System.out.println("Introduce una cadena");
            zenb1 = Integer.parseInt(br.readLine());
            zenb2 = Integer.parseInt(br.readLine());

            int resultado = zenb1 + zenb2;
            //System.out.println("Zenb1: " + zenb1 + ", Zenb2: " + zenb2);
            System.out.println("Emaitza: " + resultado);
            //zenb1 = br.readLine();
            //System.out.printIn("Cadena escrita:'"ttexto);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}
