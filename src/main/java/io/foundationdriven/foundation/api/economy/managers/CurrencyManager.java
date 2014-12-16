/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 FoundationDriven
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.foundationdriven.foundation.api.economy.managers;

import io.foundationdriven.foundation.api.economy.errors.InvalidGlobalValue;
import io.foundationdriven.foundation.api.economy.objects.Currency;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages registered currencies
 * @see io.foundationdriven.foundation.api.economy.objects.Currency
 */
public class CurrencyManager {
    /**
     * All the registered currencies
     * @see io.foundationdriven.foundation.api.economy.objects.Currency
     */
    private static List<Currency> currencies = new ArrayList<Currency>();

    /**
     * Gets a currency by name
     * @param name the name of the currency
     * @return the currency or null if not found
     * @see io.foundationdriven.foundation.api.economy.objects.Currency
     */
    public static Currency getCurrency(String name){
        for (Currency c : currencies){
            if(c.getName().equals(name)) return c;
        }
        return null;
    }

    /**
     * Creates and registers a currency from the given arguments
     * @param name the name of the currency
     * @param plural the plural of the currency
     * @param globalValue the globalvalue of the currency
     * @return the currency that was created
     * @see io.foundationdriven.foundation.api.economy.objects.Currency
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
     * @see io.foundationdriven.foundation.api.economy.managers.AccountManager
     */
    public static void deleteCurrency(Currency delete){
        if (currencies.contains(delete)) AccountManager.purgeCurrency(delete);
    }

    /**
     * Unregisters and converts all instances of a currency to another
     * @param delete The currency to delete
     * @param convertTo The currency to convert to
     * @see io.foundationdriven.foundation.api.economy.managers.AccountManager
     */
    public static void deleteCurrency(Currency delete, Currency convertTo){
        if (currencies.contains(delete)) AccountManager.purgeCurrency(delete, convertTo);
    }
}
