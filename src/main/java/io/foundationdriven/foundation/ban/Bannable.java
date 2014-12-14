package io.foundationdriven.foundation.ban;

import org.spongepowered.api.entity.player.Player;

/**
 * This interface defines a bannable object or player.
 */
public interface Bannable {
    /**
     * Checks if an Object is bannable.
     *
     * @return Is the object bannable
     */
    public boolean isBannable(Player player);

}
