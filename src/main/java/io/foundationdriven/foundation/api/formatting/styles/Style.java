package io.foundationdriven.foundation.api.formatting.styles;

public class Style {
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Style(String name, String value) {

        this.name = name;
        this.value = value;
    }
}
