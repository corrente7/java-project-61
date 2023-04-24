package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static String gsdRule = "Find the greatest common divisor of given numbers.";

    public static void gsdGame() {
        Engine.runGame(createGsdArray(), gsdRule);
    }
    public static String[][] createGsdArray() {
        String[][] gsdArray = new String[Engine.TRYCOUNT][2];
        for (int i = 0; i < gsdArray.length; i++) {
            int random1 = Utils.randomInt();
            int random2 = Utils.randomInt();
            gsdArray[i][0] = random1 + " " + random2;
            gsdArray[i][1] = String.valueOf(greatestCommonDivisor(random1, random2));
        }
        return gsdArray;
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
