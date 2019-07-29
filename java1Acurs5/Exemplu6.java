public class Exemplu6 {
    public static void main(String [] args) {
        Magazin m1 = Magazin.getInstance();
        m1.produse = 5;
        
        System.out.println(m1.produse);
        
        Magazin m2 = Magazin.getInstance();
        m2.produse = 10;
        
        System.out.println(m1.produse);
    }
}