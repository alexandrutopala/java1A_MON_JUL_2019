public class Exemplu3 {
    public static void main(String [] args) {
        int[][] m = new int[3][2];
        
        m[0] = new int[]{1, 4, 2};
        
        m[1][1] = 5;
        m[2][0] = 7;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
            
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int[] x : m) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
        
        
        
        
        
    }
}

