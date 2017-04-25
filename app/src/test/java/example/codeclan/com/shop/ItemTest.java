package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/04/2017.
 */

public class ItemTest {
    Item item;



    @Before
    public void before() {
        item = new Item(2,"Bread", 5.00, 4);

    }

    @Test
    public void getIdTest(){
        assertEquals(2,item.getId());
    }
     @Test
      public void getNameTest() {
        assertEquals("Bread", item.getName());
    }
    @Test
      public void getPriceTest(){
        assertEquals(5.00,item.getPrice(),0.01);
    }
     @Test
       public void getQuantityTest(){
         assertEquals(4,item.getQuantity());
     }




    @Test
    public void setPriceTest(){
         item.setPrice(2.00);
         assertEquals(2.00,item.getPrice(),0.01);
     }

    @Test
    public void setQuantitytest(){
        item.setQuantity(3);
        assertEquals(3,item.getQuantity()) ;

    }


}