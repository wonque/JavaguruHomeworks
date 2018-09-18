package shoppinglist;

import java.util.List;

public class ShoppingListTests {

    public static void main(String[] args) {
        ShoppingListTests test = new ShoppingListTests();
        ShoppingListTools tools = new ShoppingListTools();
        test.negativePriceTest();
        ShoppingList shoppingList = new ShoppingList("First list");
        shoppingList.addToList("Coffee", 8.50, Categories.SOFT_DRINKS);
        shoppingList.addToList("Tea", 3.40, Categories.SOFT_DRINKS);
        shoppingList.addToList("Trainers", 120, Categories.FOOTWEAR);
        shoppingList.addToList("Hat", 15, Categories.CLOTHES);
        shoppingList.addToList("Cheese", 7.80, Categories.FOOD);
        shoppingList.addToList("Headphones", 45.70, Categories.GADGETS);
        shoppingList.addToList("Bread", 3.40, Categories.FOOD);
        shoppingList.addToList("Red Wine", 8.90, Categories.ALCOHOL);
        shoppingList.addToList("Beer", 4.60, Categories.ALCOHOL);
        shoppingList.addToList("External Hard Drive", 150.90, Categories.GADGETS);

        test.deleteProductByNameTest("Hat", shoppingList);

        List<Product> productsInRange = tools.getProductsInPriceRange(1.50, 5.00, shoppingList);
        tools.printFilteredProductList(productsInRange);

        List<Product> productsInCategory = tools.getProductsByCategory("gadgets", shoppingList);
        tools.printFilteredProductList(productsInCategory);

        tools.exportShoppingListToFile(shoppingList);

    }

    private void negativePriceTest() {
        Product beer = new Product("Beer", Categories.ALCOHOL);
        beer.setPrice(-100);
        if (beer.getPrice() == 0) {
            System.out.println("negativePriceTest OK");
        } else {
            System.out.println("negativePriceTest failed!");
        }

    }

    private void deleteProductByNameTest(String name, ShoppingList shoppingList) {
        shoppingList.deleteProductByName(name);
        if (!shoppingList.getShoppingList().contains(name)) {
            System.out.println("deleteProductByNameTest OK");
        } else {
            System.out.println("deleteProductByNameTest FAIL");
        }

    }


}
