package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calc {
    public static final String CALC_RULE = "What is the result of the expression?";

    public static void startCalcGame() {
        Engine.runGame(createCalcArray(), CALC_RULE);
    }
    public static String[][] createCalcArray() {
        String[][] calcArray = new String[Engine.ROUND_COUNT][2];
        Random r = new Random();
        for (int i = 0; i < calcArray.length; i++) {
            int random1 = Utils.generateRandomInt(Utils.RANGE);
            int random2 = Utils.generateRandomInt(Utils.RANGE);
            char mathOperation = generateMathOperation(r);
            calcArray[i][0] = random1 + " " + mathOperation + " " + random2;
            calcArray[i][1] = String.valueOf(checkMathOperation(random1, random2, mathOperation));
        }
        return calcArray;
    }
    public static int checkMathOperation(int number1, int number2, char operator) {
        if (operator == '+') {
            return number1 + number2;
        }
        if (operator == '-') {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }
    public static char generateMathOperation(Random r) {
        String operation = "+-*";
        char c = operation.charAt(r.nextInt(operation.length()));
        return c;
    }
}
