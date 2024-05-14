package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Cli.greeting;
import static hexlet.code.games.Even.startEven;
import static hexlet.code.games.Calc.startCalc;
import static hexlet.code.games.GCD.startGCD;
import static hexlet.code.games.Prime.startPrime;
import static hexlet.code.games.Progression.startProgression;

public class App {
    public static final int GREETING_CASE = 1;
    public static final int EVEN_CASE = 2;
    public static final int CALC_CASE = 3;
    public static final int NODE_CASE = 4;
    public static final int PROGRESSION_CASE = 5;
    public static final int PRIME_CASE = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var game = 0;
        System.out.println(
                        "Please enter the game number and press Enter\n"
                                + "1 - Greet\n"
                                + "2 - Even\n"
                                + "3 - Calc\n"
                                + "4 - GCD\n"
                                + "5 - Progression\n"
                                + "6 - Prime\n"
                                + "0 - Exit\n"
                                + "Your choice: "
        );
        game = scanner.nextInt();
        switch (game) {
            case 0:
                return;
            case GREETING_CASE:
                greeting();
                break;
            case EVEN_CASE:
                startEven();
                break;
            case CALC_CASE:
                startCalc();
                break;
            case NODE_CASE:
                startGCD();
                break;
            case PROGRESSION_CASE:
                startProgression();
                break;
            case PRIME_CASE:
                startPrime();
                break;
            default:
                throw new Error("Undefined input. Please choose number from 0 to 6.");
        }
        scanner.close();
    }
}



