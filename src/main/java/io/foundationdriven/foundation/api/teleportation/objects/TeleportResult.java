package io.foundationdriven.foundation.api.teleportation.objects;

import org.spongepowered.api.world.Location;

public class TeleportResult {
    private Location from;
    private Waypoint to;
    private boolean successful;

    public Location getFrom() {
        return from;
    }

    public Waypoint getTo() {
        return to;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public TeleportResult(Location from, Waypoint to, boolean successful) {

        this.from = from;
        this.to = to;
        this.successful = successful;
    }
    public Integer getDistance(){
        //TODO
        return 0;
    }
}
