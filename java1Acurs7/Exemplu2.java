public class Exemplu2 {
    public static void main(String [] args) {
        String s = "Ana are mere";
        
        // EREM99ERA99ANA
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        
        s = sb.toString();
        
        s = s.replaceAll(" ", "99");
        s = s.toUpperCase();
        
        System.out.println(s);
        
    }
}