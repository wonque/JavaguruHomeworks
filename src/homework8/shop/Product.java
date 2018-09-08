package homework8.shop;

public class Product {

    private String title;
    private double price;

//    public Product (String title, int group, double price){
//        this.title = title;
//        this.price = price;
//        this.group = group;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ". Price: " + price;
    }
}
