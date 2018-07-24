package lesson4;

public class MatchBoxTest {

    public static void main(String[] args) {
        MatchBox matchBox = new MatchBox();
        System.out.println (matchBox.isOpen());
        matchBox.openMatchBox();
        System.out.println (matchBox.isOpen());
        matchBox.openMatchBox();
        System.out.println (matchBox.isOpen());

        System.out.println(matchBox.getMatchesInBox());


        }


    }

