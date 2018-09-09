package homework7;

import java.util.Random;

public class IntegerArray {


    public static Integer [] createArray (int arraySize, int randomBound){
        Integer [] someArray = new Integer[arraySize];
        Random random = new Random();
        for (int i = 0; i < someArray.length; i++ ){
            int randomNumber = random.nextInt(randomBound);
            someArray[i] = randomNumber;
        }
        return someArray;
    }

    public static double calulateSumInArray (Integer[] array){
        double sum = 0;
        for(Integer number : array){
            sum+=number;
        }
        return sum;
    }

    public static void printArray (Integer[] array) {
        for (Integer number : array){
            System.out.print(number +" ");
        }
    }

    public static Integer[] invertArray (Integer [] array) {
        int lastItemIndex = array.length-1;
        for (int i =0 ; i<array.length/2;i++){
            int currentValue = array[i];
            array[i] = array[lastItemIndex];
            array[lastItemIndex] = currentValue;
            lastItemIndex--;
        }return array;
    }

}
