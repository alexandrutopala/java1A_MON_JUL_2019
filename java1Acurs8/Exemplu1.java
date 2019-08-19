public class Exemplu1 {
    public static void main(String [] args) {
        Cutie c1 = new Cutie();
        
        Cutie<String> c2 = new Cutie<String>();
        // c2 accepta doar instante de cutie care au 
        // ca tip generic String
        
        Cutie<?> c3 = new Cutie<Integer>();
        // c3 accepta orice instante de cutiei, indiferent
        // de tipul lor generic
        
        Cutie<? extends Number> c4 = new Cutie<Integer>();
        // c4 accepta doar instante de cutie care au 
        // ca tip generic pe Number, sau o clasa ce mosteneste
        // pe Number
        
        Cutie<? super Number> c5 = new Cutie<Object>();
        // c5 accepta doar instante de cutie care au 
        // ca tip generic pe Number, sau o clasa superioara
        // lui Number
        
        Cutie<Integer> c6 = new Cutie<>();
        
        new Cutie<int[]>();
        
        new Cutie< Cutie<Integer> >();
        
        new A<Integer, Integer, String>();
        
        Cutie.<Integer>m(5);
        
    }
}