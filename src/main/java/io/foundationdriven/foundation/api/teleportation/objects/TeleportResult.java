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
