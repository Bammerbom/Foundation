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
package io.foundationdriven.foundation.api.economy;

import io.foundationdriven.foundation.api.economy.currency.Currency;

import java.util.List;
import java.util.UUID;

public interface EconomyManager {

	List<Bank> getBanks();

	void addBank(Bank bank);

	List<Bank> getBanksByName(String name);

	List<Bank> banksThatSupportCurrency(Currency currency);

	void setDefaultBank(Bank bank);

	Bank getDefaultBank();

	List<Bank> blacklistedBanks();

	void blacklistBank(UUID uuid);

	Bank getBankByBankID(UUID bankID);

	void addCurrencyToBank(Bank bank, Currency currency);

	void addCurrenciesToBank(Bank bank, List<Currency> currencies);

	void addCurrencyToBank(List<Bank> banks, Currency currency);

	void addCurrenciesToBanks(List<Bank> banks, List<Currency> currencies);

	void addCurrencyToAll(Currency toAdd);

	void addCurrenciesToAll(List<Currency> toAdd);
}