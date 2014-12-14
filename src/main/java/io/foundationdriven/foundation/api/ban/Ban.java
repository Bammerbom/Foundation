package io.foundationdriven.foundation.api.ban;

import org.spongepowered.api.entity.player.Player;

import javax.annotation.Nullable;
import java.util.List;

/**
 * This is the interface for a ban.
 */
public interface Ban {
    /**
     * Sets a player or IPv4 address to be banned.
     *
     * @param player or IP to be banned.
     */
    public void setBanned(@Nullable Player player, @Nullable String ipv4);
    /**
     * Sets a player or IPv4 address to be banned.
     *
     * @param player or IP to be unbanned.
     */
    public void setUnbanned(@Nullable Player player, @Nullable String ipv4);
    /**
     * Contains the banned players.
     *
     * @return Banned players
     */
    @Nullable
    public List<Player> bannedPlayers();
    /**
     * Contains a list of banned IPv4 addresses.
     *
     * @return The banned IPv4 addresses
     */
    @Nullable
    public List<String> bannedIPs();
}
