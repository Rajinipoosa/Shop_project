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
    public void getcustomerCardNames() {
        assertEquals(3, customer.getpaymentDetails());
    }


}
