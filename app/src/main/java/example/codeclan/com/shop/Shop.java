package example.codeclan.com.shop;

import java.util.ArrayList;

/**
 * Created by user on 21/04/2017.
 */

public class Shop{
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;

    private int sales;
    private int refunds;
    private double totalIncome;

    public Shop(Integer sales, Integer refunds, Double totalIncome) {

        this.items = new ArrayList<Item>();
        this.customers = new ArrayList<Customer>();
        this.sales = sales;
        this.refunds = refunds;
        this.totalIncome = totalIncome;

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
}





