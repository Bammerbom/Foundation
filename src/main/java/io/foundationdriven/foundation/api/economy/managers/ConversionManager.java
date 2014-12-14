package io.foundationdriven.foundation.api.economy.managers;

import io.foundationdriven.foundation.api.economy.objects.Currency;

/**
 * A helper class for converting currencies
 */
public class ConversionManager {
    /**
     * Converts the amount of from to to
     * @param from The currency to convert from
     * @param a The amount of the currency
     * @param to The Currency to convert to
     * @return The equivalent of a of from in to
     * @see io.foundationdriven.foundation.api.economy.objects.Currency
     */
    public static Integer convert(Currency from, Integer a, Currency to){
        return (a * from.getGlobalValue()) / to.getGlobalValue();
    }
}
