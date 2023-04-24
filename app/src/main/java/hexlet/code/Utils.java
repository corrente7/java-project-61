package hexlet.code;

public class Utils {
    public static int randomInt() {
        int range = 120;
        return (int) ((Math.random() * range - 1) + 1);
    }
}
