public class Exemplu6 {
    public static void main(String [] args) {
        Punct p1 = new Punct(1, 2);
        
        Cerc c1 = new Cerc(new Punct(2, 2), 3);
        
        Punct p2 = new Punct(10, 8);
        
        System.out.println(c1.getArie());
        System.out.println(c1.isInside(p1));
        System.out.println(c1.isInside(p2));
    }
}