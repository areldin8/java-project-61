package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static final int ATTEMPT_COUNT = Engine.ATTEMPTS;
    public static final int ACTION_NUM = 3;
    private static final int QUESTION_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    private static final char[] MATH_SIGNS = {'+', '*', '-'};
    private static String[][] questionsAndAnswers = new String[ATTEMPT_COUNT][2];

    public static void gameCalc() {
        questionsAndAnswers = generateQuestionsAndAnswers();
        Engine.introGame(DESCRIPTION, questionsAndAnswers);
    }

    private static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();
        for (int i = 0; i < ATTEMPT_COUNT; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            char sign = calculator(i, num1, num2);
            questionsAndAnswers[i][QUESTION_NUMBER] = num1 + " " + sign + " " + num2;
        }
        return questionsAndAnswers;
    }

    private static char calculator(int i, int num1, int num2) {
        char sign = getExpression();
        switch (sign) {
            case '+':
                questionsAndAnswers[i][ANSWER_NUMBER] = String.valueOf(num1 + num2);
                break;
            case '-':
                questionsAndAnswers[i][ANSWER_NUMBER] = String.valueOf(num1 - num2);
                break;
            case '*':
                questionsAndAnswers[i][ANSWER_NUMBER] = String.valueOf(num1 * num2);
                break;
            default:
                System.out.println("Error.Unknown sign");
        }
        return sign;
    }
    private static char getExpression() {
        Random random = new Random();
        int randomSign = random.nextInt(ACTION_NUM);
        char sign = MATH_SIGNS[randomSign];
        return sign;
    }
}



