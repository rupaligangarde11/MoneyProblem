import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void shouldAdd120PaiseAnd150PaiseToReturn270Paise() {
        Money money1 = new Money(0, 120);
        Money money2 = new Money(0, 150);
        assertEquals(new Money(0, 270), money1.addPaise(money2));
    }

    @Test
    public void shouldAdd1RupeeAnd5RupeeToReturn6Rupee() {
        Money money1 = new Money(1, 0);
        Money money2 = new Money(5, 0);
        assertEquals(new Money(6, 0), money1.addRupee(money2));
    }

    @Test
    public void shouldReturnTrueWhenComparing120PaiseAnd1Rupee20Paise() {
        Money paise = new Money(0, 120);
        Money rupeeAndPaise = new Money(1, 20);
        assertEquals(paise, rupeeAndPaise);
    }

    @Test
    public void shouldAdd1Rupee20PaiseAnd150PaiseToReturn2Rupee70Paise() {
        Money money1 = new Money(1, 20);
        Money money2 = new Money(0, 150);
        assertEquals(new Money(2, 70), money1.addMoney(money2));
    }


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
