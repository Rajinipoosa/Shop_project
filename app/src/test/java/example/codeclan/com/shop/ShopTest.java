package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/04/2017.
 */

public class ShopTest {
    Shop shop;
    Item items;

    Customer customers;
    PurchasedItems purchasedItems;

    @Before
    public void before() {
        shop = new Shop(10, 5, 100.00);
         items = new Item("chocalate", 5.00, 10);
        customers = new Customer("Rajini");

    }

    @Test
    public void getShopSalesTest() {
        assertEquals(10, shop.getShopSales());
    }
    @Test
    public void setShopSalesTest() {
        shop.setShopSales(20);
        assertEquals(20, shop.getShopSales());
    }

    @Test
    public void getShopRefundsTest(){
        assertEquals(5, shop.getShopRefunds());
    }

    @Test
    public void setShopRefundsTest(){
        shop.setShopRefunds(10);
        assertEquals(10, shop.getShopRefunds());
    }
    @Test
    public void getShopTotalIncomeTest(){
        assertEquals(100.00,shop.getShopTotalIncome());

    }
    @Test
    public void setShopTotalIncomeTest(){
        shop.setShopTotalIncome(200.00);
//        System.out.println(shop.getShopTotalIncome());
       assertEquals(200.00,shop.getShopTotalIncome());

    }
   @Test
    public void getMakeASale(){
       shop.addTheSaleItemToCustomer("Rajini",items);


    }
}


