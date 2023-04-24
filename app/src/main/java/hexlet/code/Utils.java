package hexlet.code;

public class Utils {
    private static final int RANGE = 120;
    public static int randomInt() {
        return (int) ((Math.random() * RANGE - 1) + 1);
    }
}
