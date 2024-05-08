package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static void startCalc() {
        var questionsAndAnswers = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRound();
        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateRound() {
        var questionsAndAnswers = new String[2];
        int num1 = Utils.getRandomNumber(Engine.MAX_NUMBER);
        int num2 = Utils.getRandomNumber(Engine.MAX_NUMBER);
        char sign = getExpression();
        questionsAndAnswers[Engine.QUESTION_NUMBER] = num1 + " " + sign + " " + num2;
        int result = calculator(num1, num2, sign);
        questionsAndAnswers[Engine.ANSWER_NUMBER] = String.valueOf(result);
        return questionsAndAnswers;
    }

    private static int calculator(int num1, int num2, char sign) {
        var result = 0;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                throw new Error("Unknown: '${sign}'!");
        }
        return result;
    }

    private static char getExpression() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = Utils.getRandomNumber(operators.length);
        return operators[randomIndex];
    }
}





