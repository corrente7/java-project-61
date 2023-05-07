package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String PRIME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startPrimeGame() {
        String[][] primeArray = new String[Engine.ROUND_COUNT][];
        for (int i = 0; i < primeArray.length; i++) {
            primeArray[i] = generateRoundData();
        }
        Engine.runGame(primeArray, PRIME_RULE);
    }

    private static String[] generateRoundData() {
        int random = Utils.generateRandomInt(Utils.RANGE);
        String[] roundArray = new String[]{String.valueOf(random), isPrime(random) ? "yes" : "no"};
        return roundArray;
    }

    private static boolean isPrime(int number) {
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


