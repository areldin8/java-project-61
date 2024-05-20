package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startPrime() {
        var questionsAndAnswers = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateRound();
        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateRound() {
        int questionNumber = Utils.getRandomNumber();
        var questionsAndAnswers = new String[2];
        questionsAndAnswers[Engine.QUESTION_NUMBER] = String.valueOf(questionNumber);
        questionsAndAnswers[Engine.ANSWER_NUMBER] = (isPrime(questionNumber)) ? "yes" : "no";
        return questionsAndAnswers;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



