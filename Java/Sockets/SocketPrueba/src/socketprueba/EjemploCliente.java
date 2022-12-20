/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprueba;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author arceredillo
 *         public class EjemploCliente {
 * 
 *         public static void main(String[] args) throws Exception {
 *         //String Host = "localhost";
 *         String Host = "192.168.65.6";
 *         int Puerto = 6000;//puerto remoto
 *         System.out.println("PROGRAMA CLIENTE INICIADO....");
 *         Socket Cliente = new Socket(Host, .adrian
 */
public class EjemploCliente {

        public static void main(String[] args) throws Exception {
                String Host = "localhost";
                //String Host = "192.168.65.6";
                int Puerto = 6000;// puerto remoto
                System.out.println("PROGRAMA CLIENTE INICIADO....");
                Socket Cliente = new Socket(Host, Puerto);
                // CREO FLUJO DE SALIDA AL SERVIDOR
                DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
                // ENVIO UN SALUDO AL SERVIDOR
                // flujoSalida.writeUTF("Saludos al SERVIDOR DESDE EL CLIENTE");
                Scanner sc = new Scanner(System.in);
                flujoSalida.writeUTF(sc.nextLine());
                // CREO FLUJO DE ENTRADA AL SERVIDOR
                DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
                // EL SERVIDOR ME ENVIA UN MENSAJE
                System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());
                // CERRAR STREAMS Y SOCKETS
                flujoEntrada.close();
                flujoSalida.close();
                Cliente.close();

        }
}
