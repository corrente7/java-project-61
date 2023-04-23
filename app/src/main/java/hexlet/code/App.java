package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
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
        if (number == 0) {
            System.exit(0);
        }
        if (number == 1) {
            Engine.greetUser();
        }
        if (number == 2) {
            Engine.greetUser();
            Even.evenGame();
        }
        if (number == 3) {
            Engine.greetUser();
            Calc.calcGame();
        }
        if (number == 4) {
            Engine.greetUser();
            GCD.GSDGame();
        }
        if (number == 5) {
            Engine.greetUser();
            Progression.progressionGame();
        }
        if (number == 6) {
            Engine.greetUser();
            Prime.primeGame();
        }
    }
}
