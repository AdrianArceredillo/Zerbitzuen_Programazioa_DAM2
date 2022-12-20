/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unsaludo2;

import java.io.IOException;

/**
 *
 * @author arceredillo.adrian
 */
public class UnSaludo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (args.length < 1) {
            System.out.println("SE NECESITA UN SALUDO...");
            System.exit(1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ".Agurra " + args[0]);
        }
//        String agur = br.readLine();
//        System.out.println("Programa amatizera doa eta hau bidali dit: " + agur);
    }
    
}
