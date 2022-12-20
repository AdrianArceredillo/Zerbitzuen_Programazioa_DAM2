/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batuketamain;

/**
 *
 * @author AdriAlex
 */
public class BatuketaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
		int a = 0;
		int b = 0;
		
		try {
		   a = Integer.parseInt(args[0]);
		   b = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException e)
		{
		   e.printStackTrace();
		}
		catch (Exception e)
		{
		   e.printStackTrace();
		}
		
		int batura = a + b;
		
		System.out.println("Batura: " + a + " + " + b + " = " + batura);
		
		throw new Exception("Hau nahita botatako errore bat da");

	}
    
}
