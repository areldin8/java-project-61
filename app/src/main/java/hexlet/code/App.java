package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Cli.greeting;
import static hexlet.code.games.Even.gameEven;
import static hexlet.code.games.Calc.gameCalc;
import static hexlet.code.games.Node.gameNode;
import static hexlet.code.games.Prime.gamePrime;
import static hexlet.code.games.Progression.gameProgression;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                var game = 0;
                System.out.println(
                        "Please enter the game number and press Enter\n"
                                +"1 - Greet\n"
                                +"2 - Even\n"
                                +"3 - Calc\n"
                                +"4 - GCD\n"
                                +"5 - Progression\n"
                                +"6 - Prime\n"
                                +"0 - Exit\n"
                                +"Your choice: "
                );
                game = scanner.nextInt();
        switch (game){
            case 0:
                System.exit(1);
                break;
            case 1:
                greeting();
                break;
            case 2:
                gameEven();
                break;
            case 3:
                gameCalc();
            case 4:
                gameNode();
            case 5:
                gameProgression();
            case 6:
                gamePrime();
            default:
                System.out.println("Undefined input. Please choose number from 0 to 6.");
        }
        scanner.close();
    }
}


