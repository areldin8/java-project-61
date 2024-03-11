package hexlet.code.games;
import java.util.Random;
import hexlet.code.Engine;
    public class Prime {
        public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
        public static final int ATTEMPT_COUNT = Engine.ATTEMPTS;
        private static final int QUESTION_NUMBER = 0;
        private static final int ANSWER_NUMBER = 1;
        private static String[][] questionsAndAnswers = new String[ATTEMPT_COUNT][2];

        public static void gamePrime() {
            questionsAndAnswers = generateQuestionsAndAnswers();
            Engine.introGame(DESCRIPTION, questionsAndAnswers);
        }
        private static String[][] generateQuestionsAndAnswers() {
            Random random = new Random();
            for (int i = 0; i < ATTEMPT_COUNT; i++) {
                int questionNumber = random.nextInt(100);
                questionsAndAnswers[i][QUESTION_NUMBER] = String.valueOf(questionNumber);
                questionsAndAnswers[i][ANSWER_NUMBER] = (isPrime(questionNumber)) ? "yes" : "no";
            }
            return questionsAndAnswers;
        }

            public static boolean isPrime(int num) {
                if (num <= 1) {
                    return false;
                }
                for (int i = 2; i < Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }

