package lesson4;

import java.util.ArrayList;
import java.util.List;

public class MatchBox {

    private List<Match> matches = new ArrayList();
    private int capacity;
    private int matchesInBox;
    private boolean isOpen;
    private boolean isEmpty;

    public MatchBox () {
        // default capacity of a MatchBox object
        this.capacity = 200;
        this.isOpen = false;
        this.isEmpty = true;
        this.matchesInBox = matches.size();
    }

    public boolean isOpen() {return this.isOpen;}

    public boolean isEmpty() {
        return isEmpty;
    }
    public int getCapacity() {return this.capacity;}

    public boolean openMatchBox (){
        if (!this.isOpen) {
            this.isOpen = true;
//            System.out.println("Match box is open");
            return this.isOpen;
        }
        else {
            this.isOpen = false;
//            System.out.println("Match box is closed");
            return this.isOpen;
        }
    }

    public int getMatchesInBox() {
        return matchesInBox;
    }

    public boolean isFull() {
        return this.capacity == this.matchesInBox;
    }
}
