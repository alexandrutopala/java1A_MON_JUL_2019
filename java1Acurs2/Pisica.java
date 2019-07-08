public class Pisica {
    String nume;
    int greutate;
    
    String culoare;
    
    
    Pisica(String nume, int greutate) {
        this(nume);
        this.greutate = greutate;
    }
    
    Pisica(String nume) {
        this();
        this.nume = nume;
    }
    
    Pisica() {
        System.out.println("c-tor Pisica");
    }
    
    
    
    
    void sayHello() {
        System.out.println("Miau! numele meu este " + nume);
    }
}