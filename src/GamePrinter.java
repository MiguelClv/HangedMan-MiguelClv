/**
 * Created by 54167208T on 31/01/2017.
 */
public class GamePrinter {
    public static void printInstructions(){

        System.out.println("Welcome!");
        System.out.println("Choose a letter:");
    }

    public static void printFinalResult(GameState game){
        if(game.hasWon()) {
            System.out.println("You've won!");
        }else{
            System.out.println("You've lost!");
        }

        GamePrinter.printCurrentResult(game.getCurrentResult());
    }

    public static void printCurrentResult(String currentResult){
        System.out.println("The current word : " + currentResult);
    }
}
