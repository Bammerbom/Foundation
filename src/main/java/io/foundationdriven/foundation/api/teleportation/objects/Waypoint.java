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
package io.foundationdriven.foundation.api.teleportation.objects;

import io.foundationdriven.foundation.api.teleportation.errors.UnsafeTeleport;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.world.Location;

import java.util.UUID;

/**
 * A Waypoint is a pretty simple object that represents a place where an entity could be teleported to
 */
public class Waypoint {
    /**
     * The name of this waypoint
     */
    private String name;
    /**
     * The UUID of this waypoint
     * @see java.util.UUID
     */
    private UUID uuid;
    /**
     * The location of this waypoint
     * @see org.spongepowered.api.world.Location
     */
    private Location loc;

    /**
     * Gets the name
     * @return name
     */
    public String getName() {

        return name;
    }

    /**
     * Sets the variables
     * @param name the name
     * @param loc the location
     */
    public Waypoint(String name, Location loc) {
        this.name = name;
        this.loc = loc;
        this.uuid = UUID.randomUUID();
    }

    /**
     * Sets the name
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the UUID
     * @return uuid
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Gets the location
     * @return loc
     */
    public Location getLoc() {
        return loc;
    }

    /**
     * Sets the location
     * @param loc the new loc
     */
    public void setLoc(Location loc) {
        this.loc = loc;
    }

    /**
     * Teleports the provided entity to this waypoint
     * @param e the entity to teleport
     * @return the TeleportResult
     * @see io.foundationdriven.foundation.api.teleportation.objects.TeleportResult
     * @see org.spongepowered.api.entity.Entity
     */
    public TeleportResult teleport(Entity e) {
        if (loc.getBlock().getType() != BlockTypes.AIR || loc.add(0, 1, 0).getBlock().getType() != BlockTypes.AIR)
            throw new UnsafeTeleport(this);
        Location from = e.getLocation();
        e.teleport(loc);
        return new TeleportResult(from, this, true);
    }
}
