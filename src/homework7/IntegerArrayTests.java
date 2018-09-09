package homework7;


public class IntegerArrayTests {

    public static void main(String[] args) {
        Integer [] someArray = IntegerArray.createArray(10, 101);
        IntegerArray.printArray(someArray);
        double arrayNumbersSum = IntegerArray.calulateSumInArray(someArray);
        System.out.println("The sum of all numbers is: " + arrayNumbersSum);
        System.out.println();
        IntegerArray.printArray(someArray);
        IntegerArray.invertArray(someArray);
        System.out.println();
        IntegerArray.printArray(someArray);
        System.out.println();

    }
}
