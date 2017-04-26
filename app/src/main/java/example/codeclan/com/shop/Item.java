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
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price ;
    }

    public int getId() {
        return id;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object otherItem) {
        Item other = (Item) otherItem;

        return this.id == other.getId();
    }





}