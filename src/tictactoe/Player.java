package tictactoe;


public class Player {


    public static final int HUMAN = 1;
    private String name;
    private String symbol;

    public Player() {
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


//    public void assignSymbols(Player player1, Player player2) {
//        if ((player1.isHuman()) && (player2.isHuman())) {
//            player1.setSymbol("X");
//            player2.setSymbol("0");
//        } else if ((player1.isHuman()) && !(player2.isHuman())) {
//            player1.setSymbol("0");
//            player2.setSymbol("X");
//        } else {
//            player1.setSymbol("X");
//            player2.setSymbol("0");
//        }
//    }

//    public void assignNames(Player player1, Player player2) {
//        if (player1.isHuman() && player2.isHuman()) {
//            player1.setName("Player 1");
//            player2.setName("Player 2");
//        } else if ((player1.isHuman()) && !player2.isHuman()) {
//            player1.setName("HUMAN");
//            player2.setName("STUPID BOT");
//        } else if (!player1.isHuman() && !player2.isHuman()) {
//            player1.setName("Clint Eastwood");
//            player2.setName("Chuck Norris");
//        }
//    }

    public boolean isHuman() {
        return this.getID() == 1;
    }


    @Override
    public String toString() {
        return "Players name: " + name + "\nPlayers symbol: " + symbol;
    }
}














