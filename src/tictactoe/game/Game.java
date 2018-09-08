package tictactoe.game;

import tictactoe.Board;
import tictactoe.Player;

import java.util.Scanner;

public abstract class Game {

    public static final int MOVES_AVAILABLE = 9;
    public String currentHumanPlayerMove;
    public Board board;

    public void play() {
    }

    public void askHumanPlayerForMove(Player player) {
        Scanner scObject = new Scanner(System.in);
        System.out.println(player.getName() + ", make a move: ");
        String input = scObject.next();
        if (board.isMoveAvailable(input)) {
            this.currentHumanPlayerMove = input;
        } else {
            System.out.println("This move is unavailable, try again!");
            askHumanPlayerForMove(player);
        }
    }
}

