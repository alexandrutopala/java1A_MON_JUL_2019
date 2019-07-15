public class Exemplu1 {
    public static void main(String [] args) {
        Caine c1 = new Caine("rex", 5);
        
        Caine c2 = new Caine("sasha", 2);
        
        System.out.println(c1.instanceCounter);
        System.out.println(c2.instanceCounter);
        
        System.out.println(Caine.instanceCounter);
        
        Caine.ham();
        //Caine.sayHello();
        
        
    }
}