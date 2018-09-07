package tictactoe;

import java.util.*;

public class Board {

    private String [] board;


    public Board() {
        this.board = new String[9];
    }

    public boolean isBoardFull (){
        for (String item: board) {
            if (!item.equals("X") && (!item.equals("0"))){
                return false;
            }

        }return true;
    }

    public List<String> getEmptyCells (){
        List<String> emptyCells = new ArrayList<>();
        for(String item : board){
            if(!item.equals("X") && (!item.equals("0"))){
                emptyCells.add(item);
            }
        }return emptyCells;
    }

    public String getCharacterFromIndex (int index) throws IndexOutOfBoundsException{
        try{
        return board[index];}
        catch (IndexOutOfBoundsException e){
            return "" ;
        }
    }


    public int getIndexOfCharacter (String character){
        for(int i=0; i<board.length; i++){
            if(board[i].equals(character)){
                return i;
            }

        }return -1;
    }

    public boolean isMoveAvailable (String move) throws ArrayIndexOutOfBoundsException{
        try{
        return board[getIndexOfCharacter(move)].equals(move);}catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }

    public void setCharacter (int index, String symbol){
        board[index] = symbol;
    }

    public int getSize(){
        return board.length;
    }

    public void generateBoard() {
        int number = 1;
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(number);
            number++;
        }

    }



    public void displayBoard() {
        System.out.println();
        System.out.println("     |     |       ");
        System.out.print("  " + board[0] + "  |  " + board[1] + "  |  " + board[2]);
        System.out.println();
        System.out.println("-----|-----|------");
        System.out.print("  " + board[3] + "  |  " + board[4] + "  |  " + board[5]);
        System.out.println();
        System.out.println("-----|-----|------");
        System.out.print("  " + board[6] + "  |  " + board[7] + "  |  " + board[8]);
        System.out.println();
        System.out.println("     |     |       ");
        System.out.println();

    }
}






