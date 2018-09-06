package homework8.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> products;


    public Shop (){
        this.products = new ArrayList<>();
    }

    public void findByTitle (String title){
        System.out.println("Items contains --> "+title);
        for(Product item : products){
            if(item.getTitle().toLowerCase().contains(title.toLowerCase())){
                System.out.println(item);
            }
        }
    }

    public void findByPriceRange(double priceMin, double priceMax){
        System.out.println("Matched items: ");
        for(Product item :products){
            if((priceMin<= item.getPrice()) && (item.getPrice()<=priceMax)){
                System.out.println(item);
            }
        }
    }

    public void addToShop (String title, double price){
        Product product = new Product();
        product.setTitle(title);
        product.setPrice(price);
        addToProducts(product);
    }

    private void addToProducts (Product product){
        products.add(product);
    }

    public void printProducts(){
        for (Product item : products){
            System.out.println(item);
        }
    }

}
