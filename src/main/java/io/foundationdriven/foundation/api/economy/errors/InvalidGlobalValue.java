package io.foundationdriven.foundation.api.economy.errors;

/**
 * This is thrown when an invalid global value is passed into a currency
 * Normally due to a negative number
 */
public class InvalidGlobalValue extends Error{
    /**
     * The global value that was passed in
     */
    private Integer globalValue;

    /**
     * Sets the global value and calls the error constructor
     * @param globalValue The globalvalue that was passed in
     */
    public InvalidGlobalValue(Integer globalValue) {
        super();
        this.globalValue = globalValue;
    }

    /**
     * Gets the global value that was passed in
     * @return The global value that was passed in
     */
    public Integer getGlobalValue() {
        return this.globalValue;
    }
}
