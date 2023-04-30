package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;


public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GSD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number) {
            case EXIT:
                System.out.println("Goodbye!");
                break;
            case GREET:
                Cli.getUserName();
                break;
            case EVEN:
                Even.startEvenGame();
                break;
            case CALC:
                Calc.startCalcGame();
                break;
            case GSD:
                GCD.startGsdGame();
                break;
            case PROGRESSION:
                Progression.startProgressionGame();
                break;
            case PRIME:
                Prime.startPrimeGame();
                break;
            default:
                break;
        }
    }
}
