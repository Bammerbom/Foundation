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

import org.apache.logging.log4j.Logger;
import org.spongepowered.api.event.state.PreInitializationEvent;
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
    Logger logger = null;

    @Subscribe
    public void onInit(PreInitializationEvent event) {
        logger = (Logger) event.getPluginLog();
    }

    @Subscribe
    public void onStart(ServerStartingEvent event) {
        //TODO onStart
    }

    @Subscribe
    public void onStop(ServerStoppingEvent event) {
        //TODO onStop
    }

    public void setLogger(Logger _logger) {
        logger = _logger;
    }
}
