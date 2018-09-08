package homework8.library;


import java.util.LinkedList;


public class Library {

    private LinkedList<Book> allBooks;

    public Library() {
        this.allBooks = new LinkedList<>();
    }
    //Вариант 1 - перед добавлением создать экземпляр класса Book
//    public void addToLibrary (Book book){
//        allBooks.add(book);
//
//    }

    //Вариант 2 - создание объекта Book и добавление через объект Library
    public void addToLibrary(String title, String authorsFirstName, String authorsSecondName) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthorFirstName(authorsFirstName);
        book.setAuthorSecondName(authorsSecondName);
        allBooks.add(book);
    }

    public void getOneAuthorBooks(String authorsName) {
        System.out.println("Search result for author-> " + authorsName + ":\n");
        String toFind = authorsName.toLowerCase();
        for (Book item : allBooks) {
            String authorsFullName = item.getFullAuthorsName().toLowerCase();
            String authorsSecondName = item.getAuthorSecondName().toLowerCase();
            String authorsFirstName = item.getAuthorFirstName().toLowerCase();
            if (authorsFullName.equals(toFind) || authorsFirstName.equals(toFind)
                    || authorsSecondName.equals(toFind)) {
                System.out.println(item);
            }
        }
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




