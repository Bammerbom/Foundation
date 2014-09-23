package com.foundationpowered.foundation.module;

import com.foundationpowered.foundation.api.module.Module;
import com.foundationpowered.foundation.api.module.ModuleManager;
import com.foundationpowered.foundation.api.module.ModuleType;
import java.util.List;

public class FoundationModuleManager implements ModuleManager {

    private List<Module> activeModules;

    public List<Module> getModules() {
        return null;
    }

    public Module getModule(String _id) {
        return null;
    }

    public Module getModule(ModuleType _type) {
        return null;
    }

    public void registerModuleAsActive(String _id) {
        activeModules.add(getModule(_id));
    }

    public void initLoader() {

    }

    public void initAllModules() {

    }

    public void startAllModules() {

    }

    public void startIndividualModule(String _id) {

    }

    public void reloadAllModules() {
    }

    public void reloadIndividualModule(String _id) {
    }

    public void stopAllModules() {

    }

    public void stopIndividualModule(String _id) {

    }

    public List<Module> getActiveModules() {
        return activeModules;
    }
}
