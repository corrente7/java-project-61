package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String PRIME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startPrimeGame() {
        Engine.runGame(createPrimeArray(), PRIME_RULE);
    }
    public static String[][] createPrimeArray() {
        String[][] primeArray = new String[Engine.ROUND_COUNT][2];
        for (int i = 0; i < primeArray.length; i++) {
            int random = Utils.generateRandomInt(Utils.RANGE);
            primeArray[i][0] = String.valueOf(random);
            primeArray[i][1] = isPrime(random) ? "yes" : "no";
        }
        return primeArray;
    }
    public static boolean isPrime(int number) {
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


