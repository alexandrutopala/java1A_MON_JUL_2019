public class Exemplu4 {
    public static void main(String [] args) {
        Pisica p1;
        
        p1 = new Pisica();
        
        p1.nume = "Tom";
        p1.culoare = "negru";
        p1.greutate = 5;
        
        System.out.println(p1.nume);
        
        Pisica p2 = p1;
        p2.nume = "Mitzi";
        
        System.out.println(p1.nume);
        
        Pisica p3 = new Pisica();
        p3.nume = "Sutzy";
        
        System.out.println(p3.nume);
        System.out.println(p1.nume);
        
        p1 = null;
        //System.out.println(p1.nume); // NullPointerException
        
        p2.sayHello();
        
        
    }
}