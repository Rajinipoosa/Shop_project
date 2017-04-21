package example.codeclan.com.shop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by user on 21/04/2017.
 */

public class Customer {
    private String CustomerName;
    private ArrayList<Card> paymentlist;


    public Customer(String name){
        this.CustomerName = name;
        paymentlist = new ArrayList<Card>();
        paymentlist.add(new Card("CreditCard", 1111, 100.0));
        paymentlist.add(new Card("DebitCard", 4444, 200.00));
        paymentlist.add(new Card("Master", 5555, 200.00));

    }


    public String getCustomerName() {
        return this.CustomerName;
    }

    public int getpaymentDetails() {
        return paymentlist.size();
    }
}
