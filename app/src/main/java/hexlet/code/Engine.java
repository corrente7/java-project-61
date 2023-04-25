package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int TRYCOUNT = 3;
    public static void runGame(String[][] gameArray, String rules) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        int count = 0;
        for (String[] row : gameArray) {
            String question = row[0];
            String rightAnswer = row[1];
            System.out.println("Question: " + question);
            String answer = scan.nextLine();
            System.out.println("Your answer: " + answer);
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer. ");
                System.out.println("Correct answer was " + "'" + rightAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (count == TRYCOUNT) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
