package io.foundationdriven.economy.errors;

/**
 * Thrown when an account does not have enough money to perform a transaction
 */
public class NotEnoughMoney extends Error {
    /**
     * The amount of money the account needs to be able to perform the transaction
     */
    private Integer deficit;

    /**
     * Calculates and sets the deficit and calls the error constructor
     * @param attempted The transaction that was attempted
     * @param had The amount the account had
     */
    public NotEnoughMoney(Integer attempted, Integer had) {
        super();
        this.deficit = attempted - had;
    }

    /**
     * Gets the deficit
     * @return The deficit
     */
    public Integer getDeficit() {
        return this.deficit;
    }
}
