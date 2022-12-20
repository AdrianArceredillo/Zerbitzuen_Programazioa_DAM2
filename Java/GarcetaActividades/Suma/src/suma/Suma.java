/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author arceredillo.adrian
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int zenb1 = 0, zenb2 = 0;
        while (zenb1 != 1) {
            zenb1 = Integer.parseInt(br.readLine());
            zenb2 = Integer.parseInt(br.readLine());
            int kalkulua = zenb1 + zenb2;
            System.out.println(kalkulua);
        }
    }
    
}
