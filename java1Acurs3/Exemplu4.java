public class Exemplu4 {
    public static void main(String ... args) {
        suma(2, 2);
        
        suma(1, 2, 3);
        suma();
        suma(new int[]{1, 2, 3});
        
    }
    
    static int suma(int ... nr) {
        int[] v = nr;
        
        int s = 0;
        for (int x : nr) {
            s += x;
        }
        
        return s;
    }
}