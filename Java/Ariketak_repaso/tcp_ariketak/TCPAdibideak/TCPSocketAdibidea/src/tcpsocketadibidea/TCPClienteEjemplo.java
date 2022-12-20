
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClienteEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String Host = "localhost";
       int Puerto = 6000;//puerto remoto
       //RECIBIR SOCKET
       
       Socket cliente = new Socket(Host,Puerto);//conecta
       InetAddress l = cliente.getInetAddress();
        System.out.println("Puerto local: " + cliente.getLocalPort());
        System.out.println("Puerto remoto: " + cliente.getPort());
        System.out.println("Host remoto: " + l.getHostName().toString());
        System.out.println("IP Host remoto: " + l.getHostAddress().toString());
        
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        OutputStream salida = null;
        salida = cliente.getOutputStream();
        DataOutputStream flujoSalida = new DataOutputStream(salida);
        flujoSalida.writeUTF("Saludos al servidor desde el CLIENTE");
        
        InputStream entrada = null;
        entrada = cliente.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(entrada);
        System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());        
        
        
            
    }
    
}
