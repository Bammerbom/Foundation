package io.foundationdriven.economy.errors;

public class InvalidAmount extends Error {
    private Integer amount;

    public InvalidAmount(Integer amount) {
        super();
        this.amount = amount;
    }

    public Integer getAmount() {
        return this.amount;
    }
}
