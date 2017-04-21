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

    @Before
    public void before() {
       customer = new Customer("Rajini");
       this.paymentDetails = paymentDetails;
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
     System.out.println(customer.getTotalMoneyInCard("CreditCard"));

//        assertEquals(100.0, customer.getTotalMoneyInCard("CreditCard"));
    }



}
