package socketprueba.enviar_recibir_mensaje;

import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;

public class Servidor {
    public static void main(String[] args) throws IOException {
        
        int numeroPuerto = 6000; // Puerto
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        Socket clienteConectado = null;
        System.out.println("Esperando al cliente ");
        clienteConectado = servidor.accept();

        // CREO FLUJO DE ENTRADA DEL CLIENTE        
        InputStream entrada = null;
        entrada = clienteConectado.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(entrada);    //recibir del cliente
        
        //EL CLIENTE ME ENVIA UN MENSAJE
        String mezua = flujoEntrada.readUTF();
        System.out.println("Recibiendo del CLIENTE: \n\t" + mezua); //leer mensaje del cliente

        // CREO FLUJO DE SALIDA AL CLIENTE
        OutputStream salida = null;
        salida = clienteConectado.getOutputStream();
        DataOutputStream flujoSalida = new DataOutputStream(salida);    //lo que se le envía al cliente (una vez hayamos recibido su mensaje)

        // ENVIO UN SALUDO AL CLIENTE
        String erantzuna = "Hola, amigo! ";

        flujoSalida.writeUTF(erantzuna);
        
        //CERRAR STREAMS Y SOCKETS
        entrada.close();
        flujoEntrada.close();
        salida.close();
        flujoSalida.close();
        clienteConectado.close();
        servidor.close();

    }
}
