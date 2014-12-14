package io.foundationdriven.economy.managers;

import io.foundationdriven.economy.objects.Currency;

public class ConversionManager {
    public static Integer convert(Currency from, Integer a, Currency to){
        return (a * from.getGlobalValue()) / to.getGlobalValue();
    }
}
