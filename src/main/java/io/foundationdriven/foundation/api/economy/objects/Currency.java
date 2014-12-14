package io.foundationdriven.foundation.api.economy.objects;

import io.foundationdriven.foundation.api.economy.errors.InvalidGlobalValue;

/**
 * Represents a currency
 * @see io.foundationdriven.foundation.api.economy.managers.CurrencyManager
 */
public class Currency {
    /**
     * The name of this currency
     */
    private String name;
    /**
     * The plural of this currency
     */
    private String plural;
    /**
     * The global value of this currency
     */
    private Integer globalValue;

    /**
     * Sets the variables of this currency
     * @param name the name of this currency
     * @param plural the plural of this currency
     * @param globalValue the globalValue of this currency
     */
    public Currency(String name, String plural, Integer globalValue) {
        this.name = name;
        this.plural = plural;
        this.globalValue = globalValue;
    }

    /**
     * Gets the name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the plural
     * @return the plural
     */
    public String getPlural() {
        return plural;
    }

    /**
     * Sets the plural
     * @param plural the new plural
     */
    public void setPlural(String plural) {
        this.plural = plural;
    }

    /**
     * Gets the global value
     * @return the global value
     */
    public Integer getGlobalValue() {
        return globalValue;
    }

    /**
     * Sets the global value
     * @param globalValue the new global value
     */
    public void setGlobalValue(Integer globalValue) {
        if (globalValue < 0) throw new InvalidGlobalValue(globalValue);
        else this.globalValue = globalValue;
    }

    /**
     * Gets the name to use based on the integer provided
     * @param i the integer / amount
     * @return plural or name
     */
    public String getAppropriateName(Integer i) {
        if (i > 1) return plural;
        else return name;
    }
}
