package io.foundationdriven.foundation.api.module;

import java.nio.file.Path;

public interface ModuleLoader {

	/**
	 * Scans the available modules.
	 */
	void scanModules();


	/**
	 * Builds the dependencies tree.
	 */
	void orderDependencies();

	/**
	 * Verify that the modules supports
	 * the core version.
	 */
	void verifyCoreVersions();

	/**
	 * Loads a single module.
	 * @param _path path of the module
	 */
	void loadModule(Path _path);

	/**
	 * Loads all modules.
	 */
	void loadAllModule();

    /**
     * Sets the path where Foundation
     * scans for modules.
     * @param _path path of the modules directory
     */
    void setModulesPath(Path _path);

    Path getModulesPath();
}
