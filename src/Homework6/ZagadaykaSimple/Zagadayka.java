package Homework6.ZagadaykaSimple;

import java.util.Scanner;

public class Zagadayka {

    RandomNumberGenerator genNum = new RandomNumberGenerator();
    Scanner scObject = new Scanner(System.in);
    private int guess = 0;


    public void guessNumber () {
        int generatedNum = this.genNum.generateRandomNumber();
        System.out.println("I've guessed a number in range from 1 till 100\nTry to guess!");
        while(!this.isGuessed(this.guess, generatedNum)){
            System.out.println("Make a guess: ");
            this.guess = scObject.nextInt();
            if (isGuessed(this.guess, generatedNum)){
                System.out.println("Correct!\nGAME OVER!");
                break;
            }
            else if (isBigger(this.guess, generatedNum)) {
                System.out.println("Nope!\nMy number is bigger! Try again!");
            }
            else if (isLess(this.guess, generatedNum)) {
                System.out.println("Nope!\nMy number is smaller! Try again!");}

            }
    }


    private boolean isGuessed (int guess, int generatedNum) {
        return guess == generatedNum;
    }

    private boolean isBigger (int guess, int generatedNum) {
        return guess<generatedNum;
    }

    private boolean isLess (int guess, int generatedNum) {
        return guess>generatedNum;
    }


}





