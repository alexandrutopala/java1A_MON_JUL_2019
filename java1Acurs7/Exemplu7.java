import java.util.*;

public class Exemplu7 {
    
    public static void main(String [] args) {
        Random random = new Random();
        
        System.out.println( random.nextInt(4) ); // [0, 4)
        
        System.out.println( random.nextInt(20) - 10 );
    }
}