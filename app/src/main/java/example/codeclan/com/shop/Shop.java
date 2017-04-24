package example.codeclan.com.shop;

import java.util.ArrayList;

/**
 * Created by user on 21/04/2017.
 */

public class Shop {
    private ArrayList<Item> items;
    private ArrayList<PurchasedItems> purchasedItems;
    private int sales;
    private int refunds;
    private double totalIncome;

    public Shop(Integer sales, Integer refunds, Double totalIncome) {

        this.items = new ArrayList<Item>();
        this.sales = sales;
        this.refunds = refunds;
        this.totalIncome = totalIncome;
        this.purchasedItems = new ArrayList<PurchasedItems>();


    }

    public int getShopSales() {
        return sales;
    }






    public void setShopSales(int shopSales) {
        this.sales = shopSales;
    }

    public int getShopRefunds() {
        return refunds;
    }

    public void setShopRefunds(int shopRefunds) {
        this.refunds = shopRefunds;
    }

    public double getShopTotalIncome() {
        return totalIncome;
    }

    public double setShopTotalIncome(double shopTotalIncome) {
        this.totalIncome = shopTotalIncome;
        return totalIncome;
    }
    public void addItem(Item item) {
        items.add(item);
    }

    public double makeaSaleToCustomer(Item item, Customer customer) {
        double value = 0;
        double result= 0;
        /*
                Have a public void addItem(item item)
                    this will add to arraylist


                 Alos have an id for item so we can keep track


                 first in this method check if item exists
                 if it does, sell to customer

                 then take item out of arraylist, then add to purchaseditem arraylist

                 test it
         */
        if (items.equals(item)) {

        }

        result = customer.buyItem(item.getPrice());
         value  = item.getQuantity() - 1;
        purchasedItems.add(new PurchasedItems(item.getName(),item.getPrice()));
        sales = sales + 1;
        return result;

    }



}




