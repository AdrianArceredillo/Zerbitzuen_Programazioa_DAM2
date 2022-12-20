
import static java.lang.Thread.sleep;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arceredillo.adrian
 */
public class ThreadEjemploMuerteSegura extends Thread {

    private boolean stopHilo = false;
    
    public void pararHilo() {
        stopHilo = true;
    }

    public void run() {
        while (!stopHilo) {
            System.out.println("En el hilo... ");
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        ThreadEjemploMuerteSegura h = new ThreadEjemploMuerteSegura();
        sleep(1000);
        for (int i = 0; i < 1000; i++) ;
        h.pararHilo();
        h.start();
        System.out.println("3 HILOS CREADOS...");
    }

}
