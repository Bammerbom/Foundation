package io.foundationdriven.foundation.api.formatting.styles;

/**
 * Represents a style
 */
public class Style {
    /**
     * The name of this style
     */
    private String name;
    /**
     * The string to add when this style is invoked
     */
    private String value;

    /**
     * Gets the name of this style
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this style
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the string to add when this style is invoked
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the string to add when this style is invoked
     * @param value the new string
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Sets the variables
     * @param name name
     * @param value value
     */
    public Style(String name, String value) {

        this.name = name;
        this.value = value;
    }
}
