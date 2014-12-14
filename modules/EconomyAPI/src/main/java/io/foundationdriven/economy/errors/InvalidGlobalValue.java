package io.foundationdriven.economy.errors;

public class InvalidGlobalValue {
    private Integer globalValue;

    public InvalidGlobalValue(Integer globalValue) {
        super();
        this.globalValue = globalValue;
    }

    public Integer getGlobalValue() {
        return this.globalValue;
    }
}
