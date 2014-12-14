package io.foundationdriven.economy.errors;

/**
 * This is thrown when an invalid amount is passed into give or take methods
 * Normally a negative number
 */
public class InvalidAmount extends Error {
    /**
     * The amount that was provided
     */
    private Integer amount;

    /**
     * Sets the amount and calls the error constructor
     * @param amount The amount that was provided
     */
    public InvalidAmount(Integer amount) {
        super();
        this.amount = amount;
    }

    /**
     * Gets the amount that was provided
     * @return The amount that was provided
     */
    public Integer getAmount() {
        return this.amount;
    }
}
