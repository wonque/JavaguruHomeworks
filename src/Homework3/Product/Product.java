package Homework3.Product;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;
//    private double actualPrice;

    Product (String name, double regularPrice) {
        this.name = name;
        this.regularPrice = regularPrice;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getActualPrice() {
        double actualPrice = regularPrice - regularPrice*discount/100;
        return actualPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void displayProductInfo(){
        System.out.println("Product name: "+ this.getName());
        System.out.println("Regular price: " + this.getRegularPrice() + " EUR");
        System.out.println("Applied discount: " + this.getDiscount() +"%");
        System.out.println("Actual price with discount: " + this.getActualPrice() + " EUR");
    }
}
