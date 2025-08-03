package vut.test;


import org.junit.Test;
import static org.junit.Assert.*;
import vut.data.CreditCard;

/**
 *
 * @author ajne
 */
public class CreditCardTest {
    
    @Test
    public void testSetFullName() {
        CreditCard obj = new CreditCard("John Doe", "0403125190088", "0764893865");
    obj.setFullName("John,Doe");
    assertEquals("John,Doe",obj.getFullName());
    }

    @Test
    public void testSetIDNumber() {
        CreditCard obj = new CreditCard("John Doe", "0403125190088", "0764893865");
        obj.setIDNumber("0403125190088");
        assertEquals("0403125190088", obj.getIDNumber());
    }

    @Test
    public void testSetCellNumber() {
        CreditCard obj = new CreditCard("John Doe", "0403125190088", "0764893865");
        obj.setCellNumber("0764893865");
        assertEquals("0764893865", obj.getCellNumber());

    }
    
      @Test
    public void testCardPurchase() {
        CreditCard obj = new CreditCard("John Doe", "0403125190088", "0764893865");
        obj.cardPurchase(680.50);
        assertEquals(18, obj.getPointsAccumulated());
        assertEquals(1,obj.getNoOfPurchases());
}
}
