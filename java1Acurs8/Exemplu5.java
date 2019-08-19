import java.util.*;

public class Exemplu5 {
    
    public static void main(String [] args) {
        Set<String> set = new HashSet<>();
        
        set.add("Bucuresti");
        set.add("Iasi");
        set.add("Brasov");
        set.add("Iasi");
        set.add("Sibiu");
        
        System.out.println(set);
        
        
        List<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(3);
        
        Set<Integer> noDuplicates = new HashSet<>(list);
        System.out.println(noDuplicates);
    }
    
}