package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static String evenRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {
        Engine.runGame(createEvenArray(), evenRule);
    }
    public static String[][] createEvenArray() {
        String[][] evenArray = new String[Engine.getTryAnswer()][2];
        for (int i = 0; i < evenArray.length; i++) {
            int random = Engine.randomInt();
            evenArray[i][0] = String.valueOf(random);
            evenArray[i][1] = evenCheck(random);
        }
        return evenArray;
    }

    public static String evenCheck(int number) {
        if (isEven(number) == true) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static boolean isEven(int a) {
        return (a % 2 == 0);
    }
}
