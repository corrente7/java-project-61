package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {

    private static String progressionRule = "What number is missing in the progression?";
    private static final int PROGRESSIONLENGTH = 10;
    public static void progressionGame() {
        Engine.runGame(createProgressionArray(), progressionRule);
    }
    public static String[][] createProgressionArray() {
        String[][] progressionArray = new String[Engine.TRYCOUNT][2];
        for (int i = 0; i < progressionArray.length; i++) {
            int random1 = Utils.randomInt();
            int random2 = Utils.randomInt();
            int[] progression = createProgression(random1, random2);
            int randomNumber = 0 + (int) (Math.random() * PROGRESSIONLENGTH);
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
        int[] array = new int[PROGRESSIONLENGTH];
        array[0] = a1;
        for (int i = 2; i < PROGRESSIONLENGTH + 1; i++) {
            array[i - 1] = a1 + d * (i - 1);
        }
        return array;
    }
}
