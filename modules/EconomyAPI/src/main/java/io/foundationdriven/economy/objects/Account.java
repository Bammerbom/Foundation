package io.foundationdriven.economy.objects;

import io.foundationdriven.economy.errors.InvalidAmount;

import java.util.HashMap;
import java.util.UUID;

public class Account {
    private String name;
    private UUID uuid;
    private HashMap<Currency, Integer> amounts = new HashMap<Currency, Integer>();

    public Account(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public HashMap<Currency, Integer> getAmounts() {
        return amounts;
    }

    public Integer getAmount(Currency c) {
        if (amounts.containsKey(c)) {
            return amounts.get(c);
        } else {
            return 0;
        }
    }

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
