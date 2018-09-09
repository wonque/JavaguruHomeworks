package homework7;

public class ArrayWithUserBoundsTest {

    public static void main(String[] args) {
        Integer[] someArray = ArrayWithUserBounds.createArray(10, 101);
        ArrayWithUserBounds.printArray(someArray);
        System.out.println();
        User newUser = new User();
        newUser.setupUserBound();
        Integer[] newUserArray = ArrayWithUserBounds.createNewArrayUsingBounds(someArray, newUser.getUserBounds());
        ArrayWithUserBounds.printArray(newUserArray);

    }
}
