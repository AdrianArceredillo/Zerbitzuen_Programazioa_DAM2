

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arceredillo.adrian
 */
public class GarcetaAdibidea1 {

    public static void main(String[] args) {
        
        System.out.println("Adibidea 1");
        
        Runtime r = Runtime.getRuntime();
        String comando = "NOTEPAD";
        Process p;
        try {
            p = r.exec(comando);
        } catch (Exception e) {
            System.out.println("Error e n : " + comando);
            e.printStackTrace();
        }
    }

}
