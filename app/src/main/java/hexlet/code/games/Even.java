package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int ATTEMPT_COUNT = Engine.ATTEMPTS;
    private static final int QUESTION_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    private static String[][] questionsAndAnswers = new String[ATTEMPT_COUNT][2];

    public static void gameEven() {
        questionsAndAnswers = generateQuestionsAndAnswers();
        Engine.introGame(DESCRIPTION, questionsAndAnswers);
    }
        private static String[][] generateQuestionsAndAnswers() {
            Random random = new Random();
            for (int i = 0; i < ATTEMPT_COUNT; i++) {
                int questionNumber = random.nextInt(100);
                questionsAndAnswers[i][QUESTION_NUMBER] = String.valueOf(questionNumber);
                questionsAndAnswers[i][ANSWER_NUMBER] = (isEven(questionNumber)) ? "yes" : "no";
            }
            return questionsAndAnswers;
        }
        private static boolean isEven(int currentNumber) {
           return currentNumber % 2 == 0;
        }
}


