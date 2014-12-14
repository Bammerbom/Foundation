package io.foundationdriven.economy.managers;

import io.foundationdriven.economy.errors.InvalidGlobalValue;
import io.foundationdriven.economy.objects.Currency;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages registered currencies
 * @see io.foundationdriven.economy.objects.Currency
 */
public class CurrencyManager {
    /**
     * All the registered currencies
     * @see io.foundationdriven.economy.objects.Currency
     */
    private static List<Currency> currencies = new ArrayList<>();

    /**
     * Gets a currency by name
     * @param name the name of the currency
     * @return the currency or null if not found
     * @see io.foundationdriven.economy.objects.Currency
     */
    public static Currency getCurrency(String name){
        for (Currency c : currencies){
            if(c.getName() == name) return c;
        }
        return null;
    }

    /**
     * Creates and registers a currency from the given arguments
     * @param name the name of the currency
     * @param plural the plural of the currency
     * @param globalValue the globalvalue of the currency
     * @return the currency that was created
     * @see io.foundationdriven.economy.objects.Currency
     */
    public static Currency createCurrency(String name, String plural, Integer globalValue){
        if (getCurrency(name) != null) return getCurrency(name);
        else if(globalValue < 0) throw new InvalidGlobalValue(globalValue);
        else{
            Currency newCurrency = new Currency(name, plural, globalValue);
            currencies.add(newCurrency);
            return newCurrency;
        }
    }

    /**
     * Gets the list of registered currencies
     * @return A list of registered currencies
     */
    public static List<Currency> getCurrencies() {
        return currencies;
    }

    /**
     * Unregisters and purges a currency
     * @param delete the currency to delete
     * @see io.foundationdriven.economy.managers.AccountManager
     */
    public static void deleteCurrency(Currency delete){
        if (currencies.contains(delete)) AccountManager.purgeCurrency(delete);
    }

    /**
     * Unregisters and converts all instances of a currency to another
     * @param delete The currency to delete
     * @param convertTo The currency to convert to
     * @see io.foundationdriven.economy.managers.AccountManager
     */
    public static void deleteCurrency(Currency delete, Currency convertTo){
        if (currencies.contains(delete)) AccountManager.purgeCurrency(delete, convertTo);
    }
}
