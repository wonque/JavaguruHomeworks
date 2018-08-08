package Homework3.Stock;

public class StockDemo {
    public static void main(String[] args) {
        Stock ibm = new Stock("IBM", 146.54);
        ibm.updatePrice(146.50);
        ibm.updatePrice(146.56);
        System.out.println(ibm);

    }
}
