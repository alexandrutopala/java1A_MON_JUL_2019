public class C {
    int x = 5;
    
    
    
    void m() {
        int a = 2;
        
        class InnerC {
            int x = 2;
            void m() {
                System.out.println(a);
                System.out.println(C.this.x);
            }
        }
        //a++;
        
    }
}