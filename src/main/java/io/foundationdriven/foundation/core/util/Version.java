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
package io.foundationdriven.foundation.core.util;

public class Version implements Comparable {

    private int major;
    private int minor;
    private int build;
    private int revision;

    public Version(int _major, int _minor, int _build, int _revision) {
        major = _major;
        minor = _minor;
        build = _build;
        revision = _revision;
    }

    public static Version createVersionFromString(String _versionString) {
        //TODO Implement this
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public int getBuild() {
        return build;
    }

    public int getRevision() {
        return revision;
    }

    public String getVersionString() {
        return String.format("%s.%s.%s.%s", major, minor, build, revision);
    }

    public int compareTo(Object o) {
        //TODO Implement comparison
        return 0;
    }
}
