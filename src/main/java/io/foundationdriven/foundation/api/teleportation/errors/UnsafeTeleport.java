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
