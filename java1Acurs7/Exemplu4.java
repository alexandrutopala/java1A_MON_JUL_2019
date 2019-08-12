public class Exemplu4 {
    public static void main(String [] args) {
        Integer i1 = 3; //new Integer(3); // boxing
        
        int x = i1; //i1.intValue(); // unboxing
        
        Object o1 = 2;
        Number n1 = 1;
        Number n2 = 3L;
        Number n3 = 3.2;
        
        Number[] nums = {n1, n2, n3};
        
        String s = "4";
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}