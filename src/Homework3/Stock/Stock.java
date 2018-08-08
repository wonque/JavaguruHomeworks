package Homework3.Stock;

class Stock {
     // объявление свойств класса
    private String company;
    double currentValue;
    double max;
    double min;
    // создание конструктора класса
    Stock (String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }

    public String getCompany () {return company;}

    public double getCurrentValue() {return currentValue;}

    public double getMax() {return max;}

    public double getMin() {
        return min;
    }

    private void setMax (double max) {
        this.max = max;
    }

    private void setMin (double min) {
        this.min = min;
    }

    public String toString() {
        return "Name: " + company + "\n" + "Current price: " + currentValue + "\n" + "Min price: " + min + "\n"
                + "Max price: " + max;
    }

    public void updatePrice (double newPrice) {
        this.currentValue = newPrice;
        if (newPrice <= this.getMin()) {
            this.setMin(newPrice);
        }
        else if ((newPrice>this.getMin()) && (newPrice<this.getMax())) {
            this.setMin(newPrice);
            }
        else if (newPrice >= this.getMax()) {
            this.setMax(newPrice);
        }
//        return this.currentValue;
        }

}
