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
     * Sets a player or IPv4 address to be unbanned.
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
