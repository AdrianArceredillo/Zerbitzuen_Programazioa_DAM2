package ariketa_2;

import java.io.*;
import java.net.*;

public class HiloServidor extends Thread {
    BufferedReader fentrada;
    PrintWriter fsalida;
    Socket socket = null;

    public HiloServidor(Socket s) throws IOException {
        socket = s;
        // sarrera eta irteera fluxuak sortu
        fsalida = new PrintWriter(socket.getOutputStream(), true);
        fentrada = new BufferedReader(new InputStreamReader(
                socket.getInputStream()));
    }// ..

    public void run() { // tarea para hacer con el cliente
        int numero_random = ((int) (Math.random()*100+1));

        String cadena = "";
        while (numero_random < 100) {
            System.out.println("Bidali: " + socket.toString());
            try {
                cadena = fentrada.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }// obtener cadena
            
        }
    }
}
