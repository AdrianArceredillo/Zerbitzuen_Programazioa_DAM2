
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Haria extends Thread{
    
    String mezua = "";
    
    public Haria(int i){
        if(i == 1){
            mezua = "TIC";
        }else {
            mezua = "TAC";
        }
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println(mezua);
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Haria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
