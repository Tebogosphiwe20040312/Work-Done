package vut.test;

/**
 *
 *
 * @author 222467088 TS Jiyane
 */

import org.junit.Test;
import static org.junit.Assert.*;
import vut.AmGamer;
import vut.ProGamer;

public class GamerTest {

    @Test
    public void testGenCodeAmGamer1() {
        AmGamer gamer = new AmGamer("123", "Tshepo Lekoka", 25, 1);
        assertEquals("A123-1", gamer.genCode());
    }

    @Test
    public void testGenCodeAmGamer2() {
        AmGamer gamer = new AmGamer("456", "Glad Maimele", 20, 2);
        assertEquals("A456-2", gamer.genCode());
    }

    @Test
    public void testGenCodeAmGamer3() {
        AmGamer gamer = new AmGamer("789", "Golden Similo", 30, 3);
        assertEquals("A789-3", gamer.genCode());
    }

    @Test
    public void testGenCodeProGamer1() {
        ProGamer gamer = new ProGamer("101", "Tumelo Lenotha", 28, 5, 15);
        assertEquals("P1515-05", gamer.genCode());
    }

    @Test
    public void testGenCodeProGamer2() {
        ProGamer gamer = new ProGamer("202", "Vushaka Chauke", 33, 8, 25);
        assertEquals("P2525-08", gamer.genCode());
    }

    public void testcalculateDiscountAmGamer1() {
        AmGamer gamer = new AmGamer("123", "Latricia Fisher", 15, 1);
        assertEquals(40, gamer.calculateDiscount(1000));
    }

    @Test
    public void testcalculateDiscountAmGamer2() {
        AmGamer gamer = new AmGamer("456", "Glad Maimele", 20, 2);
        assertEquals(20, gamer.calculateDiscount(1000));
    }

    @Test
    public void testcalculateDiscountAmGamer3() {
        AmGamer gamer = new AmGamer("789", "Hluphile Tree", 25, 3);
        assertEquals(0, gamer.calculateDiscount(1000));
    }

    @Test
    public void testcalculateDiscountAmGamer4() {
        AmGamer gamer = new AmGamer("101", "Golden Similo", 14, 1);
        assertEquals(40, gamer.calculateDiscount(1000));
    }

    @Test
    public void testcalculateDiscountProGamer1() {
        ProGamer gamer = new ProGamer("102", "Mbali Mantso", 35, 12, 10);
        assertEquals(250, gamer.calculateDiscount(1000));
    }

    @Test
    public void testcalculateDiscountProGamer2() {
        ProGamer gamer = new ProGamer("103", "Mania Mangope", 40, 8, 20);
        assertEquals(400, gamer.calculateDiscount(10000));
    }
}
