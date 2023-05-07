package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String EVEN_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startEvenGame() {
        String[][] evenArray = new String[Engine.ROUND_COUNT][];
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = generateRoundData();
        }
        Engine.runGame(evenArray, EVEN_RULE);
    }

    private static String[] generateRoundData() {
        int random = Utils.generateRandomInt(Utils.RANGE);
        String[] roundArray = new String[]{String.valueOf(random), isEven(random) ? "yes" : "no"};
        return roundArray;
    }

    private static boolean isEven(int a) {
        return (a % 2 == 0);
    }
}
