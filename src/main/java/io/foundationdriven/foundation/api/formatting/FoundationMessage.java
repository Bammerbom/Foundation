package io.foundationdriven.foundation.api.formatting;

import io.foundationdriven.foundation.api.formatting.styles.StyleManager;

/**
 * The main class of the formatting API. Provides an easy way to apply styles to strings with a Stringbuilder like style
 */
public class FoundationMessage {
    /**
     * The string value of this message
     */
    private String value;

    /**
     * Starts the message with the main style
     * @param start the string to start with
     */
    public FoundationMessage(String start) {
        value += StyleManager.getStyle("main") + start;
    }

    /**
     * Starts the message with the style specified
     * @param start the string to start with
     * @param style the style to use
     */
    public FoundationMessage(String start, String style) {
        value += StyleManager.getStyle(style) + start;
    }

    /**
     * Adds the string provided to this message with the main style
     * @param value the string to add
     * @return this
     */
    public FoundationMessage main(String value) {
        value += StyleManager.getStyle("main") + value;
        return this;
    }

    /**
     * Adds the string provided to this message with the accent style
     * @param value the string to add
     * @return this
     */
    public FoundationMessage accent(String value) {
        value += StyleManager.getStyle("accent") + value;
        return this;
    }

    /**
     * Appends the string provided onto the message without editing it
     * @param value the string to append
     * @return this
     */
    public FoundationMessage force(String value) {
        value += value;
        return this;
    }
    /**
     * Adds the string provided to this message with the style provided
     * @param value the string to add
     * @param style the style to use
     * @return this
     */
    public FoundationMessage custom(String value, String style) {
        value += StyleManager.getStyle(style) + value;
        return this;
    }

    /**
     * Finishes the message
     * @return value
     */
    public String finalise() {
        return value;
    }
}
