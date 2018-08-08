package Homework3.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

class ProductDec {

    private String name;
    private BigDecimal regularPrice;
//    private BigDecimal actualPrice;
    private double discount;
    private String currency = "EUR";

    ProductDec(String name, double regularPrice) {
        this.name = name;
        this.regularPrice = new BigDecimal(regularPrice);
    }

    public String getName() { return name; }

    public BigDecimal getRegularPrice() { return regularPrice.setScale(2, RoundingMode.HALF_UP);}

    public BigDecimal getDiscount () { return BigDecimal.valueOf(discount); }

    public void setName(String name) { this.name = name;}

    public void setDiscount (double discount) { this.discount = discount;}

    public void setRegularPrice (BigDecimal regularPrice) {this.regularPrice = regularPrice;}


    public BigDecimal getActualPrice() {

        BigDecimal discount = this.getDiscount();
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal currentPrice = this.getRegularPrice();

        BigDecimal result = currentPrice.subtract(currentPrice.multiply(discount.divide(hundred)));

        // всё в одну строчку, но так - менее читаемо, по моему.
        // BigDecimal result = this.getRegularPrice().subtract(this.getRegularPrice().multiply(BigDecimal.valueOf(this.discount)).divide(BigDecimal.valueOf(100.0)));

        return result.setScale(2, RoundingMode.HALF_UP);
    }

    public void displayProductInfo() {
        System.out.println("Product name: "+ this.getName());
        System.out.println("Regular price : "+ this.getRegularPrice() + this.currency);
        System.out.println("Applied discount: "+ this.getDiscount()+"%");
        System.out.println("Actual price with discount: " + this.getActualPrice() + this.currency);
    }
}

