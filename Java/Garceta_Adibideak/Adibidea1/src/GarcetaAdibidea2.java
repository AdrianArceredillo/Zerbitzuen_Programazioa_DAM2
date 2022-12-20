/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;

/**
 *
 * @author arceredillo.adrian
 */

//argumentos

public class GarcetaAdibidea2 {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        Runtime r = Runtime.getRuntime();
        String comando = "CMD /C DIR";  //puede estar en mayúsculas o en minúsculas
        Process p = null;
        try {
            p = r.exec(comando);
            InputStream is = p.getInputStream();
            InputStream isErr = p.getErrorStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedReader brErr = new BufferedReader(new InputStreamReader(isErr));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
// COMPROBACION DE ERROR - 0 bien - 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
