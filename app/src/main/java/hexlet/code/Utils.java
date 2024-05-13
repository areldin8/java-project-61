package hexlet.code;

public class Utils {
    public static final int MAX_SIZE = 10;
    public static final int MIN_SIZE = 5;
    public static final int MAX_NUMBER = 100;
    public static int getRandomSize() {
        return getRandomNumber(MAX_SIZE, MIN_SIZE);
    }

    public static int getRandomExpression() {
        return getRandomNumber(2, 0);
    }

    public static int randomizer() {
        return getRandomNumber(MAX_NUMBER, 1);
    }

    public static int getRandomNumber(int maxValue) {
        return getRandomNumber(maxValue, 1);
    }

    public static int getRandomNumber(int maxValue, int minValue) {
        return (int) Math.floor(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
