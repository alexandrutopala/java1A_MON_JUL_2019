import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(4);
        list.addLast(5);
        
        list.addFirst(6);
        list.addFirst(10);
        list.addLast(9);
        list.removeFirst();
        list.removeLast();
        list.addFirst(2);
        list.addFirst(5);
        list.removeLast();
        list.removeFirst();
        
        System.out.println(list);
        
        
    }
}