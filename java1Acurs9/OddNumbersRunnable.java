public class OddNumbersRunnable implements Runnable {
    
    
    
    @Override
    public void run() {
        for (int i = 1; i <= 25; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}