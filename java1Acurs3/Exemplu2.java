public class Exemplu2 {
    public static void main(String [] args) {
        int[] v;
        
        v = new int[3];
        
        v[0] = -1;
        v[1]++;
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + " " + v[i]);
        }
        
        for (int x : v) {
            System.out.println(x);
        }
        
        int[] v1 = new int[]{1, 5, 5, 6};
        System.out.println("------");
        
        for (int x : v1) {
            System.out.println(x);
        }
        
        int[] v2 = {3, 2, 5};
    }
    
    
    
}