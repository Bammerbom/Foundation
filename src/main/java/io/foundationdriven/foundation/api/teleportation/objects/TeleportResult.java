package io.foundationdriven.foundation.api.teleportation.objects;

import org.spongepowered.api.world.Location;

/**
 * Returned when the teleport function of a waypoint is called, contains information about the teleport as well as whether or not it was succesful
 */
public class TeleportResult {
    /**
     * The location the entity was at before the teleport
     */
    private Location from;
    /**
     * The waypoint the entity was teleported to
     */
    private Waypoint to;
    /**
     * Whether or not the teleport was successful
     */
    private boolean successful;

    /**
     * Sets the variables
     * @param from the location the entity was at before the teleport
     * @param to the waypoint the entity was at
     * @param successful whether or not the teleport was successful
     */
    public TeleportResult(Location from, Waypoint to, boolean successful) {

        this.from = from;
        this.to = to;
        this.successful = successful;
    }

    /**
     * Gets from
     * @return from
     */
    public Location getFrom() {
        return from;
    }

    /**
     * Gets to
     * @return to
     */
    public Waypoint getTo() {
        return to;
    }

    /**
     * Gets successful
     * @return successful
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Gets the distance between the two locations
     * @return the distance
     */
    public Integer getDistance() {
        //TODO
        return 0;
    }
}
