package io.foundationdriven.foundation.core;

import io.foundationdriven.foundation.core.util.Version;

import javax.annotation.Nullable;

public class FoundationVersion {

    @Nullable
    private Version currentVersion = null;

    @Nullable
    private Version newVersion = null;

    public void registerVersion(VersionType type, Version version) {
        if (type == VersionType.CURRENT)
            currentVersion = version;
        else
            newVersion = version;
    }

    public Version getCurrentVersion() {
        if (currentVersion == null)
            throw new IllegalStateException("Cannot get the current version when it is not registered");
        return currentVersion;
    }

    public Version getNewVersion() {
        if (currentVersion == null)
            throw new IllegalStateException("Cannot get the new version when it is not registered");
        return newVersion;
    }

    public enum VersionType {
        CURRENT,
        OTHER
    }
}
