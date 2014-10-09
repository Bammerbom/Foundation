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

    private int major, minor, build, revision;

    public int compareTo(Version c) {
        return 0;
    }
}
