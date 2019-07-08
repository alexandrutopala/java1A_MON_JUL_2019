public class Exemplu6 {
    public static void main(String [] args) {
        Foo f = new Foo();
        
        Pisica p = new Pisica();
        p.nume = "Mitzi";
        int x = 5;
        
        f.transferCopie(x);
        f.transferReferinta(p);
        
        System.out.println(x);
        System.out.println(p.nume);
        
        
        
        
        
        
    }
}