package io.foundationdriven.foundation.api.formatting.errors;

/**
 * Thrown when a custom style not present was requested
 * @see io.foundationdriven.foundation.api.formatting.styles.Style
 */
public class StyleNotFound extends Error{
    /**
     * The name of the requested style
     */
    private String name;

    /**
     * Gets the name of the requested style
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name and calls the error constructor
     * @param name the name of the requested style
     */
    public StyleNotFound(String name) {
        super();
        this.name = name;
    }
}
