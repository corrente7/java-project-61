package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String answer;
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
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
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

    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        Cli.getUserName();
    }

    public static void runGame(String[][] gameArray, String rules) {
        System.out.println(rules);
        int count = 0;
        while (count < Engine.getTryAnswer()) {
            String question = gameArray[count][0];
            String rightAnswer = gameArray[count][1];
            System.out.println("Question: " + question);
            readAnswer();
            if (getAnswer().equals(rightAnswer)) {
                Engine.correct();
                count++;
            } else {
                System.out.println("'" + getAnswer()+ "'" + " is wrong answer. Correct answer was " + "'" + rightAnswer + "'");
                Engine.tryAgain();
                break;
            }
            if (count == Engine.getTryAnswer()) {
                Engine.congratulations();
            }
        }
    }
}
