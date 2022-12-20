
public class MainTicTac {
    public static void main(String[] args){
        Haria h1 = new Haria(1);
        Haria h2 = new Haria(0);
        
        h1.start();
        h2.start();
        try{
            h1.join();
            h2.join();
        }catch(InterruptedException e){
            //Logger.getLogger(Haria.getC)
        }
        
    }
}
