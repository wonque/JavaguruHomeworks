package shoppinglist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private List<Product> shoppingList;
    private String title;

    public ShoppingList(String name) {
        title = name;
        this.shoppingList = new ArrayList<>();
    }

    public void addToList(String name, double price, Categories category) {
        Product product = new Product(name, category);
        product.setPrice(price);
        shoppingList.add(product);
    }

    public String getTitle() {
        return title;
    }

    public void deleteProductByName(String name) {
        List<Product> copyOfShoppingList = new ArrayList<>();
        copyOfShoppingList.addAll(shoppingList);
        int counter = 0;
        for (Product product : copyOfShoppingList) {
            if (product.getName().equals(name)) {
                shoppingList.remove(product);
                counter++;
            }
        }
        System.out.println("Total deleted products: " + counter);
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }

    public void printShoppingList() {
        for (Product product : shoppingList) {
            System.out.println(product);
        }
    }

}
