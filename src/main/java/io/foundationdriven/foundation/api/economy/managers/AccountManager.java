package io.foundationdriven.foundation.api.economy.managers;

import io.foundationdriven.foundation.api.economy.objects.Account;
import io.foundationdriven.foundation.api.economy.objects.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Stores and manages accounts
 *
 * @see io.foundationdriven.foundation.api.economy.objects.Account
 */
public class AccountManager {
    /**
     * The registered accounts
     *
     * @see io.foundationdriven.foundation.api.economy.objects.Account
     */
    private static List<Account> accounts = new ArrayList<Account>();

    /**
     * Gets an account by the name of the account
     *
     * @param name The name of the account
     * @return The account with that name or null if not found
     * @see io.foundationdriven.foundation.api.economy.objects.Account
     */
    public static Account getAccount(String name) {
        for (Account a : accounts) {
            if (a.getName() == name) return a;
        }
        return null;
    }

    /**
     * Gets an account by the UUID of the account
     *
     * @param uuid The UUID of the account
     * @return The account with that UUID or null if not found
     * @see io.foundationdriven.foundation.api.economy.objects.Account
     * @see java.util.UUID
     */
    public static Account getAccount(UUID uuid) {
        for (Account a : accounts) {
            if (a.getUuid() == uuid) return a;
        }
        return null;
    }

    /**
     * Creates and registers a new account with the provided name
     *
     * @param name the name to register the account under
     * @return the new account
     * @see io.foundationdriven.foundation.api.economy.objects.Account
     */
    public static Account createAccount(String name) {
        Account newAccount = new Account(name);
        accounts.add(newAccount);
        return newAccount;
    }

    /**
     * Gets the account list
     *
     * @return the account list
     */
    public static List<Account> getAccounts() {
        return accounts;
    }

    /**
     * Purges purge from all accounts and converts it to convertTo
     *
     * @param purge     The currency to purge
     * @param convertTo The currency to convert it to
     * @see io.foundationdriven.foundation.api.economy.objects.Currency
     * @see io.foundationdriven.foundation.api.economy.managers.ConversionManager
     */
    public static void purgeCurrency(Currency purge, Currency convertTo) {
        for (Account a : accounts) {
            if (a.getAmounts().containsKey(purge)) {
                Integer convertedTo = ConversionManager.convert(purge, a.getAmount(purge), convertTo);
                a.getAmounts().remove(purge);
                a.give(convertTo, convertedTo);
            }
        }
    }

    /**
     * Purges purge from all accounts
     *
     * @param purge The currency to purge
     * @see io.foundationdriven.foundation.api.economy.objects.Currency
     * @see io.foundationdriven.foundation.api.economy.managers.ConversionManager
     */
    public static void purgeCurrency(Currency purge) {
        for (Account a : accounts) {
            if (a.getAmounts().containsKey(purge)) {
                a.getAmounts().remove(purge);
            }
        }
    }

    /**
     * Unregisters an account
     *
     * @param a The account to unregister
     */
    public static void unregisterAccount(Account a) {
        if (accounts.contains(a)) accounts.remove(a);
    }
}
