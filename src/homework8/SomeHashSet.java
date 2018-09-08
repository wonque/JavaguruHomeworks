package homework8;


import java.util.Scanner;
import java.util.HashSet;

public class SomeHashSet {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter some input or press Enter: ");
            String ans = scanner.nextLine();
            if (ans.equals("")) {
                break;
            } else {
                strings.add(ans);
            }
        }
        System.out.println(strings);

    }


}
