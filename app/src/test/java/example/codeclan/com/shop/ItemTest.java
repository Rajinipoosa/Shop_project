package example.codeclan.com.shop;

import org.junit.Before;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/04/2017.
 */

public class ItemTest {
    Item item1;
    Item item2;


    @Before
    public void before() {
        item1 = new Item("Bread", 5.00, 4, 1.0);
        item2 = new Item("Jam", 4.00, 2, 0.5);
    }

    public void getNameTest() {
        assertEquals("Bread", item1.getName());
    }

}