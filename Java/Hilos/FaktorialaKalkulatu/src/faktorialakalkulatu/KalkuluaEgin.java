/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faktorialakalkulatu;

/**
 *
 * @author arceredillo.adrian
 */
public class KalkuluaEgin extends Thread {
    
    private Zenbakia zenb1;
    private int fact;
    
    public KalkuluaEgin(Zenbakia zenb1) {
        this.zenb1 = zenb1;
    }

    public void run() {
        
        fact = zenb1.kalkulatu();
        
        System.out.println(zenb1.getZenbakia() + "! = " + fact);
        
        
//        for (int x = 1; x <= 4; x++) {
//            //c.RetirarDinero(10, getName());
//            this.fact = zenb1
//            zenb1.kalkulatu;
//            //zenb1.RetirarDinero(10, getName());
//            
//        }
    } // run
    
    
}
