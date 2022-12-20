/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arceredillo.adrian
 */
public class UsaHilo {

    public static void main(String[] args) {
        HiloSimple hs = new HiloSimple();
        hs.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Fuera del hilo..");
        }
    }
}
