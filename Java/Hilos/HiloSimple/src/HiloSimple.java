/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arceredillo.adrian
 */
public class HiloSimple extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En el Hilo... ");
        }
    }
}
