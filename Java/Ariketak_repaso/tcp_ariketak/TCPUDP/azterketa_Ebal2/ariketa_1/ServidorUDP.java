package azterketa_Ebal2.ariketa_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServidorUDP {
    public static void main(String[] args) throws IOException {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        byte[] bufer = new byte[1024];// bufer para recibir el datagrama
        byte[] enviados = new byte[1024];
        // ASOCIO EL SOCKET AL PUERTO 12345
        DatagramSocket socket = new DatagramSocket(12345);
        // ESPERANDO INFORMACIÓN
        System.out.println("Esperando el número ......... ");

        DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
        socket.receive(recibo);// recibo datagrama
        int bytesRec = recibo.getLength();// obtengo numero de bytes

        //obtener los datos del cliente
        InetAddress IPOrigen = recibo.getAddress();
        int puerto = recibo.getPort();

        String paquete = new String(recibo.getData());// obtengo String
        
        String prueba = String.valueOf(paquete.charAt(0));  //cambiar formato de la información para poder manipularla
        int zenbakia = Integer.parseInt(prueba);
        
        int berreketa_emaitza = zenbakia * zenbakia;
        String str = prueba.substring(0, 1);

        //preparar el contenido que voy a enviar al cliente
        System.out.println("\nJasotako zenbakia " + prueba + " da. ");
        String mezu_finala = "Berreketaren emaitza: " + berreketa_emaitza + " da. \n";
        enviados = mezu_finala.getBytes(); 

        System.out.println(mezu_finala);    //prueba para ver si el contenido es el que deseo
        System.out.println("Enviando datos...");

        DatagramPacket paqEnviado = new DatagramPacket(enviados, enviados.length, IPOrigen, puerto);
        socket.send(paqEnviado);    //ENVIAR EL CONTENIDO AL SERVIDOR
                
        socket.close(); // cierro el socket

    }

}
