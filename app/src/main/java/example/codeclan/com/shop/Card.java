package example.codeclan.com.shop;

/**
 * Created by user on 21/04/2017.
 */

public class Card {
    private String cardType;
    private int cardNumber;
    private double amount;
    public Card(String cardType,int cardNumber, double amount){
        this.cardType = cardType;
        this.cardNumber= cardNumber;
        this.amount = amount;
        
    }

    public String getCardType() {
        return cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
