package tictactoe.game;


import tictactoe.Board;
import tictactoe.GameUtils;
import tictactoe.Player;

public class HumanVsHuman extends Game {

    private Player humanPlayer1;
    private Player humanPlayer2;
    private Player currentPlayer;

    public void setupGame() {
        this.humanPlayer1 = new Player();
        this.humanPlayer2 = new Player();
        Player.setupPlayers(humanPlayer1, humanPlayer2);
        this.board = new Board();
        board.generateBoard();
        this.currentHumanPlayerMove = "";
    }


    private void switchHumanPlayers(Player player1, Player player2) {
        if (currentPlayer == null) {
            currentPlayer = player1;
        } else if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        } else if (currentPlayer.equals(player2)) {
            currentPlayer = player1;
        }
    }

    public void play() {
        int totalMoves = 0;
        board.displayBoard();
        while (totalMoves != MOVES_AVAILABLE) {
            switchHumanPlayers(humanPlayer1, humanPlayer2);
            if (GameUtils.performAllWinChecks(board, currentPlayer.getSymbol())) {
                System.out.println(currentPlayer.getName().toUpperCase() + " WINS!");
                break;
            }
            askHumanPlayerForMove(currentPlayer);
            board.setCharacter(board.getIndexOfCharacter(currentHumanPlayerMove), currentPlayer.getSymbol());
            if (GameUtils.performAllWinChecks(board, currentPlayer.getSymbol())) {
                System.out.println(currentPlayer.getName().toUpperCase() + " WINS!");
                break;
            }
            board.displayBoard();
            totalMoves++;
        }
        board.displayBoard();
        System.out.println("GAME OVER!");
    }

}






