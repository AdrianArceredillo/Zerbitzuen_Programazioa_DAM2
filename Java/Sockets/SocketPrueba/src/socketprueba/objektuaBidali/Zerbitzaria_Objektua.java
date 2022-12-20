package socketprueba.objektuaBidali;

import java.io.*;
import java.net.*;

public class Zerbitzaria_Objektua {

    public static void main(String[] arg) throws IOException, ClassNotFoundException {

        System.out.println("\033[H\033[2J");
        System.out.flush();

        int numeroPuerto = 6000;// Puerto
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        Socket clienteConectado = null;
        System.out.println("Esperando al cliente ");
        clienteConectado = servidor.accept();
        // CREO FLUJO DE ENTRADA DEL CLIENTE

        InputStream entrada = null;
        entrada = clienteConectado.getInputStream();

        ObjectInputStream objectInputStream = new ObjectInputStream(entrada);

        Objektua obj_leido = (Objektua) objectInputStream.readObject();
        System.out.println(obj_leido.toString());

        System.out.println("Closing sockets.");
        servidor.close();
        clienteConectado.close();
    }

}
