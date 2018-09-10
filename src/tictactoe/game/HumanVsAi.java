package tictactoe.game;

import tictactoe.ComputerPlayer;
import tictactoe.Player;

public class HumanVsAi extends Game {

    private Player humanPlayer1;
    private ComputerPlayer aiPlayer1;


    public HumanVsAi (){
        super();
        this.humanPlayer1 = new Player();
        this.aiPlayer1 = new ComputerPlayer();
        this.setupPlayers(humanPlayer1, aiPlayer1);
        System.out.println(humanPlayer1);
    }

    public void play() {
        board.displayBoard();
        while (!isDraw()) {
            askHumanPlayerForMove(humanPlayer1);
            int indexOfNUmberToReplace = board.getIndexOfCharacter(currentHumanPlayerMove);
            board.setCharacter(indexOfNUmberToReplace, humanPlayer1.getSymbol());
            board.displayBoard();
            if (winChecks.haveAWinner(board, humanPlayer1.getSymbol())) {
                System.out.println(humanPlayer1.getName().toUpperCase() + " WINS!");
                break;
            } else if (board.isBoardFull()) {
                break;
            }
            System.out.println(aiPlayer1.getName() + " MOVE!\n");
            String bestAiMove = aiPlayer1.findBestMove(board);
            int indexOfBestAiMove = board.getIndexOfCharacter(bestAiMove);
            board.setCharacter(indexOfBestAiMove, aiPlayer1.getSymbol());
            if (winChecks.haveAWinner(board, aiPlayer1.getSymbol())) {
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


