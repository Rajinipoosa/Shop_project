package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/04/2017.
 */

public class ShopTest {
    Shop shop;
    Item items;
    Customer customers;

    @Before
    public void before() {
        shop = new Shop(10, 5, 100.00);
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


}


