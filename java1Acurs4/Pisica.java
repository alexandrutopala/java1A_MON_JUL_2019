public class Pisica extends Domestic {
    public String nume;
    
    public Pisica() {
    
        super(true);
        System.out.println("c-tor pisica");
        nume = "Tommy";
    }
    
    public void printThisNume() {
        System.out.println("This : " + this.nume);
    }
    
    public void printSuperNume() {
        System.out.println("Super : " + super.nume);
    }
    
    @Override
    public void sayHello() {
        System.out.println("Miau! Numele meu este " + nume);
    }
    
    
    
    
}