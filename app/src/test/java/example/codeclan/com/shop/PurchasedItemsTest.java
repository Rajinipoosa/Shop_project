package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/04/2017.
 */

public class PurchasedItemsTest {
    PurchasedItems purchasedItems;

    @Before
    public void before(){
       purchasedItems = new PurchasedItems("Bread",2.00);

    }



}
