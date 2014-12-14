package io.foundationdriven.economy.errors;

public class NotEnoughMoney extends Error {
    private Integer deficit;

    public NotEnoughMoney(Integer attempted, Integer had) {
        super();
        this.deficit = attempted - had;
    }

    public Integer getDeficit() {
        return this.deficit;
    }
}
