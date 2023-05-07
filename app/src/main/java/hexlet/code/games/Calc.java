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

    private static String[] generateRoundData() {
        int random1 = Utils.generateRandomInt(Utils.RANGE);
        int random2 = Utils.generateRandomInt(Utils.RANGE);
        char mathOperation = generateMathOperation(new Random());
        return new String[]{
                random1 + " " + mathOperation + " " + random2,
                String.valueOf(checkMathOperation(random1, random2, mathOperation))
        };
    }

    private static int checkMathOperation(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                return 0;
        }
    }

    private static char generateMathOperation(Random random) {
        String allOperations = "+-*";
        char operation = allOperations.charAt(random.nextInt(allOperations.length()));
        return operation;
    }
}
