package hexlet.code;
import java.util.Random;

public class Utils {
    public static final int MAX_NUMBER = 100;
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber(int minValue, int maxValue) {
        return RANDOM.nextInt(maxValue - minValue + 1) + minValue;
    }
    public static int getRandomNumber() {
        return getRandomNumber(MAX_NUMBER, 1);
    }

    public static int getRandomNumber(int maxValue) {
        return getRandomNumber(maxValue, 1);
    }

    public static int getRandomNumber(int maxValue, int minValue) {
        return (int) Math.floor(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
