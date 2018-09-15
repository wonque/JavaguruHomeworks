package tictactoe;

import tictactoe.game.GameModes;

public class TicTacToeMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe\n");
        GameModes game = new GameModes();
        game.playGameMode();
    }
}
