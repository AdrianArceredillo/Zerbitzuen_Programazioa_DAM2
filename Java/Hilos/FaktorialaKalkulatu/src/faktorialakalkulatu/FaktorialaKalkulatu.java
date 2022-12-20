/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faktorialakalkulatu;

/**
 *
 * @author arceredillo.adrian
 */
public class FaktorialaKalkulatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zenbakia z1 = new Zenbakia(20);
        Zenbakia z2= new Zenbakia(4);
        Zenbakia z3 = new Zenbakia(2);
        Zenbakia z4 = new Zenbakia(1);
        Zenbakia z5 = new Zenbakia(3);
        Zenbakia z6 = new Zenbakia(10);
        
        KalkuluaEgin h1 = new KalkuluaEgin(z1); //h1.start();
        KalkuluaEgin h2 = new KalkuluaEgin(z2); //h2.start();
        KalkuluaEgin h3 = new KalkuluaEgin(z3); //h3.start();
        KalkuluaEgin h4 = new KalkuluaEgin(z4); //h4.start();
        KalkuluaEgin h5 = new KalkuluaEgin(z5); //h5.start();
        KalkuluaEgin h6 = new KalkuluaEgin(z6); //h6.start();
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        
        try {
          h1.join();
          h2.join();
          h3.join();
          h4.join();
          h5.join();
          h6.join();
        } catch (InterruptedException ex) {
            
        }
        
        /*SacarDinero h2 = new SacarDinero("Juan", c);
        hi.start();
        h2.start();*/
    }
    
}
