package tictactoe.game;

import tictactoe.Board;
import tictactoe.ComputerPlayer;
import tictactoe.WinChecks;
import tictactoe.Player;

public class HumanVsAi extends HumanVsHuman {

    private Player humanPlayer1;
    private ComputerPlayer aiPlayer1;

    public void setupGame() {
        this.humanPlayer1 = new Player();
        this.aiPlayer1 = new ComputerPlayer();
        Player.setupPlayers(humanPlayer1, aiPlayer1);
        System.out.println(humanPlayer1);
        this.board = new Board();
        board.generateBoard();
        this.currentHumanPlayerMove = "";
    }

    public void play() {
        int totalMoves = 0;
        board.displayBoard();
        while (totalMoves != MOVES_AVAILABLE) {
            askHumanPlayerForMove(humanPlayer1);
            int indexOfNUmberToReplace = board.getIndexOfCharacter(currentHumanPlayerMove);
            board.setCharacter(indexOfNUmberToReplace, humanPlayer1.getSymbol());
            board.displayBoard();
            if (WinChecks.performAll(board, humanPlayer1.getSymbol())) {
                System.out.println(humanPlayer1.getName().toUpperCase() + " WINS!");
                break;
            } else if (board.isBoardFull()) {
                break;
            }
            System.out.println(aiPlayer1.getName() + " MOVE!\n");
            String bestAiMove = aiPlayer1.findBestMove(board);
            int indexOfBestAiMove = board.getIndexOfCharacter(bestAiMove);
            board.setCharacter(indexOfBestAiMove, aiPlayer1.getSymbol());
            if (WinChecks.performAll(board, aiPlayer1.getSymbol())) {
                System.out.println(aiPlayer1.getName().toUpperCase() + " WINS!");
                break;
            }
            board.displayBoard();
            totalMoves++;

        }
        board.displayBoard();
        System.out.println("GAME OVER!");
    }
}


