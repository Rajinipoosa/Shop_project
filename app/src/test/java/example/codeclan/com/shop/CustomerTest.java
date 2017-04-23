package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/04/2017.
 */

public class CustomerTest {

    Customer customer;
    Card paymentDetails;
    PurchasedItems purchasedItems;

    @Before
    public void before() {
       customer = new Customer("Rajini");

    }
    @Test
    public void getCustomerNameTest(){
        assertEquals("Rajini", customer.getCustomerName());

    }
    @Test
    public void getCustomerCardNames() {
        assertEquals(3, customer.getPaymentDetails());
    }
    @Test
    public void getTotalMoneyInCardTest(){
//     System.out.println(customer.getTotalMoneyInCard("Master"));

       assertEquals(100.0, customer.getTotalMoneyInCard("CreditCard",1111));
    }
    @Test
    public void getCustomerPurchasedDetailsTest(){
        assertEquals(1,customer.getCustomerPurchasedDetails().size());
    }



}
