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


    public Customer(String name,Card preferredCardDetails){

        this.CustomerName = name;
        paymentlist = new ArrayList<Card>();
        paymentlist.add(new Card("CreditCard",1111, 100.0)) ;
        paymentlist.add(new Card("DebitCard",4444, 200.00));
        paymentlist.add(new Card("VisaCard",3333, 50.00));
        purchasedItems = new ArrayList<Item>();

       this.preferredCardDetails = preferredCardDetails;

    }

    public String getCustomerName() {
        return this.CustomerName;
    }

    public int getTotalNumberOfPaymentDetails() {
       return paymentlist.size();

    }

    public void buyItem(double item_price,double item_quantity) {
        double result = 0;
        result = preferredCardDetails.getCardAmount() - (item_price*item_quantity) ;
        preferredCardDetails.setCardAmount(result);



    }
    public double getTotalMoneyInCard() {
        return preferredCardDetails.getCardAmount();
    }



    public double refundItem(double item_price,double item_quantity) {
        double result = 0;
        result = preferredCardDetails.getCardAmount() + (item_price*item_quantity) ;
        preferredCardDetails.setCardAmount(result);
        return result;
    }
    public int getPurchasedItem(Item newItem) {
        purchasedItems.add(newItem);
        return purchasedItems.size();
    }


    public void selectPrefferedCardDetails(String cardtype) {
        for(Card card: paymentlist  ){
            if(card.getCardType() == cardtype){
                preferredCardDetails = card;



            }

        }

    }



}
