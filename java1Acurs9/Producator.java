import java.util.*;

public class Producator extends Thread {
    
    public Producator(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (Exemplu2.list) {
                try {
                    if (Exemplu2.list.size() < 100) {
                        int x = random.nextInt(100);
                        Exemplu2.list.add(x);
                        System.out.println("PRODUS: " + x);
                        Exemplu2.list.notifyAll();
                    } else {
                        Exemplu2.list.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}