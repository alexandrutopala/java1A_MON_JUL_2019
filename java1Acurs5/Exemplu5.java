public class Exemplu5 {
    public static void main(String [] args) {
        
        
        
        
        Operatie o1 = new Operatie() {
            @Override
            public int calculeaza(int a, int b) {
                return a + b;
            }
        };
        
        Operatie o2 = (a, b) -> a + b;
        
        Operatie o3 = (int a, int b) -> a + b;
        
        Operatie o4 = (a, b) -> {
            return a + b;
        };
        
    }
}



