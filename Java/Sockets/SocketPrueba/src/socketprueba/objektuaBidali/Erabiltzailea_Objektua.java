package socketprueba.objektuaBidali;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author arceredillo
 *         public class EjemploCliente {
 *         public static void main(String[] args) throws Exception {
 *         //String Host = "localhost";
 *         String Host = "192.168.65.6";
 *         int Puerto = 6000;//puerto remoto
 *         System.out.println("PROGRAMA CLIENTE INICIADO....");
 *         Socket Cliente = new Socket(Host, .adrian
 */

public class Erabiltzailea_Objektua {
    public static void main(String[] args) throws Exception {

        System.out.println("\033[H\033[2J");
        System.out.flush();

        String Host = "localhost";
        // String Host = "192.168.65.6";
        int Puerto = 6000;// puerto remoto
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket Cliente = new Socket(Host, Puerto);

        // get the output stream from the socket.
        OutputStream outputStream = Cliente.getOutputStream();
        // create an object output stream from the output stream so we can send an
        // object through it
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // CREAR UN OBJETO QUE SE ENVIARÁ AL SERVIDOR

        String mezua_user;
        int zenbakia_user;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Sartu objektuaren mezua: ");
            mezua_user = sc.nextLine();
            // obj.setMezua(sc.nextLine());
            // flujoSalida.writeUTF(obj.getMezua());

            System.out.print("Sartu objektuaren zenbakia: ");
            zenbakia_user = sc.nextInt();
            // obj.setZenbakia(sc.nextInt());

            // flujoSalida.writeUTF(obj.getMezua());
        }

        Objektua obj = new Objektua(mezua_user, zenbakia_user);

        // flujoSalida.writeUTF(obj.toString());

        System.out.println("Sending messages to the ServerSocket");
        objectOutputStream.writeObject(obj);
        // objectOutputStream.writeObject(messages);

        Cliente.close();

        // // CREO FLUJO DE ENTRADA AL SERVIDOR
        // DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
        // // EL SERVIDOR ME ENVIA UN MENSAJE
        // System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());
        // // CERRAR STREAMS Y SOCKETS
        // flujoEntrada.close();
        // flujoSalida.close();
        // Cliente.close();

    }
}
