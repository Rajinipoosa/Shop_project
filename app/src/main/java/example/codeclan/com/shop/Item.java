package example.codeclan.com.shop;

/**
 * Created by user on 21/04/2017.
 */

public class Item{
    private int id;
    private String name ;
    private double price;
    private int quantity;



    public  Item(Integer id, String name,double price,Integer quantity){
        this.id = id;
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

    public int getId() {
        return id;
    }
}