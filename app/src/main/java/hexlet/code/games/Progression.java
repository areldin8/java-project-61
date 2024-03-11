package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static final int MAX_LENGTH = 10;
    public static final int MAX_SIZE = 10;
    public static final int MIN_SIZE = 5;
    public static final int ATTEMPT_COUNT = Engine.ATTEMPTS;
    private static final int QUESTION_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    private static String[][] questionsAndAnswers = new String[ATTEMPT_COUNT][2];

    public static void gameProgression() {
        questionsAndAnswers = generateQuestionsAndAnswers();
        Engine.introGame(DESCRIPTION, questionsAndAnswers);
    }

    private static String[][] generateQuestionsAndAnswers(){
        Random random = new Random();
        int numsInRow = random.nextInt(MIN_SIZE, MAX_SIZE);
        for (int i = 0; i < ATTEMPT_COUNT; i++) {
            int missingNumberIndex = random.nextInt(numsInRow);
            int increment = random.nextInt(MAX_LENGTH);
            int currentNum = random.nextInt(100);
            String[] progression = generateProgression(numsInRow, currentNum, increment);
            String missingNumber = progression[missingNumberIndex];
            progression[missingNumberIndex] = " .. ";
            questionsAndAnswers[i][ANSWER_NUMBER] = missingNumber;
            questionsAndAnswers[i][QUESTION_NUMBER] = String.join(" ", progression);
        }
        return questionsAndAnswers;
    }
    private static String[] generateProgression(int numsInRow, int currentNum, int increment) {
        String[] progression = new String[numsInRow];
        for (int j = 0; j < numsInRow; j++) {
            progression[j] = String.valueOf(currentNum);
            currentNum += increment;
        }
        return progression;
    }
}
