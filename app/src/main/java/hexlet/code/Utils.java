package hexlet.code;

public class Utils {

    public static final int RANGE = 120;

    public static int generateRandomInt(int range) {
        return (int) ((Math.random() * range - 1) + 1);
    }
}
