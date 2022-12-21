/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP;

import static java.lang.Integer.parseInt;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author agirrezabala.peru
 */
public class ServidorUDP {
        public static void main(String[] argv) throws Exception {
        byte[] bufer = new byte[1024];//bufer para recibir el datagrama 
        //ASOCIO EL SOCKET AL PUERTO 6001
        DatagramSocket socket = new DatagramSocket(6001);
        //ESPERANDO DATAGRAMA
        System.out.println("Esperando Datagrama'......... ");
        DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
        socket.receive(recibo);//recibo datagrama
        String paquete = new String(recibo.getData());//obtengo String
        //Conversiones necesarias
        String numeroString = paquete.trim();
        int numeroInt=parseInt(numeroString);
        //Conseguir berreketa
        Integer berreketa=numeroInt*numeroInt;
        //conversiones para enviar de vuelta
        String BerreketaString = berreketa.toString();
        byte[] mensaje = new byte[1024];
        mensaje = BerreketaString.getBytes();
        //Enviar el datagrama
        DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length,recibo.getAddress(),recibo.getPort());
        socket.send(envio);

        socket.close(); //cierro el socket
    }
}
    

