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
