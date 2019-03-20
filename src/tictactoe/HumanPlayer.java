package tictactoe;


public class HumanPlayer {


    public static final int HUMAN = 1;
    private String name;
    private String symbol;

    public HumanPlayer() {
        this.name = "";
        this.symbol = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return HUMAN;
    }

    public boolean isHuman() {
        return this.getID() == 1;
    }


    @Override
    public String toString() {
        return "Players name: " + name + "\nPlayers symbol: " + symbol;
    }
}














