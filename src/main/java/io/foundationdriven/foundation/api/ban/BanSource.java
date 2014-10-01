package io.foundationdriven.foundation.api.ban;

/**
 * BanSource is the source of a ban. It can be either a
 * Player, a Console or System(plugin).
 */
public interface BanSource {

	String getSourceName();

}
