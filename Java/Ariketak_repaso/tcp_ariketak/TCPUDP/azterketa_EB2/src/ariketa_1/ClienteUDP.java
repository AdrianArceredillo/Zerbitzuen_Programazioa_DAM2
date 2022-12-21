package ariketa_1;

import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClienteUDP {
    public static void main(String[] argv) throws Exception {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        InetAddress destino = InetAddress.getLocalHost();
        int port = 12345; // puerto al que envió el datagrama

        DatagramSocket clientSocket = new DatagramSocket();// socket cliente

        byte[] mensaje = new byte[1024];
        byte[] recibidos = new byte[1024];

        Scanner sc = new Scanner(System.in);    //PEDIMOS DATOS AL USUARIO
        System.out.print("Introduce un número: ");
        String mezua;
        mezua = sc.nextLine();
        mensaje = mezua.getBytes();

        // CONSTRUYO EL DATAGRAMA A ENVIAR
        DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, port);

        DatagramSocket socket = new DatagramSocket(34567);// Puerto local
        System.out.println("Enviando datos");
        socket.send(envio); //ENVIAMOS LOS DATOS INTRODUCIDOS POR TECLADO

        System.out.println("\nRecibiendo datos ...");
        DatagramPacket recibo = new DatagramPacket(recibidos, recibidos.length);    //RECIBO LA INFORMACIÓN DEL SERVIDOR

        //PREPARO LA INFORMACIÓN Y LA VISUALIZO
        String resultado_recibido = new String(recibo.getData());
        System.out.println("\nEmaitza: " + resultado_recibido.getBytes().toString() + "\n");
        
        socket.close(); // cierro el socket
    }
}