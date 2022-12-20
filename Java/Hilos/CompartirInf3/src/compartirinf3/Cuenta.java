/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compartirinf3;

/**
 *
 * @author arceredillo.adrian
 */
public class Cuenta {

    private int saldo;

    Cuenta(int s) {
        saldo = s;
    } //inicializa saldo actual

    int getSaldo() {
        return saldo;
    } //devuelve el saldo

    void restar(int cantidad) { //se resta la cantidad al saldo
        saldo = saldo - cantidad;
    }

    void RetirarDinero(int cant, String nom) {
        if (getSaldo() >= cant) {
            System.out.println("SE VA A RETIRAR SALDO (ACTUAL ES: "
                    + getSaldo() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            restar(cant);
            System.out.println(nom + " retira => " + cant
                    + " ACTUAL(" + getSaldo() + ")");
        } else {
            System.out.println(nom + " No puede retirar dinero, NO HAY SALDO (" + getSaldo() + ")");
        }
        if (getSaldo() < 0) {
            System.out.println("SALDO NEGATIVO => " + getSaldo());
        }
    }//RetirarDinero
}//Cuenta

