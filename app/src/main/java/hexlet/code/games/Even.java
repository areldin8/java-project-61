package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startEven() {
        var questionsAndAnswers = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRound();
        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }

    private static String[] generateRound() {
        var questionsAndAnswers = new String[2];
        int questionNumber = Utils.getRandomNumber(101);
        questionsAndAnswers[Engine.QUESTION_NUMBER] = String.valueOf(questionNumber);
        questionsAndAnswers[Engine.ANSWER_NUMBER] = (isEven(questionNumber)) ? "yes" : "no";
        return questionsAndAnswers;
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}


