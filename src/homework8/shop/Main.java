package homework8.shop;

public class Main {

    public static void main(String[] args) {
        Shop someShop = new Shop();
        someShop.addToShop("Milk", 1.84);
        someShop.addToShop("Coffee", 5.44);
        someShop.addToShop("Beer", 7.89);
        someShop.addToShop("Onions", 0.65);
        someShop.printProducts();
        someShop.findByPriceRange(0, 8);
        someShop.findByTitle("bee");
    }
}
