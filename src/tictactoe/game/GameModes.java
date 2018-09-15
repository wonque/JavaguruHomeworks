package tictactoe.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameModes {

    private int option;

    public GameModes() {
        this.option = -1;
    }

    private void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    private void chooseOption() {
        Scanner scanner = new Scanner(System.in);
        displayGameOptions();
        try {
            int answer = scanner.nextInt();
            if (answer >= 0 && answer <= 3) {
                setOption(answer);
            } else {
                System.out.println("Please, choose 1,2,3 or 0!\n");
                chooseOption();
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, choose 1,2,3 or 0!\n");
            scanner.next();
            chooseOption();
        }
    }

    private void displayGameOptions() {
        System.out.println("Press 1 to Human vs Human mode");
        System.out.println("Press 2 to Human vs AI mode");
        System.out.println("Press 3 to a Bot Battle\n");
        System.out.println("Press 0 to quit\n");
        System.out.println("Your option: ");
    }

    private void applyGameMode(int option) {
        switch (option) {
            case 1:
                HumanVsHuman twoHumans = new HumanVsHuman();
                twoHumans.play();
                break;
            case 2:
                HumanVsAi humanAi = new HumanVsAi();
                humanAi.play();
                break;
            case 3:
                AiVsAi bots = new AiVsAi();
                bots.play();
                break;
            default:
                System.out.println("Bye!");
                break;
        }
    }

    public void playGameMode() {
        chooseOption();
        applyGameMode(option);
    }
}

