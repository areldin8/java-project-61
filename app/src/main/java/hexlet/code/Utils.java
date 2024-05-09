package hexlet.code;

public class Utils {
    public static int getRandomNumber(int maxValue) {
        return (int) Math.floor(Math.random() * (maxValue));
    }

    public static int getRandomNumbers(int maxValue, int minValue) {
        return (int) Math.floor(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
