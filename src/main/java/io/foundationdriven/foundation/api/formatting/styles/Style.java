/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 FoundationDriven
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
