package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static void calcGame() {
        int count = 0;
        while (count < Engine.getTryAnswer()) {
            System.out.println("What is the result of the expression?");
            int random1 = Engine.randomInt();
            int random2 = Engine.randomInt();
            char mathOperation = mathOperation();
            System.out.println("Question: " + random1 + " " + mathOperation + " " + random2);
            Engine.readAnswer();

            if (mathOperation == '+' & Integer.parseInt(Engine.getAnswer()) == random1 + random2) {
                Engine.correct();
                count++;
            } else if (mathOperation == '-' & Integer.parseInt(Engine.getAnswer()) == random1 - random2) {
                Engine.correct();
                count++;
            } else if (mathOperation == '*' & Integer.parseInt(Engine.getAnswer()) == random1 * random2) {
                Engine.correct();
                count++;
            } else if (mathOperation == '+' & Integer.parseInt(Engine.getAnswer()) != random1 + random2) {
                System.out.println(Engine.getAnswer() + " is wrong answer ;(. Correct answer was " + (random1 + random2));
                Engine.tryAgain();
                break;
            } else if (mathOperation == '-' & Integer.parseInt(Engine.getAnswer()) != random1 - random2) {
                System.out.println(Engine.getAnswer() + " is wrong answer ;(. Correct answer was " + (random1 - random2));
                Engine.tryAgain();
                break;
            } else if (mathOperation == '*' & Integer.parseInt(Engine.getAnswer()) != random1 + random2) {
                System.out.println(Engine.getAnswer() + " is wrong answer ;(. Correct answer was " + (random1 * random2));
                Engine.tryAgain();
                break;
            } else {
                System.out.println(Engine.getAnswer() + " is wrong answer.");
                Engine.tryAgain();
                break;
            }

            if (count == Engine.getTryAnswer()) {
                Engine.congratulations();
            }
        }
    }
    public static char mathOperation() {
        String operation = "+-*";
        Random r = new Random();
        char c = operation.charAt(r.nextInt(operation.length()));
        return c;
    }
}
