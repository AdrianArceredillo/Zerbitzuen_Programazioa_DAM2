/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilotictac;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arceredillo.adrian
 */
public class HariaTICTAC extends Thread {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    String mezua = "";

    HariaTICTAC(int i) {
        //el 1 se entiende como True y 0 como False
        if (i == 1) {
            mezua = "GO! ";     //System.out.println(ANSI_GREEN + mezua + ANSI_RESET);
        } else {
            mezua = "STOP! ";   //System.out.println(ANSI_RED + mezua + ANSI_RESET);
        }
    }

    @Override
    public void run() {
        while (true) {
            //System.out.println(mezua);
            if (mezua.equals("STOP! ")) {
                System.out.println(ANSI_GREEN + mezua + ANSI_RESET);        //System.out.println(ANSI_GREEN + "This text is green!" + ANSI_RESET);
            } else if (mezua.equals("GO! ")) {
                System.out.println(ANSI_RED + mezua + ANSI_RESET);          //System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HariaTICTAC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /*public void pararHilo() {
        stopHilo = true;
    }*/
 /*HariaTICTAC(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
