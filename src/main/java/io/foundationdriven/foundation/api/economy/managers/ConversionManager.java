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
