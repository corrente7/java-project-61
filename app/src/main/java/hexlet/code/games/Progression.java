package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {

    public static final String PROGRESSION_RULE = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    public static void startProgressionGame() {
        Engine.runGame(createProgressionArray(), PROGRESSION_RULE);
    }
    public static String[][] createProgressionArray() {
        String[][] progressionArray = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < progressionArray.length; i++) {
            int random1 = Utils.generateRandomInt(Utils.RANGE);
            int random2 = Utils.generateRandomInt(Utils.RANGE);
            int[] progression = createProgression(random1, random2);
            int randomNumber = 0 + (int) (Math.random() * PROGRESSION_LENGTH);
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
            String str = result.toString();
            progressionArray[i][0] = str;
            progressionArray[i][1] = String.valueOf(x);
        }
        return progressionArray;
    }
    public static int[] createProgression(int a1, int d) {
        int[] array = new int[PROGRESSION_LENGTH];
        array[0] = a1;
        for (int i = 2; i < PROGRESSION_LENGTH + 1; i++) {
            array[i - 1] = a1 + d * (i - 1);
        }
        return array;
    }
}
