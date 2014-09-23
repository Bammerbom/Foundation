package com.foundationpowered.foundation.api.module;

import java.util.List;

public interface ModuleManager {

	List<Module> getModules();

	/**
	 * Gets a module by it's ID
	 * @param   id
	 * @return  Module
	 */
	Module getModule(String id);

	/**
	 * Gets a module by it's type. There
	 * can only one module of each type.
	 * @param   type
	 * @return  Module
	 */
	Module getModule(ModuleType type);

	/**
	 * Starts the ModLoader
	 */
	void initLoader();

	/**
	 * Called on server initialization.
	 */
	void initModules();

	/**
	 * Called on server start.
	 */
	void startModules();

	/**
	 * Called on server reload.
	 */
	void reloadModules();

	/**
	 * Called on server stop.
	 */
	void stopModules();

}
