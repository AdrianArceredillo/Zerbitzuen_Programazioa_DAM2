/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */
public class ServidorTCP {
    public static void main(String args[]) throws IOException {
        ServerSocket servidor;
        servidor = new ServerSocket(6000);
        System.out.println("Servidor iniciado...");
        while (true) {
            Socket cliente = new Socket();
            cliente = servidor.accept();// esperando cliente
            HiloServidor hilo = new HiloServidor(cliente);
            hilo.start(); // se atiende al cliente
        }

    }
}
