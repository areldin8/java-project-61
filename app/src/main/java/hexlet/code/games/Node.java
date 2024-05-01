package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Node {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void startNode() {
        var questionsAndAnswers = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRound();
        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateRound() {
        var questionsAndAnswers = new String[2];
        int num1 = Utils.getRandomNumber(101);
        int num2 = Utils.getRandomNumber(101);
        questionsAndAnswers[Engine.QUESTION_NUMBER] = num1 + " " + num2;
        questionsAndAnswers[Engine.ANSWER_NUMBER] = String.valueOf(isGCD(num1, num2));
        return questionsAndAnswers;
    }

    private static int isGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


