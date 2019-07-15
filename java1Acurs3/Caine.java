public class Caine {
    static int instanceCounter;
    String nume;
    int varsta;
    
    {
        System.out.println("bloc anonim non-static");
    }
    
    static {
        System.out.println("bloc anonim static");
    }
    
    Caine(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        instanceCounter++;
        System.out.println("c-tor Caine");
    }
    
    void sayHello() { // context non-static
        System.out.println("Ham! Numele meu este " + this.nume);
        System.out.println(instanceCounter);
        
    }
    
    static void ham() { // context static
        System.out.println("Ham");
        System.out.println(instanceCounter);
        //System.out.println(this.nume);
    }
    
    
    
    
    
    
}