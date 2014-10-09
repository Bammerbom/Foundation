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

/**
 * The <code>Version</code> class is a project-independent class
 * that represents a version. It holds major, minor, build and
 * revision numbers.
 *
 * @version 1.0.0
 * @see java.lang.Comparable
 * @since 2014-10-09
 */
public class Version implements Comparable<Version> {

    // Variables holding the major, minor, build and revision numbers.
    private int major, minor, build, revision;

    public Version(int _major, int _minor, int _build, int _revision) {
        major = _major;
        minor = _minor;
        build = _build;
        revision = _revision;
    }

    /**
     * The <code>parseVersion</code> method creates a new
     * <code>Version</code> object from a version string.
     * The string must be in this format:
     * <pre>
     *     %i.%i.%i.%i
     * </pre>
     *
     * @param versionString string holding a version number
     * @return new instance of the <code>Version</code> class
     * @since 2014-10-09
     */
    public static Version parseVersion(String versionString) {
        // Variables for temporary holding the extracted version numbers.
        int tmpMaj, tmpMin, tmpBuild, tmpRev;

        // String array containing the extracted version numbers
        String[] extracted = versionString.split("\\.");

        // Initialize the temporary version numbers.
        tmpMaj = Integer.parseInt(extracted[0]);
        tmpMin = Integer.parseInt(extracted[1]);
        tmpBuild = Integer.parseInt(extracted[2]);
        tmpRev = Integer.parseInt(extracted[3]);

        // Return a new Version object.
        return new Version(tmpMaj, tmpMin, tmpBuild, tmpRev);
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

    public int compareTo(Version o) {
        return 0;
    }
}
