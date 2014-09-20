package com.foundationpowered.foundation.module;

import java.util.List;

public abstract class ModuleDependencies {

	private List<ModuleType> dependencies;

	public ModuleDependencies(List<ModuleType> _dependencies) {
		dependencies = _dependencies;
	}

	/**
	 * Compare 2 ModuleDepencies
	 * @param dependencies
	 * @return  true if @param as higher load priority
	 */
	public abstract boolean compare(ModuleDependencies dependencies);

}
