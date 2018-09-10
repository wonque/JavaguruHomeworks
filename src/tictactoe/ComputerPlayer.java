package tictactoe;

import java.util.List;
import java.util.Random;


public class ComputerPlayer extends Player {

    public static final int AI = 0;
    private Random random;
    private WinChecks winChecks;


    public ComputerPlayer() {
        this.winChecks = new WinChecks();
        this.random = new Random();
    }

    @Override
    public int getID() {
        return AI;
    }

    public String chooseRandomMove(Board board) {
        List<String> emptyCells = board.getEmptyCells();
        int index = random.nextInt(emptyCells.size());
        return emptyCells.get(index);

    }

    private int miniMax(Board currentBoard, int depth, String symbol) {

        if (winChecks.haveAWinner(currentBoard, "X")) {
            return 1;
        }
        if (winChecks.haveAWinner(currentBoard, "0")) {
            return -1;
        }
        if (currentBoard.isBoardFull() || depth == 9) {
            return 0;
        }

        if (symbol.equals("X")) {
            int best = -2;
            for (int i = 0; i < currentBoard.getSize(); i++) {
                //get character from cell for future usage
                String currentCharacterOnBoard = currentBoard.getCharacterFromIndex(i);
                //check for empty cells
                if (!currentCharacterOnBoard.equals("X")
                        && !currentCharacterOnBoard.equals("0")) {
                    //make a move for current player
                    currentBoard.setCharacter(i, "X");
                    //call miniMax for opponent
                    best = Math.max(best, miniMax(currentBoard, depth + 1, "0"));
                    //undo the move of current player
                    currentBoard.setCharacter(i, currentCharacterOnBoard);

                }
            }
            return best;
        } else {
            int best = 2;
            for (int i = 0; i < currentBoard.getSize(); i++) {
                String currentCharacterOnBoard = currentBoard.getCharacterFromIndex(i);
                if (!currentCharacterOnBoard.equals("X")
                        && !currentCharacterOnBoard.equals("0")) {
                    currentBoard.setCharacter(i, "0");
                    best = Math.min(best, miniMax(currentBoard, depth + 1, "X"));
                    currentBoard.setCharacter(i, currentCharacterOnBoard);

                }
            }
            return best;
        }
    }


    public String findBestMove(Board currentBoard) {
        int bestValue = -1000;
        String bestMove = "";

        for (int i = 0; i < currentBoard.getSize(); i++){
            String currentCharacter = currentBoard.getCharacterFromIndex(i);
            if (!currentCharacter.equals("X") &&
                    !currentCharacter.equals("0")) {
                currentBoard.setCharacter(i, "X");
                int moveValue = miniMax(currentBoard, 0, "0");
                currentBoard.setCharacter(i, currentCharacter);
                if (moveValue > bestValue) {
                    bestMove = currentBoard.getCharacterFromIndex(i);
                    bestValue = moveValue;
                }
            }
    }return bestMove;
}}
