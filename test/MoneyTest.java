import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void shouldAddOneRupeeTenPaiseAndTwoRupeeFifteenPaiseToReturn3Rupee25Paise() {
        Money money1 = new Money(1, 10);
        Money money2 = new Money(2, 15);
        assertEquals(new Money(3, 25), money1.addMoney(money2));
    }

    @Test
    public void shouldAdd1Rupee60PaiseAnd2Rupee50PaiseToReturn4RupeeAnd10Paise() {
        Money moneyOne = new Money(1, 60);
        Money moneyTwo = new Money(2, 50);
        assertEquals(new Money(4, 10), moneyOne.addMoney(moneyTwo));
    }

}
