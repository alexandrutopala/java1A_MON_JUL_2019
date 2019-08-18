public class Game_solutie {
    private final static int INITIAL_TRIES = 20;
    
    private static Game_solutie singleton;
    
    int number;
    private int leftTries;
    
    private Game_solutie() {
        restart();
    }
    
    public static Game_solutie getInstance() {
        if (singleton == null) {
            singleton = new Game_solutie();
        }
        return singleton;
    }
    
    public boolean lessThan(int guess) {
        decrementTries(1);
        return number < guess;
    }
    
    public boolean greaterThan(int guess) {
        decrementTries(1);
        return number > guess;
    }
    
    public boolean isEqual(int guess) {
        if (number == guess) {
            // In cazul in care jucatorul a ghicit numarul 
            // nu vreau sa decrementez numarul de incercari,
            // pentru ca jocul a fost castigat
            return true;
        }
        
        // Daca nu a ghicit, decrementez numarul de incercari
        // si ii returnez ca nu a ghicit numarul
        decrementTries(2);
        return false;
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
    
    private void decrementTries(int tries) {
        leftTries -= tries;
        
        if (leftTries <= 0) {
            throw new GameOverException("Ai ramas fara incercari");
        }
    }
    
}