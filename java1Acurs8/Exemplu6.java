import java.util.*;

public class Exemplu6 {
    
    public static void main(String [] args) {
        Set<String> set = new LinkedHashSet<>();
        
        set.add("Bucuresti");
        set.add("Iasi");
        set.add("Brasov");
        set.add("Iasi");
        set.add("Sibiu");
        
        System.out.println(set);
    }
}
        