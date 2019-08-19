import java.util.*;

public class Exemplu9 {
    
    public static void main(String [] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Gigel", 1);
        map.put("Maria", 2);
        map.put("Costel", 3);
        
        System.out.println(map.get("Maria"));
        
        map.put("Maria", 4);
        
        System.out.println(map);
        
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        
        Collection<Integer> values = map.values();
        
        System.out.println(map.containsKey("Maria"));
        System.out.println(map.containsValue(2));
        
        map.remove("Maria");
        System.out.println(map);
        
    }
}