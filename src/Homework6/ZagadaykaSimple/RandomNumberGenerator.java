package Homework6.ZagadaykaSimple;

import java.util.Random;

public class RandomNumberGenerator {

    private int startingPoint=1;
    private int endingPoint=100;

    public int generateRandomNumber () {

        Random randNum = new Random();
        int generatedNumber = randNum.nextInt((endingPoint-startingPoint) +1) + startingPoint;

        return generatedNumber;

    }

}
