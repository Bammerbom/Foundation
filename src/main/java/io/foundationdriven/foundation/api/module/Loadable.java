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
package io.foundationdriven.foundation.api.module;

/**
 * The <code>Loadable</code> interface must be implemented by every
 * modules main class (which also has the "@Module" annotation) in
 * order to be loaded correctly. This interface provides methods which
 * are called at different stages of the server.
 *
 * @version 1.0.0
 * @since 2014-12-01
 */
public interface Loadable {

    /**
     * The <code>onServerStarting</code> method is called immediately
     * after the module is loaded.
     */
    public void onServerStarting();

    /**
     * The <code>onServerStarted</code> method is called when the
     * server is started.
     */
    public void onServerStarted();

    /**
     * The <code>onServerStopping</code> method is called when the
     * server is stopping.
     */
    public void onServerStopping();
}
