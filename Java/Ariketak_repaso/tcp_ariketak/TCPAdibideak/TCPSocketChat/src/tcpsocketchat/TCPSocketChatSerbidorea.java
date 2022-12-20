
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TCPSocketChatSerbidorea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int Puerto = 6000;// Puerto
        ServerSocket Servidor = new ServerSocket(Puerto);
        Socket cliente= Servidor.accept();//esperando a un cliente
        
        InputStream entrada = null;
        entrada = cliente.getInputStream();
        
        DataInputStream flujoEntrada = new DataInputStream(entrada);
        
                
        while( true){
            System.out.println(flujoEntrada.readUTF());
            if(!"*".equals(flujoEntrada.readUTF())){
                
            }
        }
        
    }
    
}
