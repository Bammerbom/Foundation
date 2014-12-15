package io.foundationdriven.foundation.api.teleportation.errors;

import io.foundationdriven.foundation.api.teleportation.objects.Waypoint;

/**
 * Thrown when a teleport is unsafe ( One of the blocks isn't air )
 */
public class UnsafeTeleport extends Error {
    /**
     * The waypoint
     */
    private Waypoint waypoint;

    /**
     * Sets the variables and calls the super constructor
     * @param waypoint the waypoint
     */
    public UnsafeTeleport(Waypoint waypoint) {
        super();
        this.waypoint = waypoint;
    }

    /**
     * Gets waypoint
     * @return waypoint
     */
    public Waypoint getWaypoint() {
        return waypoint;
    }
}
