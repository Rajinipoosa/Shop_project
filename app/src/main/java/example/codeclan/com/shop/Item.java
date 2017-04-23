package example.codeclan.com.shop;

/**
 * Created by user on 21/04/2017.
 */

public class Item{

    private String name ;
    private double price;
    private int quantity;


    public  Item(String name,double price,Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity=quantity;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = "Banana";
    }

    public void setPrice(double price) {
        this.price = 2.00;
    }
}