package example.codeclan.com.shop;

import java.lang.reflect.Array;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by user on 21/04/2017.
 */

public class Customer {
    private String CustomerName;
    private ArrayList <Card> paymentlist;
    private ArrayList<Item> purchasedItems;
    private Card preferredCardDetails;
//    HashMap<String,Integer> paymentlist;

    public Customer(String name, Card preferredCardDetails){
        this.CustomerName = name;
        paymentlist = new ArrayList<Card>();
//        HashMap<String,Integer> paymentlist = new HashMap<String,Integer>();
        //paymentlist.put("CreditCard",100.00);
        //paymentlist.put("DebitCard",200);
        paymentlist.add(new Card("CreditCard",1111, 100.0)) ;
        paymentlist.add(new Card("DebitCard",4444, 200.00));
        purchasedItems = new ArrayList<Item>();
        this.preferredCardDetails = preferredCardDetails;

    }


    public String getCustomerName() {
        return this.CustomerName;
    }

    public int getPaymentDetails() {

        return paymentlist.size();
    }


    public double getTotalMoneyInCard() {
        return preferredCardDetails.getCardAmount();

    }

    public void buyItem(double item_price) {
        double result = 0;
       result = preferredCardDetails.getCardAmount() - item_price;
        //paymentlist.get("DebitCard")
//        result =  paymentlist.get("DebitCard")-item_price;

        preferredCardDetails.setCardAmount(result);
    }

    public double refundItem(double item_price) {
        double result = 0;
//        paymentlist.get("DebitCard") + item_price;
        result = preferredCardDetails.getCardAmount() + item_price;
//          paymentlist.get("DebitCard").setCardAmount(result);
        preferredCardDetails.setCardAmount(result);
        return result;
    }

    public void selectPrefferedCardDetails(String cardtype,int number) {
        for(Card card: paymentlist  ){
            if(card.getCardType() == cardtype && card.getCardNumber() == number){
                preferredCardDetails = card;


            }

        }

    }
}
