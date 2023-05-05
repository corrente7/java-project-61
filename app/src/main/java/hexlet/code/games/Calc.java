package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calc {
    public static final String CALC_RULE = "What is the result of the expression?";

    public static void startCalcGame() {

        String[][] calcArray = new String[Engine.ROUND_COUNT][];
        for (int i = 0; i < calcArray.length; i++) {
            calcArray[i] = generateRoundData();
        }
        Engine.runGame(calcArray, CALC_RULE);
    }
    public static String[] generateRoundData() {
        int random1 = Utils.generateRandomInt(Utils.RANGE);
        int random2 = Utils.generateRandomInt(Utils.RANGE);
        Random r = new Random();
        char mathOperation = generateMathOperation(r);
        String[] roundArray = new String[]{random1 + " " + mathOperation + " " + random2,
                String.valueOf(checkMathOperation(random1, random2, mathOperation))};
        return roundArray;
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
