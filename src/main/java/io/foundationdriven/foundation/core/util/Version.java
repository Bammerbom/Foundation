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
