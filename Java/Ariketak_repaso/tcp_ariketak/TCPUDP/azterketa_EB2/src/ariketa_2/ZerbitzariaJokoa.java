package ariketa_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ZerbitzariaJokoa {
    public static void main(String[] args) {
        int port = 9865;
        try (Scanner in = new Scanner(System.in)){
            ServerSocket ssocket = new ServerSocket(port);
            System.out.println("Server listening on port " + port);
            System.out.println("Esperando a los jugadores...");
            Socket socket = ssocket.accept();   //esperar llamada
            System.out.println("Jugador 1 está en línea!\n");
            String sendData;

            while(true) {
                InputStream input = socket.getInputStream();
                DataInputStream flujoEntrada = new DataInputStream(input);
                String data = flujoEntrada.readUTF();


                System.out.println(data);
                System.out.print("Servidor juego: ");
                sendData = in.nextLine();
                OutputStream output = socket.getOutputStream();
                DataOutputStream flujoSalida = new DataOutputStream(output);
                flujoSalida.writeUTF("Servidor juego: " + sendData);
            }
            //socket.close();
            //ssocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * Berriro gertatu zait fitxategia hortik galtzea (hariaren fitxategia), eta denborik gabe geratu naiz. Ezin izan 
 * dut ariketa behar zen moduan egin, baina ezer ere ez entregatu ordez, zerbitzariaren eta bezero baten arteko "chat" bat 
 * egitea lortu dut. Hau da, bakarrik dago jokalari bat.
 * 
 *  Ez dakit zerbaiterako balioko duen, baina badaezpada igoko dut
 */