package tictactoe.game;

import tictactoe.Board;
import tictactoe.Player;
import tictactoe.WinChecks;

import java.util.Scanner;

public abstract class Game {

    public static final int MOVES_AVAILABLE = 9;
    public String currentHumanPlayerMove;
    public Board board;
    public WinChecks winChecks;
    public int totalMoves;

    Game(){
        this.winChecks = new WinChecks();
        this.currentHumanPlayerMove = "";
        this.board = new Board();
        board.generateBoard();
        this.totalMoves = 0;
    }

    public abstract void play();

    private void assignSymbols(Player player1, Player player2) {
        if ((player1.isHuman()) && (player2.isHuman())) {
            player1.setSymbol("X");
            player2.setSymbol("0");
        } else if ((player1.isHuman()) && !(player2.isHuman())) {
            player1.setSymbol("0");
            player2.setSymbol("X");
        } else {
            player1.setSymbol("X");
            player2.setSymbol("0");
        }
    }

    private void assignNames(Player player1, Player player2) {
        if (player1.isHuman() && player2.isHuman()) {
            player1.setName("Player 1");
            player2.setName("Player 2");
        } else if ((player1.isHuman()) && !player2.isHuman()) {
            player1.setName("HUMAN");
            player2.setName("STUPID BOT");
        } else if (!player1.isHuman() && !player2.isHuman()) {
            player1.setName("Clint Eastwood");
            player2.setName("Chuck Norris");
        }
    }

    public boolean isDraw(){
        return totalMoves==MOVES_AVAILABLE;
    }

    public void setupPlayers(Player player1, Player player2){
        assignNames(player1, player2);
        assignSymbols(player1, player2);
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

