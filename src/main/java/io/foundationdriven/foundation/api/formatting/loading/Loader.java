package io.foundationdriven.foundation.api.formatting.loading;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.foundationdriven.foundation.api.formatting.errors.MissingStyles;
import io.foundationdriven.foundation.api.formatting.styles.Style;
import io.foundationdriven.foundation.api.formatting.styles.StyleManager;
import org.spongepowered.api.text.format.TextColor;
import org.spongepowered.api.text.format.TextColors;

import java.util.ArrayList;
import java.util.List;

public class Loader {
    private static Config config = ConfigFactory.load();
    private static boolean init = false;
    public static void init(){
        System.setProperty("foundation.styles.default.main", TextColors.BLACK + "[MAIN]");
        System.setProperty("foundation.styles.default.accent", TextColors.WHITE + "[ACCENT]");
        loadDefaultStyles();
        loadCustomStyles();
        init = true;
    }

    private static void loadDefaultStyles() {
        List<String> missingStyles = new ArrayList<String>();
        if (!config.hasPath("foundation.styles.default.main")) missingStyles.add("foundation.styles.default.main");
        if (!config.hasPath("foundation.styles.default.accent")) missingStyles.add("foundation.styles.default.accent");
        if (!missingStyles.isEmpty()) throw new MissingStyles(missingStyles);
        else{
            StyleManager.addStyle(new Style("main", config.getString("foundation.styles.default.main")));
            StyleManager.addStyle(new Style("accent", config.getString("foundation.styles.default.accent")));
        }
    }

    private static void loadCustomStyles() {
        for (String n : config.getObject("foundation.styles.custom").keySet()){
            String v = config.getString("foundation.styles.custom." + n);
            StyleManager.addStyle(new Style(n, v));
        }
    }


}
