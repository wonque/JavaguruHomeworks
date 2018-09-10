package tictactoe.game;

import tictactoe.ComputerPlayer;

public class AiVsAi extends Game {

    private ComputerPlayer aiPlayer1;
    private ComputerPlayer aiPlayer2;

    public AiVsAi() {
        super();
        this.aiPlayer1 = new ComputerPlayer();
        this.aiPlayer2 = new ComputerPlayer();
        this.setupPlayers(aiPlayer1, aiPlayer2);

    }

    public void play() {
        board.displayBoard();
        while (!isDraw()) {
            String aiPlayer1Move = aiPlayer1.chooseRandomMove(board);
            int indexOfAiPlayer1Move = board.getIndexOfCharacter(aiPlayer1Move);
            board.setCharacter(indexOfAiPlayer1Move, aiPlayer1.getSymbol());
            board.displayBoard();
            if (winChecks.haveAWinner(board, aiPlayer1.getSymbol())) {
                System.out.println(aiPlayer1.getName().toUpperCase() + " WINS!");
                break;
            } else if (board.isBoardFull()) {
                break;
            }
            String aiPlayer2Move = aiPlayer2.chooseRandomMove(board);
            int indexOfAiPlayer2Move = board.getIndexOfCharacter(aiPlayer2Move);
            board.setCharacter(indexOfAiPlayer2Move, aiPlayer2.getSymbol());
            if (winChecks.haveAWinner(board, aiPlayer2.getSymbol())) {
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
