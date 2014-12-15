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
