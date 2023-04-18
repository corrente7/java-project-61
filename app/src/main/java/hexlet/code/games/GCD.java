package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        int count = 0;
        while (count < Engine.getTryAnswer()) {
            System.out.println("Find the greatest common divisor of given numbers.");
            int random1 = Engine.randomInt();
            int random2 = Engine.randomInt();
            System.out.println("Question: " + random1 + " " + random2);
            Engine.readAnswer();

            int nod = greatestCommonDivisor(random1, random2);

            if (Integer.parseInt(Engine.getAnswer()) == nod) {
                Engine.correct();
                count++;
            } else {
                System.out.println(Engine.getAnswer() + " is wrong answer. Correct answer was " + nod);
                Engine.tryAgain();
                break;
            }

            if (count == Engine.getTryAnswer()) {
                Engine.congratulations();
            }
        }
    }
    public static int greatestCommonDivisor(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }
}
