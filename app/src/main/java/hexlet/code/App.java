package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Even even = new Even();
        //Cli cli = new Cli();
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getUserName();
            Even.evenGame();
        }
        if (number == 2) {
            Cli.getUserName();
            Even.evenGame();
        }

    }
}
