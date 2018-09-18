package shoppinglist;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private Categories category;


    public Product(String name, Categories category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Categories getCategory() {
        return category;
    }

    public String getCategoryString() {
        return category.getTitle();
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("PRICE CANT BE NEGATIVE. CURRENT PRICE SET TO 0");
            this.price = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
