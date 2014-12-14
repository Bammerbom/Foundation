package io.foundationdriven.foundation.api.formatting.styles;

import io.foundationdriven.foundation.api.formatting.errors.StyleNotFound;

import java.util.List;

public class StyleManager {
    private static List<Style> styles;

    public static List<Style> getStyles() {
        return styles;
    }
    public static Style addStyle(Style s){
        if (styles.contains(s)) styles.remove(s);
        else styles.add(s);
        return s;
    }
    public static Style getStyle(String name){
        for (Style s : styles){
            if (s.getName() == name) return s;
        }
        throw new StyleNotFound(name);
    }
}
