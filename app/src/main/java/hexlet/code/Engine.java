package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static final int ROUND_COUNT = 3;

    public static void runGame(String[][] gameArray, String rules) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        for (String[] row : gameArray) {
            String question = row[0];
            String rightAnswer = row[1];
            System.out.println("Question: " + question);
            String answer = scan.nextLine();
            System.out.println("Your answer: " + answer);
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer. ");
                System.out.println("Correct answer was " + "'" + rightAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
