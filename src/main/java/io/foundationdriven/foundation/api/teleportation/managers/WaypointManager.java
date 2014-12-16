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
