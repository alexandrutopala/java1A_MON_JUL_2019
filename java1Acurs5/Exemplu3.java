public class Exemplu3 {
    public static void main(String [] args) {
        
        
        
        // instantiere clasa inner statica
        B.B2 b2 = new B.B2();
        
        // instantiere clasa inner non-statica
        B b = new B();
        B.B1 b1 = b.new B1();
    }
}