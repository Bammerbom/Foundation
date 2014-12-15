package io.foundationdriven.foundation.api.teleportation.managers;

import io.foundationdriven.foundation.api.teleportation.errors.UnsafeTeleport;
import io.foundationdriven.foundation.api.teleportation.objects.Waypoint;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.world.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Manages the waypoints
 *
 * @see io.foundationdriven.foundation.api.teleportation.objects.Waypoint
 */
public class WaypointManager {
    /**
     * All the registered waypoints
     *
     * @see io.foundationdriven.foundation.api.teleportation.objects.Waypoint
     */
    private static List<Waypoint> waypoints = new ArrayList<>();

    /**
     * Gets the waypoints list
     *
     * @return waypoints
     */
    public static List<Waypoint> getWaypoints() {
        return waypoints;
    }

    /**
     * Gets a waypoint by name
     *
     * @param name the name of the waypoint
     * @return the waypoint
     * @see io.foundationdriven.foundation.api.teleportation.objects.Waypoint
     */
    public static Waypoint getWaypoint(String name) {
        for (Waypoint w : waypoints) {
            if (w.getName() == name) return w;
        }
        return null;
    }

    /**
     * Gets a waypoint by uuid
     *
     * @param uuid the uuid of the waypoint
     * @return the waypoint
     * @see io.foundationdriven.foundation.api.teleportation.objects.Waypoint
     * @see java.util.UUID
     */
    public static Waypoint getWaypoint(UUID uuid) {
        for (Waypoint w : waypoints) {
            if (w.getUuid() == uuid) return w;
        }
        return null;
    }

    /**
     * Creates and registers a waypoint
     *
     * @param name the name of the waypoint
     * @param loc  the location of the waypoint
     * @return the waypoint registered
     */
    public static Waypoint createWaypoint(String name, Location loc) {
        Waypoint newWaypoint = new Waypoint(name, loc);
        if (loc.getBlock().getType() != BlockTypes.AIR || loc.add(0, 1, 0).getBlock().getType() != BlockTypes.AIR)
            throw new UnsafeTeleport(newWaypoint);
        waypoints.add(newWaypoint);
        return newWaypoint;
    }

    /**
     * Removes the waypoint provided from the list
     * @param w the waypoint to remove
     */
    public static void removeWaypoint(Waypoint w) {
        if (waypoints.contains(w)) waypoints.remove(w);
    }
}
