package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {

    public static String primeRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void primeGame() {
        Engine.runGame(createPrimeArray(), primeRule);
    }
    public static String[][] createPrimeArray() {
        String[][] primeArray = new String[Engine.getTryAnswer()][2];
        for (int i = 0; i < primeArray.length; i++) {
            int random = Engine.randomInt();
            primeArray[i][0] = String.valueOf(random);
            primeArray[i][1] = primeCheck(random);
        }
        return primeArray;
    }

    public static String primeCheck(int number) {
        if (isSimple(number) == true) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}


