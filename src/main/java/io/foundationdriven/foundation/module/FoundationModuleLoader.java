package io.foundationdriven.foundation.module;

import io.foundationdriven.foundation.api.module.ModuleLoader;
import java.nio.file.Path;

public class FoundationModuleLoader implements ModuleLoader {

    private Path modulesPath;

    public void scanModules() {

    }

    public void orderDependencies() {

    }

    public void verifyCoreVersions() {

    }

    public void loadModule(Path _path) {

    }

    public void loadAllModule() {

    }

    public void setModulesPath(Path _path) {
        modulesPath = _path;
    }

    public Path getModulesPath() {
        return modulesPath;
    }
}