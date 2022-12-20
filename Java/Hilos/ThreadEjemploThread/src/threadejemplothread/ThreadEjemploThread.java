/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadejemplothread;

/**
 *
 * @author arceredillo.adrian
 */
public class ThreadEjemploThread extends Thread {

    public ThreadEjemploThread(String str) {
        super(str);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina thread " +Thread.currentThread().getName());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadEjemploThread ter = new ThreadEjemploThread("Pepe");
        Thread t1 = new Thread(ter, "Pepe");
        Thread t2 = new Thread(ter, "Juan");
        Thread t3 = new Thread(ter, "Urko");
        t1.start();
        t2.start();
        t3.start();
        //new ThreadEjemploThread("Juan").start();
        //new ThreadEjemploThread("Juan").start();
        System.out.println("Termina thread main");
    }
    
}
