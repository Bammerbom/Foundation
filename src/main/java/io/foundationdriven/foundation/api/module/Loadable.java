package io.foundationdriven.foundation.api.module;

public interface Loadable {

    public void onServerStarting();

    public void onServerStarted();

    public void onServerStopping();
}
