package hexlet.code;
import java.util.Scanner;

public class Even {
    public static String answer;
    public static String username = Cli.name;

    public static void evenGame() {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        while (count < 3) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int random = randomInt();
            System.out.println("Question: " + random);
            answer = scan.nextLine();
            System.out.println("Your answer: " + answer);

            if (isEven(random) == true & answer.equals("yes")) {
                System.out.println("Correct!");
                count++;
            } else if (isEven(random) == false & answer.equals("no")) {
                System.out.println("Correct!");
                count++;
            } else if (isEven(random) == true & answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + username + "!");
                break;
            } else if (isEven(random) == false & answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + username + "!");
                break;
            } else {
                System.out.println("wrong answer");
                System.out.println("Let's try again," + username + "!");
                break;
            }
            if (count ==3) {
                System.out.println("Congratulations, " + username + "!");
            }
        }
    }
        static boolean isEven(int a){
            return (a%2==0);
        }
    public static int randomInt() {
        return (int) ((Math.random() * (120 - 1)) + 1);
    }
}