/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socketprueba;

import java.io.*;
import java.net.*;

/**
 *
 * @author arceredillo.adrian
 */
public class EjemploServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] arg) throws IOException {
        int numeroPuerto = 6000;// Puerto
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        Socket clienteConectado = null;
        System.out.println("Esperando al cliente ");
        clienteConectado = servidor.accept();
        // CREO FLUJO DE ENTRADA DEL CLIENTE

        InputStream entrada = null;
        entrada = clienteConectado.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(entrada);
        // EL CLIENTE ME ENVIA UN MENSAJE
        String mezua = flujoEntrada.readUTF();
        System.out.println("Recibiendo del CLIENTE: \n\t" + mezua);

        // CREO FLUJO DE SALIDA AL CLIENTE
        OutputStream salida = null;
        salida = clienteConectado.getOutputStream();
        DataOutputStream flujoSalida = new DataOutputStream(salida);
        // ENVIO UN SALUDO AL CLIENTE
        String[] parts = mezua.split(" ");
        int zenb1, zenb2, erantzuna = 0;
        zenb1 = Integer.parseInt(parts[0]);
        zenb2 = Integer.parseInt(parts[2]);
        switch (parts[1]) {
            case "+":
            erantzuna = zenb1 + zenb2;
                break;
            case "-":
            erantzuna = zenb1 - zenb2;
                break;
            case "*":
            erantzuna = zenb1 * zenb2;
                break;
            case "/":
            erantzuna = zenb1 / zenb2;
                break;

            default:

                break;
        }

        mezua = Integer.toString(erantzuna);
        flujoSalida.writeUTF(mezua);
        // CERRAR STREAMS Y SOCKETS
        entrada.close();
        flujoEntrada.close();
        salida.close();
        flujoSalida.close();
        clienteConectado.close();
        servidor.close();
    }

}
