package example.codeclan.com.shop;

import java.util.ArrayList;

/**
 * Created by user on 21/04/2017.
 */

public class Shop {
    private ArrayList<Item> items;
    private ArrayList<Item> purchasedItems;
    private int sales;
    private int refunds;
    private double totalIncome;

    public Shop(Integer sales, Integer refunds, Double totalIncome) {

        this.items = new ArrayList<Item>();
        this.sales = sales;
        this.refunds = refunds;
        this.totalIncome = totalIncome;
        this.purchasedItems = new ArrayList<Item>();


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


    public void  setShopTotalIncome(double shopTotalIncome) {
        this.totalIncome = shopTotalIncome;
    }


    public void addItem(Item item) {
        items.add(item);
    }

   public void makeaSaleToCustomer(Item item, Customer customer) {
        /*
                Have a public void addItem(item item)
                    this will add to arraylist


                 Alos have an id for item so we can keep track


                 first in this method check if item exists
                 if it does, sell to customer

                 then take item out of arraylist, then add to purchaseditem arraylist

                 test it
         */
        if(items.contains(item)) {
            customer.buyItem(item.getPrice());
            purchasedItems.add(item);
            sales = sales + 1;
            setShopSales(sales);
        }
    }


    public void  giveARefundToCustomer(Item item, Customer customer) {

        if(purchasedItems.contains(item)) {
            customer.refundItem(item.getPrice());
            purchasedItems.remove(item);
            refunds = refunds + 1;
            setShopRefunds(refunds);

        }
    }

    public void reportTotalIncomeTest() {
        totalIncome = sales - refunds;
        setShopTotalIncome(totalIncome);

    }
}




