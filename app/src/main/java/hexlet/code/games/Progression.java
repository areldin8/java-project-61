package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";

    public static void startProgression() {
        var questionsAndAnswers = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRound();
        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateRound() {
        var questionsAndAnswers = new String[2];
        int numbersInRow = Utils.getRandomSizeProgression();
        int missingNumberIndex = Utils.getRandomNumber(numbersInRow);
        int increment = Utils.randomizer();
        int currentNum = Utils.randomizer();
        String[] progression = generateProgression(numbersInRow, currentNum, increment);
        String missingNumber = progression[missingNumberIndex];
        progression[missingNumberIndex] = "..";
        questionsAndAnswers[Engine.ANSWER_NUMBER] = missingNumber;
        questionsAndAnswers[Engine.QUESTION_NUMBER] = String.join(" ", progression);
        return questionsAndAnswers;
    }

    private static String[] generateProgression(int numbersInRow, int currentNum, int increment) {
        String[] progression = new String[numbersInRow];
        for (int j = 0; j < numbersInRow; j++) {
            progression[j] = String.valueOf(currentNum);
            currentNum += increment;
        }
        return progression;
    }
}

