package io.foundationdriven.economy.objects;

import io.foundationdriven.economy.errors.InvalidAmount;

import java.util.HashMap;
import java.util.UUID;

/**
 * Represents an account
 * @see io.foundationdriven.economy.managers.AccountManager
 */
public class Account {
    /**
     * The name of this account
     */
    private String name;
    /**
     * The UUID of this account
     * @see java.util.UUID
     */
    private UUID uuid;
    /**
     * The amounts of currencies that this account has in it
     * @see io.foundationdriven.economy.objects.Currency
     */
    private HashMap<Currency, Integer> amounts = new HashMap<Currency, Integer>();

    /**
     * Sets the name and generates a UUID
     * @param name the name of this account
     */
    public Account(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
    }

    /**
     * Gets the name of this account
     * @return the name of this account
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this account
     * @param name The new name of this account
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the UUID of this account
     * @return the UUID of this account
     * @see java.util.UUID
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Gets the amounts list for this account
     * @return The amounts of currencies that this account has in it
     * @see io.foundationdriven.economy.objects.Currency
     */
    public HashMap<Currency, Integer> getAmounts() {
        return amounts;
    }

    /**
     * Gets the amount of the provided currency this account has
     * @param c The currency
     * @return The amount
     */
    public Integer getAmount(Currency c) {
        if (amounts.containsKey(c)) {
            return amounts.get(c);
        } else {
            return 0;
        }
    }

    /**
     * Gives an amount of a specified currency to this account
     * @param c the currency to give
     * @param a the amount to give
     * @return this
     * @see io.foundationdriven.economy.objects.Currency
     */
    public Account give(Currency c, Integer a) {
        if (a < 1) {
            throw new InvalidAmount(a);
        }
        Integer val = 0;
        if (amounts.containsKey(c)) {
            val = amounts.get(c);
        }
        val += a;
        amounts.put(c, val);
        return this;
    }

    /**
     * Takes an amount of a specified currency from this account
     * @param c the currency to take
     * @param a the amount to take
     * @return this
     * @see io.foundationdriven.economy.objects.Currency
     */
    public Account take(Currency c, Integer a) {
        if (a < 1) {
            throw new InvalidAmount(a);
        }
        Integer val = 0;
        if (amounts.containsKey(c)) {
            val = amounts.get(c);
        }
        val -= a;
        amounts.put(c, val);
        return this;
    }
}
