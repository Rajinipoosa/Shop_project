package example.codeclan.com.shop;

import java.util.ArrayList;

/**
 * Created by user on 21/04/2017.
 */

public class Shop {
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;
    private ArrayList<PurchasedItems> purchasedItems;
    private ArrayList<Card> card;
    private int sales;
    private int refunds;
    private double totalIncome;

    public Shop(Integer sales, Integer refunds, Double totalIncome) {

        this.items = new ArrayList<Item>();
        this.card = new ArrayList<Card>();
        this.customers = new ArrayList<Customer>();
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

//    public double addTheSaleItemToCustomer(String name,Item items, Card cards) {
//
//         double result   = 0 ; double value = 0;
//
//
//        for (Customer customer : customers) {
//
//            if (customer.getCustomerName() == name ){
//
//                for(Card customercard : card){
//                    if ( (customercard.getCardType() == cards.getCardType()) && (customercard.getCardNumber() == cards.getCardNumber())){
//                          value = customer.getTotalMoneyInCard(cards.getCardType(),cards.getCardNumber());
//                          result  = value - items.getPrice();
//
//
//                    }
//
//                }
//
//                customer.UpdateTotalMoneyInCard(cards.getCardType(),cards.getCardNumber(),result);
//               result = customer.getTotalMoneyInCard(cards.getCardType(),cards.getCardNumber());
//
//
//
//
//        }
//            return result;
//        }
//
//    }
}




