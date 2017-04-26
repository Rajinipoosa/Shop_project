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

        shop = new Shop(10, 5, 0.00);
        item = new Item(1,"chocalate", 5.00, 10);
        customer = new Customer("Rajini", new Card("Master", 44, 500.0));
        shop.addItem(item);
//        shop.addItem(new Item(2,"Bread", 2.00, 10));
        this.purchasedItems = purchasedItems;
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
       shop.makeaSaleToCustomer(item, customer);
        assertEquals(495.0, customer.getTotalMoneyInCard());
       assertEquals(9,item.getQuantity());



   }

    @Test
      public void giveARefundToCustomerTest(){
        shop.makeaSaleToCustomer(item, customer);
        shop.giveARefundToCustomer(item, customer);
        assertEquals(500.0,customer.getTotalMoneyInCard());
        assertEquals(10,item.getQuantity());
        assertEquals(0,customer.getPurchasedItem());


    }

    @Test
      public void reportTotalIncomeTest(){
        shop.makeaSaleToCustomer(item, customer);
        shop.giveARefundToCustomer(item, customer);
        shop.reportTotalIncomeTest();
        assertEquals(5.0,shop.getShopTotalIncome());
    }


}



