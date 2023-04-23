package hexlet.code.games;
import hexlet.code.Engine;


public class Progression {

    public static String progressionRule = "What number is missing in the progression?";
    public static void progressionGame() {
        Engine.runGame(createProgressionArray(), progressionRule);
    }
    public static String[][] createProgressionArray() {
        String[][] progressionArray = new String[Engine.getTryAnswer()][2];
        for (int i = 0; i < progressionArray.length; i++) {
            int random1 = Engine.randomInt();
            int random2 = Engine.randomInt();
            int progressionLength = 10;
            int[] progression = createProgression(random1, random2);
            int randomNumber = 0 + (int) (Math.random() * progressionLength);
            int x = progression[randomNumber];
            var result = new StringBuilder();
            for (int num : progression) {
                if (num == x) {
                    result.append(".. ");
                } else {
                    result.append(Integer.toString(num));
                    result.append(" ");
                }
            }
            String str = result.toString();
            progressionArray[i][0] = str;
            progressionArray[i][1] = String.valueOf(x);
        }
        return progressionArray;
    }
    public static int[] createProgression(int a1, int d) {
        int[] array = new int[10];
        array[0] = a1;
        for (int i = 2; i < 11; i++) {
            array[i - 1] = a1 + d * (i - 1);
        }
        return array;
    }
}
