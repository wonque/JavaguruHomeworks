package Homework3.Product;

public class ProductDemo {

    public static void main(String[] args) {
        ProductDec milk = new ProductDec("milk", 0.80);
        milk.setDiscount(20);
        milk.displayProductInfo();

        ProductDec teaMilkyOolong = new ProductDec("Green Tea Milky Oolong", 2.40);
        teaMilkyOolong.setDiscount(33.69);
        System.out.println();
        teaMilkyOolong.displayProductInfo();

        Product coffee = new Product("coffee", 12.80);
        coffee.setDiscount(2.5);
        System.out.println();
        coffee.displayProductInfo();


    }
}
