package tictactoe.game;

import tictactoe.Player;

public class HumanVsHuman extends Game {

    private Player humanPlayer1;
    private Player humanPlayer2;
    private Player currentPlayer;

    public HumanVsHuman() {
        super();
        this.humanPlayer1 = new Player();
        this.humanPlayer2 = new Player();
        this.setupPlayers(humanPlayer1, humanPlayer2);

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
        board.displayBoard();
        while (!isDraw()) {
            switchHumanPlayers(humanPlayer1, humanPlayer2);
            if (winChecks.haveAWinner(board, currentPlayer.getSymbol())) {
                System.out.println(currentPlayer.getName().toUpperCase() + " WINS!");
                break;
            }
            askHumanPlayerForMove(currentPlayer);
            int indexOfCurrentCharacterOnBoard = board.getIndexOfCharacter(currentHumanPlayerMove);
            board.setCharacter(indexOfCurrentCharacterOnBoard, currentPlayer.getSymbol());
            if (winChecks.haveAWinner(board, currentPlayer.getSymbol())) {
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






