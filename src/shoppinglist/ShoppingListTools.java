package shoppinglist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListTools {

    public List<Product> getProductsByCategory(String category, ShoppingList shoppingList) {
        List<Product> byCategory = new ArrayList<>();
        String toFind = category.toLowerCase();
        for (Product product : shoppingList.getShoppingList()) {
            String productCategory = product.getCategoryString().toLowerCase();
            if (productCategory.contains(toFind)) {
                byCategory.add(product);
            }
        }
        System.out.println("Search results for '" + category + "'\n");
        return byCategory;
    }

    public List<Product> getProductsInPriceRange(double from, double to, ShoppingList shoppingList) {
        List<Product> productsInRange = new ArrayList<>();
        for (Product product : shoppingList.getShoppingList()) {
            if (product.getPrice() >= from && product.getPrice() <= to) {
                productsInRange.add(product);
            }
        }
        System.out.println("Filtered results for price range from " + from + " to " + to);
        return productsInRange;
    }

    public void printFilteredProductList(List<Product> someList) {
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }

    }

    public void exportShoppingListToFile(ShoppingList list) {
        String fileName = list.getTitle().concat(".txt");
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("An IOException was caught " + e.getMessage());
        }
        try {
            PrintWriter writer = new PrintWriter(file.getAbsoluteFile());
            writer.write("List of products in " + list.getTitle() + ": \n");
            writer.println();
            for (Product product : list.getShoppingList()) {
                writer.println(product);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("An FileNotFoundException was caught " + e.getMessage());
        }
    }

}
