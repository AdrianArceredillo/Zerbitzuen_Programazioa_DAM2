package socketprueba.enviar_recibir_mensaje;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        String Host = "localhost";
        //String Host = "192.168.65.6";
        int Puerto = 6000;// puerto remoto
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket Cliente = new Socket(Host, Puerto);

        // CREO FLUJO DE SALIDA AL SERVIDOR
        DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream()); //lo que se envía al servidor

        // ENVIO UN SALUDO AL SERVIDOR
        // flujoSalida.writeUTF("Saludos al SERVIDOR DESDE EL CLIENTE");
        Scanner sc = new Scanner(System.in);
        flujoSalida.writeUTF(sc.nextLine());

        // CREO FLUJO DE ENTRADA AL SERVIDOR
        DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());   //lo que llega del servidor

        // EL SERVIDOR ME ENVIA UN MENSAJE
        System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());   //leer mensaje del servidor
        
        // CERRAR STREAMS Y SOCKETS
        flujoEntrada.close();
        flujoSalida.close();
        Cliente.close();

    }
}
