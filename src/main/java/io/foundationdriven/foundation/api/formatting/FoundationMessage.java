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
