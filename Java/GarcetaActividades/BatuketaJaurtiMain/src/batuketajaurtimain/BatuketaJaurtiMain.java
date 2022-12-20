/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batuketajaurtimain;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author AdriAlex
 */
public class BatuketaJaurtiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		ProcessBuilder pb;
		pb = new ProcessBuilder("java.exe", 
					"-cp",
					"D:\\GDrive\\uni_eibar\\Eclipse_lanak\\10_Batuketa\\bin\\",
					"unieibar.BatuketaMain",
					"76",
					"2");
		File irteeraFitxategia = new File("irteera.txt");
		File erroreFitxategia = new File("erroreak.txt");
		pb.redirectOutput(irteeraFitxategia);
		pb.redirectError(erroreFitxategia);
		System.out.println("BatuketaJaurtiMain: BatuketaMain prozesua SORTU dut.");
		try {
			Process p = pb.start();
			System.out.println("BatuketaJaurtiMain: BatuketaMain prozesua JAURTI dut.");
			p.waitFor();
			System.out.println("BatuketaJaurtiMain: BatuketaMain prozesua BUKATU da.");
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("BatuketaJaurtiMain: Banoa lotara.");
	}
    
}
