package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 21/04/2017.
 */

public class CustomerTest {

    Customer customer;
    Card paymentDetails;
    Item   purchasedItems;
    Card preferredCardDetails;

    @Before
    public void before() {
        preferredCardDetails = new Card("DebitCard",4444,200.00);
        customer = new Customer("Rajini", preferredCardDetails);
    }
    @Test
    public void getCustomerNameTest(){
        assertEquals("Rajini", customer.getCustomerName());

    }
    @Test
    public void selectPrefferedCardDetailsTest() {

        customer.selectPrefferedCardDetails("CreditCard", 1111);
    }


    @Test
    public void getCustomerCardNamesTest() {
        assertEquals(2, customer.getPaymentDetails());
    }


    @Test
    public void getTotalMoneyInCardTest(){

        assertEquals(200.00,customer.getTotalMoneyInCard());

    }


    @Test
    public void buyItemTest(){
        customer.buyItem(10.00);
        double total = customer.getTotalMoneyInCard();

        assertEquals(190.0,total,0.01);
     }

     @Test
     public void refundItemTest(){
         assertEquals(210.0,customer.refundItem(10.00));

     }

}
