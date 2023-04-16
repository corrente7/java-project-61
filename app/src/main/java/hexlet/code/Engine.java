package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static String answer;
    public static String username = Cli.name;
    public static Scanner scan = new Scanner(System.in);


    public static void readAnswer() {
        answer = scan.nextLine();
        System.out.println("Your answer: " + answer);
    }

    public static void correct() {
        System.out.println("Correct!");
    }
    public static void tryAgain() {
        System.out.println("Let's try again, " + username + "!");
    }
    public static void congratulations() {
        System.out.println("Congratulations, " + username + "!");
    }
    public static int randomInt() {
        return (int) ((Math.random() * (120 - 1)) + 1);
    }
}
