import java.util.*;

public class Main {
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        Game game = Game.getInstance();
        
        while (true) {
            try {
                line = scanner.nextLine();
                input = line.split("\\s+");
                
                switch (input[0].toUpperCase()) {
                    case "LT" : 
                        int x1 = Integer.parseInt(input[1]);
                        System.out.println( game.lessThan(x1) );
                        break;
                    case "GT" : 
                        int x2 = Integer.parseInt(input[1]);
                        System.out.println( game.greaterThan(x2) );
                        break;
                    case "EQ" : 
                        int x3 = Integer.parseInt(input[1]);
                        System.out.println( game.isEqual(x3) );
                        break;
                    case "SCORE" :
                        System.out.println( game.getScore() ); 
                        break;
                    case "RESET" : 
                        game.restart();
                        break;
                    case "EXIT" : 
                        System.exit(0);
                    default : 
                        System.err.println("Comanda invalida");
                }
                
                
                
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}