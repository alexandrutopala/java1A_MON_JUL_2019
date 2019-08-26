public class Exemplu1 {
    public static void main(String [] args) throws Exception {
        EvenNumbersThread t1 = new EvenNumbersThread();
        
        OddNumbersRunnable runnable = new OddNumbersRunnable();
        Thread t2 = new Thread(runnable);
        
        t1.start();
        t2.start();
        //t1.run();
        
        t1.join();
        // pune firul curent (main) sa astepte pana la
        // terminarea executiei lui t1
        
        t2.join();
        // pune firul curent (main) sa astepte pana la
        // terminarea executiei lui t2
        
        System.out.println("end main");
    }
}