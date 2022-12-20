/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arceredillo.adrian
 */
public class HiloEjemplo1 extends Thread {

    private int c;      //contador de cada hilo
    private int hilo;

    public HiloEjemplo1(int hilo) {
        this.hilo = hilo;
        System.out.println("Creando HILO: " + hilo);
    }

    public void run() {
        c = 0;
        while (c <= 5) {
            System.out.println("Hilo: " + hilo + " / C = " + c);
            c++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HiloEjemplo1 h = null;
        sleep(1000);
        for (int i = 0; i < 3; i++) {
            h = new HiloEjemplo1(i + 1); //crear hilo
            h.start(); //iniciar hilo
        }
        System.out.println("3 HILOS CREADOS...");
    }

}
