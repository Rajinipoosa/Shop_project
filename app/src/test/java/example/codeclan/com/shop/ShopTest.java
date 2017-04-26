package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 21/04/2017.
 */

public class ShopTest {
    Shop shop;
    Item item;
    Customer customer;
    Item  purchasedItems;

    @Before
      public void before() {

        shop = new Shop(10, 5, 0.00, 2);
        item = new Item(1,"chocalate", 5.00, 10);
        customer = new Customer("Rajini", new Card("Master", 44, 500.0));
        shop.addItem(item);


    }
    @Test
      public void getShopSalesTest() {
        assertEquals(10, shop.getShopSales());
    }

    @Test
      public void addItemTest(){
        shop.addItem(item);

    }
    @Test
    public void getOrderItemQuantityTest(){
        assertEquals(2, shop.getOrderItemQuantity());

    }

    @Test
      public void setShopSalesTest() {
        shop.setShopSales(20);
        assertEquals(20, shop.getShopSales());
    }

    @Test
      public void getShopRefundsTest() {
        assertEquals(5, shop.getShopRefunds());
    }

    @Test
      public void setShopRefundsTest() {
        shop.setShopRefunds(10);
        assertEquals(10, shop.getShopRefunds());
    }

    @Test
      public void getShopTotalIncomeTest() {
        assertEquals(0.00, shop.getShopTotalIncome());

    }

    @Test
      public void setShopTotalIncomeTest() {
        shop.setShopTotalIncome(200.00);

        assertEquals(200.00, shop.getShopTotalIncome());
    }


   @Test
     public void makeaSaleToCustomerTest(){
       assertEquals(10,item.getQuantity());
        shop.makeaSaleToCustomer(item, customer,shop.getOrderItemQuantity());
        assertEquals(490.0, customer.getTotalMoneyInCard());
        assertEquals(8,item.getQuantity());
       assertEquals(11,shop.getShopSales());

   }

    @Test
      public void giveARefundToCustomerTest(){
        customer.selectPrefferedCardDetails("CreditCard");
        shop.makeaSaleToCustomer(item, customer,shop.getOrderItemQuantity());
        assertEquals(90.0,customer.getTotalMoneyInCard());
        assertEquals(8,item.getQuantity());
        shop.giveARefundToCustomer(item, customer,shop.getOrderItemQuantity());
        assertEquals(100.0,customer.getTotalMoneyInCard());
        assertEquals(10,item.getQuantity());
        assertEquals(6,shop.getShopRefunds());
//       / assertEquals(false,purchasedItems);
    }

    @Test
      public void reportTotalIncomeTest(){
        shop.makeaSaleToCustomer(item, customer,shop.getOrderItemQuantity());
        shop.giveARefundToCustomer(item, customer,shop.getOrderItemQuantity() );
        shop.reportTotalIncomeTest();
        assertEquals(5.0,shop.getShopTotalIncome());
    }


}



