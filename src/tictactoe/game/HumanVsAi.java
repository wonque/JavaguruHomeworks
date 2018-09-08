package tictactoe.game;

import tictactoe.Board;
import tictactoe.ComputerPlayer;
import tictactoe.GameUtils;
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
            board.setCharacter(board.getIndexOfCharacter(currentHumanPlayerMove), humanPlayer1.getSymbol());
            board.displayBoard();
            if (GameUtils.performAllWinChecks(board, humanPlayer1.getSymbol())) {
                System.out.println(humanPlayer1.getName().toUpperCase() + " WINS!");
                break;
            } else if (board.isBoardFull()) {
                break;
            }
            System.out.println(aiPlayer1.getName() + "MOVE!\n");
            int aiMove = board.getIndexOfCharacter(aiPlayer1.findBestMove(board));
            board.setCharacter(aiMove, aiPlayer1.getSymbol());
            if (GameUtils.performAllWinChecks(board, aiPlayer1.getSymbol())) {
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


