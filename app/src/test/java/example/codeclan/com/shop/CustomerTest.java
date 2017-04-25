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
        preferredCardDetails  = new Card("DebitCard",4444,200.00);
        customer = new Customer("Rajini", preferredCardDetails);
        this.purchasedItems = purchasedItems;

    }
    @Test
      public void getCustomerNameTest(){
        assertEquals("Rajini", customer.getCustomerName());

    }


    @Test
      public void getCustomerCardTotalTest() {
        assertEquals(3, customer.getTotalNumberOfPaymentDetails());
    }


    @Test
      public void getTotalMoneyInCardTest(){

        assertEquals(200.00,customer.getTotalMoneyInCard());

    }

    @Test
    public void selectPrefferedCardDetailsTest() {
        customer.selectPrefferedCardDetails("CreditCard");
        assertEquals(100.0, customer.getTotalMoneyInCard(), 0.01);
    }

    @Test

      public void buyItemTest(){
        customer.selectPrefferedCardDetails("DebitCard");
        customer.buyItem(10.00);


        double total = customer.getTotalMoneyInCard();
        assertEquals(190.0,total,0.01);
     }



     @Test
       public void refundItemTest(){
         customer.selectPrefferedCardDetails("VisaCard");

         assertEquals(60.00,customer.refundItem(10.00));

     }


    @Test
    public void getTotalPurchasedItems(){
        assertEquals(0,customer.getPurchasedItem());
    }


}
