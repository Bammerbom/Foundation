package io.foundationdriven.foundation.api.module;

import java.io.File;

public interface Module {

	String getName();

	String getID();

	/**
	 * Prefix to be used for the module
	 * @return prefix or null
	 */
	String getPrefix();

	String getDescription();

	/**
	 * Called by ModLoader on the initial scan.
	 * Should usually be left empty.
	 */
	void classLoad();

	/**
	 * Called on server initialization.
	 * Non-module Foundation functions are guaranteed
	 * but modules aren't.
	 */
	void onInit();

	/**
	 * Called on server start.
	 */
	void onStart();

	/**
	 * Called on server stop.
	 */
	void onStop();

	/**
	 * Called on server reload.
	 */
	void onReload();

	/**
	 * Gets the module directory.
	 * @return  module directory
	 */
	File getDir();

	/**
	 * Gets a module ressource.
	 * @param file path inside the module dir
	 * @return
	 */
	File getRessource(String file);

	/**
	 * Gets the Foundation dependencies that
	 * should be loaded before this modules
	 * @return  dependencies or null
	 */
	ModuleDependencies getDependencies();

	/**
	 * Gets the module version.
	 * @return  module version
	 */
	String getVersion();

	/**
	 * Gets the api version the module supports
	 * @return  api version
	 */
	String getCoreVersion();

}
