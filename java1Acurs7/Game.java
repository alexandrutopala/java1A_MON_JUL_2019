public class Game {
    private final static int INITIAL_TRIES = 20;
    
    private static Game singleton;
    
    int number;
    private int leftTries;
    
    private Game() {
        restart();
    }
    
    public static Game getInstance() {
        if (singleton == null) {
            singleton = new Game();
        }
        return singleton;
    }
    
    public boolean lessThan(int guess) {
        return number < guess;
    }
    
    public boolean greaterThan(int guess) {
        return number > guess;
    }
    
    public boolean isEqual(int guess) {
        return number == guess;
    }
    
    public int getScore() {
        return leftTries * 100;
    }
    
    public void restart() {
        leftTries = INITIAL_TRIES;
        java.util.Random random = new java.util.Random();
        
        number = random.nextInt(99) + 1; // [1, 100)
        
        
        System.out.println("Ghiceste numarul la care ma gandesc");
    }
    
    
    
}