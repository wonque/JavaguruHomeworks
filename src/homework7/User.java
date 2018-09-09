package homework7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {

    private Scanner sc = new Scanner(System.in);
    private Integer[] userBounds;
    private int lowerBound;
    private int higherBound;

    public User() {
        this.lowerBound = -1;
        this.higherBound = -1;
        this.userBounds = new Integer[2];
    }

    public int getHigherBound() {
        return higherBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public Integer[] getUserBounds() {
        return userBounds;
    }

    private void initializeArrayOfBound() {
        this.userBounds[0] = lowerBound;
        this.userBounds[1] = higherBound;
    }


    private void askUserForLowerBound() throws InputMismatchException {
        System.out.println("Enter lower bound (0< Your Input < 100): ");
        try {
            Scanner in = new Scanner(System.in);
            int lowAnswer = in.nextInt();
            if ((lowAnswer > lowerBound) && (lowAnswer < 100)) {
                this.lowerBound = lowAnswer;
            } else {
                System.out.println("Invalid input!\n");
                askUserForLowerBound();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!\n");
            askUserForLowerBound();
        }

    }

    private void askUserForHigherBound() throws InputMismatchException {
        System.out.println("Enter higher bound " + lowerBound + " < Your Input < 100: ");
        try {
            Scanner in = new Scanner(System.in);
            int highAnswer = in.nextInt();
            if ((highAnswer > lowerBound) && highAnswer <= 100) {
                this.higherBound = highAnswer;
            } else {
                System.out.println("Invalid input!\n");
                askUserForHigherBound();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!\n");
            askUserForHigherBound();
        }
    }

    public void setupUserBound() {
        askUserForLowerBound();
        askUserForHigherBound();
        initializeArrayOfBound();
    }

}
