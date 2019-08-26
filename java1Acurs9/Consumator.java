public class Consumator extends Thread {
 
    public Consumator(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        while (true) {
            synchronized (Exemplu2.list) {
                try {
                    if (!Exemplu2.list.isEmpty()) {
                        int x = Exemplu2.list.get(0);
                        Exemplu2.list.remove(0);
                        System.out.println("CONSUMAT: " + x);
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