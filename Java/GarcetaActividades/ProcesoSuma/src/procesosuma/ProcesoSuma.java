/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesosuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author arceredillo.adrian
 */
public class ProcesoSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String line;
        try {
            Process hijo = Runtime.getRuntime().exec("cmd /c java -jar Suma.jar");
            BufferedReader brin = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
            PrintStream ps = new PrintStream(hijo.getOutputStream());
            String str = "";
            String zenb1, zenb2;
            
            System.out.println("Sartu 1.zenbakia: ");
            zenb1 = brin.readLine();
            System.out.println("Sartu 2.zenbakia: ");
            zenb2 = brin.readLine();
            
            ps.println(zenb1);      //no es necesario escribir nada
            ps.flush();                 //asegura que los datos se han enviado
            ps.println(zenb2);      //no es necesario escribir nada
            ps.flush();                 //asegura que los datos se han enviado
            
            if ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch(IOException e) {
            
        }

    }

}
