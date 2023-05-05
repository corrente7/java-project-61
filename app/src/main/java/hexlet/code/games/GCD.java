package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String GCD_RULE = "Find the greatest common divisor of given numbers.";

    public static void startGcdGame() {
        String[][] gcdArray = new String[Engine.ROUND_COUNT][];
        for (int i = 0; i < gcdArray.length; i++) {
            gcdArray[i] = generateRoundData();
        }
        Engine.runGame(gcdArray, GCD_RULE);
    }
    public static String[] generateRoundData() {
        int random1 = Utils.generateRandomInt(Utils.RANGE);
        int random2 = Utils.generateRandomInt(Utils.RANGE);
        String[] roundArray = new String[]{random1 + " " + random2, String.valueOf(findGCD(random1, random2))};
        return roundArray;
    }
    public static int findGCD(int x, int y) {
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
