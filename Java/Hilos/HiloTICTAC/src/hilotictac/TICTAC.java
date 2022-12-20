/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilotictac;

//Actividad 2_1 del libro

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author arceredillo.adrian
 */
public class TICTAC {
    public static void main(String[] args) {        
        // TODO code application logic here
        HariaTICTAC hTIC = new HariaTICTAC(1);
        HariaTICTAC hTAC = new HariaTICTAC(0);

        hTIC.start();
        hTAC.start();

        try {
            hTIC.join();
            hTAC.join();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(TICTAC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
