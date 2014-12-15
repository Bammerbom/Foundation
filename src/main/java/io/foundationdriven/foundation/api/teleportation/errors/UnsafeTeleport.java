package io.foundationdriven.foundation.api.teleportation.errors;

import io.foundationdriven.foundation.api.teleportation.objects.Waypoint;

public class UnsafeTeleport extends Error {
    private Waypoint waypoint;

    public UnsafeTeleport(Waypoint waypoint) {
        super();
        this.waypoint = waypoint;
    }

    public Waypoint getWaypoint() {
        return waypoint;
    }
}
