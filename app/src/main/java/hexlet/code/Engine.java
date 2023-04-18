package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String answer;
    private static String username = Cli.getName();
    private static Scanner scan = new Scanner(System.in);
    private static int tryCount = 3;

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

    public static String getAnswer() {
        return answer;
    }
    public static int getTryAnswer() {
        return tryCount;
    }

    public static Scanner getScan() {
        return scan;
    }


}
