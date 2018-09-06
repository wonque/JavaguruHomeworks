package homework8;


import java.util.Scanner;

public class HashSet {

    public static void main(String[] args) {
        java.util.HashSet<String> strings = new java.util.HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter some input or press Enter: ");
            String ans = scanner.nextLine();
            if(ans.equals("")){
                break;
            }else{
                strings.add(ans);
            }
        }System.out.println(strings);

    }




}
