/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesosprocessbuilder;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author arceredillo.adrian
 */
public class ProcesosProcessBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ProcessBuilder pb = new ProcessBuilder("CMD");
        File fBat = new File("C:\\Users\\arceredillo.adrian\\Documents\\DAM_2\\DAM_2\\Programacion_Servicios\\Java\\Garceta_Adibideak\\ProcesosProcessBuilder\\fichero.bat");
        File fOut = new File("C:\\Users\\arceredillo.adrian\\Documents\\DAM_2\\DAM_2\\Programacion_Servicios\\Java\\Garceta_Adibideak\\ProcesosProcessBuilder\\salida.txt");
        File fErr = new File("C:\\Users\\arceredillo.adrian\\Documents\\DAM_2\\DAM_2\\Programacion_Servicios\\Java\\Garceta_Adibideak\\ProcesosProcessBuilder\\error.txt");

        ProcessBuilder pb2 = new ProcessBuilder("CMD");
        
        pb.redirectError(fBat);
        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        pb.start();
    }

}
