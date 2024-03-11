package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int QUESTION_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    public static final int ATTEMPTS = 3;

    public static void introGame(String greeting, String[][] questionsAndAnswers) {
        var username = Cli.greeting();
        System.out.println(greeting);
        Scanner scanner = new Scanner(System.in);

        for (String[] questionsAndAnswer : questionsAndAnswers) {
            var correctAnswer = questionsAndAnswer[ANSWER_NUMBER];
            System.out.println("Question " + questionsAndAnswer[QUESTION_NUMBER]);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();
            var result = answer.equals(correctAnswer);
            if (result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + answer
                        + "' is wrong answer ;(."
                        + "Correct answer was ' "
                        + correctAnswer + "'.");
                System.out.println(("Let's try again, " + username + "!"));
                System.exit(1);
            }
            System.out.println("Congratulations, " + username + "!");
        }
        scanner.close();
    }
}

