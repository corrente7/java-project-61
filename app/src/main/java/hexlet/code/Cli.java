package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String name;
    public static void getUserName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name? ");
        name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
    public String getName() {
        return name;
    }
}
