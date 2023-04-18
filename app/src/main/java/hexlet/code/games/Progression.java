package hexlet.code.games;
import hexlet.code.Engine;


public class Progression {
    public static void progressionGame() {
        int count = 0;
        while (count < Engine.getTryAnswer()) {
            System.out.println("What number is missing in the progression?");
            int random1 = Engine.randomInt();
            int random2 = Engine.randomInt();
            int[] progression = createProgression(random1, random2);
            int randomNumber = 0 + (int) (Math.random() * 10);
            int x = progression[randomNumber];
            var result = new StringBuilder();
            for (int num : progression) {
                if (num == x) {
                    result.append(".. ");
                } else {
                    result.append(Integer.toString(num));
                    result.append(" ");
                }
            }
            System.out.println("Question: " + result);
            Engine.readAnswer();

            if (Integer.parseInt(Engine.getAnswer()) == x) {
                Engine.correct();
                count++;
            } else {
                System.out.println(Engine.getAnswer() + " is wrong answer. Correct answer was " + x);
                Engine.tryAgain();
                break;
            }

            if (count == Engine.getTryAnswer()) {
                Engine.congratulations();
            }
        }
    }
    public static int[] createProgression(int a1, int d) {
        int[] array = new int[10];
        array[0] = a1;
        for (int i = 2; i < 11; i++) {
            array[i - 1] = a1 + d * (i - 1);
        }
        return array;
    }
}
