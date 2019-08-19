import java.util.*;

public class Exemplu8 {
    
    public static void main(String [] args) {
        Comparator<Persoana> comp = 
            (p1, p2) -> p1.nume.compareTo(p2.nume);
            
        Comparator<Persoana> comp2 = new Comparator<Persoana>() {
            @Override
            public int compare(Persoana p1, Persoana p2) {
                return p1.nume.compareTo(p2.nume);
            }
        };
            
        
        Set<Persoana> persoane = new TreeSet<>(comp);
        
        persoane.add(new Persoana("Gigel", 23));
        persoane.add(new Persoana("Maria", 20));
        persoane.add(new Persoana("Costel", 25));
        
        System.out.println(persoane);
        
    }
}