package io.foundationdriven.foundation.api.ban;

import org.spongepowered.api.entity.Player;

import java.util.UUID;

/**
 * An Player that has been targeted by a ban
 */
public interface PlayerBanTarget {

	UUID getUUID();

	/**
	 * Does no guarantee that the player is online
	 */
	Player getPlayer();

}
