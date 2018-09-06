package homework8;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> someMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter some input or press Enter: ");
            String ans = scanner.nextLine();
            if (ans.equals("")){
                break;
            }else {
                someMap.putIfAbsent(ans, 0);
                someMap.computeIfPresent(ans, (key, value) -> value+1);
            }

        }
        System.out.println(someMap);
        System.out.println("Total values: " + someMap.values().size());
    }




}
