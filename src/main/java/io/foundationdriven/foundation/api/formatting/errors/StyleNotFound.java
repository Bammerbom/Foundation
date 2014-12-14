package io.foundationdriven.foundation.api.formatting.errors;

public class StyleNotFound extends Error{
    private String name;

    public String getName() {
        return name;
    }

    public StyleNotFound(String name) {
        this.name = name;
    }
}
