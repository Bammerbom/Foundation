package io.foundationdriven.foundation.api.ban;

import org.spongepowered.api.plugin.Plugin;

/**
 * A SystemBanSource is a ban source that takes origin in a
 * plugin automated function. It should not be created from
 * a player or console action.
 */
public interface SystemBanSource extends BanSource {

	Plugin getPlugin();
}
