package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static void evenGame() {
        int count = 0;
        while (count < Engine.getTryAnswer()) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int random = Engine.randomInt();
            System.out.println("Question: " + random);
            Engine.readAnswer();

            if (isEven(random) == true & Engine.getAnswer().equals("yes")) {
                Engine.correct();
                count++;
            } else if (isEven(random) == false & Engine.getAnswer().equals("no")) {
                Engine.correct();
                count++;
            } else if (isEven(random) == true & Engine.getAnswer().equals("no")) {
                System.out.println("'no' is wrong answer. Correct answer was 'yes'.");
                Engine.tryAgain();
                break;
            } else if (isEven(random) == false & Engine.getAnswer().equals("yes")) {
                System.out.println("'yes' is wrong answer. Correct answer was 'no'.");
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
    static boolean isEven(int a) {
        return (a % 2 == 0);
    }
}
