package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String EVEN_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startEvenGame() {
        Engine.runGame(createEvenArray(), EVEN_RULE);
    }
    public static String[][] createEvenArray() {
        String[][] evenArray = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < evenArray.length; i++) {
            int random = Utils.generateRandomInt(Utils.RANGE);
            evenArray[i][0] = String.valueOf(random);
            evenArray[i][1] = isEven(random) ? "yes" : "no";
        }
        return evenArray;
    }
    public static boolean isEven(int a) {
        return (a % 2 == 0);
    }
}
