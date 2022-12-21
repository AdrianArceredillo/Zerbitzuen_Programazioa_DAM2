/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author agirrezabala.peru
 */
public class ClienteUDP {

    public static void main(String[] argv) throws Exception {
        InetAddress destino = InetAddress.getLocalHost();
        int port = 6001; //puerto al que envió el datagrama 
        byte[] bufer = new byte[1024];//bufer para recibir el datagrama 
        byte[] mensaje = new byte[1024];
        String numeroString = "4";
        System.out.println("Berretuko den zenbakia--> "+ numeroString);

        mensaje = numeroString.getBytes(); //codifico String a bytes
        //CONSTRUYO EL DATAGRAMA A ENVIAR
        DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, port);
        DatagramSocket socket = new DatagramSocket(6000);//Puerto local 
        //ENVIO DATAGRAMA
        socket.send(envio);
        //PREPARO DATAGRAMA PARA RECIBIR MENSAJE
        DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
        socket.receive(recibo);//recibo datagrama
        String paquete = new String(recibo.getData());//obtengo String
        System.out.println("Emaitza-->  " + paquete.trim());
        socket.close(); //cierro el socket
    }
}

