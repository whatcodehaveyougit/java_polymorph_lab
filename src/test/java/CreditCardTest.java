import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(333, "01/20", 123, 2, 100);
    }

    @Test
    public void creditCardHasNumber(){
        assertEquals(333, creditCard.getCardNumber());
    }

    @Test
    public void creditCardHasExpiryDate(){
        assertEquals("01/20", creditCard.getExpiryDate());
    }


}
