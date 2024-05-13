package hexlet.code;

public class Utils {
    public static int getRandomSize() {
        return getRandomSize(10, 5);
    }
    public static int getRandomSize(int maxValue, int minValue) {
        return (int) Math.floor(Math.random() * 6) + 5;
    }

    public static int getRandomExpression() {
        return getRandomNumber(2, 0);
    }

    public static int randomizer() {
        return getRandomNumber(100, 1);
    }

    public static int getRandomNumber(int maxValue) {
        return getRandomNumber(maxValue, 1);
    }

    public static int getRandomNumber(int maxValue, int minValue) {
        return (int) Math.floor(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
