import java.util.*;

public class Main_solutie {
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        Game_solutie game = Game_solutie.getInstance();
        
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
                        boolean isEqual = game.isEqual(x3);
                        
                        // Daca isEqual este true, inseamna ca jocutorul
                        // a ghicit numarul, deci a castigat jocul
                        if (isEqual) {
                            System.out.println("Ai castigat");
                            System.out.println("Scor final: " + game.getScore());
                            game.restart();
                        } else {
                            System.out.println(isEqual);
                        }
                        
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
                
            } catch (GameOverException e) {    
                // Daca a fost aruncata GameOverException, 
                // inseamna ca jocul s-a terminat.
                // Vom afisa punctajul si vom restarta 
                // automat jocul
                System.err.println(e.getMessage());
                System.err.println("Scor final: " + game.getScore());
                game.restart();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}