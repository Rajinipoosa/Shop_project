package example.codeclan.com.shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/04/2017.
 */

public class CardTest {
    Card card;

      @Before
      public void before(){
        card = new Card("DebitCard", 121212, 12.90);
//      card2 = new Card("CreditCard", 121334, 20.90);
      }

      @Test
        public void getCardTypeTest(){
        assertEquals("DebitCard",card.getCardType());

      }
      @Test
        public void getCardNumberTest(){
        assertEquals(121212, card.getCardNumber());
      }
      @Test
          public void getCardAmountTest(){
          assertEquals(12.90,card.getCardAmount(),0.01);
      }

      @Test
        public void setCardAmountTest(){
          card.setCardAmount(12.00);
          assertEquals(12.00,card.getCardAmount());
      }
       @Test
    public void SetCardNumberTest(){
           card.setCardNumber(5555);
           assertEquals(5555,card.getCardNumber());
       }
       @Test
      public void setCardTypeTest(){
           card.setCardType("CreditCard");
           assertEquals("CreditCard",card.getCardType()) ;
       }

}

