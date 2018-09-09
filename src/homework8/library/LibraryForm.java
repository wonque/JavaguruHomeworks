package homework8.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryForm {

    private static int option = 0;

    public static void askForOption(Library library) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        displayOptions();
        System.out.println("Your input: ");
        try {
            option = scanner.nextInt();
            libraryActions(option, library);
        } catch (InputMismatchException e) {
            option = 0;
            libraryActions(option, library);
        }
    }

    private static String askForTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title: ");
        return scanner.next();
    }

    private static String askForAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter authors full name or second name: ");
        return scanner.next();
    }

    private static void displayOptions() {
        System.out.println("To search book by author choose 1.");
        System.out.println("To search book by title choose 2.");
        System.out.println("To display all available books choose 3.\n");
        System.out.println("Any other input will end program\n");
    }

    private static void libraryActions(int option, Library library) {
        switch (option) {
            case 0:
                System.out.println("Program ended.");
                break;
            case 1:
                String author = askForAuthor();
                library.getArrayOfAuthorsBooks(author);
                break;
            case 2:
                String title = askForTitle();
                library.getBooksByTitle(title);
                break;
            case 3:
                library.printAllBooks();
        }
    }
}
