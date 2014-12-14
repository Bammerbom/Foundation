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
package io.foundationdriven.foundation.core;

import org.spongepowered.api.Game;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.util.event.Subscribe;

import javax.annotation.Nullable;

/**
 * Foundation is a Sponge plugin which provides core functionality
 * to the server. It also provides an API for other plugins
 *
 * @version 1.0.0
 * @since 2014-09-19
 */
@Plugin(id = "Foundation", name = "Foundation", version = "1.0.0")
public class Foundation {

    @Nullable
    private static Foundation instance = null;
    @Nullable
    private static Game gameInstance = null;

    public Foundation() throws IllegalStateException {
        if (instance != null) throw new IllegalStateException("A Foundation instance is already initialized");
    }

    public static Foundation getInstance() {
        if (instance == null) throw new IllegalStateException("Cannot get a null instance");
        synchronized (Foundation.class) {
            return instance != null ? instance : null;
        }
    }

    public static Game getGameInstance() {
        if (gameInstance == null) throw new IllegalStateException("Cannot get a null game");
        return gameInstance;
    }

    @Subscribe
    public void onPreInitialization(final PreInitializationEvent event) {
        // Map all modules, configurations, child plugins etc.
        // Initialize everything.
        instance = this;
        gameInstance = event.getGame();
    }

    @Subscribe
    public void onServerStarting(final ServerStartingEvent event) {
        // Load all modules, configurations, child plugins etc.
    }

    @Subscribe
    public void onServerStarted(final ServerStartedEvent event) {
        // Make sure nothing went wrong.
    }

    @Subscribe
    public void onServerStopping(final ServerStoppingEvent event) {
        // Save and unload everything safely.
    }
}
