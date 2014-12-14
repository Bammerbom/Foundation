package io.foundationdriven.foundation.api.formatting;

import io.foundationdriven.foundation.api.formatting.styles.StyleManager;

public class FoundationMessage {
    private String value;

    public FoundationMessage(String start) {
        value += StyleManager.getStyle("main") + start;
    }

    public FoundationMessage(String start, String style) {
        value += StyleManager.getStyle(style) + start;
    }

    public FoundationMessage main(String value) {
        value += StyleManager.getStyle("main") + value;
        return this;
    }

    public FoundationMessage accent(String value) {
        value += StyleManager.getStyle("accent") + value;
        return this;
    }

    public FoundationMessage force(String value) {
        value += value;
        return this;
    }

    public FoundationMessage custom(String value, String style) {
        value += StyleManager.getStyle(style) + value;
        return this;
    }

    public String finalise() {
        return value;
    }
}
