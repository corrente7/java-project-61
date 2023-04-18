package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        int count = 0;
        while (count < Engine.getTryAnswer()) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            int random = Engine.randomInt();
            System.out.println("Question: " + random);
            Engine.readAnswer();

            if (isSimple(random) == true & Engine.getAnswer().equals("yes")) {
                Engine.correct();
                count++;
            } else if (isSimple(random) == false & Engine.getAnswer().equals("no")) {
                Engine.correct();
                count++;
            } else if (isSimple(random) == true & Engine.getAnswer().equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                Engine.tryAgain();
                break;
            } else if (isSimple(random) == false & Engine.getAnswer().equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                Engine.tryAgain();
                break;
            } else {
                System.out.println(Engine.getAnswer() + "is wrong answer.");
                Engine.tryAgain();
                break;
            }

            if (count == Engine.getTryAnswer()) {
                Engine.congratulations();
            }
        }
    }

    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

}


