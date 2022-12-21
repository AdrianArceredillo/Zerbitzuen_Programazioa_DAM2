package TCP;
import static java.lang.Integer.parseInt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HiloServidor  extends Thread  {
    BufferedReader fentrada;
    PrintWriter fsalida;
    Socket socket = null;

    public HiloServidor(Socket s) throws IOException {// CONSTRUCTOR
        socket = s;
        // se crean flujos de entrada y salida
        fsalida = new PrintWriter(socket.getOutputStream(), true);
        fentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }// . .

    public void run() {//tarea a realizar con el cliente 
        double zenbakiaDouble =  Math.random()*100;//numero aleatorio
        int asmatuBeharrekoa = (int) zenbakiaDouble;//conversion de valores
        String cadena="";
        //el servidor recibira numeros del cliente 6 veces
        for (int i = 1; i<=6;i++) {
            String aukera = i+". Aukera";
            fsalida.println(aukera.trim());//enviar mayúscula
            try {
                 cadena = fentrada.readLine();//recibimos el numero del cliente en formato String
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }//obtener cadena
            int jasotakoZenbakia = parseInt(cadena);//conversion de valores
            if(asmatuBeharrekoa==jasotakoZenbakia){
                String zorionak="zorionak asmatu duzu zenbakia!!";
                fsalida.println(zorionak.trim().toUpperCase());//enviar mayúscula
                String bukaera="Bukaera. Sakatu enter";
                fsalida.println(bukaera.trim());//amaitu
                break;
            }if(asmatuBeharrekoa<jasotakoZenbakia){
                String txikiagoa="zenbakia txikiagoa da";
                fsalida.println(txikiagoa.trim().toUpperCase());//enviar mayúscula
            }if(asmatuBeharrekoa>jasotakoZenbakia){
                String handiagoa="zenbakia handiagoa da";
                fsalida.println(handiagoa.trim().toUpperCase());//enviar mayúscula
            }if(i==6){
                String bukaera="Bukaera. Sakatu enter";
                fsalida.println(bukaera.trim());//amaitu
            }
            }// fin for

        try {
            fsalida.close (); 
            fentrada.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        try {
            socket.close ();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
