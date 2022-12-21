/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author agirrezabala.peru
 */
public class ClienteTCP {
    public static void main(String[] args) throws IOException {

        String Host = "localhost";
        int Puerto = 6000;// puerto remoto
        Socket Cliente = new Socket(Host, Puerto);
        // CREO FLUJO DE SALIDA AL SERVIDOR2
        PrintWriter fsalida = new PrintWriter(Cliente.getOutputStream(), true);
        // CREO FLUJO DE ENTRADA AL SERVIDOR
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
        // FLUJO PARA ENTRADA ESTANDAR
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String cadena, eco = "";
        System.out.println("6 Aukera dituzu zenbaki ezkutua asmatzeko bestela prozesuen errekuperaketara joango zara!!: ");
        while (eco != "*" ) {
            try {
                eco = fentrada.readLine(); // recibo cadena del servidor
            } catch (Exception e) {
                System.out.println("amaitu da jokua ");
                break;
            }
            System.out.println(eco);
            cadena = in.readLine();// lectura por teclado
            fsalida.println(cadena); // envió cadena al servidor
            try {
                eco = fentrada.readLine(); // recibo cadena del servidor
            } catch (Exception e) {
                System.out.println("amaitu da jokua ");
                break;
            }
            System.out.println(eco);
        }
        fsalida.close();
        fentrada.close();
        System.out.println("Fin del envió... ");
        in.close();
        Cliente.close();
    }

}
