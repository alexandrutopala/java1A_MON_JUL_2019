public class Cutie<T> {
    T continut;
    
    
    public void setContinut(T continut) {
        this.continut = continut;
    }
    
    public T getContinut() {
        return continut;
    }
    
    public static <V> void m(V v) {
        System.out.println("Metoda static a cu tip generic");
    }
    
    
    
}