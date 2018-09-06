package homework8.library;

public class Main {
    public static void main(String[] args) {

        //Вариант 1
//        Book bk1 = new Book ("Война и мир", "Лев","Толстой");
//        Book bk2 = new Book("Братья Карамазовы", "Федор", "Достоевский");
//        Book bk3 = new Book ("Преступление и наказание", "Федор", "Достоевский");
//        Book bk4 = new Book("Властелин Колец", "Джон", "Толкин");
//        Library library = new Library();
//        library.addToLibrary(bk1);
//        library.addToLibrary(bk2);
//        library.addToLibrary(bk3);
//        library.addToLibrary(bk4);

        //Вариант 2
        Library library = new Library();
        library.addToLibrary("Война и мир", "Лев","Толстой");
        library.addToLibrary("Братья Карамазовы", "Федор", "Достоевский");
        library.addToLibrary("Преступление и наказание", "Федор", "Достоевский");
        library.addToLibrary("Властелин Колец", "Джон", "Толкин");
        LibraryForm.askForOption(library);

    }
}
