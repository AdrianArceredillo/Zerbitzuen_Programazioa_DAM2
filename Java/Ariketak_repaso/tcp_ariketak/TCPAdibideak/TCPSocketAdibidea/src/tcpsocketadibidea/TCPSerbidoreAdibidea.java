
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSerbidoreAdibidea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int Puerto = 6000;// Puerto
            ServerSocket Servidor = new ServerSocket(Puerto);
            System.out.println("Escuchando en " + Servidor.getLocalPort());
            System.out.println("Esperando al cliente....");
            Socket clientel= Servidor.accept();//esperando a un cliente
            //realizar acciones con clientel
            //Socket cliente2 = Servidor.accept();//esperando a otro cliente
            //realizar acciones con cliente2
            
            
            System.out.println(Servidor.getLocalPort());
            
            //CREO FLUJO DE ENTRADA AL CLIENTE
            
            InputStream entrada = null;
            entrada = clientel.getInputStream();
            DataInputStream flujoEntrada = new DataInputStream(entrada);
            System.out.println("Recibiendo del CLIENTE: \n\t" + flujoEntrada.readUTF());
            
            OutputStream salida = null;
            salida = clientel.getOutputStream();
            DataOutputStream flujoSalida=  new DataOutputStream(salida);
            flujoSalida.writeUTF("Saludos al cliente del servidor");
            
            entrada.close();
            flujoEntrada.close();
            salida.close();
            Servidor.close();
            flujoSalida.close();
    }
    
}
