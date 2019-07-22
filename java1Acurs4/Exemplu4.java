public class Exemplu4 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica();
        
        Animal a1 = new Pisica();
        
        Domestic d1 = new Pisica();
        
        Animal a2 = new Domestic(true);
        
        a1.getNume();
        //a1.isDeInterior();
        a1.sayHello();
        
        Pisica p2 = (Pisica) a1;
        
        if (a2 instanceof Pisica) {
            Pisica p3 = (Pisica) a2;
            System.out.println("Este o pisica");
        } else {
            System.out.println("Nu e o pisica");
        }
        
        System.out.println(a1 instanceof Domestic); // true
        System.out.println(a2 instanceof Animal); // true
        //System.out.println(p1 instanceof String);
        System.out.println(p1 instanceof Animal); // true
        
        a2 = new Pisica();
        System.out.println(
            a2 instanceof Domestic && 
            !(a2 instanceof Pisica)        
        );
        
        System.out.println(a2.getClass() == Domestic.class);
        
        
        
        
        
        
        
        
    }
}