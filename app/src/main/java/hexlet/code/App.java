package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Cli.greeting;
import static hexlet.code.games.Even.startEven;
import static hexlet.code.games.Calc.startCalc;
import static hexlet.code.games.Node.startNode;
import static hexlet.code.games.Prime.startPrime;
import static hexlet.code.games.Progression.startProgression;

public class App {
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
            case 1:
                greeting();
                break;
            case 2:
                startEven();
                break;
            case 3:
                startCalc();
                break;
            case 4:
                startNode();
                break;
            case 5:
                startProgression();
                break;
            case 6:
                startPrime();
                break;
            default:
                System.out.println("Undefined input. Please choose number from 0 to 6.");
        }
        scanner.close();
    }
}



