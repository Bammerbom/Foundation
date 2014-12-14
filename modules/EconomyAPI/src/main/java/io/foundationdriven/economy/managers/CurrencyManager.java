package io.foundationdriven.economy.managers;

import io.foundationdriven.economy.objects.Currency;

import java.util.ArrayList;
import java.util.List;

public class CurrencyManager {
    private static List<Currency> currencies = new ArrayList<>();
    public static Currency getCurrency(String name){
        for (Currency c : currencies){
            if(c.getName() == name) return c;
        }
        return null;
    }
    public static Currency createCurrency(String name, String plural, Integer globalValue){
        if (getCurrency(name) != null) return getCurrency(name);
        else{
            Currency newCurrency = new Currency(name, plural, globalValue);
            currencies.add(newCurrency);
            return newCurrency;
        }
    }

    public static List<Currency> getCurrencies() {
        return currencies;
    }
    public static void deleteCurrency(Currency delete){
        if (currencies.contains(delete)) AccountManager.purgeCurrency(delete);
    }
    public static void deleteCurrency(Currency delete, Currency convertTo){
        if (currencies.contains(delete)) AccountManager.purgeCurrency(delete, convertTo);
    }
}
