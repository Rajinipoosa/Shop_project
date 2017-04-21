package example.codeclan.com.shop;

/**
 * Created by user on 21/04/2017.
 */

public class Item{

    private String name ;
    private double price;
    private int quantity;
    private double tax;

    public  Item(String name,double price,Integer quantity, double tax){
        this.name = name;
        this.price = price;
        this.quantity=quantity;
        this.tax = tax;


    }

    public String getName() {
        return name;
    }
}