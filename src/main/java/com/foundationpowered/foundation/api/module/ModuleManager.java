package com.foundationpowered.foundation.api.module;

import java.util.List;

public interface ModuleManager {

	List<Module> getModules();

	/**
	 * Gets a module by it's ID
	 * @param   _id
	 * @return  Module
	 */
	Module getModule(String _id);

	/**
	 * Gets a module by it's type. There
	 * can only one module of each type.
	 * @param   _type
	 * @return  Module
	 */
	Module getModule(ModuleType _type);

    void registerModuleAsActive(String _id);

	/**
	 * Starts the ModLoader
	 */
	void initLoader();

	/**
	 * Initializes all modules.
	 */
	void initAllModules();

	/**
	 * Starts all modules.
	 */
	void startAllModules();

    /**
     * Starts an individual module, based on the
     * given id.
     * @param _id id of the module
     */
    void startIndividualModule(String _id);

	/**
	 * Reloads all modules.
	 */
	void reloadAllModules();

    /**
     * Reloads an individual module.
     * @param _id id of the module
     */
    void reloadIndividualModule(String _id);

	/**
	 * Stops all modules.
	 */
	void stopAllModules();

    /**
     * Stops an individual module.
     * @param _id id of the module
     */
    void stopIndividualModule(String _id);

    /**
     * Gets a list of active modules.
     * @return list of active modules
     */
    List<Module> getActiveModules();

}
