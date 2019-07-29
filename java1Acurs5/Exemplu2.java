public class Exemplu2 {
    public static void main(String [] args) {
        Anotimp a1 = Anotimp.VARA; //new Anotimp();
        
        switch (a1) {
            case IARNA : System.out.println("e frig"); break;
            case PRIMAVARA : System.out.println("e caldut"); break;
            case VARA : System.out.println("e cald"); break;
            case TOAMNA : System.out.println("e frigut"); break;
            default : System.out.println("Nu e un anotimp");
        }
        
        Anotimp[] anotimpuri = Anotimp.values();
        
        for (Anotimp a : anotimpuri) {
            System.out.println(a.ordinal() + " " + a.name());
        }
        
        Anotimp a2 = Anotimp.valueOf("IARNA");
        System.out.println(a2.getX());
        
    }
}