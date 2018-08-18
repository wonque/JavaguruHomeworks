package Homework6;

import java.util.Scanner;

public class GuessMyNumber {

    private int lowerBound;
    private int upperBound;
    private int guess;
    private Scanner userInput;

    public GuessMyNumber() {

        this.lowerBound = 1;
        this.upperBound = 100;
        this.userInput = new Scanner(System.in);
    }

    public String askUserInput(int guess) {
        System.out.println("Is your number " + guess + " ?\n");
        System.out.println("Enter 'h' to indicate the guess is too high.\nEnter 'l' to indicate the guess is too low.\nEnter 'c' to indicate I guessed correctly.");
        System.out.println("\nYour input: ");
        return this.userInput.next();
    }


    public void setLowerBound (int newValue){
        this.lowerBound = newValue;
    }

    public void setUpperBound (int newValue){
        this.upperBound = newValue;
    }

    public boolean isInputValid(String input) {
        return input.equals("l") || input.equals("h") || input.equals("c");
    }

    private int updateGuess (){
        return this.guess = (upperBound+lowerBound)/2;
    }

    public void play () {
        System.out.println("Please think of a number between 1 and 100!");
        while((upperBound - lowerBound)>=1){
            int newGuess = this.updateGuess();
            String answer = this.askUserInput(newGuess);
            if (this.isInputValid(answer)){
                if (this.isCorrect(answer)){
                    System.out.println("Game over. Your secret number was: "+ newGuess);
                    break;
                }else if(this.isHigh(answer)) {
                    this.setUpperBound(newGuess);
                }else if(this.isLow(answer)){
                    this.setLowerBound(newGuess);
                }}
                else{
                    System.out.println("Sorry, I did not understand your input.");
                }
            }

        }

    private boolean isLow(String input){
        return input.equals("l");
    }

    private boolean isHigh(String input){
        return input.equals("h");
    }

    private boolean isCorrect(String input){
        return input.equals("c");
    }

}
