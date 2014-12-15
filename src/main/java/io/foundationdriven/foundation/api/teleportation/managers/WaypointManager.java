package io.foundationdriven.foundation.api.teleportation.managers;

import io.foundationdriven.foundation.api.teleportation.objects.Waypoint;
import org.spongepowered.api.world.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WaypointManager {
    private static List<Waypoint> waypoints = new ArrayList<>();

    public static List<Waypoint> getWaypoints() {
        return waypoints;
    }
    public static Waypoint getWaypoint(String name){
        for (Waypoint w : waypoints){
            if (w.getName() == name) return w;
        }
        return null;
    }
    public static Waypoint getWaypoint(UUID uuid){
        for (Waypoint w : waypoints) {
            if (w.getUuid() == uuid) return w;
        }
        return null;
    }
    public static Waypoint createWaypoint(String name, Location loc) {
        Waypoint newWaypoint = new Waypoint(name, loc);
        waypoints.add(newWaypoint);
        return newWaypoint;
    }
    public static void removeWaypoint(Waypoint w) {
        if (waypoints.contains(w)) waypoints.remove(w);
    }
}
