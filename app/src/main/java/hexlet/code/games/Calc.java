package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static String calcRule = "What is the result of the expression?";

    public static void calcGame() {
        Engine.runGame(createCalcArray(), calcRule);
    }
    public static String[][] createCalcArray() {
        String[][] calcArray = new String[Engine.getTryAnswer()][2];
        for (int i = 0; i < calcArray.length; i++) {
            int random1 = Engine.randomInt();
            int random2 = Engine.randomInt();
            char mathOperation = mathOperation();
            calcArray[i][0] = random1 + " " + mathOperation + " " + random2;
            calcArray[i][1] = String.valueOf(calcCheck(random1, random2, mathOperation));
        }
        return calcArray;
    }
   public static int calcCheck(int number1, int number2, char operator) {
       if (operator == '+') {
           return number1 + number2;
       } if (operator == '-') {
           return number1 - number2;
       } else {
           return number1 * number2;
       }
   }
    public static char mathOperation() {
        String operation = "+-*";
        Random r = new Random();
        char c = operation.charAt(r.nextInt(operation.length()));
        return c;
    }
}
