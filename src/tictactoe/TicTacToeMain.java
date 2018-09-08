package tictactoe;

import tictactoe.game.GameModes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TicTacToeMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe\n");
        int option = -1;
        while (option != 0) {
            Scanner scanner = new Scanner(System.in);
            GameModes.displayGameOptions();
            try {
                option = scanner.nextInt();
                GameModes.chooseMode(option);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please, choose 1,2,3 or 0!\n");
                continue;
            }

        }
    }
}
