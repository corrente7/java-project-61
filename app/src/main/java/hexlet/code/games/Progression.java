package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {

    public static final String PROGRESSION_RULE = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;

    public static void startProgressionGame() {
        String[][] progressionArray = new String[Engine.ROUND_COUNT][];
        for (int i = 0; i < progressionArray.length; i++) {
            progressionArray[i] = generateRoundData();
        }
        Engine.runGame(progressionArray, PROGRESSION_RULE);
    }

    private static String[] generateRoundData() {
        int random1 = Utils.generateRandomInt(Utils.RANGE);
        int random2 = Utils.generateRandomInt(Utils.RANGE);
        int[] progression = createProgression(random1, random2, PROGRESSION_LENGTH);
        int randomNumber = Utils.generateRandomInt(PROGRESSION_LENGTH);
        int hiddenNumber = progression[randomNumber];
        String result = "";
        for (int num : progression) {
            if (num == hiddenNumber) {
                result = result.join(" ", result, "..");
            } else {
                result = result.join(" ", result, Integer.toString(num));
            }
        }
        result.trim();
        String[] roundArray = new String[]{result, String.valueOf(hiddenNumber)};
        return roundArray;

    }
    private static int[] createProgression(int firstNumber, int progressionStep, int progressionLength) {
        int[] array = new int[progressionLength];
        array[0] = firstNumber;
        for (int i = 2; i < progressionLength + 1; i++) {
            array[i - 1] = firstNumber + progressionStep * (i - 1);
        }
        return array;
    }
}
