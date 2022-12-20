/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faktorialakalkulatu;

/**
 *
 * @author arceredillo.adrian
 */
public class Zenbakia {
    public int zenbakia;
    public int zenbakia2, zenbakia3, zenbakia4, zenbakia5, zenbakia6;
    private int faktorialaBalioa = 1;
    
    Zenbakia(int zenb1) {
        zenbakia = zenb1;
    } //inicializa número
    
    int getZenbakia() {
        return zenbakia;
    } //devuelve el numero
    
    int getFaktoriala() {
        return zenbakia;
    } //devuelve el Factorial
    
    int kalkulatu() { //se calcula el factorial
        
        for (int i = zenbakia; i >= 1; --i) {
            //System.out.println(i);
            this.faktorialaBalioa = faktorialaBalioa * i;
        }
        //System.out.println("Sarturiko '" + zenb + "' zenbakiaren faktoriala, " + this.faktorialaBalioa + " da. ");
        return this.faktorialaBalioa;   
    }

}
