package tictactoe.game;

public class GameModes {

    public static void displayGameOptions (){
        System.out.println("Press 1 to Human vs Human mode");
        System.out.println("Press 2 to Human vs AI mode");
        System.out.println("Press 3 to a Bot Battle\n");
        System.out.println("Press 0 to quit\n");
        System.out.println("Your option: ");
    }

    public static void chooseMode (int option){
         switch (option){
             case 1:
                 HumanVsHuman twoHumans = new HumanVsHuman();
                 twoHumans.setupGame();
                 twoHumans.play();
                 break;
             case 2:
                 HumanVsAi humanAi = new HumanVsAi();
                 humanAi.setupGame();
                 humanAi.play();
                 break;
             case 3:
                 AiVsAi bots = new AiVsAi();
                 bots.setupGame();
                 bots.play();
                 break;
             case 0:
                 System.out.println("Bye!");
                 break;

    }}


}

