public class Exemplu1 {
    public static void main(String [] args) {
        Personaj p = create();
        
        p.actioneaza();
    }
    
    private static Personaj create() {
        return new Span();
    }
}