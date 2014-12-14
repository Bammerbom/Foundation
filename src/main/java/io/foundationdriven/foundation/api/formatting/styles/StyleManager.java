package io.foundationdriven.foundation.api.formatting.styles;

import io.foundationdriven.foundation.api.formatting.errors.StyleNotFound;

import java.util.List;

/**
 * Manages the available styles
 */
public class StyleManager {
    /**
     * Stores all available styles
     */
    private static List<Style> styles;

    /**
     * Gets the available styles
     * @return styles
     */
    public static List<Style> getStyles() {
        return styles;
    }

    /**
     * Adds a style to the list
     * @param s the style to add
     * @return the style added
     */
    public static Style addStyle(Style s){
        if (styles.contains(s)) styles.remove(s);
        else styles.add(s);
        return s;
    }

    /**
     * Gets the style with the provided name
     * @param name the name to search for
     * @return the style found
     * @see io.foundationdriven.foundation.api.formatting.errors.StyleNotFound
     */
    public static Style getStyle(String name){
        for (Style s : styles){
            if (s.getName() == name) return s;
        }
        throw new StyleNotFound(name);
    }
}
