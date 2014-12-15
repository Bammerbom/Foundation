package io.foundationdriven.foundation.api.teleportation.objects;

import io.foundationdriven.foundation.api.teleportation.errors.UnsafeTeleport;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.world.Location;

import java.util.UUID;

public class Waypoint {
    private String name;
    private UUID uuid;
    private Location loc;

    public String getName() {

        return name;
    }

    public Waypoint(String name, Location loc) {
        this.name = name;
        this.loc = loc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public TeleportResult teleport(Entity e) {
        if (loc.getBlock().getType() != BlockTypes.AIR || loc.add(0, 1, 0).getBlock().getType() != BlockTypes.AIR)
            throw new UnsafeTeleport(this);
        Location from = e.getLocation();
        e.teleport(loc);
        return new TeleportResult(from, this, true);
    }
}
