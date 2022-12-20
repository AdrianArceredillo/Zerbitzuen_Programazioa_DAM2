package socketprueba.tcp_udp.tcpClienteKalkulagailua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class tcpClienteKalkulagailua {
    public static void main(String[] args) throws IOException {
        String Host = "localhost";
        int Puerto = 6006;//puerto remoto

        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket Cliente = new Socket(Host, Puerto);

        // CREO FLUJO DE SALIDA AL SERVIDOR 
        PrintWriter fsalida = new PrintWriter(Cliente.getOutputStream(), true);
        // CREO FLUJO DE ENTRADA AL SERVIDOR / zerbitzariak bidaltzen duena jasotzeko
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));

        // FLUJO PARA ENTRADA ESTANDAR / idatzitakoa jasotzeko
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String cadena, emaitza = "";
        System.out.print("Introduce cadena: ");
        cadena = in.readLine();//lectura por teclado 
        while (!cadena.equals("-1")) {
            fsalida.println(cadena); //envió cadena al servidor
            emaitza = fentrada.readLine(); //recibo cadena del servidor
            System.out.println(" -> Resultado: " + emaitza);
            System.out.print("Introduce cadena: ");
            cadena = in.readLine();//lectura por teclado
        }
        fsalida.close();
        fentrada.close();
        System.out.println("Final de envío... ");
        in.close();
        Cliente.close();
    }
}