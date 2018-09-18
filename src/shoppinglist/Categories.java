package shoppinglist;

public enum Categories {
    SOFT_DRINKS("Soft Drinks"),
    CLOTHES("Clothes"),
    FOOTWEAR("Footwear"),
    ALCOHOL("Alcohol"),
    FOOD("Food"),
    GADGETS("Gadgets");

    private String title;

    Categories(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
