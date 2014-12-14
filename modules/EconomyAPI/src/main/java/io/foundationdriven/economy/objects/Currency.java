package io.foundationdriven.economy.objects;

public class Currency {
    private String name;
    private String plural;
    private Integer globalValue;

    public Currency(String name, String plural, Integer globalValue) {
        this.name = name;
        this.plural = plural;
        this.globalValue = globalValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    public Integer getGlobalValue() {
        return globalValue;
    }

    public void setGlobalValue(Integer globalValue) {
        this.globalValue = globalValue;
    }

    public String getAppropriateName(Integer i) {
        if (i > 1) return plural;
        else return name;
    }
}
