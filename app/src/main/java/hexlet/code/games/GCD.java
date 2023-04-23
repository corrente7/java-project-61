package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static String GSDRule = "Find the greatest common divisor of given numbers.";

    public static void GSDGame() {
        
        Engine.runGame(createGSDArray(), GSDRule);
    }
    public static String[][] createGSDArray() {
        String[][] GSDArray = new String[Engine.getTryAnswer()][2];
        for (int i = 0; i < GSDArray.length; i++) {
            int random1 = Engine.randomInt();
            int random2 = Engine.randomInt();
            GSDArray[i][0] = random1 + " " + random2;
            GSDArray[i][1] = String.valueOf(greatestCommonDivisor(random1, random2));
        }
        return GSDArray;
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
