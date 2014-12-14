import io.foundationdriven.economy.errors.InvalidAmount;
import io.foundationdriven.economy.errors.InvalidGlobalValue;
import io.foundationdriven.economy.errors.NotEnoughMoney;
import io.foundationdriven.economy.managers.AccountManager;
import io.foundationdriven.economy.managers.CurrencyManager;
import io.foundationdriven.economy.objects.Account;
import io.foundationdriven.economy.objects.Currency;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests the economy API
 */
public class EconomyTest {
    /**
     * Creates two currencies ( Waffles and pancakes ) for use throughout the tests as well as a test account
     * @see io.foundationdriven.economy.objects.Currency
     * @see io.foundationdriven.economy.managers.CurrencyManager
     */
    @BeforeClass
    public static void createCurrency(){
        Currency waffle = CurrencyManager.createCurrency("Waffle", "Waffles", 1);
        Currency pancake = CurrencyManager.createCurrency("Pancake", "Pancakes", 2);
        org.junit.Assert.assertSame("Waffle currency wasn't registered", CurrencyManager.getCurrency("Waffle"), waffle);
        org.junit.Assert.assertSame("Pancake currency wasn't registered", CurrencyManager.getCurrency("Pancake"), pancake);
        Account a = AccountManager.createAccount("test");
        org.junit.Assert.assertSame("test Account wasn't registered", AccountManager.getAccount("test"), a);
    }

    /**
     * Tries to register a currency with a negative globalValue (-1)
     * @throws io.foundationdriven.economy.errors.InvalidGlobalValue
     * @see io.foundationdriven.economy.objects.Currency
     * @see io.foundationdriven.economy.managers.CurrencyManager
     */
    @Test(expected = InvalidGlobalValue.class)
    public void testInvalidCurrencyCreation(){
        CurrencyManager.createCurrency("Invalid", "Invalids", -1);
    }

    /**
     * Sets the test account's waffle count to 0, gives it 100 and tries to give it -100
     * @throws io.foundationdriven.economy.errors.InvalidAmount
     * @see io.foundationdriven.economy.objects.Account
     */
    @Test(expected = InvalidAmount.class)
    public void testGiving() {
        Account a = AccountManager.getAccount("test");
        Currency c = CurrencyManager.getCurrency("Waffle");
        if (a == null) org.junit.Assert.fail("Could not find test account");
        else if (c == null) org.junit.Assert.fail("Could not find waffle currency");
        else {

            a.getAmounts().put(c, 0);
            a.give(c, 100);
            org.junit.Assert.assertEquals("When given 100 waffles, test account didn't have 100 waffles", ((Integer) 100), a.getAmount(c));
            a.give(c, -100);
        }
    }

    /**
     * Sets the test account's waffle count to 200, takes 50 and tries to take -50
     * @throws io.foundationdriven.economy.errors.InvalidAmount
     * @see io.foundationdriven.economy.objects.Account
     */
    @Test(expected = InvalidAmount.class)
    public void testTaking(){
        Account a = AccountManager.getAccount("test");
        Currency c = CurrencyManager.getCurrency("Waffle");
        if (a == null) org.junit.Assert.fail("Could not find test account");
        else if (c == null) org.junit.Assert.fail("Could not find waffle currency");
        else{

            a.getAmounts().put(c, 200);
            a.take(c, 50);
            org.junit.Assert.assertEquals("When given 200 waffles and 50 waffles were taken away, test Account didn't have 50 waffles", ((Integer)150), a.getAmount(c));
            a.take(c, (-50));
        }
    }

    /**
     * Sets the test account's waffle count to 100 and tries to take 200
     * @throws io.foundationdriven.economy.errors.NotEnoughMoney
     * @see io.foundationdriven.economy.objects.Account
     */
    @Test(expected = NotEnoughMoney.class)
    public void testTooMuchTake() {
        Account a = AccountManager.getAccount("test");
        Currency c = CurrencyManager.getCurrency("Waffle");
        if (a == null) org.junit.Assert.fail("Could not find test account");
        else if (c == null) org.junit.Assert.fail("Could not find waffle currency");
        else{
            a.getAmounts().put(c, 100);
            a.take(c, 200);
        }
    }

    /**
     * Purges and converts all waffles to pancakes then purges all pancakes and deletes the test account
     */
    @AfterClass
    public static void cleanup(){
        Account a = AccountManager.getAccount("test");
        Currency w = CurrencyManager.getCurrency("Waffle");
        Currency p = CurrencyManager.getCurrency("Pancake");
        if (a == null) org.junit.Assert.fail("Could not find test account");
        else if (w == null) org.junit.Assert.fail("Could not find waffle currency");
        else if (p == null) org.junit.Assert.fail("Could not find pancake currency");
        else{
            a.getAmounts().put(w, 100);
            CurrencyManager.deleteCurrency(w, p);
            org.junit.Assert.assertEquals("100 wafles should be 50 pancakes", ((Integer)a.getAmount(p)), ((Integer)50));
            CurrencyManager.deleteCurrency(p);
            org.junit.Assert.assertEquals("Amounts hashmap should be empty", a.getAmounts().size(), 0);
            AccountManager.unregisterAccount(a);
            org.junit.Assert.assertEquals("Should be no accounts left", AccountManager.getAccounts().size(), 0);
        }
    }
}