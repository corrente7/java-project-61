package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String GSD_RULE = "Find the greatest common divisor of given numbers.";

    public static void startGsdGame() {
        Engine.runGame(createGsdArray(), GSD_RULE);
    }
    public static String[][] createGsdArray() {
        String[][] gsdArray = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < gsdArray.length; i++) {
            int random1 = Utils.generateRandomInt(Utils.RANGE);
            int random2 = Utils.generateRandomInt(Utils.RANGE);
            gsdArray[i][0] = random1 + " " + random2;
            gsdArray[i][1] = String.valueOf(findGreatestCommonDivisor(random1, random2));
        }
        return gsdArray;
    }
    public static int findGreatestCommonDivisor(int x, int y) {
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
