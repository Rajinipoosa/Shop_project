package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

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
    @Test
    public void setNameTest(){
        item2 = new Item("Banana",2.00,2,0.1);
        item2.setName("Banana");
        assertEquals("Banana",item2.getName());

    }
     @Test
      public void getNameTest() {
        assertEquals("Bread", item1.getName());
    }
    @Test
      public void getPriceTest(){
        assertEquals(5.00,item1.getPrice());
    }
     @Test
       public void getQuantityTest(){
         assertEquals(4,item1.getQuantity());
     }
     @Test
    public void setPriceTest(){
         item2.setPrice(2.00);
         assertEquals(2.00,item2.getPrice());
     }


}