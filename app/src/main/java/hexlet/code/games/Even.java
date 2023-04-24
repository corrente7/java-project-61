package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static String evenRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {
        Engine.runGame(createEvenArray(), evenRule);
    }
    public static String[][] createEvenArray() {
        String[][] evenArray = new String[Engine.TRYCOUNT][2];
        for (int i = 0; i < evenArray.length; i++) {
            int random = Utils.randomInt();
            evenArray[i][0] = String.valueOf(random);
            evenArray[i][1] = evenCheck(random);
        }
        return evenArray;
    }

    public static String evenCheck(int number) {
        if (isEven(number)) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static boolean isEven(int a) {
        return (a % 2 == 0);
    }
}
