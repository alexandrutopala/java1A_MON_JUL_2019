public class Magazin {
    int produse;
    
    private static Magazin singleton;
    
    private Magazin() {
    }
    
    public static Magazin getInstance() {
        if (singleton == null) {
            singleton = new Magazin();
        }
        return singleton;
    }
}