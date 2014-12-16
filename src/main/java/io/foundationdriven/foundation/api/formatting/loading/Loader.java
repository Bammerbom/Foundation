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
package io.foundationdriven.foundation.api.formatting.loading;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.foundationdriven.foundation.api.formatting.styles.Style;
import io.foundationdriven.foundation.api.formatting.styles.StyleManager;
import org.spongepowered.api.text.format.TextColors;

/**
 * Loads the styles and registers them with the stylemanager
 * @see io.foundationdriven.foundation.api.formatting.styles.Style
 * @see io.foundationdriven.foundation.api.formatting.styles.StyleManager
 * @see com.typesafe.config.Config
 */
public class Loader {
    /**
     * The config object
     * @see com.typesafe.config.Config
     */
    private static Config config = ConfigFactory.load();
    /**
     * Whether or not the formatting api has been intialised
     */
    private static boolean init = false;

    /**
     * Initialises the formatting api
     */
    public static void init() {
        System.setProperty("foundation.styles.default.main", TextColors.BLACK + "[MAIN]");
        System.setProperty("foundation.styles.default.accent", TextColors.WHITE + "[ACCENT]");
        loadDefaultStyles();
        loadCustomStyles();
        init = true;
    }

    /**
     * Loads the default styles ( Main and accent )
     * @see io.foundationdriven.foundation.api.formatting.styles.Style
     */
    private static void loadDefaultStyles() {
        StyleManager.addStyle(new Style("main", config.getString("foundation.styles.default.main")));
        StyleManager.addStyle(new Style("accent", config.getString("foundation.styles.default.accent")));
    }

    /**
     * Loads all custom styles
     * @see io.foundationdriven.foundation.api.formatting.styles.Style
     */
    private static void loadCustomStyles() {
        for (String n : config.getObject("foundation.styles.custom").keySet()) {
            String v = config.getString("foundation.styles.custom." + n);
            StyleManager.addStyle(new Style(n, v));
        }
    }


}
