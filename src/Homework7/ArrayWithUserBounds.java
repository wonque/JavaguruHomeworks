package Homework7;

import java.util.Random;

public class ArrayWithUserBounds {

    public static Integer[] createArray(int arraySize, int randomBound) {
        Integer[] someArray = new Integer[arraySize];
        Random random = new Random();
        for (int i = 0; i < someArray.length; i++) {
            int randomNumber = random.nextInt(randomBound);
            someArray[i] = randomNumber;
        }
        return someArray;
    }

    public static void printArray(Integer[] array) {
        for (Integer number : array) {
            System.out.print(number + " ");
        }
    }

    private static boolean isNumberInBounds (int number, Integer[] userBounds){
        int lowBound  = userBounds[0];
        int highBound = userBounds[1];
        return (lowBound<=number) && (number<=highBound);
    }

    private static int calculatePossibleUserArraySize (Integer [] currentArray, Integer[] userBounds){
        int arraySize = 0;
        for (int number : currentArray){
            if(isNumberInBounds(number,userBounds)){
                arraySize++;
            }
        }return arraySize;
    }

    public static Integer[] createNewArrayUsingBounds (Integer[] currentArray, Integer[] userBound){
        int newArraySize = calculatePossibleUserArraySize(currentArray, userBound);
        Integer[] userBoundArray = new Integer[newArraySize];
        int index = 0;
        for (int i=0; i< currentArray.length; i++){
            if(isNumberInBounds(currentArray[i], userBound )){
                userBoundArray[index] = currentArray[i];
                index++;
            }
        }return userBoundArray;
    }
}