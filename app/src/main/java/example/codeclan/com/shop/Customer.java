package example.codeclan.com.shop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by user on 21/04/2017.
 */

public class Customer {
    private String name;
    private ArrayList<Card> paymentDetails;


    public Customer(String name){
        this.name = name;
        this.paymentDetails= new ArrayList<Card>();

    }


}
