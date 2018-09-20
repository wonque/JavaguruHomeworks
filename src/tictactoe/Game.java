package tictactoe;

import java.util.Scanner;

public class Game {

    private static final int MOVES_AVAILABLE = 9;
    private String currentHumanPlayerMove;
    private Player currentPlayer;
    private Board board;
    private WinChecks winChecks;
    private int totalMoves;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.winChecks = new WinChecks();
        this.currentHumanPlayerMove = "";
        this.board = new Board();
        board.generateBoard();
        this.totalMoves = 0;
        this.player1 = player1;
        this.player2 = player2;
        setupPlayers(player1, player2);
    }

    private void switchPlayers(Player player1, Player player2) {
        if (currentPlayer == null || currentPlayer == player2) {
            currentPlayer = player1;
        } else if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        }
    }

    private void makeGameMove(Player player) {
        if (player.isHuman()) {
            askHumanPlayerForMove(player);
            int indexOfNUmberToReplace = board.getIndexOfCharacter(currentHumanPlayerMove);
            board.setCharacter(indexOfNUmberToReplace, player.getSymbol());
        } else {
            ComputerPlayer aiPlayer = (ComputerPlayer) player;
            String bestAiMove = aiPlayer.findBestMove(board);
            int indexOfBestAiMove = board.getIndexOfCharacter(bestAiMove);
            board.setCharacter(indexOfBestAiMove, aiPlayer.getSymbol());
        }
    }

    public void play() {
        board.displayBoard();
        while (!isDraw()) {
            switchPlayers(player1, player2);
            makeGameMove(currentPlayer);
            if (winChecks.haveAWinner(board, currentPlayer.getSymbol())) {
                System.out.println(currentPlayer.getName().toUpperCase() + " WINS!");
                break;
            } else if (board.isBoardFull()) {
                break;
            }
            board.displayBoard();
            totalMoves++;
        }
        board.displayBoard();
        System.out.println("GAME OVER!");

    }

    private void assignSymbols(Player player1, Player player2) {
        player1.setSymbol("0");
        player2.setSymbol("X");
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

    public boolean isDraw() {
        return totalMoves == MOVES_AVAILABLE;
    }

    public void setupPlayers(Player player1, Player player2) {
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

