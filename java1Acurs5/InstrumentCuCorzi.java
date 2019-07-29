@FunctionalInterface
public interface InstrumentCuCorzi extends
     Instrument, ObiectDeLemn {
    
    
    @Override
    default void incanta() {
        System.out.println("Ou lala");
    }
    
    static void m() {
        System.out.println("Metoda statica in interfata");
    }
}