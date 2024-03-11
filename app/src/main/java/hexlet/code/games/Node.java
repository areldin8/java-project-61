package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Node {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int ATTEMPT_COUNT = Engine.ATTEMPTS;
    private static final int QUESTION_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    private static String[][] questionsAndAnswers = new String[ATTEMPT_COUNT][2];


    public static void gameNode() {
        questionsAndAnswers = generateQuestionsAndAnswers();
        Engine.introGame(DESCRIPTION, questionsAndAnswers);
    }
    private static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();
        for (int i = 0; i < ATTEMPT_COUNT; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            questionsAndAnswers[i][QUESTION_NUMBER] = num1 + " " + num2;
            questionsAndAnswers[i][ANSWER_NUMBER] = String.valueOf(isGCD(num1, num2));
        }
        return questionsAndAnswers;
    }

        public static int isGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }

