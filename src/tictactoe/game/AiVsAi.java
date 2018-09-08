package tictactoe.game;

import tictactoe.Board;
import tictactoe.ComputerPlayer;
import tictactoe.GameUtils;
import tictactoe.Player;


public class AiVsAi extends HumanVsAi {

    private ComputerPlayer aiPlayer1;
    private ComputerPlayer aiPlayer2;

    public void setupGame() {
        this.aiPlayer1 = new ComputerPlayer();
        this.aiPlayer2 = new ComputerPlayer();
        Player.setupPlayers(aiPlayer1, aiPlayer2);
        this.board = new Board();
        board.generateBoard();
        this.currentHumanPlayerMove = "";
    }

    public void play() {
        int totalMoves = 0;
        board.displayBoard();
        while (totalMoves != MOVES_AVAILABLE) {
            String aiPlayer1Move = aiPlayer1.chooseRandomMove(board);
            board.setCharacter(board.getIndexOfCharacter(aiPlayer1Move), aiPlayer1.getSymbol());
            board.displayBoard();
            if (GameUtils.performAllWinChecks(board, aiPlayer1.getSymbol())) {
                System.out.println(aiPlayer1.getName().toUpperCase() + " WINS!");
                break;
            } else if (board.isBoardFull()) {
                break;
            }
            String aiPlayer2Move = aiPlayer2.chooseRandomMove(board);
            board.setCharacter(board.getIndexOfCharacter(aiPlayer2Move), aiPlayer2.getSymbol());
            if (GameUtils.performAllWinChecks(board, aiPlayer2.getSymbol())) {
                System.out.println(aiPlayer2.getName().toUpperCase() + " WINS!");
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
}
