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
//        item2 = new Item(3,"Jam", 4.00, 2);
    }
//    @Test
//    public void setNameTest(){
//        item = new Item(2,"Banana",2.00,2);
//        item.setName("Banana");
//        assertEquals("Banana",item2.getName());
//
//    }
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


}