package homework8.library;

public class Book {

    private String title;
    private String authorFirstName;
    private String authorSecondName;

     //Контсруктор класса для Варианта 1

//    public Book (String title, String authorFirstName, String authorSecondName){
//              this.title = title;
//              this.authorFirstName = authorFirstName;
//              this. authorSecondName = authorSecondName;}


    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullAuthorsName (){
        return authorFirstName + " " + authorSecondName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book: " + getFullAuthorsName() + " - "+ '"' + title +'"';
    }

}
