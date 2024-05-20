package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static final int MIN_INDEX = 0;
    public static final int MAX_INDEX = 2;

    public static void startCalc() {
        var questionsAndAnswers = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRound();
        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateRound() {
        var questionsAndAnswers = new String[2];
        int num1 = Utils.getRandomNumber();
        int num2 = Utils.getRandomNumber();
        char sign = getExpression();
        questionsAndAnswers[Engine.QUESTION_NUMBER] = num1 + " " + sign + " " + num2;
        int result = calculator(num1, num2, sign);
        questionsAndAnswers[Engine.ANSWER_NUMBER] = String.valueOf(result);
        return questionsAndAnswers;
    }

    private static int calculator(int num1, int num2, char sign) {
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return  num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new Error("Unknown: '${sign}'!");
        }
    }

    private static char getExpression() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = Utils.getRandomNumber(MAX_INDEX, MIN_INDEX);
        return operators[randomIndex];

    }
}





