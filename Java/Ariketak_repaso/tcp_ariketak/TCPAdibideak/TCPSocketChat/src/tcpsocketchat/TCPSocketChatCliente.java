
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.System.exit;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class TCPSocketChatCliente {
    private boolean exit = true;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String Host = "localhost";
       int Puerto = 6000;//puerto remoto
       Socket cliente = new Socket(Host,Puerto);
       System.out.println("PROGRAMA CLIENTE INICIADO....");
        OutputStream salida = null;
        salida = cliente.getOutputStream();
        DataOutputStream flujoSalida = new DataOutputStream(salida);
        String message = "";
        
        while(true){
            Scanner sc = new Scanner(System.in);
            message = sc.next();
            flujoSalida.writeUTF(message);
            
            if(!"*".equals(message)){
                
            }
        }
       
    }
    
}
