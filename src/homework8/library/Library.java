package homework8.library;


import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> allBooks;

    public Library() {
        this.allBooks = new ArrayList<>();
    }

    public void addToLibrary(String title, String authorsFirstName, String authorsSecondName) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthorFirstName(authorsFirstName);
        book.setAuthorSecondName(authorsSecondName);
        allBooks.add(book);
    }

    public List<Book> getArrayOfAuthorsBooks(String authorsName) {
        List<Book> books = new ArrayList<>();
        String toFind = authorsName.toLowerCase();
        for (Book item : allBooks) {
            String authorsFullName = item.getFullAuthorsName().toLowerCase();
            String authorsSecondName = item.getAuthorSecondName().toLowerCase();
            String authorsFirstName = item.getAuthorFirstName().toLowerCase();
            if (authorsFullName.equals(toFind) || authorsFirstName.equals(toFind)
                    || authorsSecondName.equals(toFind)) {
                books.add(item);
            }
        }
        System.out.println(books);
        return books;
    }

    public void getBooksByTitle(String title) {
        System.out.println("Search result for title -> " + title + ":\n");
        for (Book item : allBooks) {
            if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(item);
            }
        }
    }


    public void printAllBooks() {
        System.out.println("Total books: " + allBooks.size());
        for (Book book : allBooks) {
            System.out.println(book + "\n");

        }
    }
}




